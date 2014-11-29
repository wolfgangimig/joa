/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IModality.
 * IModality Interface 
 */
@CoInterface(guid="{D4B240B9-059B-4D13-8997-31B282B3BD43}")
public interface IModality extends IDispatch {
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
}
