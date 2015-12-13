package custapp;

import java.awt.Component;

import learn.CelsiusConverterGUI;

import com.wilutions.joa.swing.FormPageSwing;

public class MyFormPageSwing extends FormPageSwing {

	@Override
	public Component createFrameContent() {
		CelsiusConverterGUI dummy = new CelsiusConverterGUI();
		Component p = dummy.getContentPane();
		return p;
	}

}
