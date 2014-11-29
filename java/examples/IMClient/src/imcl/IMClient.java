package imcl;

import com.wilutions.com.ComException;
import com.wilutions.com.ConnectionPoint;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.uccollaborationlib.ClientState;
import com.wilutions.mslib.uccollaborationlib.ClientType;
import com.wilutions.mslib.uccollaborationlib.IApplicationRegistration;
import com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation;
import com.wilutions.mslib.uccollaborationlib.IClient;
import com.wilutions.mslib.uccollaborationlib.IConferenceScheduler;
import com.wilutions.mslib.uccollaborationlib.IContactManager;
import com.wilutions.mslib.uccollaborationlib.IConversationManager;
import com.wilutions.mslib.uccollaborationlib.IDelegatorClient;
import com.wilutions.mslib.uccollaborationlib.IDeviceManager;
import com.wilutions.mslib.uccollaborationlib.ILyncClient;
import com.wilutions.mslib.uccollaborationlib.ISelf;
import com.wilutions.mslib.uccollaborationlib.ISignInConfiguration;
import com.wilutions.mslib.uccollaborationlib.IUtilities;
import com.wilutions.mslib.uccollaborationlib.LyncClientCapabilityTypes;
import com.wilutions.mslib.uccollaborationlib.SupportedFeatures;
import com.wilutions.mslib.uccollaborationlib._ILyncClientEvents;
import com.wilutions.mslib.uccollaborationlib.impl.Fire__ILyncClientEvents;

public class IMClient extends DispatchImpl implements ILyncClient, IClient {

	private ClientState _clientState = ClientState.ucClientStateUninitialized;
	private IMClientAsyncOperation _asyncOperation = new IMClientAsyncOperation();
	private IMClientSelf _self;

	public IMClient() {
		getConnectionPointContainer().provideConnectionPoint(_ILyncClientEvents.class);
	}

	@Override
	public ClientType getType() throws ComException {
		return ClientType.ucClientTypeUC;
	}

	@Override
	public ClientState getState() throws ComException {
		return _clientState;
	}

	@Override
	public String getUri() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISelf getSelf() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContactManager getContactManager() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConversationManager getConversationManager() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConferenceScheduler getConferenceScheduler() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation SignIn(String _userUri, String _domainAndUsername, String _password,
			Object _CommunicatorClientCallback, Object _state) throws ComException {
		ClientState _previousClientState = this._clientState;
		this._clientState = ClientState.ucClientStateSignedIn;

		IMClientStateChangedEventData eventData = new IMClientStateChangedEventData(_previousClientState, _clientState);

		if (_userUri != null) {
			
			// During the sign-in process, create a new contact with
			// the contact information of the currently signed-in user.
			this._self = new IMClientSelf(IMContact.BuildContact(_userUri));
		}

	    // Raise the _ILyncClientEvents.OnStateChanged event.
		Fire__ILyncClientEvents.onOnStateChanged(this, this, eventData);
	    
	    return this._asyncOperation;
	}

	@Override
	public IAsynchronousOperation SignOut(Object _CommunicatorClientCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISignInConfiguration getSignInConfiguration() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LyncClientCapabilityTypes getCapabilities() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDeviceManager getDeviceManager() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDelegatorClient[] getDelegatorClients() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUtilities getUtilities() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IApplicationRegistration CreateApplicationRegistration(String _appGuid, String _appName) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getInSuppressedMode() throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation Initialize(String _clientName, String _version, String _clientShortName,
			String _clientNameAbbreviation, String _clientLongName, SupportedFeatures _supportedFeatures,
			Object _CommunicatorClientCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation Shutdown(Object _CommunicatorClientCallback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

}
