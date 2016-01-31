/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.wilutions.com.CoClass;

/**
 * This class marks an Addin class. Classes annotated with this class must also
 * be annotated with {@link CoClass}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface DeclAddin {
	/**
	 * Microsoft Office application type.
	 * 
	 * @return Application type
	 */
	OfficeApplication application();

	/**
	 * Addin description. This text is stored in the Windows registry database
	 * and is displayed in configuration dialogs of the Microsoft Office
	 * application.
	 * 
	 * @return Description text
	 */
	String description();

	/**
	 * Addin description. This text is stored in the Windows registry database.
	 * This text is stored in the Windows registry database and is displayed in
	 * configuration dialogs of the Microsoft Office application.
	 * 
	 * @return Friendly name
	 */
	String friendlyName();

	LoadBehavior loadBehavior() default LoadBehavior.LoadOnStartFirstTime;
}
