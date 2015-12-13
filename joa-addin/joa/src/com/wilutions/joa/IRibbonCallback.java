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

@CoInterface(guid="{B65AD801-ABAF-11D0-BB8B-00A0C90F2744}")
public interface IRibbonCallback extends IDispatch {
	public void onButtonClicked(IDispatch ribbonControl) throws ComException;
}
