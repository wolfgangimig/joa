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
import java.net.URISyntaxException;
import java.net.URL;
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

	// Since Windows 10 Creators Update (installed at 2017-13-05 on my computer),
	// it is no more possible to start a BAT file as a COM server. Error: 0x800700C1 
	// "... is not an executable ...".
	// I tried the following to solve the problem:
	// - start java.exe directly 
	//    -> fails because it starts not in the project directory
	// - start an exe wrapped into a launch4j installer 
	//    -> requires launch4j, complicated
	// - start BAT packed into installer package (http://stackoverflow.com/questions/22266511/iexpress-command-line-example-to-create-exe-packages)
	//    -> have to create the installer packaged as Administrator
	private final static boolean registerBAT = true;
	
	private static Logger log = Logger.getLogger("RegUtil");

	/**
	 * Returns application path of self contained application. If running as a
	 * JavaFX packaged application, this function returns the path instdir/app.
	 * 
	 * @return application path or null (if not running as a packaged
	 *         application).
	 */
	public static File getAppPathIfSelfContained() {
		String launcherPath = System.getProperty("java.launcher.path");
		if (launcherPath == null || launcherPath.isEmpty())
			return null;
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
		if (log.isLoggable(Level.FINE))
			log.fine("getExecPath(");
		
		String javaHome = System.getProperty("java.home");
		StringBuilder path = new StringBuilder();

		System.out.println("javaHome=" + javaHome);
		if (log.isLoggable(Level.FINE))
			log.fine("javaHome=" + javaHome);
		
		String localServer32 = System.getProperty("localServer32", "");

		// Self-contained Java application?
		String launcherPath = System.getProperty("java.launcher.path");
		File selfInstDir = launcherPath != null ? new File(launcherPath) : null;
		if (log.isLoggable(Level.FINE))	log.fine("selfInstDir=" + selfInstDir);
		
		if (selfInstDir != null) {

			// Application is an EXE file in selfAppPath
			File[] filesInAppDir = selfInstDir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.toLowerCase().endsWith(".exe");
				}
			});
			if (log.isLoggable(Level.FINE))
				log.fine("found exe=" + Arrays.toString(filesInAppDir));
			if (filesInAppDir.length != 0) {
				File appFile = filesInAppDir[0];
				path.append("\"");
				path.append(appFile.getAbsolutePath());
				path.append("\"");
			} else {
				throw new IllegalStateException("Failed to register application, EXE not found in " + selfInstDir);
			}

		} 
		else if (System.getProperty("launch4j.exefile") != null) {
			// Unfortunately, the EXE command does not start an instance of 
			// the JOA application that is recognized by Outlook.
			
			// Created with Launch4j
			String exe = System.getProperty("launch4j.exefile");
			boolean quote = !exe.startsWith("\"");
			if (quote) path.append("\"");
			path.append(exe);
			if (quote) path.append("\"");
			
		}
		else if (localServer32.startsWith("java")) {
			URL jarUrl = mainClass.getProtectionDomain().getCodeSource().getLocation();
			try {
				String exe = javaHome + "\\bin\\" + localServer32;
				File jarFile = new File(jarUrl.toURI());
				path.append("\"").append(exe).append("\" ");
				path.append("-Xmx500m -Djava.net.useSystemProxies=true ");
				path.append("-jar ").append("\"").append(jarFile).append("\"");
			} catch (URISyntaxException e) {
				throw new IllegalStateException("Main class jar invalid for url=" + jarUrl, e);
			}
		}
		else if (registerBAT) {

			// The returned path should not be longer than 256 (MAX_PATH)
			// characters. Otherwise Outlook ignores the Addin. Although a VBS
			// script is
			// able to create the Addin.
			// To support long command lines, always create a BAT file
			// that starts the addin application.

			final File file = new File(mainClass.getName() + ".bat");
			final String CRLF = "\r\n";

			if (log.isLoggable(Level.FINE))
				log.fine("register " + file);

			path.append("@echo off").append(CRLF);
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
			path.append("\"cmd.exe\" /C \"");
			path.append(file.getAbsolutePath());
			path.append("\"");
		}
		else {
			// Just execute any program.
			// Outlook will wait until you started your COM server in the debugger.
			// see https://msdn.microsoft.com/de-de/library/windows/desktop/ms683844(v=vs.85).aspx
			path.append("cmd.exe");
		}

		if (log.isLoggable(Level.FINE))
			log.fine(")getExecPath=" + path);
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
	 */
	public static String getClassesRoot(boolean perUserNotMachine) throws ComException {
		return JoaDll.nativeGetClassesRoot(perUserNotMachine);
	}
	
	/**
	 * Get root key for configuration.
	 * 
	 * @param perUserNotMachine
	 *            true: HKEY_CURRENT_USER\Software, false: HKEY_LOCAL_MACHINE\Software
	 * @param bitness64
	 *            true: HKEY_LOCAL_MACHINE\Software, false: HKEY_LOCAL_MACHINE\Software\WOW6432Node
	 * @return Root key for program configuration.
	 */
	public static String getConfigRoot(boolean perUserNotMachine, boolean bitness64) {
		String ret = "";
		if (perUserNotMachine) {
			ret = "HKEY_CURRENT_USER\\Software";
		}
		else if (bitness64) {
			ret = "HKEY_LOCAL_MACHINE\\Software";
		}
		else {
			ret = "HKEY_LOCAL_MACHINE\\Software\\WOW6432Node";
		}
		return ret;
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
	 *             Thrown, if a COM related error occurs.
	 */
	public static void registerLocalServer32(boolean perUserNotMachine, String className, String clsid, String progId,
			String path) throws ComException {
		
		String rootKey = getClassesRoot(perUserNotMachine);

		String keyClsid = rootKey + "\\CLSID\\" + clsid;
		String keyProgId = rootKey + "\\" + progId;

		setRegistryValue(keyClsid, "", className);
		setRegistryValue(keyClsid, "ProgId", progId);
		setRegistryValue(keyClsid + "\\LocalServer32", "", path);
		
		String exe = getServerExecutable(path);
		setRegistryValue(keyClsid + "\\ServerExecutable", "", exe);

		setRegistryValue(keyProgId, "", className);
		setRegistryValue(keyProgId + "\\CLSID", "", clsid);
	}
	
	/**
	 * Find executable name (e.g. cmd.exe) in path.
	 * @param path Path used as LocalServer32 registration, e.g. "cmd.exe" /C ".../itol.bat"
	 * @return Executable name
	 */
	public static String getServerExecutable(String path) {
		String exe = path;
		if (exe.startsWith("\"")) {
			int p = exe.indexOf("\"", 1);
			if (p < 0) p = exe.length();
			exe = exe.substring(1, p);
		}
		else {
			int p = exe.indexOf(" ");
			if (p < 0) p = exe.length();
			exe = exe.substring(0, p);
		}
		return "\"" + exe + "\"";
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
	 *             Thrown, if a COM related error occurs.
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
	 *             Thrown, if a COM related error occurs.
	 */
	public static void registerCoClass(boolean perUserNotMachine, String path, Class<?> coclass) throws ComException {
		CoClass coClassAnnotation = coclass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to register coclass, missing annotation " + CoClass.class);

		String progId = coClassAnnotation.progId();
		String guid = coClassAnnotation.guid().toUpperCase();

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
	 *             Thrown, if a COM related error occurs.
	 */
	public static void unregisterCoClass(boolean perUserNotMachine, Class<?> coclass) throws ComException {
		CoClass coClassAnnotation = coclass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister coclass, missing annotation " + CoClass.class);

		String progId = coClassAnnotation.progId();
		String guid = coClassAnnotation.guid().toUpperCase();

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

	public static boolean isOutlook64() {
		boolean ret = System.getProperty("os.arch").contains("64");
		if (ret) {
			int supportedVersionMin = 14;
			int supportedVersionMax = 20;
			Object bitness = "";
			boolean found = false;
			String[] HKLMs = { "HKLM\\SOFTWARE", "HKLM\\SOFTWARE\\WOW6432Node" };
			for (int version = supportedVersionMax; !found && version >= supportedVersionMin; version--) {
				for (int i = 0; !found && i < HKLMs.length; i++) {
					String key = HKLMs[i] + "\\Microsoft\\Office\\" + version + ".0\\Outlook";
					bitness = getRegistryValue(key, "Bitness", "");
					found = bitness != null && bitness.toString().length() != 0;
				}
			}
			if (!found) {
				throw new IllegalStateException("Cannot detect Outlook bitness from HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Office\\[.].0\\Outlook\\Bitness");
			}
			if (found) {
				ret = bitness.equals("x64");
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		boolean is64 = isOutlook64();
		System.out.println(is64);
	}
}
