package imcl;

import com.wilutions.com.CoClass;
import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.com.IDispatch;
import com.wilutions.mslib.messengerapi.DMessengerEvents;
import com.wilutions.mslib.messengerapi.IMessenger;
import com.wilutions.mslib.messengerapi.MCONTACTPROPERTY;
import com.wilutions.mslib.messengerapi.MISTATUS;
import com.wilutions.mslib.messengerapi.MOPTIONPAGE;
import com.wilutions.mslib.messengerapi.MPHONE_TYPE;
import com.wilutions.mslib.messengerapi.MUAFOLDER;
import com.wilutions.mslib.uccollaborationlib.IUCOfficeIntegration;
import com.wilutions.mslib.uccollaborationlib.OIFeature;
import com.wilutions.mslib.uccollaborationlib.OIInterface;
import com.wilutions.mslib.uccollaborationlib._IUCOfficeIntegrationEvents;

@CoClass(progId="LitwareClientAppObject.Class", guid="{a086c707-6089-4ffe-9bf6-c651ad64267f}")
public class LitwareClientAppObject extends DispatchImpl implements IUCOfficeIntegration, IMessenger {
	
	public final static String OUTLOOK_2013 = "15.0.0.0";
	public final static String OUTLOOK_2010 = "14.0.0.0";
	
	public LitwareClientAppObject() {
		getConnectionPointContainer().provideConnectionPoint(_IUCOfficeIntegrationEvents.class);
		getConnectionPointContainer().provideConnectionPoint(DMessengerEvents.class);
	}
	
	IMClient imClient = new IMClient();
	Automation imAutomation = new Automation();

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
			ret = imClient;
			break;
		case OIInterface._oiInterfaceIAutomation:
			ret = imAutomation;
			break;
		}
		return ret;
	}

	@Override
	public IDispatch getWindow() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ViewProfile(Object vContact) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getReceiveFileDirectory() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDispatch StartVoice(Object vContact) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDispatch InviteApp(Object vContact, String bstrAppID) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SendMail(Object vContact) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenInbox() throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDispatch SendFile(Object vContact, String bstrFileName) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Signout() throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Signin(Integer hwndParent, String bstrSigninName, String bstrPassword) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDispatch GetContact(String bstrSigninName, String bstrServiceId) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void OptionsPages(Integer hwndParent, MOPTIONPAGE MOPTIONPAGE) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddContact(Integer hwndParent, String bstrEMail) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FindContact(Integer hwndParent, String bstrFirstName, String bstrLastName, Object vbstrCity,
			Object vbstrState, Object vbstrCountry) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDispatch InstantMessage(Object vContact) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDispatch Phone(Object vContact, MPHONE_TYPE ePhoneNumber, String bstrNumber) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void MediaWizard(Integer hwndParent) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDispatch Page(Object vContact) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AutoSignin() throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDispatch getMyContacts() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMySigninName() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMyFriendlyName() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMyStatus(MISTATUS value) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MISTATUS getMyStatus() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getUnreadEmailCount(MUAFOLDER mFolder) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMyServiceName() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMyPhoneNumber(MPHONE_TYPE PhoneType) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getMyProperty(MCONTACTPROPERTY ePropType) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMyProperty(MCONTACTPROPERTY ePropType, Object value2) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMyServiceId() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDispatch getServices() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

}
