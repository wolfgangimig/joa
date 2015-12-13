/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.example.cnaddin;

import com.wilutions.com.ComException;
import com.wilutions.com.Dispatch;
import com.wilutions.com.IDispatch;
import com.wilutions.mslib.outlook.Inspector;
import com.wilutions.mslib.outlook.OlObjectClass;
import com.wilutions.mslib.outlook._Application;
import com.wilutions.mslib.outlook._Inspector;
import com.wilutions.mslib.outlook._Inspectors;
import com.wilutions.mslib.outlook._NameSpace;

public class InspectorsDummy implements _Inspectors {

	@Override
	public _Application getApplication() throws ComException {
		
		return null;
	}

	@Override
	public OlObjectClass getClass_() throws ComException {
		
		return null;
	}

	@Override
	public _NameSpace getSession() throws ComException {
		
		return null;
	}

	@Override
	public Dispatch getParent() throws ComException {
		
		return null;
	}

	@Override
	public Integer getCount() throws ComException {
		
		return null;
	}

	@Override
	public Inspector Item(Object Index) throws ComException {
		
		return null;
	}

	@Override
	public _Inspector Add(IDispatch Item) throws ComException {
		
		return null;
	}

}
