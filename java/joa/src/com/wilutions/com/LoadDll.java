package com.wilutions.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class LoadDll {

	public static boolean loadLib(String lib, boolean throwEx) {
		boolean succ = false;
		try {
			if (lib.indexOf(File.separatorChar) >= 0) {
				System.load(lib);
			}
			else {
				System.loadLibrary(lib);
			}
			succ = true;
		}
		catch (UnsatisfiedLinkError ex) {
			if (throwEx) throw ex;
		}
		return succ;
	}
	
	public static String get3264() {
		boolean is64 = System.getProperty("os.arch").indexOf("64") >= 0;
		return is64 ? "64" : "32";
	}
	
	public static void copyNativesToTemp(File tempDir, String ... resourceNames) throws IOException {
		for (String resourceName : resourceNames) {
			copyFileFromResourceToTemp(tempDir, resourceName);
		}
	}
	
	public static void copyFileFromResourceToTemp(File tempDir, String resourceName) throws IOException {
		File file = new File(tempDir, resourceName);
		System.out.println("Copy native DLL to temporary directory, file=" + file);
		FileOutputStream fos = null;
		InputStream is = null;
		try {
			fos = new FileOutputStream(file);
			is = JoaDll.class.getResourceAsStream(resourceName);
			if (is == null) {
				throw new IOException(resourceName + " not found in package " + JoaDll.class.getPackage().getName());
			}
			byte[] buf = new byte[10000];
			int len = -1;
			while ((len = is.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (is != null) {
				is.close();
			}
		}
	}


}
