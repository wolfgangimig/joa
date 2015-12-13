/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAutomation.
 * IAutomation Interface 
 */
@CoInterface(guid="{2EDAF003-14A6-4FAF-8A72-99526D048D63}")
public interface IAutomation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public void LaunchAddContactWizard(final String _contactEmail) throws ComException;
  @DeclDISPID(1610743809)  public IConversationWindow StartConversation(final AutomationModalities _conversationModes, final String[] _participantUris, final AutomationModalitySettings[] _contextTypes, final Object[] _contextDatas) throws ComException;
  @DeclDISPID(1610743810)  public IConversationWindow JoinConference(final String _conferenceUrl) throws ComException;
  @DeclDISPID(1610743811)  public IAsynchronousOperation StartConversationEx(final AutomationModalities _conversationModes, final String[] _participantUris, final AutomationModalitySettings[] _contextTypes, final Object[] _contextDatas, final Object _callback, final Object _state) throws ComException;
  @DeclDISPID(1610743812)  public IAsynchronousOperation JoinConferenceEx(final String _conferenceUrl, final Integer _parentHWND, final Object _callback, final Object _state) throws ComException;
  @DeclDISPID(1610743813)  public IConversationWindow GetConversationWindow(final IConversation _conversation) throws ComException;
}
