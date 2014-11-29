package com.wilutions.com;

import java.util.HashMap;

public class __AllClasses {

	public static final HashMap<String,String> classes = new HashMap<String,String>();
	
	public static void registerClass(String guid, String className) {
		classes.put(guid, className);
	}
	
	public static String getClassName(String guid) {
		return classes.get(guid);
	}
}
	