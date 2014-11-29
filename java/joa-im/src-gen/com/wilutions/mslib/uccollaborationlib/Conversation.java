/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Conversation.
 * Conversation class describs a conversation. It includes details such as the conversation 
 * participants, modalities, state, etc., and impelements actions like merge, park, terminate 
 * etc. This class handles events defined in the interface IConversationEvents. 
 */
@CoClass(guid="{457D962F-5F66-4429-BD94-6F9F366FAE0D}")
public class Conversation extends Dispatch implements IConversation {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ConversationState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public IParticipant getSelfParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"SelfParticipant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743810)  public IModalityDictionary getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityDictionaryImpl.class);
  }
  @DeclDISPID(1610743811)  public IParticipantCollection getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantCollectionImpl.class);
  }
  @DeclDISPID(1610743812)  public IParticipant AddParticipant(IDispatch _contactOrCollaborationEndpoint) throws ComException {
    final Object obj = this._dispatchCall(1610743812,"AddParticipant", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743813)  public void RemoveParticipant(IParticipant _participant) throws ComException {
    this._dispatchCall(1610743813,"RemoveParticipant", DISPATCH_METHOD,null,(_participant!=null?_participant:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public IConversationContextList getContexts() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Contexts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextListImpl.class);
  }
  @DeclDISPID(1610743815)  public IConversationHistory getHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"History", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationHistoryImpl.class);
  }
  @DeclDISPID(1610743816)  public IConversationPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743817)  public IAsynchronousOperation SetProperty(ConversationProperty _propertyType, Object _propertyValue, Object _conversationCallback, Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public IAsynchronousOperation SendInitialContext(ContextType[] _contextTypes, Object[] _contextDatas, Object _conversationCallback, Object _state) throws ComException {
    assert(_contextTypes != null);
    assert(_contextDatas != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"SendInitialContext", DISPATCH_METHOD,null,_contextTypes,_contextDatas,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743819)  public IAsynchronousOperation SendContextData(String _applicationId, String _dataType, String _data, Object _conversationCallback, Object _state) throws ComException {
    assert(_applicationId != null);
    assert(_dataType != null);
    assert(_data != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743819,"SendContextData", DISPATCH_METHOD,null,_applicationId,_dataType,_data,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743820)  public String GetApplicationData(String _appGuid) throws ComException {
    assert(_appGuid != null);
    final Object obj = this._dispatchCall(1610743820,"GetApplicationData", DISPATCH_METHOD,null,_appGuid);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743821)  public IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743822)  public IAsynchronousOperation Merge(IConversation _conversation, ModalityTypes _modalityTypes, Object _conversationCallback, Object _state) throws ComException {
    assert(_modalityTypes != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Merge", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_modalityTypes.value,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public IAsynchronousOperation AdmitParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"AdmitParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public IAsynchronousOperation DenyParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"DenyParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public IAsynchronousOperation Park(Object _conversationCallback, Object _state) throws ComException {
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743825,"Park", DISPATCH_METHOD,null,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743826)  public void End() throws ComException {
    this._dispatchCall(1610743826,"End", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743827)  public Boolean CanInvoke(ConversationAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743827,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743828)  public Boolean CanSetProperty(ConversationProperty _convProperty) throws ComException {
    assert(_convProperty != null);
    final Object obj = this._dispatchCall(1610743828,"CanSetProperty", DISPATCH_METHOD,null,_convProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743829)  public ConversationDirection getDirection() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"Direction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743830)  public IAsynchronousOperation MuteParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743830,"MuteParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743831)  public IAsynchronousOperation UnmuteParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743831,"UnmuteParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public Conversation() throws ComException {
    super("{457D962F-5F66-4429-BD94-6F9F366FAE0D}", "{533891F1-A460-43E6-8BDA-6D0D2C13ADDE}");
  }
  protected Conversation(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Conversation" + super.toString() + "]";
  }
}
