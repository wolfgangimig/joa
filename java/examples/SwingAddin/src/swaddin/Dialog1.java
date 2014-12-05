package swaddin;

import java.awt.Component;

import javax.swing.JComponent;

import javafx.scene.control.TextField;
import learn.CelsiusConverterGUI;
import learn.ComboBoxDemo;

import com.wilutions.joa.fx.MessageBox;
import com.wilutions.joa.swing.ModalDialogSwing;

public class Dialog1 extends ModalDialogSwing<String> {

	TextField textField;

	public Dialog1() {
		setTitle("Tutorial Dialog");
	}

	@Override
	public Component createFrameContent() {
		CelsiusConverterGUI dummy = new CelsiusConverterGUI();
		Component p = dummy.getContentPane();
		return p;
		
//		JComponent newContentPane = new ComboBoxDemo();
//		return newContentPane;
	}

	@Override
	public void onSystemMenuClose() {
		
		//super.onSystemMenuClose();

		boolean hasText = true;
		if (hasText) {
			MessageBox.create(this).title("Confirm").text("Are you sure to close the dialog?").button(1, "YES")
					.button(0, "NO").focus().cancel().bdefault().show((result, ex) -> {
						if (result == OK) {
							Dialog1.this.finish("");
						}
					});
		} else {
			super.onSystemMenuClose();
		}
	}
}
