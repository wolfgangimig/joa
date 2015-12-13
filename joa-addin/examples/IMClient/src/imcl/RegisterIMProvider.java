package imcl;

import com.wilutions.com.reg.RegUtil;

public class RegisterIMProvider {
	
	public static void register(String applicationName, String friendlyName, String processName, String guid, boolean asDefault) {
		
		String regkeyApp = "HKEY_LOCAL_MACHINE\\Software\\IM Providers\\" + applicationName;
		RegUtil.setRegistryValue(regkeyApp, "GUID", guid);
		RegUtil.setRegistryValue(regkeyApp, "FriendlyName", friendlyName);
		RegUtil.setRegistryValue(regkeyApp, "ProcessName", processName);
		
		String regkeyUser = "HKEY_CURRENT_USER\\Software\\IM Providers\\" + applicationName;
		RegUtil.setRegistryValue(regkeyUser, "UpAndRunning", 0);
		
		if (asDefault) {
			String regkeyDef = "HKEY_CURRENT_USER\\Software\\IM Providers";
			RegUtil.setRegistryValue(regkeyDef, "DefaultIMApp", applicationName);
			
			// Office 2010 Logging
			// http://technet.microsoft.com/en-us/library/ff678502.aspx
			RegUtil.setRegistryValue(regkeyDef, "OfficePresenceLogging", 1);
			
			// Office 2013 Logging
			// https://social.msdn.microsoft.com/Forums/office/en-US/a174ca43-cdcf-4f78-a032-8e0cf6d29080/officepresencelogging-in-outlook-2013
			RegUtil.setRegistryValue("HKEY_CURRENT_USER\\Software\\Microsoft\\Office\\15.0\\Common\\General", "EnablePCXLogging", 1);
		}
	}
	
	public static void unregister(String applicationName) {
		String regkeyApp = "HKEY_LOCAL_MACHINE\\Software\\IM Providers\\" + applicationName;
		RegUtil.purgeRegistryKey(regkeyApp);
		
		String regkeyUser = "HKEY_CURRENT_USER\\Software\\IM Providers\\" + applicationName;
		RegUtil.purgeRegistryKey(regkeyUser);
		
		String regkeyDef = "HKEY_CURRENT_USER\\Software\\IM Providers";
		String defaultApp = (String)RegUtil.getRegistryValue(regkeyDef, "DefaultIMApp", "");
		if (defaultApp.equals(applicationName)) {
			RegUtil.setRegistryValue(regkeyDef, "DefaultIMApp", "");
		}
	}
	
}
