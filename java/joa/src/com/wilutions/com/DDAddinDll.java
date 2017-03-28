package com.wilutions.com;

import java.io.File;
import java.io.IOException;

public class DDAddinDll extends LoadDll {
	
	private final static String ADDIN_NAME = "WI: DnD for Issue Tracker";
	private final static String ADDIN_DESCRIPTION = "This Add-in supports drag and drop mails from Outlook into web browsers and other appliations.";

	static {
		boolean isDebug = true;
		String fileName = "ddaddin" + get3264();
		String fileNameWithExt = fileName + ".dll";
		
		// Debugging: load from C++ output directories
		if (isDebug && loadLib("D:\\git\\outldd\\ddaddin\\Debug\\" + fileNameWithExt, false)) {
		}
		else if (isDebug && loadLib("D:\\git\\outldd\\ddaddin\\Debug\\" + fileNameWithExt, false)) {
		}

		// Packaged application loads joa.dll from current directory
		else if (myloadLib(fileName, false)) {
		}
		
		// Java archive joa-with-dlls.jar loads joa.dll from temporary directory
		else {
			try {
				File tempDir = JoaDll.getTempDir();
				File joadll = new File(tempDir, fileNameWithExt);
				
				// try to load from temp dir
				if (!loadLib(joadll.getAbsolutePath(), false)) {
					
					// failed, extract joa.dll into temp dir
					copyNativesToTemp(tempDir, "ddaddin32.dll", "ddaddin64.dll");
					
					// try again to load from temp dir
					loadLib(joadll.getAbsolutePath(), true);
				}
			} catch (IOException e1) {
				e1.printStackTrace();
				throw new UnsatisfiedLinkError(e1.toString());
			}
		}
	}
	
	private static boolean myloadLib(String lib, boolean throwEx) {
		return LoadDll.loadLib(lib, throwEx);
	}
	
	public static boolean install(String license, boolean installForUser) {
		return nativeInstall(license, ADDIN_NAME, ADDIN_DESCRIPTION, installForUser);
	}
	
	public static void uninstall(boolean installForUser) {
		nativeUninstall("", ADDIN_NAME, ADDIN_DESCRIPTION, installForUser);
	}
	
	public static String getLicenseTimeLimit() {
		return nativeGetLicenseTimeLimit();
	}

	public static String getLicenseKey() {
		return nativeGetLicenseKey();
	}

	public static int getLicenseCount() {
		return nativeGetLicenseCount();
	}
	
	public static void openLogFile(String logFile, String level, boolean append) {
		nativeOpenLogFile(logFile, level, append);
	}
	
	public static void closeLogFile() {
		nativeCloseLogFile();
	}
	
	public static void setProductName(String productName) {
		nativeSetProductName(productName);
	}
	
	private static native void nativeSetProductName(String productName);
	
	private static native boolean nativeInstall(String license, String addinName, String addinDescription, boolean installForUser);
	
	private static native void nativeUninstall(String license, String addinName, String addinDescription, boolean installForUser);
	
	private static native String nativeGetLicenseTimeLimit();
	
	private static native String nativeGetLicenseKey();
	
	private static native int nativeGetLicenseCount();

	private static native void nativeOpenLogFile(String logFile, String level, boolean append);
	
	private static native void nativeCloseLogFile();
}
