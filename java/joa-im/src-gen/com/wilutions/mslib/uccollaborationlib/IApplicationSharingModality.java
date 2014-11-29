/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IApplicationSharingModality.
 * IApplicationSharingModality Interface 
 */
@CoInterface(guid="{AC10D6E9-4A8C-4484-B8F4-CA1E36347AAE}")
public interface IApplicationSharingModality extends IDispatch {
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
  @DeclDISPID(1610809344)  public ISharingResourceList getShareableResources() throws ComException;
  @DeclDISPID(1610809345)  public ISharingResourceList CreateEmptyShareableResourceList() throws ComException;
  @DeclDISPID(1610809346)  public IAsynchronousOperation ShareResources(ISharingResourceList _resources, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809347)  public IAsynchronousOperation ShareDesktop(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809348)  public IAsynchronousOperation ShareMonitorByRect(Integer Left, Integer Top, Integer right, Integer bottom, Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809349)  public ISharingResourceList getLocalSharedResources() throws ComException;
  @DeclDISPID(1610809350)  public IParticipant getController() throws ComException;
  @DeclDISPID(1610809351)  public ParticipationState getParticipationState() throws ComException;
  @DeclDISPID(1610809352)  public IAsynchronousOperation RequestControl(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809353)  public IAsynchronousOperation ReleaseControl(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809354)  public IAsynchronousOperation GrantControl(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809355)  public IAsynchronousOperation RevokeControl(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809356)  public IAsynchronousOperation AcceptControlRequest(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809357)  public IAsynchronousOperation DeclineControlRequest(Object _modalityCallback, Object _state) throws ComException;
  @DeclDISPID(1610809358)  public CanShareDetail CanShare(SharingResourceType _resourceType) throws ComException;
  @DeclDISPID(1610809359)  public IParticipant getSharer() throws ComException;
  @DeclDISPID(1610809360)  public IAsynchronousOperation ShareMonitor(Integer _monitorId, Object _modalityCallback, Object _state) throws ComException;
}
