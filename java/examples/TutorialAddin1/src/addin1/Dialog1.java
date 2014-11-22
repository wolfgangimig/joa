package addin1;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
		
		VBox root = new VBox();

		MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        menuFile.getItems().addAll(newFile, openFile);
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        root.getChildren().add(menuBar);
        
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));
		root.getChildren().add(grid);
		
		Text text = new Text("Enter some text and click a button.");
		grid.add(text, 0, 0, 2, 1);

		textField = new TextField();
		grid.add(textField, 0, 1, 2, 1);

        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(
        	    "First", "Second", "Third")
        	);
        grid.add(cb, 0, 2, 2, 1);
        
		Button bnOK = new Button("OK");
		grid.add(bnOK, 0, 3);
		bnOK.setDefaultButton(true);

		Button bnCancel = new Button("Cancel");
		grid.add(bnCancel, 1, 3);
		bnCancel.setCancelButton(true);

		bnOK.setOnAction((e) -> {
			Dialog1.this.finish(textField.getText());
		});

		bnCancel.setOnAction((e) -> {
			Dialog1.this.finish("");
		});

		
		Scene dialog = new Scene(root);

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
