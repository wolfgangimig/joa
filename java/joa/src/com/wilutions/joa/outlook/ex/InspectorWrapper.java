/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook.ex;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.InspectorEvents_10;

public class InspectorWrapper extends DispatchImpl implements InspectorEvents_10 {

	protected final Inspector inspector;

	public InspectorWrapper(Inspector inspector) throws ComException {
		this.inspector = inspector;
		Dispatch.withEvents(inspector, this);
	}
	
	public Inspector getInspector() {
		return inspector;
	}
	
	@Override
	public void onActivate() throws ComException {
	}

	@Override
	public void onDeactivate() throws ComException {
	}

	@Override
	public void onClose() throws ComException {
		if (inspector != null) {
			inspector.releaseEvents(this);
			inspector.releaseComObject();
			InspectorWrappers.remove(this);
			System.out.println("release inspector");
		}
	}

	@Override
	public void onBeforeMaximize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeMinimize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeMove(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onBeforeSize(ByRef<Boolean> Cancel) throws ComException {
	}

	@Override
	public void onPageChange(String ActivePageName) throws ComException {
	}

	@Override
	public void onAttachmentSelectionChange() throws ComException {
	}

}