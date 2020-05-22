/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.wilutions.joa.fx.EmbeddedWindow;

public class WindowsUtil {
	
	public static long getWindowHandle(javafx.stage.Window window) {
		long retval = 0;
		try {
			Method m = javafx.stage.Window.class.getDeclaredMethod("getPeer");
			m.setAccessible(true);
			final Object tkStage = m.invoke(window);
			if (tkStage != null) {
				m = tkStage.getClass().getDeclaredMethod("getPlatformWindow");
				m.setAccessible(true);
				final Object platformWindow = m.invoke(tkStage);
				m = platformWindow.getClass().getMethod("getNativeHandle");
				retval = (Long) m.invoke(platformWindow);
			}			
		} catch (Throwable t) {
			throw new IllegalStateException(t);
		}
		
		return retval;
	}
	
	/**
	 * Replace forbidden characters for file names with underscore.
	 * @param fname
	 * @return
	 */
	public static String replaceForbiddenFileNameCharsWithUnderscore(String fname) {
		final String forbiddenChars = "<>:\"/\\|?*";
		for (int i = 0; i < forbiddenChars.length(); i++) {
			fname = fname.replace(forbiddenChars.charAt(i), '_');
		}
		return fname;
	}

	public static long getWindowHandle(EmbeddedWindow window) {
		return getWindowHandle(window.getWindow());
	}
	
	public static long getWindowHandle(java.awt.Frame window) {
		long retval = 0;
		try {
			Field f = java.awt.Frame.class.getField("handle");
			f.setAccessible(true);
			retval = f.getLong(window);
		} catch (Throwable t) {
			throw new IllegalStateException(t);
		}
		
		return retval;
	}

}
