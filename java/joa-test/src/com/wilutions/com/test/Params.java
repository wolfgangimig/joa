/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com.test;

import com.wilutions.com.DispatchImpl;

public class Params {
	
	public static String PROGID_JoaTestObject = "JoaTestObject.Class";
	public static String CLSID_JoaTestDispatch1 = "{23DBE989-E203-42E4-A169-0862F12E9582}";
	public static String CLSID_JoaTestDispatch2 = "{F8A6BAC0-6A82-46E5-B5CD-D6B56D2E1702}";
	public static String CLSID_JoaTestObjectJavaImpl = "{A4DFAB66-8B5D-40AE-8D8C-7457F4BE5894}";
	
	String logFile = "d:/temp/log/joatest-cpp.log";
	String logLevel = "DEBUG";
	boolean logAppend = false;
	
	private void init() {
		DispatchImpl.initLogger(logFile, logLevel, logAppend);
	}
	
	public static Params getInstance() {
		if (instance == null) {
			instance = new Params();
			instance.init();
		}
		return instance;
	}
	
	private static Params instance;

}
