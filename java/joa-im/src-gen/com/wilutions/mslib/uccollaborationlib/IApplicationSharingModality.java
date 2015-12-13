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
  @DeclDISPID(1610743812)  public void setEndpoint(final IContactEndpoint value) throws ComException;
  @DeclDISPID(1610743814)  public IModalityPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation SetProperty(final ModalityProperty _propertyType, final Object _propertyValue, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743816)  public IAsynchronousOperation Connect(final ModalityConnectOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation Disconnect(final ModalityDisconnectReason _reason, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public void Reject(final ModalityDisconnectReason _reason) throws ComException;
  @DeclDISPID(1610743819)  public void Accept() throws ComException;
  @DeclDISPID(1610743820)  public IAsynchronousOperation Hold(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743821)  public IAsynchronousOperation Retrieve(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation Forward(final IDispatch _contactOrCollaborationEndpoint, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation Transfer(final IDispatch _contactOrCollaborationEndpoint, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743824)  public IAsynchronousOperation ConsultativeTransfer(final IConversation _conversation, final TransferOptions _options, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743825)  public Boolean CanInvoke(final ModalityAction _action) throws ComException;
  @DeclDISPID(1610743826)  public Boolean CanSetProperty(final ModalityProperty _modalityProperty) throws ComException;
  @DeclDISPID(1610809344)  public ISharingResourceList getShareableResources() throws ComException;
  @DeclDISPID(1610809345)  public ISharingResourceList CreateEmptyShareableResourceList() throws ComException;
  @DeclDISPID(1610809346)  public IAsynchronousOperation ShareResources(final ISharingResourceList _resources, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809347)  public IAsynchronousOperation ShareDesktop(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809348)  public IAsynchronousOperation ShareMonitorByRect(final Integer Left, final Integer Top, final Integer right, final Integer bottom, final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809349)  public ISharingResourceList getLocalSharedResources() throws ComException;
  @DeclDISPID(1610809350)  public IParticipant getController() throws ComException;
  @DeclDISPID(1610809351)  public ParticipationState getParticipationState() throws ComException;
  @DeclDISPID(1610809352)  public IAsynchronousOperation RequestControl(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809353)  public IAsynchronousOperation ReleaseControl(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809354)  public IAsynchronousOperation GrantControl(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809355)  public IAsynchronousOperation RevokeControl(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809356)  public IAsynchronousOperation AcceptControlRequest(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809357)  public IAsynchronousOperation DeclineControlRequest(final Object _modalityCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809358)  public CanShareDetail CanShare(final SharingResourceType _resourceType) throws ComException;
  @DeclDISPID(1610809359)  public IParticipant getSharer() throws ComException;
  @DeclDISPID(1610809360)  public IAsynchronousOperation ShareMonitor(final Integer _monitorId, final Object _modalityCallback, final Object _state) throws ComException;
}
