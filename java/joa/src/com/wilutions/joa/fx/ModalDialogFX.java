package com.wilutions.joa.fx;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowHandle;
import com.wilutions.joa.OfficeAddin;
import com.wilutions.joactrllib.IJoaBridgeDialog;
import com.wilutions.joactrllib._IJoaBridgeDialogEvents;

/**
 * This is the base class for all modal dialogs.
 *
 * @param <T>
 *            Result type of callback expression.
 */
public abstract class ModalDialogFX<T> implements WindowHandle, FrameContentFactory {

	/**
	 * Helper object to show an empty modal dialog in the UI thread of Outlook.
	 */
	protected IJoaBridgeDialog joaDlg;

	/**
	 * JavaFX frame window placed inside the {@link #joaDlg}.
	 */
	private EmbeddedFrameFX embeddedFrame = new EmbeddedFrameFX();

	/**
	 * Native window handle of the {@link #joaDlg}
	 */
	private long hwndParent;
	
	/**
	 * JavaFX stage.
	 * If the owner is a JavaFX window, the dialog is created 
	 * entirely with JavaFX functionality.
	 * Either {@link #joaDlg} or {@link #fxDlg} is set.
	 */
	private Stage fxDlg;

	/**
	 * Callback expression received from function
	 * {@link #showAsync(Object, AsyncResult)}.
	 */
	protected AsyncResult<T> asyncResult;

	/**
	 * Result that will passed to {@link #asyncResult} when the dialog is
	 * closed.
	 */
	private T result;

	// Dimensions
	private double x, y, width, height, minWidth, maxWidth, minHeight, maxHeight;

	/**
	 * Align dialog box in the center of the owner window.
	 */
	private boolean centerOnOwner = true;

	/**
	 * Dialog box is re-sizable.
	 */
	private boolean resizable = true;

	/**
	 * Dialog box has a minimize button.
	 */
	private boolean minimizeBox = false;

	/**
	 * Dialog box has a maximize button.
	 */
	private boolean maximizeBox = true;

	/**
	 * Caption
	 */
	private String title;

	/**
	 * Definition for cancel button ID.
	 */
	public final static int CANCEL = 0;

	/**
	 * Definition for OK button ID.
	 */
	public final static int OK = 1;

	/**
	 * Internal processing state.
	 *
	 */
	private enum State {
		Initialized, HasParentHwnd, IsClosed
	};

	private State state = State.Initialized;

	/**
	 * Constructor.
	 */
	public ModalDialogFX() {
	}

	/**
	 * Show the dialog box.
	 * 
	 * @param _owner
	 *            Owner object, explorer or inspector window, or an
	 *            implementation of WindowHandle.
	 * @param asyncResult
	 *            Callback expression which is called, when the dialog is
	 *            closed.
	 */
	public void showAsync(Object _owner, final AsyncResult<T> asyncResult) {
		if (Platform.isFxApplicationThread()) {
			internalShowAsync(_owner, asyncResult);
		} else {
			Platform.runLater(() -> internalShowAsync(_owner, asyncResult));
		}
	}

	/**
	 * Close dialog and invoke callback expression.
	 * 
	 * @param result
	 *            Object to be passed to the callback expression.
	 * @see #showAsync(Object, AsyncResult)
	 */
	public void finish(T result) {
		setResult(result);
		close();
	}

	/**
	 * Close dialog. Invokes the callback expression with the current value of
	 * {@link #result}.
	 * 
	 * @see #finish(Object)
	 * @see #setResult(Object)
	 */
	public void close() {
		Throwable ex = null;
		if (joaDlg != null) {
			try {
				joaDlg.Close();
			} catch (Throwable ex1) {
				ex = ex1;
			}
		}
		if (fxDlg != null) {
			fxDlg.close();
		}
		if (asyncResult != null) {
			asyncResult.setAsyncResult(result, ex);
		}
	}

	/**
	 * Called when the dialog is closed over its system menu.
	 */
	public void onSystemMenuClose() {
		this.close();
	}

	/**
	 * Set callback result.
	 * 
	 * @param ret
	 *            Result object
	 * @throws ComException
	 */
	public void setResult(T ret) {
		this.result = ret;
	}

