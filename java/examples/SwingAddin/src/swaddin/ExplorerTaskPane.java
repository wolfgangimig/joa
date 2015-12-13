package swaddin;


import java.awt.Component;

import learn.CelsiusConverterGUI;

import com.wilutions.com.ComException;
import com.wilutions.joa.swing.TaskPaneSwing;

public class ExplorerTaskPane extends TaskPaneSwing {
	
	@Override
	public Component createFrameContent() throws ComException {
		CelsiusConverterGUI dummy = new CelsiusConverterGUI();
		Component p = dummy.getContentPane();
		return p;
    }
	
}
