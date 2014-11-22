package com.wilutions.joa;

import javafx.event.Event;
import javafx.scene.Scene;

import com.wilutions.com.WindowHandle;
import com.wilutions.com.WindowsUtil;
import com.wilutions.joa.fx.EmbeddedWindow;

public abstract class FolderView implements WindowHandle {
	
	private String id;
	private EmbeddedWindow fxFrame;

	public FolderView() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public abstract Scene createScene(); 

	/**
	 * Receives WindowEvent.WINDOW_SHOWN.
	 * Property event.getSource() is null for WINDOW_SHOWN.
	 * @param event WindowEvent
	 */
	public void handleEvent(Event event) {
	}

	public EmbeddedWindow getFxFrame() {
		return fxFrame;
	}

	public void setFxFrame(EmbeddedWindow fxFrame) {
		this.fxFrame = fxFrame;
	}
	
	@Override
	public long getWindowHandle() {
		return WindowsUtil.getWindowHandle(fxFrame);
	}

}
