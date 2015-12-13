/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.fx;

import java.lang.reflect.Constructor;

import javafx.application.Platform;
import javafx.scene.Scene;

import com.wilutions.com.JoaDll;

public class EmbeddedWindowFactory {

	private EmbeddedWindowFactory() {
		try {
			embeddedWindowClass = Class.forName("com.wilutions.joa.fx.JFXEmbeddedFrame");
		} catch (ClassNotFoundException ignored) {
			embeddedWindowClass = JoaDll.nativeLoadEmbeddedWindowClass();
		}
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
			Constructor<?> constructor = embeddedWindowClass.getConstructor(long.class, Scene.class);
			EmbeddedWindow wnd = (EmbeddedWindow) constructor.newInstance(hwndParent, scene);
			return wnd;
		} catch (Throwable e) {
			throw new IllegalStateException(e);
		}

	}

	private static EmbeddedWindowFactory instance;
	private Class<?> embeddedWindowClass;
}
