/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IInstantMessageModality.
 * IInstantMessageModality Interface 
 */
@CoInterface(guid="{62A75516-C79B-42D7-8B49-3BA492C2B385}")
public interface IInstantMessageModality extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ModalityTypes getType() throws ComException;
  @DeclDISPID(1610743809)  public ModalityState getState() throws ComException;
  @DeclDISPID(1610743810)  public IConversation getConversation() throws ComException;
  @DeclDISPID(1610743811)  public IParticipant getParticipant() throws ComException;
  @DeclDISPID(1610743812)  public IContactEndpoint getEndpoint() throws ComException;
  @DeclDISPID(1610743812)  public void setEndpoint(IContactEndpoint value) throws ComException;
  @DeclDISPID(1610743814)  public IModalityPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation SetProperty(ModalityProperty _propertyType, Object _propertyValue, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation Connect(ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation Disconnect(ModalityDisconnectReason _reason, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743818)  public void Reject(ModalityDisconnectReason _reason) throws ComException;
  @DeclDISPID(1610743819)  public void Accept() throws ComException;
  @DeclDISPID(1610743820)  public IAsynchronousOperation Hold(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743821)  public IAsynchronousOperation Retrieve(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation Forward(IDispatch _contactOrCollaborationEndpoint, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation Transfer(IDispatch _contactOrCollaborationEndpoint, TransferOptions _options, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743824)  public IAsynchronousOperation ConsultativeTransfer(IConversation _conversation, TransferOptions _options, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610743825)  public Boolean CanInvoke(ModalityAction _action) throws ComException;
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(ModalityProperty _modalityProperty) throws ComException;
  @DeclDISPID(1610809344)  public IAsynchronousOperation SendMessage(String _message, INamedPropertyList _additionalFormats, ModalityConnectOptions _options, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809345)  public IAsynchronousOperation SetComposing(Boolean _isComposing, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809346)  public void SetCapabilities(InstantMessageCapabilities _capabilities) throws ComException;
  @DeclDISPID(1610809347)  public Boolean getIsTyping() throws ComException;
  @DeclDISPID(1610809348)  public Integer getCapabilities() throws ComException;
}
