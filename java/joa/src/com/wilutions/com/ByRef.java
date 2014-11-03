/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

/**
 * Wrapper class for parameters called by reference.
 *
 * @param <T>
 */
public class ByRef<T> {
	
	public T value;
	public final Class<T> clazz;
	
	public ByRef(Class<T> clazz) {
		this.clazz = clazz;
	}

	@SuppressWarnings("unchecked")
	public ByRef(T value) {
		this.value = value;
		this.clazz = (Class<T>)value.getClass();
	}
}
