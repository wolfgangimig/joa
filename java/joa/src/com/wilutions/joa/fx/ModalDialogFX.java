package com.wilutions.joa.fx;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowHandle;
import com.wilutions.joa.OfficeAddin;
import com.wilutions.joactrllib.IJoaBridgeDialog;
import com.wilutions.joactrllib._IJoaBridgeDialogEvents;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * This is the base class for all modal dialogs.
 *
 * @param <T>
 *            Result type of callback expression.
 */
public abstract class ModalDialogFX<T> implements FrameContentFactory {

	private static Logger log = Logger.getLogger(ModalDialogFX.class.getName());

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
	 * JavaFX stage. If the owner is a JavaFX window, the dialog is created
	 * entirely with JavaFX functionality. Either {@link #joaDlg} or
	 * {@link #fxDlg} is set.
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
	 * If _owner is an instance of Explorer or Inspector, this function opens a dialog box modal to the given explorer or inspector window. 
	 * As a disadvantage, the dialog title is not shown activated when an input element in the form is active.  
	 * 
	 * If _owner is an instance of javafx.stage.Window, this function shows a dialog box modal to the given Window. 
	 * The underlying explorer* or inspector window is not blocked.
	 * 
	 * @param _owner
	 *            Owner object, explorer or inspector window, an
	 *            implementation of WindowHandle, or a javafx.stage.Window.
	 *            
	 * @param asyncResult
	 *            Callback expression which is called, when the dialog is
	 *            closed.
	 */
	public void showAsync(Object _owner, final AsyncResult<T> asyncResult) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "showAsync(");
		if (Platform.isFxApplicationThread()) {
			internalShowAsyncInFxThread(_owner, asyncResult);
		}
		else {
			Platform.runLater(() -> internalShowAsyncInFxThread(_owner, asyncResult));
		}
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")showAsync");
	}


	/**
	 * Close dialog and invoke callback expression.
	 * 
	 * @param result
	 *            Object to be passed to the callback expression.
	 * @see #showAsync(Object, AsyncResult)
	 */
	public void finish(T result) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "finish(");
		setResult(result);
		close();
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")finish");
	}

	/**
	 * Close dialog. Invokes the callback expression with the current value of
	 * {@link #result}.
	 * 
	 * @see #finish(Object)
	 * @see #setResult(Object)
	 */
	public void close() {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "finish(");
		Throwable ex = null;
		if (joaDlg != null) {
			try {
				if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "joaDlg.Close()");
				joaDlg.Close();
			}
			catch (Throwable ex1) {
				ex = ex1;
			}
		}
		if (fxDlg != null) {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "fxDlg.close()");
			fxDlg.close();
		}
		if (asyncResult != null) {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "setAsyncResult");
			final Throwable fex = ex; 
			BackgTask.run(() -> {
				asyncResult.setAsyncResult(result, fex);
			});
		}
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")finish");
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
	 * @throws ComException Thrown, if a COM related error occurs.
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
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "internalShowFxDialogAsync(" + fxOwner);
		try {
			fxDlg = new Stage();
			fxDlg.initOwner(fxOwner);
			fxDlg.setTitle(title);
			fxDlg.initModality(Modality.APPLICATION_MODAL);
			Scene scene = createScene();
			fxDlg.setScene(scene);
			fxDlg.showAndWait();
		}
		catch (Throwable e) {
			log.log(Level.SEVERE, "internalShowFxDialogAsync failed", e);
			asyncResult.setAsyncResult(getResult(), e);
		}
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")internalShowFxDialogAsync");
	}

	private void internalShowAsyncInFxThread(Object _owner, AsyncResult<T> _asyncResult) {
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "internalShowAsyncInFxThread(" + _owner);
		
		this.asyncResult = _asyncResult != null ? _asyncResult : ((ret, ex) -> {}); 
		
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
		} else if (_owner instanceof ModalDialogFX) {
			@SuppressWarnings("rawtypes")
			ModalDialogFX modalDialog = ((ModalDialogFX)_owner);
			fxOwner = modalDialog.fxDlg;
			if (fxOwner == null && modalDialog.joaDlg != null) {
				hwndOwner = modalDialog.joaDlg.getHWND();
			}
		}
		
		if (hwndOwner == 0 && dispOwner == null && fxOwner == null) {
			Throwable ex = new IllegalStateException("Owner must not be null.");
			log.log(Level.SEVERE, "internalShowAsync failed", ex);
			asyncResult.setAsyncResult(null, ex);
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")internalShowAsync");
			return;
		}
		
		if (fxOwner != null) {
			internalShowFxDialogAsync(fxOwner, asyncResult);
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")internalShowAsync");
			return;
		}

		try {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "createScene");
			
			// Create the scene. Has to be implemented by subclass.
			Scene scene = createScene();

			// If width and height is not set, make the dialog
			// as large as the scene.
			maybeSetWidthAndHightFromSceneExtent(scene);

			// Show native dialog
			{
				final Dispatch fdispOwner = dispOwner;
				final long fhwndOwner = hwndOwner;
				BackgTask.run(() -> {

					// Create the native dialog object.
					// This is the task of the JOA Util Add-in. Because
					// the dialog has to be created in the UI thread
					// inside Outlook.
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "create joaDlg...");
					joaDlg = OfficeAddin.getJoaUtil().CreateBridgeDialog();
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "create joaDlg OK, " + joaDlg);

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
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "withEvents");
					DialogEventHandler dialogHandler = new DialogEventHandler();
					Dispatch.withEvents(joaDlg, dialogHandler);

					if (fdispOwner != null) {
						if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "showModal3");
						joaDlg.ShowModal3(fdispOwner);
					} else {
						if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "showModal2");
						joaDlg.ShowModal2(fhwndOwner);
					}
			
					// Wait until the native dialog fires the onShow
					// event which is implemented by the DialogEventHandler.
					// The hander stores the native dialog's window handle in hwndParent
					// and sets the state as State.HasParentHwnd
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "wait until initialized");
					synchronized (this) {
						while (state == State.Initialized) {
							try {
								this.wait();
							} catch (InterruptedException ex) {
								break;
							}
						}
					}
					if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "wait OK, state=" + state);
		
					// Native dialog initialized?
					if (state == State.HasParentHwnd) {
		
						if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "createAndShowEmbeddedWindowAsync");
		
						// Create a JavaFX frame inside the native dialog
						embeddedFrame.createAndShowEmbeddedWindowAsync(hwndParent, scene, (succ, ex) -> {
							if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "createAndShowEmbeddedWindowAsync result=" + succ + ", ex=" + ex);
							if (ex == null) {
								// Ensure the JavaFX frame is in the foreground.
								long hwndChild = embeddedFrame.getWindowHandle();
								JoaDll.nativeActivateSceneInDialog(hwndChild);
							} else {
								asyncResult.setAsyncResult(null, ex);
							}
						});
		
					} else {
						Throwable ex = new IllegalStateException("Excpected response from Office application.");
						log.log(Level.SEVERE, "Failed to show dialog", ex);
						asyncResult.setAsyncResult(null, ex);
						dialogHandler.onClosed();
					}
					
				});
			}

		} catch (Throwable ex) {
			log.log(Level.SEVERE, "Failed to show dialog", ex);
			asyncResult.setAsyncResult(null, ex);
		}
		
		if (log.isLoggable(Level.FINE)) log.log(Level.FINE, ")internalShowAsyncInFxThread");
	}

	private void maybeSetWidthAndHightFromSceneExtent(Scene scene) {
		if (width == 0 || height == 0) {
			
			try {
				Method m = Scene.class.getDeclaredMethod("preferredSize");
				m.setAccessible(true);
				m.invoke(scene);
			} catch (Exception e) {
				log.log(Level.WARNING, "Failed to compute dialog size.", e);
			}
			
			// scene.impl_preferredSize();
			
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
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "onShow(" + hwndParent  + ")");
			synchronized (ModalDialogFX.this) {
				ModalDialogFX.this.hwndParent = hwndParent;
				ModalDialogFX.this.state = State.HasParentHwnd;
				ModalDialogFX.this.notify();
			}
		}

		@Override
		public void onSystemMenuClose() throws ComException {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "onSystemMenuClose()");
			ModalDialogFX.this.onSystemMenuClose();
		}

		@Override
		public void onClosed() throws ComException {
			if (log.isLoggable(Level.FINE)) log.log(Level.FINE, "onClosed()");
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

}