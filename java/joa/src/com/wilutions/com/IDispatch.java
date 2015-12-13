/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

import java.util.function.Consumer;

/**
 * Objects received from COM and Java objects that implement a COM interface
 * implement IDispatch.
 */
@CoInterface(guid="{00020400-0000-0000-C000-000000000046}")
public interface IDispatch extends IUnknown {
	
	/**
	 * Convert this object into an object of the given class. A new object of
	 * the given class is created and the internal native object is transferred
	 * to the new object. This object hereby looses its internal native object.
	 * 
	 * @param clazz
	 *            Class object.
	 * @return new object of type clazz.
	 */
	
	default <T> T as(Class<T> clazz) {
		throw new UnsupportedOperationException();
	}
	
	
	default boolean is(Class<?> clazz) {
		throw new UnsupportedOperationException();
	}

	
	default Object _get(String propName, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default Object _get(int propId, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default void _put(String propName, Object value, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default void _put(int propId, Object value, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default Object _call(String methodName, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default Object _call(int methodId, Object... args) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default void withEvents(DispatchImpl handler) throws ComException {
		throw new UnsupportedOperationException();
	}

	
	default void releaseEvents(DispatchImpl handler) throws ComException {
		throw new UnsupportedOperationException();
	}
	
	default void releaseComObject() {
		throw new UnsupportedOperationException();
	}
	
	default <T extends IUnknown> void _fireEvent(Class<T> listenerClass, Consumer<T> action) {
		throw new UnsupportedOperationException();
	}
}
