/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

/**
 * This exception class is used for all COM functions.  
 */
public class ComException extends RuntimeException {

	protected final int hr;

	private static final long serialVersionUID = 8164049080161826217L;
	
	public ComException() {
		this("", 0);
	}
	
	public ComException(String msg) {
		this(msg, 0);
	}
	
	public ComException(String msg, Throwable e) {
		super(msg, e);
		hr = 0;
	}
	
	public ComException(String msg, int hr) {
		super(msg);
		this.hr = hr;
	}
	
	public ComException(String msg, HRESULT hr) {
		super(msg);
		this.hr = hr.value;
	}
	
	public String toString() {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append(this.getClass().getName());
		String msg = getMessage();
		if (msg != null && msg.length() != 0) {
			sbuf.append(" ").append(msg);
		}
		if (hr != 0) {
			HRESULT hrobj = HRESULT.valueOf(hr);
			if (hrobj != null) {
				sbuf.append(" ").append(hrobj);
			}
			else {
				sbuf.append(" 0x").append(Integer.toHexString(hr));
			}
		}
		return sbuf.toString();
	}
}
