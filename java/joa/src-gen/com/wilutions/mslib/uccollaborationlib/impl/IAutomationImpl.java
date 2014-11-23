/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{EE4D6968-B0C5-94EE-17DC-F0B5C8F37199}")
public class IAutomationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAutomation {
  @DeclDISPID(1610743808)  public void LaunchAddContactWizard(String _contactEmail) throws ComException {
    assert(_contactEmail != null);
    this._dispatchCall(1610743808,"LaunchAddContactWizard", DISPATCH_METHOD,null,_contactEmail);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IConversationWindow StartConversation(com.wilutions.mslib.uccollaborationlib.AutomationModalities _conversationModes, String[] _participantUris, com.wilutions.mslib.uccollaborationlib.AutomationModalitySettings[] _contextTypes, Object[] _contextDatas) throws ComException {
    assert(_conversationModes != null);
    assert(_participantUris != null);
    assert(_contextTypes != null);
    assert(_contextDatas != null);
    final Object obj = this._dispatchCall(1610743809,"StartConversation", DISPATCH_METHOD,null,_conversationModes.value,_participantUris,_contextTypes,_contextDatas);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IConversationWindow JoinConference(String _conferenceUrl) throws ComException {
    assert(_conferenceUrl != null);
    final Object obj = this._dispatchCall(1610743810,"JoinConference", DISPATCH_METHOD,null,_conferenceUrl);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation StartConversationEx(com.wilutions.mslib.uccollaborationlib.AutomationModalities _conversationModes, String[] _participantUris, com.wilutions.mslib.uccollaborationlib.AutomationModalitySettings[] _contextTypes, Object[] _contextDatas, Object _callback, Object _state) throws ComException {
    assert(_conversationModes != null);
    assert(_participantUris != null);
    assert(_contextTypes != null);
    assert(_contextDatas != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743811,"StartConversationEx", DISPATCH_METHOD,null,_conversationModes.value,_participantUris,_contextTypes,_contextDatas,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation JoinConferenceEx(String _conferenceUrl, Integer _parentHWND, Object _callback, Object _state) throws ComException {
    assert(_conferenceUrl != null);
    assert(_parentHWND != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"JoinConferenceEx", DISPATCH_METHOD,null,_conferenceUrl,_parentHWND,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IConversationWindow GetConversationWindow(com.wilutions.mslib.uccollaborationlib.IConversation _conversation) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"GetConversationWindow", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  public IAutomationImpl(String progId) throws ComException {
    super(progId, "{2EDAF003-14A6-4FAF-8A72-99526D048D63}");
  }
  protected IAutomationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAutomationImpl" + super.toString() + "]";
  }
}
