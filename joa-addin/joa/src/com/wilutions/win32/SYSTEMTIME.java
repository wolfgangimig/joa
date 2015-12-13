/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.win32;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class SYSTEMTIME {
	
	public final static TimeZone UTC = TimeZone.getTimeZone("UTC");
	public final static TimeZone LOCAL = TimeZone.getDefault();
	
	public short year, month, dayOfWeek, day, hour, minute, second, millis;
	
	public byte[] toByteArray() {
		ByteBuffer bbuf = ByteBuffer.allocate(8*2);
		bbuf.order(ByteOrder.LITTLE_ENDIAN);
		ShortBuffer sbuf = bbuf.asShortBuffer();
		sbuf.put(year).put(month).put(dayOfWeek).put(day).put(hour).put(minute).put(second).put(millis);
		return bbuf.array();
	}
	
	public static SYSTEMTIME fromByteArray(byte[] bytes) {
		SYSTEMTIME s = new SYSTEMTIME();
		ByteBuffer bbuf = ByteBuffer.wrap(bytes);
		bbuf.order(ByteOrder.LITTLE_ENDIAN);
		ShortBuffer sbuf = bbuf.asShortBuffer();
		s.year = sbuf.get();
		s.month = sbuf.get();
		s.dayOfWeek = sbuf.get();
		s.day = sbuf.get();
		s.hour = sbuf.get();
		s.minute = sbuf.get();
		s.second = sbuf.get();
		s.millis = sbuf.get();
		return s;
	}
	
	public Date toDate() {
		return toDate(LOCAL);
	}
	
	public static SYSTEMTIME fromDate(Date date) {
		return fromDate(date, LOCAL);
	}
	
	public Date toDate(TimeZone tz) {
		GregorianCalendar cal = new GregorianCalendar(year, month-1, day, hour, minute, second);
		cal.set(Calendar.MILLISECOND, millis);
		cal.setTimeZone(tz);
		Date date = cal.getTime();
		return date;
	}

	public static SYSTEMTIME fromDate(Date date, TimeZone tz) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeZone(tz);
		cal.setTime(date);
		SYSTEMTIME s = new SYSTEMTIME();
		s.year = (short)cal.get(Calendar.YEAR);
		s.month = (short)(cal.get(Calendar.MONTH)+1);
		s.dayOfWeek = (short)cal.get(Calendar.DAY_OF_WEEK);
		s.day = (short)cal.get(Calendar.DAY_OF_MONTH);
		s.hour = (short)cal.get(Calendar.HOUR_OF_DAY);
		s.minute = (short)cal.get(Calendar.MINUTE);
		s.second = (short)cal.get(Calendar.SECOND);
		s.millis = (short)cal.get(Calendar.MILLISECOND);
		return s;
	}
}
