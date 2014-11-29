package imcl;

import com.wilutions.com.ComException;
import com.wilutions.mslib.uccollaborationlib.ClientState;
import com.wilutions.mslib.uccollaborationlib.IClientStateChangedEventData;

public class IMClientStateChangedEventData implements IClientStateChangedEventData {

	private ClientState oldState;
	private ClientState newState;

	public IMClientStateChangedEventData(ClientState oldState, ClientState newState) {
		this.oldState = oldState;
		this.newState = newState;
	}

	@Override
	public ClientState getNewState() throws ComException {
		return newState;
	}

	@Override
	public ClientState getOldState() throws ComException {
		return oldState;
	}

	@Override
	public Integer getStatusCode() throws ComException {
		return 0;
	}

}
