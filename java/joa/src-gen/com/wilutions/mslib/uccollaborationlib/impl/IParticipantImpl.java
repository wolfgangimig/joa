/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{88E2593B-1EFF-9144-14B0-8E570CB1CA9E}")
public class IParticipantImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IParticipant {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.IModalityDictionary getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IModalityDictionaryImpl.class);
  }
  @DeclDISPID(1610743809)  public Boolean getIsSelf() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsSelf", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IContact getContact() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Contact", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IParticipantPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IParticipantPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetProperty(com.wilutions.mslib.uccollaborationlib.ParticipantProperty _propertyType, Object _propertyValue, Object _participantCallback, Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_participantCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetMute(Boolean _mute, Object _participantCallback, Object _state) throws ComException {
    assert(_mute != null);
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"SetMute", DISPATCH_METHOD,null,_mute,_participantCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public Boolean getIsMuted() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"IsMuted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743816)  public Boolean CanSetProperty(com.wilutions.mslib.uccollaborationlib.ParticipantProperty _participantProperty) throws ComException {
    assert(_participantProperty != null);
    final Object obj = this._dispatchCall(1610743816,"CanSetProperty", DISPATCH_METHOD,null,_participantProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Admit(Object _participantCallback, Object _state) throws ComException {
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Admit", DISPATCH_METHOD,null,_participantCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Deny(Object _participantCallback, Object _state) throws ComException {
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"Deny", DISPATCH_METHOD,null,_participantCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743819)  public Boolean CanAdmit() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"CanAdmit", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743820)  public Boolean CanDeny() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"CanDeny", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743821)  public Boolean CanBeMuted() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"CanBeMuted", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743822)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ParticipantAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743822,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IParticipantImpl(String progId) throws ComException {
    super(progId, "{4875C050-BA9C-4A05-891E-E7B0A9463664}");
  }
  protected IParticipantImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IParticipantImpl" + super.toString() + "]";
  }
}
