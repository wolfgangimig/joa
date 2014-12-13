package com.wilutions.joa.example1;

import java.io.File;
import java.util.Date;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import com.wilutions.com.BackgTask;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.joa.fx.FormRegionFX;
import com.wilutions.joa.outlook.DeclFormRegion;
import com.wilutions.joa.outlook.MessageClass;
import com.wilutions.mslib.outlook.MailItem;
import com.wilutions.mslib.outlook.OlItemType;

@DeclFormRegion(addinClass = MyOutlookAddin.class, messageClasses = { MessageClass.Note })
public class MyFormRegion extends FormRegionFX {

	TextField name;
	TextField lastName;
	TextArea comment;

	@Override
	public void onShow() throws ComException {
		BackgTask.run(() -> {
			try {
				MailItem mailItem = formRegion.getItem().as(MailItem.class);
				final String to = mailItem.getTo();
				final String subject = mailItem.getSubject();
				final Date date = mailItem.getReceivedTime();
				Platform.runLater(() -> {
					name.setText(date.toString());
					lastName.setText(to);
					comment.setText(subject);
				});
			} catch (ComException ignored) {
			}
		});
	}

	public Scene createScene() {

		// Creating a GridPane container
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(5);
		grid.setHgap(5);
		// Defining the Name text field
		name = new TextField();
		name.setPromptText("Enter your 111 name.");
		name.setPrefColumnCount(10);
		name.getText();

		GridPane.setConstraints(name, 0, 0);
		grid.getChildren().add(name);
		// Defining the Last Name text field
		lastName = new TextField();
		lastName.setPromptText("Enter your last name.");
		GridPane.setConstraints(lastName, 0, 1);
		grid.getChildren().add(lastName);
		// Defining the Comment text field
		comment = new TextArea();
		comment.setPrefColumnCount(15);
		comment.setPromptText("Enter your comment.");
		GridPane.setConstraints(comment, 0, 2);
		grid.getChildren().add(comment);
		// Defining the Submit button
		Button submit = new Button("Submit");
		GridPane.setConstraints(submit, 1, 0);
		grid.getChildren().add(submit);

		// Defining the Clear button
		Button copy = new Button("Copy from Mail");
		copy.setTooltip(new Tooltip("Copy subject and date from mail."));
		GridPane.setConstraints(copy, 1, 1);
		grid.getChildren().add(copy);

		ChoiceBox<String> cbCats = new ChoiceBox<String>(FXCollections.observableArrayList("alpha", "beta", "gamma"));
		GridPane.setConstraints(cbCats, 0, 3);
		grid.getChildren().add(cbCats);

		final Scene scene = new Scene(grid);
		scene.setFill(Color.BLUE);

		submit.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				// Stage dialog = new Stage();
				// dialog.initStyle(StageStyle.UTILITY);
				// Scene scene = new Scene(new Group(new Text(25, 25,
				// "Hello World!")));
				// dialog.setScene(scene);
				// dialog.show();

				BackgTask.run(new Runnable() {
					public void run() {
						try {
							Dispatch mailItem = (Dispatch) MyOutlookAddin.getInstance().getApplication()
									.CreateItem(OlItemType.olMailItem);
							mailItem._call("Display");

						} catch (ComException e) {
							e.printStackTrace();
						} catch (Throwable e) {
							e.printStackTrace();
						}
					}
				});

			}
		});

		scene.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				if (db.hasFiles()) {
					event.acceptTransferModes(TransferMode.COPY);
				} else {
					event.consume();
				}
			}
		});

		// Dropping over surface
		scene.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				Dragboard db = event.getDragboard();
				boolean success = false;
				if (db.hasFiles()) {
					success = true;
					String filePath = null;
					for (File file : db.getFiles()) {
						filePath = file.getAbsolutePath();
						System.out.println(filePath);
					}
				}
				event.setDropCompleted(success);
				event.consume();
			}
		});

		return scene;
	}

}
