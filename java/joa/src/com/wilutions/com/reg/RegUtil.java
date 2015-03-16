/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.com.reg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.JoaDll;

/**
 * This class defines helper functions to access the Windows registry database.
 *
 */
public class RegUtil {
	
	private static Logger log = Logger.getLogger("RegUtil");
	
	/**
	 * Returns application path of self contained application.
	 * If running as a JavaFX packaged application, this function returns the path
	 * instdir/app.
	 * @return application path or null (if not running as a packaged application).
	 */
	public static File getAppPathIfSelfContained() {
		String launcherPath = System.getProperty("java.launcher.path");
		if (launcherPath == null || launcherPath.isEmpty()) return null;
		File dir = new File(launcherPath);
		return new File(dir, "app");
	}

	/**
	 * Get the path to javaw.exe and append the classpath and the application
	 * class to be started.
	 * 
	 * @param mainClass
	 *            application class to be started.
	 * @return File system path
	 */
	public static String getExecPath(Class<?> mainClass) {
		if (log.isLoggable(Level.FINE)) log.fine("getExecPath("); 
		String javaHome = System.getProperty("java.home");
		StringBuilder path = new StringBuilder();

		System.out.println("javaHome=" + javaHome);
		if (log.isLoggable(Level.FINE)) log.fine("javaHome=" + javaHome); 

		// Self-contained Java application?
		String launcherPath = System.getProperty("java.launcher.path");
		File selfInstDir = launcherPath != null ? new File(launcherPath) : null;
		if (log.isLoggable(Level.FINE)) log.fine("selfInstDir=" + selfInstDir); 

		if (selfInstDir != null) {

			// Application is an EXE file in selfAppPath
			File[] filesInAppDir = selfInstDir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".exe");
				}
			});
			if (log.isLoggable(Level.FINE)) log.fine("found exe=" + Arrays.toString(filesInAppDir)); 
			if (filesInAppDir.length != 0) {
				File appFile = filesInAppDir[0];
				path.append("\"");
				path.append(appFile.getAbsolutePath());
				path.append("\" ");
			} else {
				throw new IllegalStateException("Failed to register application, EXE not found in " + selfInstDir);
			}

		} else {
			
			// The returned path should not be longer than 256 (MAX_PATH)
			// characters. Otherwise Outlook ignores the Addin. Although a VBS script is
			// able to create the Addin.
			// To support long command lines, always create a BAT file
			// that starts the addin application.

			final File file = new File(mainClass.getName() + ".bat");
			final String CRLF = "\r\n";
			
			if (log.isLoggable(Level.FINE)) log.fine("register " + file); 

			path.append("pushd \"").append(file.getAbsoluteFile().getParent()).append("\"");
			path.append(CRLF);

			String[] arrayClassPath = System.getProperty("java.class.path").split(";");
			for (int i = 0; i < arrayClassPath.length; i++) {
				path.append("set CP=");
				if (i != 0) {
					path.append("%CP%;");
				}
				path.append(arrayClassPath[i]);
				path.append(CRLF);
			}

			path.append("\"");
			path.append(javaHome);
			if (!javaHome.endsWith("\\")) {
				path.append("\\");
			}
			path.append("bin\\java.exe\" ");

			path.append("-classpath \"%CP%\" ");

			path.append(mainClass.getName());
			path.append(CRLF);

			writeAllText(file, path.toString());

			path.setLength(0);
			path.append("\"");
			path.append(file.getAbsolutePath());
			path.append("\"");
		}

		if (log.isLoggable(Level.FINE)) log.fine(")getExecPath=" + path); 
		return path.toString();
	}

	protected static void writeAllText(File file, String text) {
		Writer wr = null;
		try {
			wr = new OutputStreamWriter(new FileOutputStream(file));
			wr.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (wr != null) {
				try {
					wr.close();
				} catch (IOException e) {
				}
			}
		}
	}

	/**
	 * Get JAR file or directory from where the given class is loaded.
	 * 
	 * @param mainClass
	 *            Class to be loaded.
	 * @return JAR file name or directory, directory ends with "/"
	 */
	public static String getJarOrDir(Class<?> mainClass) {
		// Get the location of the class files.
		// This might be a jar file or a directory.
		String jar = mainClass.getProtectionDomain().getCodeSource().getLocation().getPath();
		try {
			jar = URLDecoder.decode(jar, "UTF-8");
		} catch (UnsupportedEncodingException e) {
		}

		if (jar.startsWith("/")) {
			jar = jar.substring(1);
		}
		return jar;
	}

	/**
	 * Write integer value into registry.
	 * 
	 * @param key
	 *            Registry key
	 * @param name
	 *            Registry value name
	 * @param value
	 * @throws ComException
	 */
	public static void setRegistryValue(String key, String name, int value) throws ComException {
		JoaDll.nativeSetRegistryValue(key, name, value);
	}

	/**
	 * Write String value into registry.
	 * 
	 * @param key
	 *            Registry key
	 * @param name
	 *            Registry value name
	 * @param value
	 * @throws ComException
	 */
	public static void setRegistryValue(String key, String name, String value) throws ComException {
		JoaDll.nativeSetRegistryValue(key, name, value);
	}

	/**
	 * Delete registry key and all subkeys and values.
	 * 
	 * @param key
	 *            Registry key
	 * @throws ComException
	 */
	public static void purgeRegistryKey(String key) throws ComException {
		JoaDll.nativeDeleteRegistryKey(key, true);
	}

	/**
	 * Delete registry key if it has not sub keys or values.
	 * 
	 * @param key
	 *            Registry key
	 * @throws ComException
	 */
	public static boolean deleteRegistryKey(String key) throws ComException {
		return JoaDll.nativeDeleteRegistryKey(key, false);
	}

	/**
	 * Delete a registry value.
	 * 
	 * @param key
	 *            Registry key
	 * @param valueName
	 *            Registry value name
	 * @throws ComException
	 */
	public static void deleteRegistryValue(String key, String valueName) throws ComException {
		JoaDll.nativeDeleteRegistryValue(key, valueName);
	}

	/**
	 * Get root key for COM classes.
	 * 
	 * @param perUserNotMachine
	 *            true: HKEY_CURRENT_USER\Software\Classes, false:
	 *            HKEY_CLASSES_ROOT
	 * @return Root key for COM classes.
	 * @throws ComException
	 */
	public static String getClassesRoot(boolean perUserNotMachine) throws ComException {
		return JoaDll.nativeGetClassesRoot(perUserNotMachine);
	}

	/**
	 * Register a LocalServer32.
	 * 
	 * @param perUserNotMachine
	 *            true: register for current user only.
	 * @param className
	 *            Java class name (incl. package) to be registered
	 * @param clsid
	 *            Class GUID
	 * @param progId
	 *            Program ID
	 * @param path
	 *            Path to invoke the COM server for this class. Usually the
	 *            return value of {@link #getExecPath(Class)}.
	 * @throws ComException
	 */
	public static void registerLocalServer32(boolean perUserNotMachine, String className, String clsid, String progId,
			String path) throws ComException {

		String rootKey = getClassesRoot(perUserNotMachine);

		String keyClsid = rootKey + "\\CLSID\\" + clsid;
		String keyProgId = rootKey + "\\" + progId;

		setRegistryValue(keyClsid, "", className);
		setRegistryValue(keyClsid, "ProgId", progId);
		setRegistryValue(keyClsid + "\\LocalServer32", "", path);

		setRegistryValue(keyProgId, "", className);
		setRegistryValue(keyProgId + "\\CLSID", "", clsid);
	}

	/**
	 * Unregister a LocalServer32.
	 * 
	 * @param perUserNotMachine
	 *            true: register for current user only.
	 * @param className
	 *            Java class name (incl. package) to be registered
	 * @param clsid
	 *            Class GUID
	 * @param progId
	 *            Program ID
	 * @throws ComException
	 */
	public static void unregisterLocalServer32(boolean perUserNotMachine, String className, String clsid, String progId)
			throws ComException {

		String rootKey = getClassesRoot(perUserNotMachine);
		String keyClsid = rootKey + "\\CLSID\\" + clsid;
		String keyProgId = rootKey + "\\" + progId;

		purgeRegistryKey(keyClsid);
		purgeRegistryKey(keyProgId);
	}

	/**
	 * Register COM class.
	 * 
	 * @param perUserNotMachine
	 *            true: register for current user only.
	 * @param path
	 *            Path to invoke the COM server for this class. Usually the
	 *            return value of {@link #getExecPath(Class)}.
	 * @param coclass
	 *            Java class to be registered. This class must be annotated with
	 *            {@link CoClass}.
	 * @throws ComException
	 */
	public static void registerCoClass(boolean perUserNotMachine, String path, Class<?> coclass) throws ComException {
		CoClass coClassAnnotation = coclass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to register coclass, missing annotation " + CoClass.class);

		String progId = coClassAnnotation.progId();
		String guid = coClassAnnotation.guid();

		registerLocalServer32(perUserNotMachine, coclass.getName(), guid, progId, path);
	}

	/**
	 * Unregister COM class.
	 * 
	 * @param perUserNotMachine
	 *            true: register for current user only.
	 * @param coclass
	 *            Java class to be registered. This class must be annotated with
	 *            {@link CoClass}.
	 * @throws ComException
	 */
	public static void unregisterCoClass(boolean perUserNotMachine, Class<?> coclass) throws ComException {
		CoClass coClassAnnotation = coclass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister coclass, missing annotation " + CoClass.class);

		String progId = coClassAnnotation.progId();
		String guid = coClassAnnotation.guid();

		unregisterLocalServer32(perUserNotMachine, coclass.getName(), guid, progId);
	}

	/**
	 * Return true, if running on 64bit Windows.
	 * 
	 * @return true, if running on 64bit Windows.
	 */
	public static boolean is64() {
		final String keys[] = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
		for (String key : keys) {
			String property = System.getProperty(key);
			if (property != null) {
				return (property.indexOf("64") >= 0);
			}
		}
		return false;
	}

	/**
	 * Get registry value.
	 * 
	 * @param key
	 *            Registry key
	 * @param name
	 *            Registry value name
	 * @param defaultValue
	 *            String or Integer default value, can be null.
	 * @return If the value is available, this function returns the value
	 *         otherwise it returns the defaultValue.
	 */
	public static Object getRegistryValue(String key, String name, Object defaultValue) {
		return JoaDll.nativeGetRegistryValue(key, name, defaultValue);
	}
}
