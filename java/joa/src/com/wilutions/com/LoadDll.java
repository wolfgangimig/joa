package com.wilutions.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class LoadDll {

	private static Logger log = Logger.getLogger(LoadDll.class.getName());

	public static boolean loadLib(String lib, boolean throwEx) {
		boolean succ = false;
		try {
			if (lib.indexOf(File.separatorChar) >= 0) {
				log.info("System.load " + lib);
				System.out.println("System.load " + lib);
				System.load(lib);
			}
			else {
				log.info("System.loadLibrary " + lib);
				System.out.println("System.loadLibrary " + lib);
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
