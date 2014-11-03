/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

*/
package com.wilutions.com;

import java.awt.Frame;
import java.lang.reflect.Method;

import sun.awt.windows.WComponentPeer;

public class WindowsUtil {
	
	public static long getWindowHandle(javafx.stage.Window window) {
		long retval = 0;
		try {
			Method m = window.getClass().getMethod("impl_getPeer");
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
	
	@SuppressWarnings("deprecation")
	public static long getWindowHandle(Frame window) {
		return window.getPeer() != null ? ((WComponentPeer) window.getPeer()).getHWnd() : 0;
	}
}
