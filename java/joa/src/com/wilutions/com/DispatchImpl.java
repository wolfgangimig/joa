/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

/**
 * This class is the base class for IDispatch implementations in Java. The
 * native library finds via reflection the implemented interfaces and makes them
 * available for COM - only IDispatch interfaces can be provide by a Java
 * object, VTBL interfaces are not supported (since they use a native function
 * pointer table).
 */
public class DispatchImpl implements IDispatch {

	/**
	 * Internal pointer. This value is internally used as a pointer to an object
	 * of the C++ class JDispatchImpl.
	 */
	private long nptr;

	public DispatchImpl() {
		JoaDll.nativeInit(this);
	}

	public static void initLogger(String logFile, String logLevel, boolean append) {
		JoaDll.nativeInitLogger(logFile, logLevel, append);
	}

	public static void doneLogger() {
		JoaDll.nativeDoneLogger();
	}

	public static void initCOM(Object module) throws ComException {
		JoaDll.nativeInitCOM(module);
	}

	public static void doneCOM() {
		JoaDll.nativeDoneCOM();
	}

	public String toString() {
		return "[DispatchImpl " + Long.toHexString(nptr) + "]";
	}
}
