package com.wilutions.joa.fx;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowHandle;
import com.wilutions.com.WindowsUtil;

public class EmbeddedFrameFX implements WindowHandle {

	/**
	 * JavaFX view.
	 */
	protected volatile EmbeddedWindow window;

	/**
	 * Event handlers usually added to a Stage. Currently, only
	 * WindowEvent.WINDOW_SHOWN is supported.
	 */
	private EventHandler<WindowEvent> eventHandlerWindowShown;

	public void close() {

		// Remove the JavaFX view.
		if (window != null) {
			window.dispose();
		}
	}

	/**
	 * Create an embedded window and show the supplied content.
	 * @param hwndParent Parent window.
	 * @param frameContent Frame content
	 * @param asyncResult Expression that is called when the window is made visible. This expression is called on the toolkit's UI thread.
	 */
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final Scene frameContent,
			final AsyncResult<Boolean> asyncResult) {
		assert hwndParent != 0;
		assert frameContent != null;
		if (Platform.isFxApplicationThread()) {
			internalCreateAndShow(hwndParent, frameContent, asyncResult);
		} else {
			Platform.runLater(() -> {
				internalCreateAndShow(hwndParent, frameContent, asyncResult);
			});
		}
	}

	/**
	 * Create window content by the supplied factory and show an embedded window.
	 * @param hwndParent Parent window.
	 * @param contentFactory Frame content factory to create the content.
	 * @param asyncResult Expression that is called when the window is made visible. This expression is called on the toolkit's UI thread.
	 */
	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final FrameContentFactory contentFactory, final AsyncResult<Boolean> asyncResult) {
		assert hwndParent != 0;
		assert contentFactory != null;
		if (Platform.isFxApplicationThread()) {
			Scene frameContent = contentFactory.createScene();
			createAndShowEmbeddedWindowAsync(hwndParent, frameContent, asyncResult);
		} else {
			Platform.runLater(() -> {
				Scene frameContent = contentFactory.createScene();
				createAndShowEmbeddedWindowAsync(hwndParent, frameContent, asyncResult);
			});
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public long getWindowHandle() {
		return WindowsUtil.getWindowHandle(window);
	}

	/**
	 * Set event handler for WindowEvent.WINDOW_SHOWN. Only one hander is
	 * supported. Only WINDOW_SHOWN is supported. The handler receives null as
	 * source parameter.
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

	private void internalCreateAndShow(long hwndParent, Scene frameContent, AsyncResult<Boolean> asyncResult) {
		Throwable ex = null;
		try {
			// Create the Java window as a child window of the JoaBridgeCtrl.
			window = EmbeddedWindowFactory.getInstance().create(hwndParent, frameContent);

			

// Seems that it's not necessary to set the focus for dialogs.
// If the frame is shown for a FormRegion and this code is executed, 
// the focus is set into the first control of the FormRegion.
// This is not what we want if the FormRegion is part of a new mail or contact etc.

			// Ensure the JavaFX frame is in the foreground.
//			long hwndChild = WindowsUtil.getWindowHandle(window);
//			JoaDll.nativeActivateSceneInDialog(hwndChild);
			

			if (eventHandlerWindowShown != null) {
				WindowEvent event = new WindowEvent(null, WindowEvent.WINDOW_SHOWN);
				eventHandlerWindowShown.handle(event);
			}
		}
		catch (Throwable e) {
			ex = e;
		}
		finally {
			if (asyncResult != null) {
				asyncResult.setAsyncResult(ex == null, ex);
			}
		}
	}

}
