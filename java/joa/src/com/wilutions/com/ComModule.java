/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.lang.reflect.Method;

import com.wilutions.com.reg.RegUtil;
import com.wilutions.joa.RegisterAddin;
import com.wilutions.joa.outlook.RegisterFormRegion;

/**
 * Base class for the Module class.
 * Each Addin project has a Module class that lists the 
 * classes that provide COM interface implementations. 
 */
public abstract class ComModule {

	/**
	 * Get COM interface implementing classes.
	 * @return Array of class objects.
	 */
	public abstract Class<?>[] getCoClasses();

	/**
	 * Get Microsoft Office Addin classes. 
	 * @return Array of class objects.
	 */
	public abstract Class<?>[] getAddins();

	/**
	 * Get Microsoft Outlook Form Regions.
	 * @return Array of class objects.
	 */
	public abstract Class<?>[] getFormRegions();

	/**
	 * Get the Module object.
	 * The Module object is found via reflection. 
	 * @return Module object.
	 */
	public static ComModule getInstance() {
		try {
			Class<?> moduleClass = Class.forName(Constants.MODULE_CLASSNAME);
			Method getinst = moduleClass.getDeclaredMethod("getInstance");
			return (ComModule) getinst.invoke(null);
		} catch (Throwable e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Register the Module with COM.
	 * The Module can be registered for all users or only for the current users.
	 * Registration for all users requires administration permissions.
	 * @param perUserNotMachine If true, registration is made for the current user. 
	 * @param path File system to the javaw.exe and command line arguments.
	 * @throws ComException Thrown, if a COM related error occurs. Thrown, if a COM related error occurs.
	 */
	public void register(boolean perUserNotMachine, String path) throws ComException {
		for (Class<?> cls : getCoClasses())
			RegUtil.registerCoClass(perUserNotMachine, path, cls);
		for (Class<?> cls : getAddins())
			RegisterAddin.register(perUserNotMachine, cls);
		for (Class<?> cls : getFormRegions())
			RegisterFormRegion.register(perUserNotMachine, cls);
	}

	/**
	 * Unregister the Module with COM.
	 * @param perUserNotMachine If true, registration is made for the current user. 
	 * @throws ComException Thrown, if a COM related error occurs.
	 */
	public void unregister(boolean perUserNotMachine) throws ComException {
		for (Class<?> cls : getCoClasses())
			RegUtil.unregisterCoClass(perUserNotMachine, cls);
		for (Class<?> cls : getAddins())
			RegisterAddin.unregister(perUserNotMachine, cls);
		for (Class<?> cls : getFormRegions())
			RegisterFormRegion.unregister(perUserNotMachine, cls);
	}

}
