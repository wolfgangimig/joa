/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Participant.
 * Participant class describs a conversation participant.This class handles the events 
 * defined in the interface IParticipantEvents. 
 */
@CoClass(guid="{DE5598BC-7188-415A-A3D9-7E86863E7A09}")
public class Participant extends Dispatch implements IParticipant {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IModalityDictionary getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityDictionaryImpl.class);
  }
  @DeclDISPID(1610743809)  public Boolean getIsSelf() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IsSelf", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743810)  public IContact getContact() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Contact", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactImpl.class);
  }
  @DeclDISPID(1610743811)  public IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743812)  public IParticipantPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743813)  public IAsynchronousOperation SetProperty(final ParticipantProperty _propertyType, final Object _propertyValue, final Object _participantCallback, final Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743813,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_participantCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743814)  public IAsynchronousOperation SetMute(final Boolean _mute, final Object _participantCallback, final Object _state) throws ComException {
    assert(_mute != null);
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743814,"SetMute", DISPATCH_METHOD,null,_mute,_participantCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743815)  public Boolean getIsMuted() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"IsMuted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743816)  public Boolean CanSetProperty(final ParticipantProperty _participantProperty) throws ComException {
    assert(_participantProperty != null);
    final Object obj = this._dispatchCall(1610743816,"CanSetProperty", DISPATCH_METHOD,null,_participantProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743817)  public IAsynchronousOperation Admit(final Object _participantCallback, final Object _state) throws ComException {
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Admit", DISPATCH_METHOD,null,_participantCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public IAsynchronousOperation Deny(final Object _participantCallback, final Object _state) throws ComException {
    assert(_participantCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"Deny", DISPATCH_METHOD,null,_participantCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
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
  @DeclDISPID(1610743822)  public Boolean CanInvoke(final ParticipantAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743822,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public Participant() throws ComException {
    super("{DE5598BC-7188-415A-A3D9-7E86863E7A09}", "{4875C050-BA9C-4A05-891E-E7B0A9463664}");
  }
  protected Participant(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Participant" + super.toString() + "]";
  }
}
