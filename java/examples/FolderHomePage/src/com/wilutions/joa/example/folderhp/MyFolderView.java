package com.wilutions.joa.example.folderhp;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import com.wilutions.joa.MessageBox;
import com.wilutions.joa.outlook.FolderView;

public class MyFolderView extends FolderView {
	
	

	@Override
	public Scene createScene() {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text text = new Text("JavaFX Folder View");
		text.setId("welcome-text");
		
		grid.add(text, 0, 0, 2, 1);

		TextField textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);

		ComboBox<String> cb = new ComboBox<String>(FXCollections.observableArrayList("First", "Second", "Third"));
		grid.add(cb, 0, 2);
		ChoiceBox<String> cb2 = new ChoiceBox<String>(FXCollections.observableArrayList("Alpha", "Beta", "Gamma"));
		grid.add(cb2, 1, 2);
		
		CheckBox ck = new CheckBox("Check Toggle Button on Ribbon Bar");
		grid.add(ck, 0, 3, 2, 1);

		Button btn = new Button("Button");
		grid.add(btn, 0, 4);
		Tooltip btnTtip = new Tooltip();
		btnTtip.setText("Show a message box.");
		btn.setTooltip(btnTtip);

		Scene scene = new Scene(grid);

		scene.getStylesheets().add(MyFolderView.class.getResource("MyFolderView.css").toExternalForm());

		btn.setOnAction((e) -> {
			MessageBox.show(this, "Message", "You pressed a button.", (result, ex) -> {
				System.out.println("MessageBox closed by button=" + result);
			});

		});
		
		ck.setOnAction((e) -> {
			Globals.getThisAddin().setFvButtonPressed(ck.isSelected());
		});

		return scene;
	}

}
