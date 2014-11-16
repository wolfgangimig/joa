/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.example.cnaddin;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.JoaDll;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorEvents;
import com.wilutions.mslib.outlook._Inspector;

public class InspectorWrapper extends DispatchImpl implements InspectorEvents {

	Inspector inspector;
	NoteTaskPane taskPane;

	public InspectorWrapper(_Inspector _i) throws ComException {
		this.inspector = Dispatch.as(_i, Inspector.class);
		Dispatch.withEvents(inspector, this);
		
		taskPane = new NoteTaskPane(this.inspector);

		Globals.getThisAddin().createTaskPaneWindowAsync(taskPane, "Note", inspector, null);
	}

	public void setTaskPaneVisible(boolean v) throws ComException {
		taskPane.setVisible(v);
	}

	public boolean getTaskPaneVisible() throws ComException {
		return taskPane.isVisible();
	}

	@Override
	public void onActivate() throws ComException {
		System.out.println("InspectorWrapper.onActivate " + this);
	}

	@Override
	public void onDeactivate() throws ComException {
		System.out.println("InspectorWrapper.onDeactivate " + this);
	}

	@Override
	public void onClose() throws ComException {
		System.out.println("InspectorWrapper.onClose " + this);
		if (taskPane != null) {
			taskPane.close();
			Globals.getThisAddin().getTaskPanes().remove(taskPane);
		}
		if (inspector != null) {
			inspector.releaseComObject();
			Globals.getThisAddin().getInspectorWrappers().remove(inspector);
		}
		JoaDll.dumpComReferenceMap("InspectorWrapper.onClose");
	}

}