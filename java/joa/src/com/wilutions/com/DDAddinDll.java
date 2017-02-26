package com.wilutions.com;

import java.io.File;
import java.io.IOException;

import com.wilutions.com.JoaDll;
import com.wilutions.com.LoadDll;

public class DDAddinDll extends LoadDll {
	
	private final static String ADDIN_NAME = "WI: DnD for Issue Tracker";
	private final static String ADDIN_DESCRIPTION = "This Add-in supports drag and drop mails from Outlook into web browsers and other appliations.";

	static {
		String fileName = "ddaddin" + get3264();
		String fileNameWithExt = fileName + ".dll";
		
		// Packaged application loads joa.dll from current directory
		if (myloadLib(fileName, false)) {
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
	
	public static void install(String license, boolean installForUser) {
		nativeInstall(license, ADDIN_NAME, ADDIN_DESCRIPTION, installForUser);
	}
	
	public static void uninstall(boolean installForUser) {
		nativeUninstall("", ADDIN_NAME, ADDIN_DESCRIPTION, installForUser);
	}

	private static native void nativeInstall(String license, String addinName, String addinDescription, boolean installForUser);
	
	private static native void nativeUninstall(String license, String addinName, String addinDescription, boolean installForUser);
}
