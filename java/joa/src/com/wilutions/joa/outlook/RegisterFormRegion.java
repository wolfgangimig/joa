/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

import java.util.ArrayList;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.reg.RegUtil;

public class RegisterFormRegion {
	
	private final static String OutlookFormRegionsKey = "\\Software\\Microsoft\\Office\\Outlook\\FormRegions";
	private final static String OutlookFormRegionsKeyWow6432Node = "\\Software\\Wow6432Node\\Microsoft\\Office\\Outlook\\FormRegions";

	public static void register(boolean perUserNotMachine, Class<?> formRegion) throws ComException {
		DeclFormRegion formRegionAnnotation = formRegion.getAnnotation(DeclFormRegion.class);
		if (formRegionAnnotation == null) throw new ComException("Failed to register form region, missing annotation " + DeclFormRegion.class);
		Class<?> addinClass = formRegionAnnotation.addinClass();
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null) throw new ComException("Failed to register form region, missing annotation " + CoClass.class + " for addin class " + addinClass);

		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		
		ArrayList<String> formRegionBaseKeys = getFormRegionBaseKeys(
				perUserNotMachine, rootKey);
				
		String addinProgId = coClassAnnotation.progId();
		System.out.println("registerFormRegion " + formRegion.getSimpleName() + ", progId=" + addinProgId);
		
		for (String formRegionBaseKey : formRegionBaseKeys) {
			String[] messageClasses = formRegionAnnotation.messageClasses();
			for (String messageClass : messageClasses) {
				String formRegionKey = formRegionBaseKey + "\\" + messageClass;
				String formRegionName = formRegion.getName();
				String formRegionValue = "=" + addinProgId;
				RegUtil.setRegistryValue(formRegionKey, formRegionName, formRegionValue);
				RegUtil.setRegistryValue(formRegionBaseKey + "\\" + messageClass + "." + addinProgId, formRegionName, formRegionValue);
			}
		}
	}

	private static ArrayList<String> getFormRegionBaseKeys(
			boolean perUserNotMachine, String rootKey) {
		ArrayList<String> formRegionBaseKeys = new ArrayList<String>(2);
		formRegionBaseKeys.add(rootKey + OutlookFormRegionsKey);
		if (!perUserNotMachine && RegUtil.is64()) {
			formRegionBaseKeys.add(rootKey + OutlookFormRegionsKeyWow6432Node);
		}
		return formRegionBaseKeys;
	}
	
	public static void unregister(boolean perUserNotMachine, Class<?> formRegion) throws ComException {
		DeclFormRegion formRegionAnnotation = formRegion.getAnnotation(DeclFormRegion.class);
		if (formRegionAnnotation == null) throw new ComException("Failed to register form region, missing annotation " + DeclFormRegion.class);
		Class<?> addinClass = formRegionAnnotation.addinClass();
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null) throw new ComException("Failed to register form region, missing annotation " + CoClass.class + " for addin class " + addinClass);

		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		String addinProgId = coClassAnnotation.progId();
		
		ArrayList<String> formRegionBaseKeys = getFormRegionBaseKeys(
				perUserNotMachine, rootKey);

		for (String formRegionBaseKey : formRegionBaseKeys) {
			String[] messageClasses = formRegionAnnotation.messageClasses();
			for (String messageClass : messageClasses) {
				String formRegionKey = formRegionBaseKey + "\\" + messageClass;
				String formRegionName = formRegion.getName();
				RegUtil.deleteRegistryValue(formRegionKey, formRegionName);
				RegUtil.purgeRegistryKey(formRegionBaseKey + "\\" + messageClass + "." + addinProgId);
			}
		}
	}
	
}
