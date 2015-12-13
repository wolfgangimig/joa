/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.util.Date;

import com.wilutions.win32.SYSTEMTIME;

/**
 * This date helper class is used in the native code to convert from a COM Date object to a Java Date object.
 */
public class DateUtil {
	
	public static Date fromSYSTEMTIME(byte[] bytes) {
		SYSTEMTIME st = SYSTEMTIME.fromByteArray(bytes);
		Date date = st.toDate();
		return date;
	}
	
	public static byte[] toSYSTEMTIME(Date date) {
		SYSTEMTIME st = SYSTEMTIME.fromDate(date);
		return st.toByteArray();
	}
}
