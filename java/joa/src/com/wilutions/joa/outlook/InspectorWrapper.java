/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa.outlook;

import com.wilutions.com.ByRef;
import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.outlook.InspectorEvents_10;
import com.wilutions.mslib.outlook._Inspector;

public class InspectorWrapper extends DispatchImpl implements InspectorEvents_10 {

	_Inspector inspector;

	public InspectorWrapper(_Inspector _i) throws ComException {
		inspector = _i;
		Dispatch.withEvents(inspector, this);
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
		if (inspector != null) {
			inspector.releaseComObject();
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
		System.out.println("page changed " + ActivePageName);
	}

	@Override
	public void onAttachmentSelectionChange() throws ComException {
	}

}