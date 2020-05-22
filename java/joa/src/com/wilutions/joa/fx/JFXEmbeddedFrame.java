/*
    Copyright (c) 2014 Wolfgang Imig
    All Rights Reserved.
 */
package com.wilutions.joa.fx;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowsUtil;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 * AWT frame object to embed a JavaFX scene as a child window into a native
 * window.
 *
 */
public class JFXEmbeddedFrame implements EmbeddedWindow {

	private long hwndParent;
	private Window stage;
	private long hwndStage;
	private java.awt.Frame frame;
	private JFXPanel fxPanel;
	private boolean firstMouseMove = true;
	private double[] lastPos = new double[6];
	private static Logger log = Logger.getLogger(JFXEmbeddedFrame.class.getName());

	public JFXEmbeddedFrame(long hwndParent, Scene scene) {

		if (!Platform.isFxApplicationThread()) {
			throw new IllegalStateException("This object must be created in the JavaFX application thread.");
		}

		this.hwndParent = hwndParent;
		
		try {
			EventQueue.invokeAndWait(() -> initAwtFrame(hwndParent, scene));
			
			fxPanel.setScene(scene);
			this.stage = scene.getWindow();
			
			this.hwndStage = WindowsUtil.getWindowHandle(this.frame);

		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void initAwtFrame(long hwndParent, Scene scene) {
		frame = (java.awt.Frame)JoaDll.createEmbeddedAwtFrame(hwndParent);
        fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(300, 200);
        frame.setVisible(true);
	}

	@Override
	public void dispose() {
		Platform.runLater(() -> {
			frame.setVisible(false);
		});
	}

	@Override
	public Window getWindow() {
		return stage;
	}

}
