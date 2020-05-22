/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.joa.outlook;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation interface for a Microsoft Outlook Form Region.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface DeclFormRegion {
	
	/**
	 * Addin class that includes the form region.
	 * @return Addin class.
	 */
	Class<?> addinClass();
	
	/**
	 * Message classes for which the form region has to be displayed.
	 * @return Array of message classes.
	 */
	String[] messageClasses();
	
}
