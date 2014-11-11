package addin1;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import com.wilutions.com.ComException;
import com.wilutions.joa.TaskPane;
import com.wilutions.mslib.outlook._Explorer;

public class ExplorerTaskPane extends TaskPane {

	@Override
	protected Scene createScene() throws ComException {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));

		Label userName = new Label("Some text:");
		grid.add(userName, 0, 1, 2, 1);
		
		final TextField userTextField = new TextField();
		grid.add(userTextField, 1, 2);
		
		Button btn = new Button("...");
		grid.add(btn, 2, 2);

		Scene scene = new Scene(grid);

		btn.setOnAction((event) -> {
			System.out.println("btn onAction");

			Dialog1 dialog = new Dialog1();
			System.out.println("dialog=" + dialog);

			_Explorer explorer = Globals.getThisAddin().getApplication().ActiveExplorer();
			System.out.println("explorer=" + explorer);
			
			dialog.showAsync(explorer, (result, ex) -> {
				
				System.out.println("result=" + result);
				userTextField.setText(result);
				System.out.println("setText OK");
			});

		});
		
		return scene;
	}

}
