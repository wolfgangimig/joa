package swaddin;

import java.awt.Component;

import learn.CelsiusConverterGUI;

import com.wilutions.joa.outlook.DeclFormRegion;
import com.wilutions.joa.outlook.MessageClass;
import com.wilutions.joa.swing.FormRegionSwing;

@DeclFormRegion(addinClass = SwingAddin.class, messageClasses = { MessageClass.Note })
public class MyFormRegion extends FormRegionSwing {

	@Override
	public Component createFrameContent() {
		CelsiusConverterGUI dummy = new CelsiusConverterGUI();
		Component p = dummy.getContentPane();
		return p;
	}


}
