/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;

/**
 * Helper class to register a Microsoft Office Addin with the Windows registry. 
 */
public class RegisterAddin {
	
	public static void register(boolean perUserNotMachine,
			Class<?> addinClass) throws ComException {
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException(
					"Failed to unregister Addin, missing annotation "
							+ CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException(
					"Failed to register Addin, missing annotation "
							+ DeclAddin.class);

		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();
		String name = addinAnnotation.friendlyName();
		String desc = addinAnnotation.description();
		int loadBehavior = addinAnnotation.loadBehavior().value;

		String key = rootKey + "\\Software\\Microsoft\\Office\\"
				+ officeApplication + "\\Addins\\" + progId;
		RegUtil.setRegistryValue(key, "FriendlyName", name);
		RegUtil.setRegistryValue(key, "Description", desc);
		RegUtil.setRegistryValue(key, "LoadBehavior", loadBehavior);

		if (RegUtil.is64() && !perUserNotMachine) {
			key = rootKey + "\\Software\\Wow6432Node\\Microsoft\\Office\\"
					+ officeApplication + "\\Addins\\" + progId;
			RegUtil.setRegistryValue(key, "FriendlyName", name);
			RegUtil.setRegistryValue(key, "Description", desc);
			RegUtil.setRegistryValue(key, "LoadBehavior", loadBehavior);
		}
		
		if (perUserNotMachine) {
			JoaDll.activateDisabledAddin(progId);
		}
		
		// Register ActiveX JoaBridgeCtrl.Class
		JoaDll.nativeDllRegisterServer(progId, perUserNotMachine, true);
		
	}
	
	public static void unregister(boolean perUserNotMachine,
			Class<?> addinClass) throws ComException {
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException(
					"Failed to unregister Addin, missing annotation "
							+ CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException(
					"Failed to register Addin, missing annotation "
							+ DeclAddin.class);

		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();
		
		String key = rootKey + "\\Software\\Microsoft\\Office\\"
				+ officeApplication + "\\Addins\\" + progId;
		RegUtil.purgeRegistryKey(key);
		
		if (RegUtil.is64() && !perUserNotMachine) {
			key = rootKey + "\\Software\\Wow6432Node\\Microsoft\\Office\\"
					+ officeApplication + "\\Addins\\" + progId;
			RegUtil.purgeRegistryKey(key);
		}
		
		// Delete Registry key where Outlook stores unspecified data about the Addin.
		if (perUserNotMachine) {
			String keyAddinData = "HKCU\\Software\\Microsoft\\Office\\15.0\\" + officeApplication + "\\Addins\\" + progId;
			RegUtil.purgeRegistryKey(keyAddinData);
		}

		// Unregister ActiveX JoaBridgeCtrl.Class
		JoaDll.nativeDllRegisterServer(progId, perUserNotMachine, false);

	}
}
