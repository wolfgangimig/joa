package swaddin;

import java.awt.Component;
import java.awt.TextField;

import com.wilutions.joa.swing.MessageBoxSwing;
import com.wilutions.joa.swing.ModalDialogSwing;

import learn.CelsiusConverterGUI;

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
			MessageBoxSwing.create(this).title("Confirm").text("Are you sure to close the dialog?").button(1, "YES")
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
