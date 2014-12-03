package com.wilutions.joa.fx;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import com.wilutions.com.AsyncResult;
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

	protected void createAndShowEmbeddedWindowAsync(final long hwndParent, final FrameContentFactory sceneFactory, final AsyncResult<Boolean> asyncResult) {
		assert hwndParent != 0;
		assert sceneFactory != null;

		Platform.runLater(() -> {
			Throwable ex = null;
			try {
				Scene scene = sceneFactory.createFrameContent();
				
				// Create the Java window as a child window of the JoaBridgeCtrl.
				window = EmbeddedWindowFactory.getInstance().create(hwndParent, scene);

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
		});
		
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

}
