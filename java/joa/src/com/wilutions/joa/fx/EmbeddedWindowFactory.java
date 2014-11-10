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

//	public void showModal(long hwndParent, Scene dialog) {
//		assert hwndParent != 0;
//		assert dialog != null;
//		assert Platform.isFxApplicationThread();
//
//		try {
//			final long hwndApp = JoaDll.nativeGetApplicationWindow(hwndParent);
//			
//			dialog.addEventHandler(WindowEvent.WINDOW_SHOWN, new EventHandler<WindowEvent>()
//			        {
//			            @Override
//			            public void handle(WindowEvent window)
//			            {
//			            	long hwndChild = WindowsUtil.getWindowHandle(dialog);
//			            	//JoaDll.nativeSetOwnerWindow(hwndChild, hwndApp);
//			            	//JoaDll.nativeEnableChildWindows(hwndApp, hwndChild, false);
//			            	JoaDll.nativeEnableWindow(hwndApp, false);
//			            }
//			        });
//
//			dialog.showAndWait();
//			JoaDll.nativeEnableWindow(hwndApp, true);
//			//oaDll.nativeEnableChildWindows(hwndApp, hwndChild, false);
//			
////			Constructor<?> constructor = embeddedWindowClass.getConstructor(long.class, Scene.class);
////			
////			GridPane grid = new GridPane();
////			Button clear = new Button("Klickme!");
////			GridPane.setConstraints(clear, 0, 0);
////			grid.getChildren().add(clear);
////			Scene scene = new Scene(grid);
////			
////			EmbeddedWindow wnd = (EmbeddedWindow) constructor.newInstance(hwndParent, scene);
////
////			dialog.initModality(Modality.APPLICATION_MODAL);
////			wnd.showModal(dialog);
//
//		} catch (Throwable e) {
//			throw new IllegalStateException(e);
//		}
//
//	}

	private static EmbeddedWindowFactory instance;
	private Class<?> embeddedWindowClass;
}
