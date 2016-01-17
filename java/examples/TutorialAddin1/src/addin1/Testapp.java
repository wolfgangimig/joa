package addin1;

import java.io.File;
import java.util.Arrays;

import com.wilutions.joa.AddinApplication;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Testapp extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();
        Button button = new Button("Klickme!");
        Label label = new Label("Label");
        box.getChildren().addAll(button, label);
        
        label.setOnDragDetected(new EventHandler <MouseEvent>() {
            public void handle(MouseEvent event) {
                System.out.println("onDragDetected");
                
                Dragboard db = label.startDragAndDrop(TransferMode.COPY);
                
                ClipboardContent content = new ClipboardContent();
                content.putFiles(Arrays.asList(new File("d:\\projectavatar.svg")));
                db.setContent(content);
                
                event.consume();
            }
        });
        
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
