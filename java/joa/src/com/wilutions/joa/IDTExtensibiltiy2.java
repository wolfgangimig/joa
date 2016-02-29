/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.com.ByRef;
import com.wilutions.com.CoInterface;
import com.wilutions.com.ComException;
import com.wilutions.com.IDispatch;

/**
 * COM interface for extending Microsoft Office application.
 * Hint: onDisconnection and onBeginShutdown are not called by Outlook, see http://stackoverflow.com/questions/4378203/excel-addin-ondisconnection-onbeginshutdown-not-called-on-logoff.
 * @see <a href="http://msdn.microsoft.com/en-us/library/extensibility.idtextensibility2.aspx">idtextensibility2</a>
 */
@CoInterface(guid="{B65AD801-ABAF-11D0-BB8B-00A0C90F2744}")
public interface IDTExtensibiltiy2 extends IDispatch {
	
	public void onConnection(IDispatch app, ext_ConnectMode connectMode, IDispatch addin, ByRef<Object[]> reserved) throws ComException;
	public void onDisconnection(ext_DisconnectMode removeMode, ByRef<Object[]> reserved)  throws ComException;
	public void onAddInsUpdate(ByRef<Object[]> reserved)  throws ComException;
	public void onStartupComplete(ByRef<Object[]> reserved) throws ComException;
	public void onBeginShutdown(ByRef<Object[]> reserved) throws ComException;
	
}
