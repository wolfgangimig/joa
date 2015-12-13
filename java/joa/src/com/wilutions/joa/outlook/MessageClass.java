/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

/**
 * Predefined Outlook message classes.
 * @see http://msdn.microsoft.com/en-us/library/bb206787(v=office.12).aspx
 */
public class MessageClass {
	
	public final static String Appointment = "IPM.Appointment";
	public final static String Contact = "IPM.Contact";
	public final static String Activity = "IPM.Activity";
	public final static String MeetingRequest = "IPM.Meeting.Schedule.Request";
	public final static String Note = "IPM.Note";
	public final static String Task = "IPM.Post"; // see http://msdn.microsoft.com/en-us/library/bb206787(v=office.12).aspx
	public final static String TaskRequest = "IPM.Task";
	

}
