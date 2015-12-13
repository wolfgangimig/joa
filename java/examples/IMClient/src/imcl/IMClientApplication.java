package imcl;

import com.wilutions.com.CoClass;
import com.wilutions.joa.AddinApplication;

public class IMClientApplication extends AddinApplication {
	
	private static final String applicationName = "JOAIMCLIENT";
	private static final String friendlyName = "JOA IM Client";
	private static final String processName = "javaw.exe";

	public static void main(String[] args) {
		main(IMClientApplication.class, IMClientApplication.class, args);
	}

	@Override
	protected void register(boolean userNotMachine, String execPath) {
		super.register(userNotMachine, execPath);
		String guid = LitwareClientAppObject.class.getAnnotation(CoClass.class).guid();
		RegisterIMProvider.register(applicationName, friendlyName, processName, guid, true);
	}
	
	@Override
	protected void unregister(boolean userNotMachine) {
		RegisterIMProvider.unregister(applicationName);
		super.unregister(userNotMachine);
	}
}
