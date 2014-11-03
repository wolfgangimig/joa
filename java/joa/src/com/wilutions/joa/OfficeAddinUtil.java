/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class OfficeAddinUtil {

	/**
	 * Return resource as string.
	 * 
	 * @param classLoader
	 *            e.g. obj.getClass().getClassLoader();
	 * @param resourceName
	 *            e.g. "com/wilutions/officeaddin/RibbonManifest.xml"
	 * @return Resource content.
	 * @throws IOException
	 */
	public static String getResourceAsString(ClassLoader classLoader, String resourceName) throws IOException {
		Reader rd = null;
		try {
			InputStream is = classLoader.getResourceAsStream(resourceName);
			if (is == null)
				throw new IOException("Resource " + resourceName + " not found.");
			rd = new InputStreamReader(is, "UTF-8");
			StringBuilder sbuf = new StringBuilder();
			int c = 0;
			while ((c = rd.read()) != -1) {
				sbuf.append((char) c);
			}
			return sbuf.toString();
		} finally {
			if (rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static byte[] getResourceAsBytes(ClassLoader classLoader, String resourceName) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		InputStream is = null;
		try {
			is = classLoader.getResourceAsStream(resourceName);

			if (is == null)
				throw new IOException("Resource " + resourceName + " not found.");
			byte[] buf = new byte[1000];
			int len = 0;
			while ((len = is.read(buf)) != -1) {
				bos.write(buf, 0, len);
			}
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}

		return bos.toByteArray();
	}
}
