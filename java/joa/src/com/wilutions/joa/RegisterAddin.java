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
	
	private enum Mode { Register, Unregister };
	
	private enum HklmNode { Default, Wow6432Node };
	
	private enum RegisterFor { Machine, User };
	
	private final String officeApplication;
	private final RegisterFor registerFor;
	private final String progId;
	
	// Determined in detectOfficeVersionAndHklm()
	private int officeVersion;
	private HklmNode hklmNode;
	
	private RegisterAddin(String officeApplication, String progId, RegisterFor registerFor) {
		this.officeApplication = officeApplication;
		this.progId = progId;
		this.registerFor = registerFor;
		detectOfficeVersionAndHklm();
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
		
		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, RegisterFor.User);
		registerAddin.ensureAddinIsActive();
	}
	
	public static void register(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		RegisterFor registerFor = perUserNotMachine ? RegisterFor.User : RegisterFor.Machine;

		if (log.isLoggable(Level.FINE)) log.fine("register(" + addinClass.getName() + " " + registerFor); 
		System.out.println("register " + addinClass.getName() + " " + registerFor );
		
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

		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, registerFor);
		registerAddin.registerAddin(progId, name, desc, loadBehavior);
		
		// Register ActiveX JoaBridgeCtrl.Class
		registerAddin.registerBridgeCtrl(true);

		registerAddin.registerJoaUtilAddin();
		
		// If we registered for user, the doNotDisableAddins key can be set during registration.
		// Otherwise it will be set the when the application starts for the first time.
		if (registerFor == RegisterFor.User) {
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
						(registerFor == RegisterFor.User ? "user" : "all"),
						referencedByProgId,
						joa32);
				regsvr32(regcmd);
	        }
	        
	        {
				String regcmd = String.format(regcmdTemplate,
						windir, 
						"System32", 
						(registerNotUnregister ? "" : "/u"), 
						(registerFor == RegisterFor.User ? "user" : "all"),
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
		
		String key = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Default) + "\\" + progId;
		RegUtil.setRegistryValue(key, "FriendlyName", name);
		RegUtil.setRegistryValue(key, "Description", desc);
		setLoadBehavior(key, loadBehavior);
		
		if (RegUtil.is64() && registerFor == RegisterFor.Machine) {
			key = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Wow6432Node) + "\\" + progId;
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
	 * @param registerFor 
	 */
	private void ensureAddinIsActive() {
		// HKEY_CURRENT_USER\SOFTWARE\Microsoft\Office\1x.0\Outlook\Resiliency\DoNotDisableAddinList
		
		String outlookRecilencyKey = getKeyOfficeApplicationVersion(officeApplication, officeVersion, RegisterFor.User, hklmNode, "Resiliency");
		
		String doNotDisabledAddinsKey = outlookRecilencyKey + "\\DoNotDisableAddinList";
		RegUtil.setRegistryValue(doNotDisabledAddinsKey, progId, 1);
		
		String disabledAddinsKey = outlookRecilencyKey + "\\DisabledItems";
		RegUtil.deleteRegistryKey(disabledAddinsKey);
		RegUtil.setRegistryValue(disabledAddinsKey, "", "");
		
		String crashingAddinsKey = outlookRecilencyKey + "\\CrashingAddinList";
		RegUtil.deleteRegistryKey(crashingAddinsKey);
			RegUtil.setRegistryValue(crashingAddinsKey, "", "");
	}
	
	private void detectOfficeVersionAndHklm() {
		final RegisterFor registerFor = RegisterFor.Machine;
		for (int version = SUPPORTED_OFFICE_VERSION_MIN; version <= SUPPORTED_OFFICE_VERSION_MAX; version++) {
			for (HklmNode hklmNode : HklmNode.values()) {
				String key = getKeyOfficeApplicationVersion(officeApplication, version, registerFor, hklmNode, "InstallRoot");
				String path = (String)RegUtil.getRegistryValue(key, "Path", "");
				if (!path.isEmpty()) {
					this.officeVersion = version;
					this.hklmNode = hklmNode;
					String msg = "Found MS Office install key=" + key + ", path=" + path;
					System.out.println(msg);
					log.info(msg);
					
					// ----------------- return
					return;
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

	private static String getKeyOfficeApplication(String officeApplication, RegisterFor registerFor,
			HklmNode hklmNode, String subkey) {
		String key = getKeyMicrosoftOffice(registerFor, hklmNode) + "\\" + officeApplication + "\\" + subkey;
		return key;
	}
	
	private static String getKeyOfficeApplicationVersion(String officeApplication, int version, RegisterFor registerFor,
			HklmNode hklmNode, String subkey) {
		String key = getKeyMicrosoftOffice(registerFor, hklmNode) 
				+ "\\" + version + ".0" 
				+ "\\" + officeApplication 
				+ "\\" + subkey;
		return key;
	}
	
	private static String getKeyMicrosoftOffice(RegisterFor registerFor, HklmNode hklmNode) {
		String rootKey = registerFor == RegisterFor.User ? "HKCU" : "HKLM";
		String key = rootKey + "\\Software\\";
		if (registerFor == RegisterFor.Machine && hklmNode == HklmNode.Wow6432Node) key += "Wow6432Node\\";
		key += "Microsoft\\Office";
		return key;
	}
	
	protected static String getKeyOfficeApplicationAddins(String officeApplication, RegisterFor registerFor, 
			HklmNode hklmNode) {
		return getKeyOfficeApplication(officeApplication, registerFor, hklmNode, "Addins");
	}

	protected void registerJoaUtilAddin() {

		String referencedByAddin = this.progId;
		String progId = JoaUtilAddin_progId;
		String name = JoaUtilAddin_name;
		String desc = JoaUtilAddin_desc;
		LoadBehavior loadBehavior = JoaUtilAddin_loadBehavior;

		registerAddin(progId, name, desc, loadBehavior);

		// Add reference to JoaUtilAddin from referencing Add-in
		String key = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Default) + "\\" + progId;
		key += "\\__References\\" + referencedByAddin;
		String value = dateFormat.format(new Date(System.currentTimeMillis()));
		RegUtil.setRegistryValue(key, "", value);
	}

	public static void unregister(boolean perUserNotMachine, Class<?> addinClass) throws ComException {
		RegisterFor registerFor = perUserNotMachine ? RegisterFor.User : RegisterFor.Machine;
		CoClass coClassAnnotation = addinClass.getAnnotation(CoClass.class);
		if (coClassAnnotation == null)
			throw new ComException("Failed to unregister Addin, missing annotation " + CoClass.class);
		DeclAddin addinAnnotation = addinClass.getAnnotation(DeclAddin.class);
		if (addinAnnotation == null)
			throw new ComException("Failed to register Addin, missing annotation " + DeclAddin.class);

		String progId = coClassAnnotation.progId();
		String officeApplication = addinAnnotation.application().toString();

		RegisterAddin registerAddin = new RegisterAddin(officeApplication, progId, registerFor);
		registerAddin.unregisterAddin(progId);

		registerAddin.unregisterJoaUtilAddin();

		// Unregister ActiveX JoaBridgeCtrl.Class
		registerAddin.registerBridgeCtrl(false);

	}

	private void unregisterAddin(String progId) {
		String key = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Default) + "\\" + progId;
		RegUtil.purgeRegistryKey(key);

		if (RegUtil.is64() && registerFor == RegisterFor.Machine) {
			key = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Wow6432Node) + "\\" + progId;
			RegUtil.purgeRegistryKey(key);
		}

		// Delete Registry keys where Outlook stores data about the Addin.
		// If unregistering for HKLM, we cannot delete this values for all users.
		if (registerFor == RegisterFor.User) {
			String keyAddinData = getKeyOfficeApplicationVersion(officeApplication, officeVersion, registerFor, HklmNode.Default, "Addins\\" + progId);
			RegUtil.purgeRegistryKey(keyAddinData);

			try {
				String keyAddinLoadTimes = getKeyOfficeApplicationVersion(officeApplication, officeVersion, registerFor, HklmNode.Default, "AddInLoadTimes");
				RegUtil.deleteRegistryValue(keyAddinLoadTimes, progId);
			}
			catch(ComException ignored) {}
			
			String keyNotDisable = getKeyOfficeApplicationVersion(officeApplication, officeVersion, registerFor, HklmNode.Default, "Resiliency\\\\DoNotDisableAddinList");
			RegUtil.deleteRegistryValue(keyNotDisable, progId);

		}
	}

	protected void unregisterJoaUtilAddin() {
		String referencedByAddin = this.progId;
		String progId = JoaUtilAddin_progId;
		String refsKey = getKeyOfficeApplicationAddins(officeApplication, registerFor, HklmNode.Default) + "\\" + progId;
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
