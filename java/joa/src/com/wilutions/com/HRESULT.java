/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.lang.reflect.Field;

/**
 * This class defines COM error codes.
 */
public class HRESULT {

	public final static int S_OK  = 0; 
	public final static int E_ABORT  = 0x80004004;
	public final static int E_ACCESSDENIED  = 0x80070005;
	public final static int E_FAIL  = 0x80004005;
	public final static int E_HANDLE  = 0x80070006;
	public final static int E_INVALIDARG  = 0x80070057;
	public final static int E_NOINTERFACE  = 0x80004002;
	public final static int E_NOTIMPL  = 0x80004001;
	public final static int E_OUTOFMEMORY  = 0x8007000E;
	public final static int E_POINTER  = 0x80004003;
	public final static int E_UNEXPECTED  = 0x8000FFFF;

	public final int value;

	private HRESULT(int value) {
		this.value = value;
	}
	
	public static HRESULT valueOf(int value) {
		return new HRESULT(value);
	}
	
	public String toString() {
		Object valueObj = value;
		for (Field f : this.getClass().getDeclaredFields()) {
			Object v;
			try {
				v = f.get(null);
				if (v.equals(valueObj)) return f.getName();
			} catch (Throwable e) {
			}
		}
		return Integer.toHexString(value);
	}
}
