/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks classes that implement the COM IDispatch interface.
 * Annotated classes must extend {@link DispatchImpl}.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CoClass {
	String guid();
	String progId() default PROG_ID_IS_CLASS_NAME;
	
	public final static String PROG_ID_IS_CLASS_NAME = "";
}
