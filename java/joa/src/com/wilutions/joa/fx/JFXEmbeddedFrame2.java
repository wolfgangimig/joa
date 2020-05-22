/*
    Copyright (c) 2014 Wolfgang Imig
    All Rights Reserved.
 */
package com.wilutions.joa.fx;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowsUtil;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 * AWT frame object to embed a JavaFX scene as a child window into a native
 * window.
 *
 */
public class JFXEmbeddedFrame2 implements EmbeddedWindow {

	private long hwndParent;
	private Stage stage;
	private long hwndStage;
	private boolean firstMouseMove = true;
	private double[] lastPos = new double[6];
	private static Logger log = Logger.getLogger(JFXEmbeddedFrame2.class.getName());

	public JFXEmbeddedFrame2(long hwndParent, Scene scene) {

		if (!Platform.isFxApplicationThread()) {
			throw new IllegalStateException("This object must be created in the JavaFX application thread.");
		}

		this.hwndParent = hwndParent;
		stage = new Stage(StageStyle.UNDECORATED);
		stage.setScene(scene);
		
		// Die Men�-Eintr�ge und Combobox-Listen werden von JavaFX
		// relativ zum scene.getWindow() positioniert. Dies hat in
		// unserem Fall zun�chst die Position (0/0). Wenn das
		// Anwendungsfenster (Outlookfenster) verschoben wird,
		// bleibt die Postion auch unver�ndert. Die Men�-Eintr�ge
		// werden also nach dem Verschieben des Anwendungsfensters
		// falsch plaziert.
		// Um dieses Problem zu beheben, registriere ich einen
		// Mouse-Listener, der die Position des screen.getWindow()
		// anpasst.
		scene.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_ENTERED, (event) -> {
			assert scene != null;
			
			try {
				final double[] xy = new double[6];
				JoaDll.nativeGetWindowClientAreaPos(this.hwndParent, xy);
				boolean posChanged = false;
				for (int i = 0; i < xy.length && !posChanged; i++) {
					posChanged = xy[i] != lastPos[i];
				}
				
				if (posChanged && !firstMouseMove) {
					
					double scaleX = xy[4];
					double scaleY = xy[5];
					double moveX = (xy[0] - lastPos[0]) / scaleX;
					double moveY = (xy[1] - lastPos[1]) / scaleY;
					
					lastPos = xy;
					Platform.runLater(() -> {
	
						final Window w = stage; // scene.getWindow();
	//					System.out.println("w=" + w.getX() + "," + w.getY() + "," + w.getWidth() + "," + w.getHeight() + "");
	//					System.out.println("xy=" + Arrays.toString(xy));
						
						// This does not really move the window since moving is blocked
						// by the window-subclass assigned in JoaDll.nativeSetParent.
						w.setX(xy[0] / xy[4]);
						w.setY(xy[1] / xy[5]);

//						w.setX(w.getX() + moveX);
//						w.setY(w.getY() + moveY);
						System.out.println("moveX=" + moveX + ", moveY=" + moveY);
					});
				}
				
				firstMouseMove = false;
			}
			catch (Exception ex) {
				log.log(Level.SEVERE, "MOUSE_ENTERED failed.", ex);
			}
		});

		stage.show();

		this.hwndStage = WindowsUtil.getWindowHandle(stage);
		JoaDll.nativeSetParent(stage, this.hwndParent, this.hwndStage, 0, 0);
		
//		JoaDll.nativeGetWindowClientAreaPos(this.hwndParent, lastPos);
//		log.info("position=" + Arrays.toString(lastPos));
//		System.out.println("parent assigned");
	}

	@Override
	public void dispose() {
		Platform.runLater(() -> {
			stage.close();
		});
	}

	@Override
	public Window getWindow() {
		return stage;
	}

}
