/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;

/**
 * Helper class to register a Microsoft Office Addin with the Windows registry.
 */
public class RegisterAddin {

	public static void register(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		System.out.println("register " + addinClass + " " + (perUserNotMachine ? "/user" : "/all") );
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();
		String name = addinAnnotation.friendlyName();
		String desc = addinAnnotation.description();
		int loadBehavior = addinAnnotation.loadBehavior().value;

		registerAddin(officeApplication, progId, name, desc, loadBehavior, perUserNotMachine);

		// Register ActiveX JoaBridgeCtrl.Class
		JoaDll.nativeDllRegisterServer(progId, perUserNotMachine, true);

		registerJoaUtilAddin(officeApplication, progId, perUserNotMachine);
	}

	private static void registerAddin(String officeApplication, String progId, String name, String desc,
			int loadBehavior, boolean perUserNotMachine) {
		System.out.println("registerAddin app=" + officeApplication + ", progId=" + progId);
		
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		RegUtil.setRegistryValue(key, "FriendlyName", name);
		RegUtil.setRegistryValue(key, "Description", desc);
		RegUtil.setRegistryValue(key, "LoadBehavior", loadBehavior);

		if (RegUtil.is64() && !perUserNotMachine) {
			key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, true) + "\\" + progId;
			RegUtil.setRegistryValue(key, "FriendlyName", name);
			RegUtil.setRegistryValue(key, "Description", desc);
			RegUtil.setRegistryValue(key, "LoadBehavior", loadBehavior);
		}

		if (perUserNotMachine) {
			JoaDll.activateDisabledAddin(progId);
		}
	}

	protected static String getKeyOfficeApplicationAddins(String officeApplication, boolean perUserNotMachine,
			boolean wow6432Node) {
		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		String key = rootKey + "\\Software\\";
		if (wow6432Node)
			key += "Wow6432Node\\";
		key += "Microsoft\\Office\\" + officeApplication + "\\Addins";
		return key;
	}

	protected static void registerJoaUtilAddin(String officeApplication, String referencedByAddin,
			boolean perUserNotMachine) {

		String progId = JoaUtilAddin_progId;
		String name = JoaUtilAddin_name;
		String desc = JoaUtilAddin_desc;
		int loadBehavior = JoaUtilAddin_loadBehavior;

		registerAddin(officeApplication, progId, name, desc, loadBehavior, perUserNotMachine);

		// Add reference to JoaUtilAddin from referencing Add-in
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		key += "\\__References\\" + referencedByAddin;
		String value = dateFormat.format(new Date(System.currentTimeMillis()));
		RegUtil.setRegistryValue(key, "", value);
	}

	public static void unregister(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();

		unregisterAddin(officeApplication, progId, perUserNotMachine);

		unregisterJoaUtilAddin(officeApplication, progId, perUserNotMachine);

		// Unregister ActiveX JoaBridgeCtrl.Class
		JoaDll.nativeDllRegisterServer(progId, perUserNotMachine, false);

	}

	private static void unregisterAddin(String officeApplication, String progId, boolean perUserNotMachine) {
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		RegUtil.purgeRegistryKey(key);

		if (RegUtil.is64() && !perUserNotMachine) {
			key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, true) + "\\" + progId;
			RegUtil.purgeRegistryKey(key);
		}

		// Delete Registry keys where Outlook stores data about the Addin.
		{
			String keyOfficeApp = "HKCU\\Software\\Microsoft\\Office\\15.0\\" + officeApplication;

			String keyAddinData = keyOfficeApp + "\\Addins\\" + progId;
			RegUtil.purgeRegistryKey(keyAddinData);

			try {
				String keyAddinLoadTimes = keyOfficeApp + "\\AddInLoadTimes";
				RegUtil.deleteRegistryValue(keyAddinLoadTimes, progId);
			}
			catch(ComException ignored) {}
		}
	}

	protected static void unregisterJoaUtilAddin(String officeApplication, String referencedByAddin,
			boolean perUserNotMachine) {
		String progId = JoaUtilAddin_progId;
		String refsKey = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		refsKey += "\\__References";
		RegUtil.deleteRegistryKey(refsKey + "\\" + referencedByAddin);

		if (RegUtil.deleteRegistryKey(refsKey)) {
			unregisterAddin(officeApplication, JoaUtilAddin_progId, perUserNotMachine);
		}
	}

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private static final String JoaUtilAddin_progId = "JoaUtilAddin.Class";
	private static final String JoaUtilAddin_name = "JOA Util Add-in";
	private static final String JoaUtilAddin_desc = "This Add-in supports other Add-ins developed with JOA.";
	private static final int JoaUtilAddin_loadBehavior = LoadBehavior.LoadOnStart.value;
	public static final String JoaUtilAddin_clsid = "{7B57EC55-0A9C-4AB0-A2CC-AF81C680CFAC}";

}
