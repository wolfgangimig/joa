/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.com.CoInterface;
import com.wilutions.com.ComException;
import com.wilutions.com.IDispatch;

@CoInterface(guid="{000C0396-0000-0000-C000-000000000046}")
public interface IRibbonExtensibility extends IDispatch {
	public String GetCustomUI(String RibbonID) throws ComException;
}
