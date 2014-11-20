package com.wilutions.joa.example.folderhp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import com.wilutions.joa.WebView;

public class CRMTodayView extends WebView {

	@Override
	public Scene createScene() {
		GridPane grid = new GridPane();
        Button clear = new Button("Klickme!");
        GridPane.setConstraints(clear, 0, 0);
        grid.getChildren().add(clear);
        Scene scene = new Scene(grid);
        return scene;
	}

}
