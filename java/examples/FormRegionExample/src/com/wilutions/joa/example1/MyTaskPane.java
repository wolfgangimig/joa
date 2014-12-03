package com.wilutions.joa.example1;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import com.wilutions.com.AsyncResult;
import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.fx.TaskPaneFX;
import com.wilutions.mslib.office.CustomTaskPane;
import com.wilutions.mslib.office.MsoCTPDockPosition;
import com.wilutions.mslib.outlook.OlItemType;

public class MyTaskPane extends TaskPaneFX {

	@Override
	public void showAsync(CustomTaskPane taskPane, AsyncResult<Boolean> asyncResult) throws ComException {
		taskPane.setDockPosition(MsoCTPDockPosition.msoCTPDockPositionBottom);
		super.showAsync(taskPane, asyncResult);
	}

	@Override
	public Scene createFrameContent() throws ComException {

		// Creating a GridPane container
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		// Defining the Name text field
		TextField name = new TextField();
		name.setPromptText("Enter your 111 name.");
		name.setPrefColumnCount(10);
		name.getText();
		GridPane.setConstraints(name, 0, 0);
		grid.getChildren().add(name);
		
		// Defining the Last Name text field
		final TextField lastName = new TextField();
		lastName.setPromptText("Enter your last name.");
		GridPane.setConstraints(lastName, 0, 1);
		grid.getChildren().add(lastName);
		// Defining the Comment text field
		final TextField comment = new TextField();
		comment.setPrefColumnCount(15);
		comment.setPromptText("Enter your comment.");
		GridPane.setConstraints(comment, 0, 2);
		grid.getChildren().add(comment);
		// Defining the Submit button
		Button submit = new Button("Submit");
		GridPane.setConstraints(submit, 1, 0);
		grid.getChildren().add(submit);

		// Defining the Clear button
		Button clear = new Button("Hide Task Pane");
		GridPane.setConstraints(clear, 1, 1);
		grid.getChildren().add(clear);
		
		ComboBox<String> cbCats = new ComboBox<String>(FXCollections.observableArrayList("alpha", "beta", "gamma"));
		GridPane.setConstraints(cbCats, 0, 3);
		grid.getChildren().add(cbCats);

		final Scene scene = new Scene(grid);

		submit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				// Stage dialog = new Stage();
				// dialog.initStyle(StageStyle.UTILITY);
				// Scene scene = new Scene(new Group(new Text(25, 25,
				// "Hello World!")));
				// dialog.setScene(scene);
				// dialog.show();

				BackgTask.run(() -> {

					try {
						Dispatch mailItem = (Dispatch) MyOutlookAddin.getInstance().getApplication()
								.CreateItem(OlItemType.olMailItem);
						mailItem._call("Display");

					} catch (Throwable e) {
						e.printStackTrace();
					}
				});

			}
		});

		clear.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				try {
					customTaskPane.setVisible(false);
				} catch (ComException e) {
					e.printStackTrace();
				}
			}
		});

		return scene;
	}
}
