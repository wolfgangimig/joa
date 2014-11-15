package com.wilutions.joa;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.joa.fx.EmbeddedWindow;
import com.wilutions.joa.fx.EmbeddedWindowFactory;
import com.wilutions.joactrllib.IJoaBridgeDialog;
import com.wilutions.joactrllib._IJoaBridgeDialogEvents;

/**
 * This is the base class for all modal dialogs.
 *
 * @param <T>
 *            Result type of callback expression.
 */
public abstract class ModalDialog<T> {

	/**
	 * Helper object to show an empty modal dialog in the UI thread of Outlook.
	 */
	protected IJoaBridgeDialog joaDlg;

	/**
	 * JavaFX frame window placed inside the {@link #joaDlg}.
	 */
	private EmbeddedWindow fxFrame;

	/**
	 * Native window handle of the {@link #joaDlg}
	 */
	private long hwndParent;

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
	 * Event handlers usually added to a Stage. Currently, only
	 * WindowEvent.WINDOW_SHOWN is supported.
	 */
	private EventHandler<WindowEvent> eventHandlerWindowShown;

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
	 * Create JavaFX scene.
	 * 
	 * @return Scene object
	 * @throws ComException
	 */
	protected abstract Scene createScene() throws ComException;

	/**
	 * Constructor.
	 */
	public ModalDialog() {
	}

	/**
	 * Show the dialog box.
	 * 
	 * @param _owner
	 *            Owner object, either explorer or inspector window.
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
	@SuppressWarnings("unchecked")
	public <E extends Event> void addEventHandler(EventType<E> eventType, EventHandler<? super E> eventHandler) {
		assert eventType == WindowEvent.WINDOW_SHOWN;
		assert eventHandler != null;
		eventHandlerWindowShown = (EventHandler<WindowEvent>) eventHandler;
	}

	private Integer toWin(double x) {
		return Double.valueOf(x).intValue();
	}

	@SuppressWarnings({ "rawtypes" })
	private void internalShowAsync(Object _owner, AsyncResult<T> asyncResult) {

		// Is the owner a COM object or another ModalDialog?
		// A COM object has to implement IOleWindow.
		Dispatch dispOwner = null;
		long hwndOwner = 0;
		if (_owner instanceof ModalDialog) {
			hwndOwner = ((ModalDialog) _owner).joaDlg.getHWND();
		} else if (_owner instanceof Dispatch) {
			dispOwner = (Dispatch) _owner;
		}
		assert hwndOwner != 0 || dispOwner != null;

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
				fxFrame = EmbeddedWindowFactory.getInstance().create(hwndParent, scene);

				Platform.runLater(() -> {
					
					// Ensure the JavaFX frame is in the foreground.
					long hwndChild = fxFrame.getWindowHandle();
					JoaDll.nativeActivateSceneInDialog(hwndChild);

					// Call event handler for WINDOW_SHOW
					if (eventHandlerWindowShown != null) {
						WindowEvent event = new WindowEvent(null, WindowEvent.WINDOW_SHOWN);
						eventHandlerWindowShown.handle(event);
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
			synchronized (ModalDialog.this) {
				ModalDialog.this.hwndParent = hwndParent;
				ModalDialog.this.state = State.HasParentHwnd;
				ModalDialog.this.notify();
			}
		}

		@Override
		public void onSystemMenuClose() throws ComException {
			ModalDialog.this.onSystemMenuClose();
		}

		@Override
		public void onClosed() throws ComException {
			if (ModalDialog.this.joaDlg != null) {
				Dispatch.releaseEvents(ModalDialog.this.joaDlg, this);
			}
			if (ModalDialog.this.fxFrame != null) {
				ModalDialog.this.fxFrame.dispose();
			}

			synchronized (ModalDialog.this) {
				ModalDialog.this.state = State.IsClosed;
				ModalDialog.this.notify();
			}
		}

	}
}
