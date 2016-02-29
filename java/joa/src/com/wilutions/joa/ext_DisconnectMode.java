/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.mslib.office.MsoExtraInfoMethod;

/**
 * Disconnect mode.
 * @see <a href="http://msdn.microsoft.com/en-us/library/extensibility.ext_disconnectmode.aspx">ext_disconnectmode</a>
 */
public enum ext_DisconnectMode {
	
	ext_dm_HostShutdown(0),
	ext_dm_UserClosed(1),
	ext_dm_UISetupComplete(2),
	ext_dm_SolutionClosed(3);
	
	public final int value;

	private ext_DisconnectMode(int value) {
		this.value = value;
	}

	public static ext_DisconnectMode valueOf(int value) {
		switch (value) {
		case 0:
			return ext_dm_HostShutdown;
		case 1:
			return ext_dm_UserClosed;
		case 2:
			return ext_dm_UISetupComplete;
		case 3:
			return ext_dm_SolutionClosed;
		default:
			throw new IllegalArgumentException(value + " is not a valid value for " + MsoExtraInfoMethod.class);
		}
	}
	
}
