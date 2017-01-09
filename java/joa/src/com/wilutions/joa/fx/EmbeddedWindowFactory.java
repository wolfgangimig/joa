/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.fx;

import javafx.application.Platform;
import javafx.scene.Scene;

public class EmbeddedWindowFactory {

	private EmbeddedWindowFactory() {
	}

	public static synchronized EmbeddedWindowFactory getInstance() {
		if (instance == null) {
			instance = new EmbeddedWindowFactory();
		}
		return instance;
	}

	public EmbeddedWindow create(long hwndParent, Scene scene) {

		assert hwndParent != 0;
		assert scene != null;
		assert Platform.isFxApplicationThread();

		try {
			EmbeddedWindow wnd = new JFXEmbeddedFrame(hwndParent, scene);
			return wnd;
		} catch (Throwable e) {
			throw new IllegalStateException(e);
		}

	}

	private static EmbeddedWindowFactory instance;
}
