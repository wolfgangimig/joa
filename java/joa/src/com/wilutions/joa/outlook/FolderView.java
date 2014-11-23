package com.wilutions.joa.outlook;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.WindowEvent;

import com.wilutions.com.WindowHandle;
import com.wilutions.com.WindowsUtil;
import com.wilutions.joa.fx.EmbeddedWindow;

public abstract class FolderView implements WindowHandle {
	
	private String id;
	private EmbeddedWindow fxFrame;

	/**
	 * Event handlers usually added to a Stage. Currently, only
	 * WindowEvent.WINDOW_SHOWN is supported.
	 */
	private EventHandler<WindowEvent> eventHandlerWindowShown;
	
	public FolderView() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	protected abstract Scene createScene(); 
	
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

	/**
	 * Receives WindowEvent.WINDOW_SHOWN.
	 * Property event.getSource() is null for WINDOW_SHOWN.
	 * @param event WindowEvent
	 */
	void handleEvent(WindowEvent event) {
		if (event.getEventType() == WindowEvent.WINDOW_SHOWN) {
			if (eventHandlerWindowShown != null) {
				eventHandlerWindowShown.handle(event);
			}
		}
	}

	void setFxFrame(EmbeddedWindow fxFrame) {
		this.fxFrame = fxFrame;
	}
	
	@Override
	public long getWindowHandle() {
		return WindowsUtil.getWindowHandle(fxFrame);
	}

}
