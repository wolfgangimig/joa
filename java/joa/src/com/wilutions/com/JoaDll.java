/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Wrapper class for native functions. All this functions should be seen as
 * private and should not be called directly. This functions might be changed in
 * subsequent versions.
 */
public class JoaDll extends LoadDll {
	
	static {
		boolean isDebug = false;
		String fileName = "joa" + get3264();
		String fileNameWithExt = fileName + ".dll";
		
		// Debugging: load from C++ output directories
		if (isDebug && loadLib("d:\\git\\joa-private\\cpp\\JoaCtrl\\x64\\Debug\\" + fileNameWithExt, false)) {
		}
		
		// Packaged application loads joa.dll from current directory
		else if (myloadLib(fileName, false)) {
		}
		
		// Java archive joa-with-dlls.jar loads joa.dll from temporary directory
		else {
			try {
				File tempDir = getTempDir();
				File joadll = new File(tempDir, fileNameWithExt);
				
				// try to load from temp dir
				if (!loadLib(joadll.getAbsolutePath(), false)) {
					
					// failed, extract joa.dll into temp dir
					copyNativesToTemp(tempDir, "joa32.dll", "joa64.dll");
					
					// try again to load from temp dir
					loadLib(joadll.getAbsolutePath(), true);
				}
			} catch (IOException e1) {
				throw new UnsatisfiedLinkError(e1.toString());
			}
		}
	}
	
	private static boolean myloadLib(String lib, boolean throwEx) {
		boolean succ = LoadDll.loadLib(lib, throwEx);
		if (succ) {
			String path = nativeGetModuleFileName();
			System.out.println("joa.dll loaded from " + path);
			succ = true;
		}
		return succ;
	}
	
	public static File getTempDir() throws IOException {
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		tempDir = new File(tempDir, "joa_" + getVersion().replace('.', '_'));
		tempDir.mkdirs();
		return tempDir;
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
			int framePaddingX, int framePaddingY);

	public static native void nativeGetWindowClientAreaPos(long hwnd, double[] xy);

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
	
	public static native void nativeActivateSceneInDialog(long hwnd);
	
	public static native String nativeGetModuleFileName();
	
	public static native void nativeCreateShortcut(String linkName, String targetName, String description);
	
	public static native long createEmbeddedFrame(long hwndStage);
	
	public static native String getOfficeVersion();
}
