/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

/**
 * Load behavior values.
 * This values control when the host application loads the Addin.
 * During registration, the value is written into the registry:
 * HKEY_CURRENT_USER\Software\Microsoft\Office\Outlook\Addins\&lt;progid&gt;\LoadBehavior
 * @see  <a href="http://msdn.microsoft.com/en-us/library/office/aa209964(v=office.11).aspx"></a>
 * @see DeclAddin#loadBehavior()
 */
public enum LoadBehavior {
	
	/**
	 * The Addin is not loaded.
	 */
	DoNotLoad(0),
	
	/**
	 * The Addin is loaded on startup.
	 * Outlook loads the Adding during startup. This is shown in the splash screen.
	 * The method IDTExtensibiltiy2.onConnection is called with ext_ConnectMode.ext_cm_Startup.
	 * If the Addin loads slowly, Outlook might decide to set the load state to {@link #DoNotLoad}.
	 */
	LoadOnStart(3),
	
	/**
	 * The Addin is loaded on startup by the JOA Util Addin.
	 * With this option, the Addin is loaded in the onStartupComplete of the JAO Util Addin. 
	 * Outlook does not track the load time under this mode and it does not disable the Addin,
	 * if it requires a long time to load. 
	 */
	LoadByJoaUtil(1024),
	
	/**
	 * The Addin is loaded on demand.
	 * Outlook loads the Addin after it has created its main window.
	 * The method IDTExtensibiltiy2.onConnection is called with ext_ConnectMode.ext_cm_AfterStartup.
	 */
	LoadOnDemand(8),
	
	/**
	 * Addin is loaded on startup only once.
	 * If Outlook reads this value, it loads the Addin on startup.
	 * Then, Outlook switches the value (under HKEY_CURRENT_USER...) to 9,
	 * which includes bit LoadOnDemand. 
	 * The Addin should add any controls to the user interface of Outlook (e.g. Ribbon tab),
	 * otherwise it might never be loaded.
	 * This value is the default for Addins registered with JOA.
	 */
	LoadOnStartFirstTime(16); 
	
	public final int value;
	private LoadBehavior(int value) { this.value = value; }
}
