package addin1;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import com.wilutions.com.ComException;
import com.wilutions.joa.fx.TaskPaneFX;

public class ExplorerTaskPane extends TaskPaneFX {
	
	@Override
	public Scene createFrameContent() throws ComException {
        GridPane grid = new GridPane();
        Button clear = new Button("Klickme!");
        GridPane.setConstraints(clear, 0, 0);
        grid.getChildren().add(clear);
        Scene scene = new Scene(grid);
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
