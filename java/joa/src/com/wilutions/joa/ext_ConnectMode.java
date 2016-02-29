/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.mslib.office.MsoExtraInfoMethod;

/**
 * Connect mode.
 * @see <a href="http://msdn.microsoft.com/en-us/library/extensibility.ext_connectmode.aspx">ext_connectmode</a>
 */
public enum ext_ConnectMode {
	
	ext_cm_AfterStartup(0),
	ext_cm_Startup(1), 
	ext_cm_External(2), 
	ext_cm_CommandLine(3), 
	ext_cm_Solution(4), 
	ext_cm_UISetup(5);

	public final int value;

	private ext_ConnectMode(int value) {
		this.value = value;
	}

	public static ext_ConnectMode valueOf(int value) {
		switch (value) {
		case 0:
			return ext_cm_AfterStartup;
		case 1:
			return ext_cm_Startup;
		case 2:
			return ext_cm_External;
		case 3:
			return ext_cm_CommandLine;
		case 4:
			return ext_cm_Solution;
		case 5:
			return ext_cm_UISetup;
		default:
			throw new IllegalArgumentException(value + " is not a valid value for " + MsoExtraInfoMethod.class);
		}
	}

}
