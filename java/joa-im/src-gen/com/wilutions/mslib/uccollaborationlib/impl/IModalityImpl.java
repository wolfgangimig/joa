/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1425D9D2-A1F8-9652-1439-5855274441B9}")
public class IModalityImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IModality {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ModalityTypes getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ModalityState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IParticipant getParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IContactEndpoint getEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743812)  public void setEndpoint(final com.wilutions.mslib.uccollaborationlib.IContactEndpoint value) throws ComException {
    this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IModalityPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743815)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SetProperty(final com.wilutions.mslib.uccollaborationlib.ModalityProperty _propertyType, final Object _propertyValue, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Connect(final com.wilutions.mslib.uccollaborationlib.ModalityConnectOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Connect", DISPATCH_METHOD,null,_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Disconnect(final com.wilutions.mslib.uccollaborationlib.ModalityDisconnectReason _reason, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_reason != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Disconnect", DISPATCH_METHOD,null,_reason.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public void Reject(final com.wilutions.mslib.uccollaborationlib.ModalityDisconnectReason _reason) throws ComException {
    assert(_reason != null);
    this._dispatchCall(1610743818,"Reject", DISPATCH_METHOD,null,_reason.value);
  }
  @DeclDISPID(1610743819)  public void Accept() throws ComException {
    this._dispatchCall(1610743819,"Accept", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Hold(final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743820,"Hold", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Retrieve(final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743821,"Retrieve", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743822)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Forward(final IDispatch _contactOrCollaborationEndpoint, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Forward", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Transfer(final IDispatch _contactOrCollaborationEndpoint, final com.wilutions.mslib.uccollaborationlib.TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"Transfer", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation ConsultativeTransfer(final com.wilutions.mslib.uccollaborationlib.IConversation _conversation, final com.wilutions.mslib.uccollaborationlib.TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"ConsultativeTransfer", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public Boolean CanInvoke(final com.wilutions.mslib.uccollaborationlib.ModalityAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743825,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(final com.wilutions.mslib.uccollaborationlib.ModalityProperty _modalityProperty) throws ComException {
    assert(_modalityProperty != null);
    final Object obj = this._dispatchCall(1610743826,"CanSetProperty", DISPATCH_METHOD,null,_modalityProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IModalityImpl(String progId) throws ComException {
    super(progId, "{D4B240B9-059B-4D13-8997-31B282B3BD43}");
  }
  protected IModalityImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IModalityImpl" + super.toString() + "]";
  }
}
