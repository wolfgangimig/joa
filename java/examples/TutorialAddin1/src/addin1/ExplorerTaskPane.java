package addin1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import com.wilutions.com.ComException;
import com.wilutions.joa.TaskPane;
import com.wilutions.mslib.outlook._Explorer;

public class ExplorerTaskPane extends TaskPane {

	@Override
	protected Scene createScene() throws ComException {
		GridPane grid = new GridPane();
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("User name:");
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
