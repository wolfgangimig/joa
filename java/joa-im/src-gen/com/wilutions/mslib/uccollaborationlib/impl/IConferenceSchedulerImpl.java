/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{073B2869-12F1-928D-0F74-31C327DB876C}")
public class IConferenceSchedulerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceScheduler {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IConferenceInfo CreateConferenceInfo() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"CreateConferenceInfo", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceInfoImpl.class);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ScheduleConference(final com.wilutions.mslib.uccollaborationlib.IConferenceInfo _confInfo, final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743809,"ScheduleConference", DISPATCH_METHOD,null,(_confInfo!=null?_confInfo:Dispatch.NULL),_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetConferenceInfo(final String _conferenceId, final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_conferenceId != null);
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743810,"GetConferenceInfo", DISPATCH_METHOD,null,_conferenceId,_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetAllConferences(final Boolean _isPublic, final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_isPublic != null);
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743811,"GetAllConferences", DISPATCH_METHOD,null,_isPublic,_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ModifyConference(final com.wilutions.mslib.uccollaborationlib.IConferenceInfo _conferenceInfo, final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743812,"ModifyConference", DISPATCH_METHOD,null,(_conferenceInfo!=null?_conferenceInfo:Dispatch.NULL),_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation DeleteConference(final String _confId, final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_confId != null);
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"DeleteConference", DISPATCH_METHOD,null,_confId,_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetAvailableModalities(final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"GetAvailableModalities", DISPATCH_METHOD,null,_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation GetCapabilities(final Object _conferenceSchedulerCallback, final Object _state) throws ComException {
    assert(_conferenceSchedulerCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"GetCapabilities", DISPATCH_METHOD,null,_conferenceSchedulerCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IConferenceSettingDictionary GetSettings() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"GetSettings", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceSettingDictionaryImpl.class);
  }
  public IConferenceSchedulerImpl(String progId) throws ComException {
    super(progId, "{C7ACB102-B692-49CC-92DA-5824822C7B96}");
  }
  protected IConferenceSchedulerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceSchedulerImpl" + super.toString() + "]";
  }
}
