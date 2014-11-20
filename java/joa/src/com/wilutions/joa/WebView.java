package com.wilutions.joa;

import javafx.event.Event;
import javafx.scene.Scene;

import com.wilutions.joa.fx.EmbeddedWindow;

public abstract class WebView {
	
	private String id;
	private EmbeddedWindow fxFrame;

	public WebView() {
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
}
