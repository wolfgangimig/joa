/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

/**
 * Asynchronous result. 
 *
 * @param <T>
 */
public interface AsyncResult<T> {
	public void setAsyncResult(T obj, Throwable ex);
}
