package com.wilutions.joa.example.folderhp;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;

import com.wilutions.joa.FolderView;
import com.wilutions.joa.MessageBox;

public class CRMTodayView extends FolderView {

	@Override
	public Scene createScene() {
		GridPane grid = new GridPane();
		
		MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        menuFile.getItems().addAll(newFile, openFile);
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        grid.add(menuBar, 0, 0);
        
        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
        	    "First", "Second", "Third")
        	);
        grid.add(cb, 0, 1);
        
        Button clear = new Button("Klickme!");
        grid.add(clear, 0, 2);
        
        Scene scene = new Scene(grid);
        
        clear.setOnAction((e) -> {
        	MessageBox.show(this, "Message", "You pressed a button.", (result, ex) -> {
        		System.out.println("MessageBox closed by button=" + result);
        	});

        });

        return scene;
	}

}
