/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * InstantMessageModality.
 * InstantMessageModality class defines the instant messaging modality. It supports actions 
 * such as sending an IM message, checking or setting the composing flag, etc. This class handles 
 * the events defined in the interface IInstantMessageModalityEvents. 
 */
@CoClass(guid="{9582D285-7E6E-4BFA-BCBC-7DE3EA3E6D74}")
public class InstantMessageModality extends Dispatch implements IInstantMessageModality {
  @DeclDISPID(1610743808)  public ModalityTypes getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public ModalityState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ModalityState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public IConversation getConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Conversation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public IParticipant getParticipant() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Participant", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IParticipantImpl.class);
  }
  @DeclDISPID(1610743812)  public IContactEndpoint getEndpoint() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IContactEndpointImpl.class);
  }
  @DeclDISPID(1610743812)  public void setEndpoint(IContactEndpoint value) throws ComException {
    this._dispatchCall(1610743812,"Endpoint", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(1610743814)  public IModalityPropertyDictionary getProperties() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Properties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IModalityPropertyDictionaryImpl.class);
  }
  @DeclDISPID(1610743815)  public IAsynchronousOperation SetProperty(ModalityProperty _propertyType, Object _propertyValue, Object _modalityCallback, Object _state) throws ComException {
    assert(_propertyType != null);
    assert(_propertyValue != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743815,"SetProperty", DISPATCH_METHOD,null,_propertyType.value,_propertyValue,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743816)  public IAsynchronousOperation Connect(ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743816,"Connect", DISPATCH_METHOD,null,_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743817)  public IAsynchronousOperation Disconnect(ModalityDisconnectReason _reason, Object _modalityCallback, Object _state) throws ComException {
    assert(_reason != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743817,"Disconnect", DISPATCH_METHOD,null,_reason.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743818)  public void Reject(ModalityDisconnectReason _reason) throws ComException {
    assert(_reason != null);
    this._dispatchCall(1610743818,"Reject", DISPATCH_METHOD,null,_reason.value);
  }
  @DeclDISPID(1610743819)  public void Accept() throws ComException {
    this._dispatchCall(1610743819,"Accept", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743820)  public IAsynchronousOperation Hold(Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743820,"Hold", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743821)  public IAsynchronousOperation Retrieve(Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743821,"Retrieve", DISPATCH_METHOD,null,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743822)  public IAsynchronousOperation Forward(IDispatch _contactOrCollaborationEndpoint, Object _modalityCallback, Object _state) throws ComException {
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743822,"Forward", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743823)  public IAsynchronousOperation Transfer(IDispatch _contactOrCollaborationEndpoint, TransferOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743823,"Transfer", DISPATCH_METHOD,null,(_contactOrCollaborationEndpoint!=null?_contactOrCollaborationEndpoint:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743824)  public IAsynchronousOperation ConsultativeTransfer(IConversation _conversation, TransferOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610743824,"ConsultativeTransfer", DISPATCH_METHOD,null,(_conversation!=null?_conversation:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610743825)  public Boolean CanInvoke(ModalityAction _action) throws ComException {
    assert(_action != null);
    final Object obj = this._dispatchCall(1610743825,"CanInvoke", DISPATCH_METHOD,null,_action.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(ModalityProperty _modalityProperty) throws ComException {
    assert(_modalityProperty != null);
    final Object obj = this._dispatchCall(1610743826,"CanSetProperty", DISPATCH_METHOD,null,_modalityProperty.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809344)  public IAsynchronousOperation SendMessage(String _message, INamedPropertyList _additionalFormats, ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException {
    assert(_message != null);
    assert(_options != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809344,"SendMessage", DISPATCH_METHOD,null,_message,(_additionalFormats!=null?_additionalFormats:Dispatch.NULL),_options.value,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809345)  public IAsynchronousOperation SetComposing(Boolean _isComposing, Object _modalityCallback, Object _state) throws ComException {
    assert(_isComposing != null);
    assert(_modalityCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809345,"SetComposing", DISPATCH_METHOD,null,_isComposing,_modalityCallback,_state);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809346)  public void SetCapabilities(InstantMessageCapabilities _capabilities) throws ComException {
    assert(_capabilities != null);
    this._dispatchCall(1610809346,"SetCapabilities", DISPATCH_METHOD,null,_capabilities.value);
  }
  @DeclDISPID(1610809347)  public Boolean getIsTyping() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"IsTyping", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809348)  public Integer getCapabilities() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"Capabilities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  public InstantMessageModality() throws ComException {
    super("{9582D285-7E6E-4BFA-BCBC-7DE3EA3E6D74}", "{62A75516-C79B-42D7-8B49-3BA492C2B385}");
  }
  protected InstantMessageModality(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[InstantMessageModality" + super.toString() + "]";
  }
}