	public T getResult() {
		return this.result;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setCenterOnOwner(boolean v) {
		this.centerOnOwner = v;
	}

	public boolean isCenterOnOwner() {
		return this.centerOnOwner;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isResizable() {
		return resizable;
	}

	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}

	public double getMinWidth() {
		return minWidth;
	}

	public void setMinWidth(double minWidth) {
		this.minWidth = minWidth;
	}

	public double getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(double maxWidth) {
		this.maxWidth = maxWidth;
	}

	public double getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(double minHeight) {
		this.minHeight = minHeight;
	}

	public double getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(double maxHeight) {
		this.maxHeight = maxHeight;
	}

	public boolean isMinimizeBox() {
		return minimizeBox;
	}

	public void setMinimizeBox(boolean minimizeBox) {
		this.minimizeBox = minimizeBox;
	}

	public boolean isMaximizeBox() {
		return maximizeBox;
	}

	public void setMaximizeBox(boolean maximizeBox) {
		this.maximizeBox = maximizeBox;
	}

	/**
	 * Set event handler for WindowEvent.WINDOW_SHOWN. Only one hander is
	 * supported. Only the event type WINDOW_SHOWN is supported. The handler
	 * receives null as source parameter.
	 * 
	 * @param eventType
	 *            must be WindowEvent.WINDOW_SHOWN
	 * @param eventHandler
	 *            handler expression
	 */
	public <E extends Event> void addEventHandler(EventType<E> eventType, EventHandler<? super E> eventHandler) {
		embeddedFrame.addEventHandler(eventType, eventHandler);
	}

	private Integer toWin(double x) {
		return Double.valueOf(x).intValue();
	}

	private void internalShowFxDialogAsync(Window fxOwner, AsyncResult<T> asyncResult) {
		try {
			this.asyncResult = asyncResult;
			fxDlg = new Stage();
			fxDlg.initOwner(fxOwner);
			fxDlg.initModality(Modality.WINDOW_MODAL);
			Scene scene = createScene();
			fxDlg.setScene(scene);
			fxDlg.showAndWait();
		} catch (Throwable e) {
			asyncResult.setAsyncResult(getResult(), e);
		}
	}

	private void internalShowAsync(Object _owner, AsyncResult<T> asyncResult) {

		// Is the owner a COM object or another WindowHandle?
		// A COM object has to implement IOleWindow.
		Dispatch dispOwner = null;
		long hwndOwner = 0;
		Window fxOwner = null;
		if (_owner instanceof WindowHandle) {
			hwndOwner = ((WindowHandle) _owner).getWindowHandle();
		} else if (_owner instanceof Dispatch) {
			dispOwner = (Dispatch) _owner;
		} else if (_owner instanceof Window) {
			fxOwner = (Window) _owner;
		}
		assert hwndOwner != 0 || dispOwner != null || fxOwner != null;
		
		if (fxOwner != null) {
			internalShowFxDialogAsync(fxOwner, asyncResult);
			return;
		}

		DialogEventHandler dialogHandler = null;
		try {

			// Create the scene. Has to be implemented by subclass.
			Scene scene = createScene();

			// If width and height is not set, make the dialog
			// as large as the scene.
			maybeSetWidthAndHightFromSceneExtent(scene);

			// Create the native dialog object.
			// This is the task of the JOA Util Add-in. Because
			// the dialog has to be created in the UI thread
			// inside Outlook.
			joaDlg = OfficeAddin.getJoaUtil().CreateBridgeDialog();

			joaDlg.setWidth(toWin(width));
			joaDlg.setHeight(toWin(height));
			joaDlg.setX(toWin(x));
			joaDlg.setY(toWin(y));
			joaDlg.setTitle(title != null ? title : "");
			joaDlg.setCenterOnOwner(centerOnOwner);
			joaDlg.setResizable(resizable);
			joaDlg.setMinHeight(toWin(minHeight));
			joaDlg.setMaxHeight(toWin(maxHeight));
			joaDlg.setMinWidth(toWin(minWidth));
			joaDlg.setMaxWidth(toWin(maxWidth));
			joaDlg.setMinimizeBox(minimizeBox);
			joaDlg.setMaximizeBox(maximizeBox);

			// Assign event handler to native dialog.
			dialogHandler = new DialogEventHandler();
			Dispatch.withEvents(joaDlg, dialogHandler);

			// Show native dialog
			if (dispOwner != null) {
				joaDlg.ShowModal3(dispOwner);
			} else {
				joaDlg.ShowModal2(hwndOwner);
			}

			// Wait until the native dialog fires the onShow
			// event which is implemented by the DialogEventHandler.
			// The hander stores the native dialog's window handle in hwndParent
			// and sets the state as State.HasParentHwnd
			synchronized (this) {
				while (state == State.Initialized) {
					this.wait();
				}
			}

			// Native dialog initialized?
			if (state == State.HasParentHwnd) {

				// Create a JavaFX frame inside the native dialog
				embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, scene, (succ, ex) -> {
					if (ex == null) {
						// Ensure the JavaFX frame is in the foreground.
						long hwndChild = embeddedFrame.getWindowHandle();
						JoaDll.nativeActivateSceneInDialog(hwndChild);
					} else if (asyncResult != null) {
						asyncResult.setAsyncResult(null, ex);
					}
				});

				this.asyncResult = asyncResult;

			} else {
				asyncResult.setAsyncResult(null, new IllegalStateException(
						"Excpected response from Office application."));
				dialogHandler.onClosed();
			}

		} catch (Throwable ex) {
			if (asyncResult != null) {
				asyncResult.setAsyncResult(null, ex);
			}
			if (dialogHandler != null) {
				dialogHandler.onClosed();
			}
		}
	}

	@SuppressWarnings("deprecation")
	private void maybeSetWidthAndHightFromSceneExtent(Scene scene) {
		if (width == 0 || height == 0) {
			scene.impl_preferredSize();
			double sceneWidth = scene.getWidth();
			double sceneHeight = scene.getHeight();
			if (width == 0) {
				width = sceneWidth + 20;
			}
			if (height == 0) {
				height = sceneHeight + 40;
			}
		}
	}

	private class DialogEventHandler extends DispatchImpl implements _IJoaBridgeDialogEvents {

		@Override
		public void onShow(final Long hwndParent) throws ComException {
			synchronized (ModalDialogFX.this) {
				ModalDialogFX.this.hwndParent = hwndParent;
				ModalDialogFX.this.state = State.HasParentHwnd;
				ModalDialogFX.this.notify();
			}
		}

		@Override
		public void onSystemMenuClose() throws ComException {
			ModalDialogFX.this.onSystemMenuClose();
		}

		@Override
		public void onClosed() throws ComException {
			if (ModalDialogFX.this.joaDlg != null) {
				Dispatch.releaseEvents(ModalDialogFX.this.joaDlg, this);
			}
			if (ModalDialogFX.this.embeddedFrame != null) {
				ModalDialogFX.this.embeddedFrame.close();
			}

			synchronized (ModalDialogFX.this) {
				ModalDialogFX.this.state = State.IsClosed;
				ModalDialogFX.this.notify();
			}
		}

	}

	@Override
	public long getWindowHandle() {
		return joaDlg.getHWND();
	}
}
