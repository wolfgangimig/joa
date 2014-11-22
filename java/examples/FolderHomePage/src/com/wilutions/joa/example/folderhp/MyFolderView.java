package com.wilutions.joa.example.folderhp;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import com.wilutions.joa.FolderView;
import com.wilutions.joa.MessageBox;

public class MyFolderView extends FolderView {

	@Override
	public Scene createScene() {
		GridPane grid = new GridPane();
		
		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0, 2, 1);

		TextField textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);
        
        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
        	    "First", "Second", "Third")
        	);
        grid.add(cb, 0, 2);
        
        Button btn = new Button("Button");
        grid.add(btn, 0, 3);
		Tooltip btnTtip = new Tooltip();
		btnTtip.setText("Show a message box.");
		btn.setTooltip(btnTtip);

        Scene scene = new Scene(grid);
        
        btn.setOnAction((e) -> {
        	MessageBox.show(this, "Message", "You pressed a button.", (result, ex) -> {
        		System.out.println("MessageBox closed by button=" + result);
        	});

        });

        return scene;
	}

}
