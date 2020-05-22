package com.wilutions.joa.swing;

import com.wilutions.com.JoaDll;

/**
 * Replacement for sun.awt.windows.WEmbeddedFrame.
 * 
 * ITJ-87: JDK 13 support
 */
public class WEmbeddedFrame extends java.awt.Frame {

	private static final long serialVersionUID = -7058369538651030651L;

	/**
	 * This WEmbeddedFrame has to be created via JNI, see jawt header.
	 * @param hwndParent
	 * @return
	 */
	public static java.awt.Frame create(long hwndParent) {
	    return (java.awt.Frame)JoaDll.createEmbeddedAwtFrame(hwndParent);
	}

}
