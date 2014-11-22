/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Wrapper class for native functions. All this functions should be seen as
 * private and should not be called directly. This functions might be changed in
 * subsequent versions.
 */
public class JoaDll {

	static {
		// Debugging: set this command line option in order to debug the DLL. 
		// This option only makes sense, if the source code of the DLL is available.
//		String strDebugJoaDll = System.getProperty("com.wilutions.joa.DebugJoaDll");
//		boolean isDebug = strDebugJoaDll != null && strDebugJoaDll.equalsIgnoreCase("true");
		
		boolean isDebug = true;
		
		
		// Debugging: load from C++ output directories
		if (isDebug && loadLib("d:\\git\\joa-private\\cpp\\JoaCtrl\\x64\\Debug\\JoaCtrl.dll", false)) {
		}
		else if (isDebug && loadLib("d:\\git\\joa-private\\cpp\\JoaCtrl\\Debug\\JoaCtrl.dll", false)) {
		}
		
		// Packaged application loads joa.dll from current directory
		else if (loadLib("joa", false)) {
		}
		
		// Java archive joa-with-dlls.jar loads joa.dll from temporary directory
		else {
			try {
				File tempDir = getTempDir();
				File joadll = new File(tempDir, "joa.dll");
				
				// try to load from temp dir
				if (!loadLib(joadll.getAbsolutePath(), false)) {
					
					// failed, extract joa.dll into temp dir
					copyNativesToTemp(tempDir);
					
					// try again to load from temp dir
					loadLib(joadll.getAbsolutePath(), true);
				}
			} catch (IOException e1) {
				throw new UnsatisfiedLinkError(e1.toString());
			}
		}
	}
	
	private static boolean loadLib(String lib, boolean throwEx) {
		boolean succ = false;
		try {
			if (lib.indexOf(File.separatorChar) >= 0) {
				System.load(lib);
			}
			else {
				System.loadLibrary(lib);
			}
			System.out.println("joa.dll loaded from " + lib);
			succ = true;
		}
		catch (UnsatisfiedLinkError ex) {
			if (throwEx) throw ex;
		}
		return succ;
	}
	
	private static String getArchitectureSubdir() {
		boolean is64 = System.getProperty("os.arch").indexOf("64") >= 0;
		return is64 ? "64" : "32";
	}
	
	public static File getTempDir() throws IOException {
		
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		tempDir = new File(tempDir, "joa_" + getVersion().replace('.', '_'));
		tempDir = new File(tempDir, getArchitectureSubdir());
		return tempDir;
	}

	private static void copyNativesToTemp(File tempDir) throws IOException {
		tempDir.mkdirs();
		copyFileFromResourceToTemp(tempDir, "joa.dll");
	}

	private static void copyFileFromResourceToTemp(File tempDir, String resourceName) throws IOException {
		File file = new File(tempDir, resourceName);
		System.out.println("Copy native DLL to temporary directory, file=" + file);
		FileOutputStream fos = null;
		InputStream is = null;
		try {
			fos = new FileOutputStream(file);
			is = JoaDll.class.getResourceAsStream(getArchitectureSubdir() + "/" + resourceName);
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

	/**
	 * Return the JOA version number.
	 * @return version number
	 * @throws IOException
	 */
	public static String getVersion() throws IOException {
		InputStream is = JoaDll.class.getResourceAsStream("version.properties");
		Properties props = new Properties();
		props.load(is);
		return props.getProperty("version");
	}
	
	
	///////////////////////////////////////////////////////////////////
	// Native functions are for internal usage only.
	// Do not call this functions directly.

	public static native void nativeInitLogger(String logFile, String logLevel, boolean append);

	public static native void nativeDoneLogger();

	public static native void nativeInit(Object obj);

	public static native void nativeInitCOM(Object module) throws ComException;

	public static native void nativeDoneCOM();

	public static native long deleteDispatch(Object obj);

	public static native Object dispatchCall(Object dispatch, Integer methodId, String methodName, int method,
			Object putValue, Object[] args) throws ComException;

	public static native void dispatchWithEvents(Dispatch dispatch, DispatchImpl handler) throws ComException;

	public static native void dispatchReleaseEvents(Dispatch dispatch, DispatchImpl handler) throws ComException;

	public static native Object dispatchAs(Object dispatch, Class<?> clazz);

	public static native boolean dispatchIs(Object dispatch, Class<?> interf);

	public static native void dumpComReferenceMap(String title);

	public static native void releaseComObject(Dispatch dispatch);

	public static native Dispatch nativeCoCreateInstance(String progId, Dispatch dispObj, String iid) throws ComException;

	public final static int GENERATOR_INCLUDE_REFERENCED_TYPELIBS = 1;
	public final static int GENERATOR_EXCLUDE_REFERENCED_TYPELIBS = 0;

	public static native void nativeGenerateJavaClassesForTypeLibs(String outDir, String pack, String[] typeLibIds,
			int opts);

	public static native void nativeSetParent(Object fxstage, long joaCtrlHandle, long javaWindowHandle,
			int framePaddingX, int framePaddingY) throws ComException;

	public static native void nativeGetWindowPos(long hwnd, int[] xy);

	public static native Object nativeGetRegistryValue(String key, String name, Object defaultValue);

	public static native void nativeSetRegistryValue(String key, String name, Object value) throws ComException;

	public static native boolean nativeDeleteRegistryKey(String key, boolean deleteIfNotEmpty) throws ComException;

	public static native String nativeGetClassesRoot(boolean userNotMachine) throws ComException;

	public static native void nativeDeleteRegistryValue(String key, String valueName) throws ComException;

	public static native void activateDisabledAddin(String path) throws ComException;

	public static native void nativeDllRegisterServer(String referencedByProgId, boolean userNotMachine,
			boolean registerNotUnregister) throws ComException;

	public static native void nativeAddEventCallInBackground(String iid, String memberName);

	public static native Object nativeCreateIPictureDisp(byte[] imageBytes);
	
	public static native Class<?> nativeLoadEmbeddedWindowClass();
	
	public static native void nativeUpdatePrivateClasses(String privateClassesDir);
	
	public static native void nativeActivateSceneInDialog(long hwnd);
	
}
