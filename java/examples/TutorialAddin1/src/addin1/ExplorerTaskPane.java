package addin1;


import java.io.File;
import java.util.Arrays;

import com.wilutions.com.ComException;
import com.wilutions.joa.fx.TaskPaneFX;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class ExplorerTaskPane extends TaskPaneFX {
	
	@Override
	public Scene createScene() throws ComException {
        VBox box = new VBox();
        Button button = new Button("Klickme!");
        Label label = new Label("Label");
        box.getChildren().addAll(button, label);
        
        // https://github.com/wolfgangimig/joa/issues/7
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
        return scene;
    }
	
//	@Override
//	public void onVisibleStateChange(_CustomTaskPane ctp) throws ComException {
//		Globals.getThisAddin().getRibbon().InvalidateControl("JoaTaskPane");
//	}

//	@Override
//	protected Scene createScene() throws ComException {
//		GridPane grid = new GridPane();
//		grid.setHgap(10);
//		grid.setVgap(10);
//		grid.setPadding(new Insets(10));
//		
//		int row = 0;
//		
//		Button btn = new Button("Show Dialog");
//		grid.add(btn, 0, row++);
//		Tooltip btnTtip = new Tooltip();
//		btnTtip.setText("Show a modal dialog");
//		btn.setTooltip(btnTtip);
//		
//		Label userName = new Label("Received text:");
//		grid.add(userName, 0, row++, 2, 1);
//		
//		final TextField userTextField = new TextField();
//		grid.add(userTextField, 0, row++, 2, 1);
//		
//        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
//        	    "First", "Second", "Third")
//        	);
//        grid.add(cb, 0, row++, 2, 1);
//
//		Scene scene = new Scene(grid);
//
//		btn.setOnAction((event) -> {
//			
//			Dialog1 dialog = new Dialog1();
//			_Explorer owner = Globals.getThisAddin().getApplication().ActiveExplorer();
//			
//			dialog.showAsync(owner, (result, ex) -> {
//				if (result != null && result.length() != 0) {
//					userTextField.setText(result);
//				}
//			});
//
//		});
//		
//		return scene;
//	}

}
