/*
    Copyright (c) 2014 Wolfgang Imig
    
    This file is part of the library "Java Add-in for Microsoft Office".

    This file must be used according to the terms of   
      
      MIT License, http://opensource.org/licenses/MIT

 */
package com.wilutions.joa;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.JoaDll;
import com.wilutions.com.reg.RegUtil;

/**
 * Helper class to register a Microsoft Office Addin with the Windows registry.
 */
public class RegisterAddin {
	
	private static Logger log = Logger.getLogger("RegisterAddin");

	/**
	 * Internal number of minimum supported office version.
	 * Currently 14, which belongs to Office 2010.
	 */
	public final static int SUPPORTED_OFFICE_VERSION_MIN = 14;

	/**
	 * Internal number of maximum supported office version.
	 * Currently 14, which belongs to Office 2016.
	 */
	public final static int SUPPORTED_OFFICE_VERSION_MAX = 16;
	
	
	private final String officeApplication;
	private final boolean perUserNotMachine;
	private final String progId;
	
	private RegisterAddin(String officeApplication, String progId, boolean perUserNotMachine) {
		this.officeApplication = officeApplication;
		this.progId = progId;
		this.perUserNotMachine = perUserNotMachine;
	}
	
	public static void ensureAddinIsActive(Class<?> addinClass) {
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();
		
		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, true);
		registerAddin.ensureAddinIsActive();
	}
	
	public static void register(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		if (log.isLoggable(Level.FINE)) log.fine("register(" + addinClass.getName() + " " + (perUserNotMachine ? "/user" : "/all")); 
		System.out.println("register " + addinClass.getName() + " " + (perUserNotMachine ? "/user" : "/all") );
		
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();
		String name = addinAnnotation.friendlyName();
		String desc = addinAnnotation.description();
		LoadBehavior loadBehavior = addinAnnotation.loadBehavior();

		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, perUserNotMachine);
		registerAddin.registerAddin(progId, name, desc, loadBehavior);
		
		// Register ActiveX JoaBridgeCtrl.Class
		registerAddin.registerBridgeCtrl(true);

		registerAddin.registerJoaUtilAddin();
		
		// If we registered for user, the doNotDisableAddins key can be set during registration.
		// Otherwise it will be set the when the application starts for the first time.
		if (perUserNotMachine) {
			registerAddin.ensureAddinIsActive();
		}
		
		if (log.isLoggable(Level.FINE)) log.fine(")register");
	}
	
	private void registerBridgeCtrl(boolean registerNotUnregister) {
		final String referencedByProgId = progId;
		final File joaDllInstDir = new File(JoaDll.nativeGetModuleFileName()).getParentFile();
		final String regcmdTemplate = "%s\\%s\\regsvr32 /s /n %s /i:\"%s %s\" \"%s\"";
    	File joa32 = new File(joaDllInstDir, "joa32.dll");
    	File joa64 = new File(joaDllInstDir, "joa64.dll");

		String windir = System.getenv("SYSTEMROOT");
        if (windir == null || windir.length() == 0) windir = System.getenv("WINDIR");
        
        try {
	        if (RegUtil.is64() && joa32.exists()) {
				String regcmd = String.format(regcmdTemplate,
						windir, 
						"SysWOW64", 
						(registerNotUnregister ? "" : "/u"), 
						(perUserNotMachine ? "user" : "all"),
						referencedByProgId,
						joa32);
				regsvr32(regcmd);
	        }
	        
	        {
				String regcmd = String.format(regcmdTemplate,
						windir, 
						"System32", 
						(registerNotUnregister ? "" : "/u"), 
						(perUserNotMachine ? "user" : "all"),
						referencedByProgId,
						RegUtil.is64() ? joa64 : joa32);
				regsvr32(regcmd);
	        }
        }
        catch (Exception e) {
        	throw new IllegalStateException(e);
        }
		
	}

	protected static void regsvr32(String regcmd) throws IOException, InterruptedException {
		System.out.println(regcmd);
		Process proc = Runtime.getRuntime().exec(regcmd);
		proc.waitFor();
		if (proc.exitValue() != 0) {
			throw new IOException("Register JOA native library failed, command=" + regcmd + ", error=" + proc.exitValue());
		}
	}

	private void registerAddin(String progId, String name, String desc, LoadBehavior loadBehavior) {
		System.out.println("registerAddin app=" + officeApplication + ", progId=" + progId);
		
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		RegUtil.setRegistryValue(key, "FriendlyName", name);
		RegUtil.setRegistryValue(key, "Description", desc);
		setLoadBehavior(key, loadBehavior);
		
		if (RegUtil.is64() && !perUserNotMachine) {
			key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, true) + "\\" + progId;
			RegUtil.setRegistryValue(key, "FriendlyName", name);
			RegUtil.setRegistryValue(key, "Description", desc);
			setLoadBehavior(key, loadBehavior);
		}
	}
	
	/**
	 * Enable Add-in.
	 * https://blogs.msdn.microsoft.com/emeamsgdev/2017/08/02/outlooks-slow-add-ins-resiliency-logic-and-how-to-always-enable-slow-add-ins/
	 * @param progId
	 * @param progId2 
	 * @param perUserNotMachine 
	 */
	private void ensureAddinIsActive() {
		// HKEY_CURRENT_USER\SOFTWARE\Microsoft\Office\1x.0\Outlook\Resiliency\DoNotDisableAddinList
		
		int officeVersion = detectOfficeVersion();
		if (officeVersion != 0) {
			
			String outlookRecilencyKey = getKeyOfficeApplicationVersion(officeApplication, officeVersion, perUserNotMachine, false, "Resiliency");
			
			String doNotDisabledAddinsKey = outlookRecilencyKey + "\\DoNotDisableAddinList";
			RegUtil.setRegistryValue(doNotDisabledAddinsKey, progId, 1);
			
			String disabledAddinsKey = outlookRecilencyKey + "\\DisabledItems";
			RegUtil.deleteRegistryKey(disabledAddinsKey);
			RegUtil.setRegistryValue(disabledAddinsKey, "", "");
			
			String crashingAddinsKey = outlookRecilencyKey + "\\CrashingAddinList";
			RegUtil.deleteRegistryKey(crashingAddinsKey);
			RegUtil.setRegistryValue(crashingAddinsKey, "", "");
		}
	}
	
	private int detectOfficeVersion() {
		final boolean perUserNotMachine = false;
		for (int version = SUPPORTED_OFFICE_VERSION_MIN; version <= SUPPORTED_OFFICE_VERSION_MAX; version++) {
			for (int wow6432Node = 0; wow6432Node < 2; wow6432Node++) {
				String key = getKeyOfficeApplicationVersion(officeApplication, version, perUserNotMachine, wow6432Node != 0, "InstallRoot");
				String path = (String)RegUtil.getRegistryValue(key, "Path", "");
				if (!path.isEmpty()) {
					return version;
				}
			}
		}
		throw new IllegalStateException("Cannot detect office version.");
	}
	
	private static void setLoadBehavior(String key, LoadBehavior loadBehavior) {
		if (loadBehavior == LoadBehavior.LoadByJoaUtil) {
			RegUtil.setRegistryValue(key, "LoadBehavior", LoadBehavior.DoNotLoad.value);
			RegUtil.setRegistryValue(key, "LoadBehaviorJOA", LoadBehavior.LoadOnStart.value);
		}
		else {
			RegUtil.setRegistryValue(key, "LoadBehavior", loadBehavior.value);
		}
	}

	private static String getKeyOfficeApplication(String officeApplication, boolean perUserNotMachine,
			boolean wow6432Node, String subkey) {
		String key = getKeyMicrosoftOffice(perUserNotMachine, wow6432Node) + "\\" + officeApplication + "\\" + subkey;
		return key;
	}
	
	private static String getKeyOfficeApplicationVersion(String officeApplication, int version, boolean perUserNotMachine,
			boolean wow6432Node, String subkey) {
		String key = getKeyMicrosoftOffice(perUserNotMachine, wow6432Node) 
				+ "\\" + version + ".0" 
				+ "\\" + officeApplication 
				+ "\\" + subkey;
		return key;
	}
	
	private static String getKeyMicrosoftOffice(boolean perUserNotMachine, boolean wow6432Node) {
		String rootKey = perUserNotMachine ? "HKCU" : "HKLM";
		String key = rootKey + "\\Software\\";
		if (!perUserNotMachine && wow6432Node) key += "Wow6432Node\\";
		key += "Microsoft\\Office";
		return key;
	}
	
	protected static String getKeyOfficeApplicationAddins(String officeApplication, boolean perUserNotMachine, 
			boolean wow6432Node) {
		return getKeyOfficeApplication(officeApplication, perUserNotMachine, wow6432Node, "Addins");
	}

	protected void registerJoaUtilAddin() {

		String referencedByAddin = this.progId;
		String progId = JoaUtilAddin_progId;
		String name = JoaUtilAddin_name;
		String desc = JoaUtilAddin_desc;
		LoadBehavior loadBehavior = JoaUtilAddin_loadBehavior;

		registerAddin(progId, name, desc, loadBehavior);

		// Add reference to JoaUtilAddin from referencing Add-in
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		key += "\\__References\\" + referencedByAddin;
		String value = dateFormat.format(new Date(System.currentTimeMillis()));
		RegUtil.setRegistryValue(key, "", value);
	}

	public static void unregister(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();

		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, perUserNotMachine);
		registerAddin.unregisterAddin(progId);

		registerAddin.unregisterJoaUtilAddin();

		// Unregister ActiveX JoaBridgeCtrl.Class
		registerAddin.registerBridgeCtrl(false);

	}

	private void unregisterAddin(String progId) {
		String key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		RegUtil.purgeRegistryKey(key);

		if (RegUtil.is64() && !perUserNotMachine) {
			key = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, true) + "\\" + progId;
			RegUtil.purgeRegistryKey(key);
		}

		// Delete Registry keys where Outlook stores data about the Addin.
		// If unregistering for HKLM, we cannot delete this values for all users.
		if (perUserNotMachine) {
			int officeVersion = detectOfficeVersion();
			String keyAddinData = getKeyOfficeApplicationVersion(officeApplication, officeVersion, perUserNotMachine, false, "Addins\\" + progId);
			RegUtil.purgeRegistryKey(keyAddinData);

			try {
				String keyAddinLoadTimes = getKeyOfficeApplicationVersion(officeApplication, officeVersion, perUserNotMachine, false, "AddInLoadTimes");
				RegUtil.deleteRegistryValue(keyAddinLoadTimes, progId);
			}
			catch(ComException ignored) {}
		}
	}

	protected void unregisterJoaUtilAddin() {
		String referencedByAddin = this.progId;
		String progId = JoaUtilAddin_progId;
		String refsKey = getKeyOfficeApplicationAddins(officeApplication, perUserNotMachine, false) + "\\" + progId;
		refsKey += "\\__References";
		RegUtil.deleteRegistryKey(refsKey + "\\" + referencedByAddin);

		if (RegUtil.deleteRegistryKey(refsKey)) {
			unregisterAddin(JoaUtilAddin_progId);
		}
	}

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	private static final String JoaUtilAddin_progId = "JoaUtilAddin.Class";
	private static final String JoaUtilAddin_name = "WI: JOA Util Add-in";
	private static final String JoaUtilAddin_desc = "This Add-in supports other Add-ins developed with JOA.";
	private static final LoadBehavior JoaUtilAddin_loadBehavior = LoadBehavior.LoadOnStart;
	public static final String JoaUtilAddin_clsid = "{7B57EC55-0A9C-4AB0-A2CC-AF81C680CFAC}";

}
