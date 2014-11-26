package imcl;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.IDispatch;
import com.wilutions.mslib.uccollaborationlib.IUCOfficeIntegration;
import com.wilutions.mslib.uccollaborationlib.OIFeature;
import com.wilutions.mslib.uccollaborationlib.OIInterface;

// http://msdn.microsoft.com/en-us/library/office/jj900715(v=office.15).aspx

@CoClass(progId="JOAIMClient.Class", guid="{a086c707-6089-4ffe-9bf6-c651ad64267f}")
public class IMClient extends DispatchImpl implements IUCOfficeIntegration {
	
	public final static String OUTLOOK_2013 = "15.0.0.0";
	public final static String OUTLOOK_2010 = "14.0.0.0";
	
	LyncClient lyncClient = new LyncClient();
	Automation automation = new Automation();

	@Override
	public OIFeature GetSupportedFeatures(String _version) throws ComException {
		System.out.println("GetSupportedFeatures " + _version);
		return OIFeature.oiFeatureFastSearch;
	}

	@Override
	public String GetAuthenticationInfo(String _version) throws ComException {
		System.out.println("GetAuthenticationInfo " + _version);
		String ret = "";
		if (_version.compareTo(OUTLOOK_2010) >= 0) {
			ret = "<authenticationinfo>";
		}
		return ret;
	}

	@Override
	public IDispatch GetInterface(String _version, OIInterface _interface) throws ComException {
		System.out.println("GetInterface " + _version + ", _interface=" + _interface);
		IDispatch ret = null;
		switch (_interface.value) {
		case OIInterface._oiInterfaceILyncClient:
			ret = lyncClient;
			break;
		case OIInterface._oiInterfaceIAutomation:
			ret = automation;
			break;
		}
		return ret;
	}

}
