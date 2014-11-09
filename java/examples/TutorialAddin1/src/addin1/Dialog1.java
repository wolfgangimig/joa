package addin1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import com.wilutions.com.ComException;
import com.wilutions.joa.ModalDialog;

public class Dialog1 extends ModalDialog<String> {

	public Dialog1() {
		setTitle("Tutorial Dialog");
		setWidth(300);
		setHeight(200);
	}

	@Override
	protected Scene createScene() throws ComException {
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0, 2, 1);
		
		final TextField textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);

		Button bnOK = new Button("OK");
		grid.add(bnOK, 0, 2);
		Button bnCancel = new Button("Cancel");
		grid.add(bnCancel, 1, 2);
		
		bnOK.setOnAction((e)-> {
			Dialog1.this.finish(textField.getText());
		});

		bnCancel.setOnAction((e)-> {
			Dialog1.this.finish("");
		});

		Scene dialog = new Scene(grid);
		return dialog;
	}

}
