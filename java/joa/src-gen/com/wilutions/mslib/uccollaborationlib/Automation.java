/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Automation.
 * UIAutomation Class 
 */
@CoClass(guid="{E45FB8A0-6716-4F0F-A4F0-220C3DEB7337}")
public class Automation extends Dispatch implements IAutomation {
  @DeclDISPID(1610743808)  public void LaunchAddContactWizard(String _contactEmail) throws ComException {
    assert(_contactEmail != null);
    this._dispatchCall(1610743808,"LaunchAddContactWizard", DISPATCH_METHOD,null,_contactEmail);
  }
  @DeclDISPID(1610743809)  public IConversationWindow StartConversation(AutomationModalities _conversationModes, String[] _participantUris, AutomationModalitySettings[] _contextTypes, Object[] _contextDatas) throws ComException {
    assert(_conversationModes != null);
    assert(_participantUris != null);
    assert(_contextTypes != null);
    assert(_contextDatas != null);
    final Object obj = this._dispatchCall(1610743809,"StartConversation", DISPATCH_METHOD,null,_conversationModes.value,_participantUris,_contextTypes,_contextDatas);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  @DeclDISPID(1610743810)  public IConversationWindow JoinConference(String _conferenceUrl) throws ComException {
    assert(_conferenceUrl != null);
    final Object obj = this._dispatchCall(1610743810,"JoinConference", DISPATCH_METHOD,null,_conferenceUrl);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  @DeclDISPID(1610743811)  public IAsynchronousOperation StartConversationEx(AutomationModalities _conversationModes, String[] _participantUris, AutomationModalitySettings[] _contextTypes, Object[] _contextDatas, Object _callback, Object _state) throws ComException {
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
  @DeclDISPID(1610743812)  public IAsynchronousOperation JoinConferenceEx(String _conferenceUrl, Integer _parentHWND, Object _callback, Object _state) throws ComException {
    assert(_conferenceUrl != null);
    assert(_parentHWND != null);
    assert(_callback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"JoinConferenceEx", DISPATCH_METHOD,null,_conferenceUrl,_parentHWND,_callback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public IConversationWindow GetConversationWindow(IConversation _conversation) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"GetConversationWindow", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationWindowImpl.class);
  }
  public Automation() throws ComException {
    super("{E45FB8A0-6716-4F0F-A4F0-220C3DEB7337}", "{2EDAF003-14A6-4FAF-8A72-99526D048D63}");
  }
  protected Automation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Automation" + super.toString() + "]";
  }
}
