package imcl;

import com.wilutions.com.ComException;
import com.wilutions.com.DispatchImpl;
import com.wilutions.mslib.uccollaborationlib.AutomationModalities;
import com.wilutions.mslib.uccollaborationlib.AutomationModalitySettings;
import com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation;
import com.wilutions.mslib.uccollaborationlib.IAutomation;
import com.wilutions.mslib.uccollaborationlib.IConversation;
import com.wilutions.mslib.uccollaborationlib.IConversationWindow;

public class Automation extends DispatchImpl implements IAutomation {

	@Override
	public void LaunchAddContactWizard(String _contactEmail) throws ComException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IConversationWindow StartConversation(AutomationModalities _conversationModes, String[] _participantUris,
			AutomationModalitySettings[] _contextTypes, Object[] _contextDatas) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConversationWindow JoinConference(String _conferenceUrl) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation StartConversationEx(AutomationModalities _conversationModes,
			String[] _participantUris, AutomationModalitySettings[] _contextTypes, Object[] _contextDatas,
			Object _callback, Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAsynchronousOperation JoinConferenceEx(String _conferenceUrl, Integer _parentHWND, Object _callback,
			Object _state) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IConversationWindow GetConversationWindow(IConversation _conversation) throws ComException {
		// TODO Auto-generated method stub
		return null;
	}

}
