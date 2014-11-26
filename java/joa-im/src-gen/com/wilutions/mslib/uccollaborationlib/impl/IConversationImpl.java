/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{93AF089A-0003-98A7-1674-04EA89E45124}")
public class IConversationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversation {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IParticipant getSelfParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"SelfParticipant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IModalityDictionary getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityDictionaryImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IParticipantCollection getParticipants() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participants", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantCollectionImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IParticipant AddParticipant(IDispatch _contactOrCollaborationEndpoint) throws ComException {
    final Object obj = this._dispatchCall(1610743812,"AddParticipant", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL));
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743813)  public void RemoveParticipant(com.wilutions.mslib.uccollaborationlib.IParticipant _participant) throws ComException {
    this._dispatchCall(1610743813,"RemoveParticipant", DISPATCH_METHOD,null,(_participant!=null?_participant:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IConversationContextList getContexts() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Contexts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationContextListImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IConversationHistory getHistory() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"History", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationHistoryImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IConversationPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetProperty(com.wilutions.mslib.uccollaborationlib.ConversationProperty _propertyType, Object _propertyValue, Object _conversationCallback, Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SendInitialContext(com.wilutions.mslib.uccollaborationlib.ContextType[] _contextTypes, Object[] _contextDatas, Object _conversationCallback, Object _state) throws ComException {
    assert(_contextTypes != null);
    assert(_contextDatas != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743818,"SendInitialContext", DISPATCH_METHOD,null,_contextTypes,_contextDatas,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743819)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SendContextData(String _applicationId, String _dataType, String _data, Object _conversationCallback, Object _state) throws ComException {
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
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743822)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Merge(com.wilutions.mslib.uccollaborationlib.IConversation _conversation, com.wilutions.mslib.uccollaborationlib.ModalityTypes _modalityTypes, Object _conversationCallback, Object _state) throws ComException {
    assert(_modalityTypes != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Merge", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_modalityTypes.value,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation AdmitParticipants(com.wilutions.mslib.uccollaborationlib.IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"AdmitParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation DenyParticipants(com.wilutions.mslib.uccollaborationlib.IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"DenyParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Park(Object _conversationCallback, Object _state) throws ComException {
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743825,"Park", DISPATCH_METHOD,null,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743826)  public void End() throws ComException {
    this._dispatchCall(1610743826,"End", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743827)  public Boolean CanInvoke(com.wilutions.mslib.uccollaborationlib.ConversationAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743827,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743828)  public Boolean CanSetProperty(com.wilutions.mslib.uccollaborationlib.ConversationProperty _convProperty) throws ComException {
    assert(_convProperty != null);
    final Object obj = this._dispatchCall(1610743828,"CanSetProperty", DISPATCH_METHOD,null,_convProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743829)  public com.wilutions.mslib.uccollaborationlib.ConversationDirection getDirection() throws ComException {
    final Object obj = this._dispatchCall(1610743829,"Direction", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationDirection.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743830)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation MuteParticipants(com.wilutions.mslib.uccollaborationlib.IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743830,"MuteParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743831)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation UnmuteParticipants(com.wilutions.mslib.uccollaborationlib.IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException {
    assert(_participants != null);
    assert(_conversationCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743831,"UnmuteParticipants", DISPATCH_METHOD,null,_participants,_conversationCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public IConversationImpl(String progId) throws ComException {
    super(progId, "{533891F1-A460-43E6-8BDA-6D0D2C13ADDE}");
  }
  protected IConversationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationImpl" + super.toString() + "]";
  }
}
