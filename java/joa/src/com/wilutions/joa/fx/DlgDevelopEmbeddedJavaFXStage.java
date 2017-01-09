package com.wilutions.joa.fx;

import com.wilutions.com.JoaDll;
import com.wilutions.com.WindowsUtil;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * This dialog was used to develop an embedded JavaFX stage.
 * It might be removed in a future version.
 *
 * @deprecated This class was only used for development. 
 */
@Deprecated 
public class DlgDevelopEmbeddedJavaFXStage extends javafx.application.Application {
	
	private static long hwndParent;
	
	public static void main(String[] args) {
		
		JoaDll.nativeInitLogger("d:\\temp\\log\\joa.log", "DEBUG", false);
		
		if (args.length > 0) hwndParent = Long.parseLong(args[0]);
		DlgDevelopEmbeddedJavaFXStage.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		VBox controls = new VBox();
		controls.setSpacing(8);
		controls.setPadding(new Insets(8));
		
		MenuButton mbutton = new MenuButton("Menu");
		MenuItem mi1 = new MenuItem("alpha");
		MenuItem mi2 = new MenuItem("beta");
		mbutton.getItems().addAll(mi1, mi2);
		controls.getChildren().add(mbutton);
		
		TextField textField = new TextField();
		textField.setTooltip(new Tooltip("Textfeld Tooltip"));
		controls.getChildren().add(textField);
		
		ComboBox<String> cb = new ComboBox<String>();
		cb.getItems().addAll("abc", "def", "ghi");
		controls.getChildren().add(cb);
		
		Button bnOpen = new Button("Open...");
		bnOpen.setOnAction((action) -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.showOpenDialog(primaryStage);
		});
		controls.getChildren().add(bnOpen);
		
		Button bnClose = new Button("Close");
		bnClose.setOnAction((action) -> {
			Platform.exit();
		});
		controls.getChildren().add(bnClose);
		
		Scene scene = new Scene(controls);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		
		primaryStage.show();
		
		
		long hwndStage = WindowsUtil.getWindowHandle(primaryStage);
		hwndStage = JoaDll.createEmbeddedFrame(hwndStage);
		
		System.out.println(hwndStage);
		System.out.flush();
		
	}

	
}
