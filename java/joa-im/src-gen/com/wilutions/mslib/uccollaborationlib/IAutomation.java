/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAutomation.
 * IAutomation Interface 
 */
@CoInterface(guid="{2EDAF003-14A6-4FAF-8A72-99526D048D63}")
public interface IAutomation extends IDispatch {
  @DeclDISPID(1610743808)  public void LaunchAddContactWizard(String _contactEmail) throws ComException;
  @DeclDISPID(1610743809)  public IConversationWindow StartConversation(AutomationModalities _conversationModes, String[] _participantUris, AutomationModalitySettings[] _contextTypes, Object[] _contextDatas) throws ComException;
  @DeclDISPID(1610743810)  public IConversationWindow JoinConference(String _conferenceUrl) throws ComException;
  @DeclDISPID(1610743811)  public IAsynchronousOperation StartConversationEx(AutomationModalities _conversationModes, String[] _participantUris, AutomationModalitySettings[] _contextTypes, Object[] _contextDatas, Object _callback, Object _state) throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation JoinConferenceEx(String _conferenceUrl, Integer _parentHWND, Object _callback, Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IConversationWindow GetConversationWindow(IConversation _conversation) throws ComException;
}
