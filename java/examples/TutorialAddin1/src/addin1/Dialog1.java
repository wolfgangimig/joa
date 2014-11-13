package addin1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import com.wilutions.com.ComException;
import com.wilutions.joa.MessageBox;
import com.wilutions.joa.ModalDialog;

public class Dialog1 extends ModalDialog<String> {

	TextField textField;

	public Dialog1() {
		setTitle("Tutorial Dialog");
	}

	@Override
	protected Scene createScene() throws ComException {

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));

		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0, 2, 1);

		textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);

		Button bnOK = new Button("OK");
		grid.add(bnOK, 0, 2);
		bnOK.setDefaultButton(true);

		Button bnCancel = new Button("Cancel");
		grid.add(bnCancel, 1, 2);
		bnCancel.setCancelButton(true);

		bnOK.setOnAction((e) -> {
			Dialog1.this.finish(textField.getText());
		});

		bnCancel.setOnAction((e) -> {
			Dialog1.this.finish("");
		});

		Scene dialog = new Scene(grid);

		return dialog;
	}

	@Override
	public void onSystemMenuClose() {

		boolean hasText = textField.getText().length() != 0;
		if (hasText) {
			MessageBox.create(this).title("Confirm").text("Are you sure to close the dialog?")
				.button(1, "YES")
				.button(0, "NO").focus().cancel().bdefault()
				.show((result, ex) -> {
					if (result == OK) {
						Dialog1.this.finish("");
					}
				});
		} else {
			super.onSystemMenuClose();
		}
	}
}
