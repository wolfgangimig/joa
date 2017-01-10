/*
    Copyright (c) 2014 Wolfgang Imig
    All Rights Reserved.
 */
package com.wilutions.joa.fx;

import java.util.Arrays;

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
public class JFXEmbeddedFrame implements EmbeddedWindow {

	private Stage stage;
	private double[] lastPos = new double[6];

	public JFXEmbeddedFrame(long hwndParent, Scene scene) {

		if (!Platform.isFxApplicationThread()) {
			throw new IllegalStateException("This object must be created in the JavaFX application thread.");
		}

		stage = new Stage(StageStyle.UNDECORATED);
		stage.setScene(scene);
		
		// Die Menü-Einträge und Combobox-Listen werden von JavaFX
		// relativ zum scene.getWindow() positioniert. Dies hat in
		// unserem Fall zunächst die Position (0/0). Wenn das
		// Anwendungsfenster (Outlookfenster) verschoben wird,
		// bleibt die Postion auch unverändert. Die Menü-Einträge
		// werden also nach dem Verschieben des Anwendungsfensters
		// falsch plaziert.
		// Um dieses Problem zu beheben, registriere ich einen
		// Mouse-Listener, der die Position des screen.getWindow()
		// anpasst.
		scene.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_ENTERED, (event) -> {
			assert scene != null;
			
			final double[] xy = new double[6];
			JoaDll.nativeGetWindowClientAreaPos(hwndParent, xy);
			boolean posChanged = false;
			for (int i = 0; i < xy.length && !posChanged; i++) {
				posChanged = xy[i] != lastPos[i];
			}
			
			if (posChanged) {
				lastPos = xy;
				Platform.runLater(() -> {

					final Window w = scene.getWindow();
//					System.out.println("w=" + w.getX() + "," + w.getY() + "," + w.getWidth() + "," + w.getHeight() + "");
//					System.out.println("xy=" + Arrays.toString(xy));
					
					// This does not really move the window since moving is blocked
					// by the window-subclass assigned in JoaDll.nativeSetParent.
					w.setX(xy[0] / xy[4]);
					w.setY(xy[1] / xy[5]);
				});
			}
		});

		stage.show();

		long hwndStage = WindowsUtil.getWindowHandle(stage);
		JoaDll.nativeSetParent(stage, hwndParent, hwndStage, 0, 0);
		System.out.println("parent assigned");
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
