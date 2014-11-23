/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{04843B14-C47D-9920-244D-675EC3031B2B}")
public class ILyncClientImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ILyncClient {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ClientType getType() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ClientState getState() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ClientState.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public String getUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Uri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.ISelf getSelf() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Self", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.ISelfImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IContactManager getContactManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"ContactManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IContactManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IConversationManager getConversationManager() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"ConversationManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConversationManagerImpl.class);
  }
  @DeclDISPID(1610743814)  public com.wilutions.mslib.uccollaborationlib.IConferenceScheduler getConferenceScheduler() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"ConferenceScheduler", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceSchedulerImpl.class);
  }
  @DeclDISPID(1610809344)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SignIn(String _userUri, String _domainAndUsername, String _password, Object _CommunicatorClientCallback, Object _state) throws ComException {
    assert(_userUri != null);
    assert(_domainAndUsername != null);
    assert(_password != null);
    assert(_CommunicatorClientCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809344,"SignIn", DISPATCH_METHOD,null,_userUri,_domainAndUsername,_password,_CommunicatorClientCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809345)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation SignOut(Object _CommunicatorClientCallback, Object _state) throws ComException {
    assert(_CommunicatorClientCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809345,"SignOut", DISPATCH_METHOD,null,_CommunicatorClientCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809346)  public com.wilutions.mslib.uccollaborationlib.ISignInConfiguration getSignInConfiguration() throws ComException {
    final Object obj = this._dispatchCall(1610809346,"SignInConfiguration", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.ISignInConfigurationImpl.class);
  }
  @DeclDISPID(1610809347)  public com.wilutions.mslib.uccollaborationlib.LyncClientCapabilityTypes getCapabilities() throws ComException {
    final Object obj = this._dispatchCall(1610809347,"Capabilities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.LyncClientCapabilityTypes.valueOf((Integer)obj);
  }
  @DeclDISPID(1610809348)  public com.wilutions.mslib.uccollaborationlib.IDeviceManager getDeviceManager() throws ComException {
    final Object obj = this._dispatchCall(1610809348,"DeviceManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IDeviceManagerImpl.class);
  }
  @DeclDISPID(1610809349)  public com.wilutions.mslib.uccollaborationlib.IDelegatorClient[] getDelegatorClients() throws ComException {
    final Object obj = this._dispatchCall(1610809349,"DelegatorClients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IDelegatorClient[])obj;
  }
  @DeclDISPID(1610809350)  public com.wilutions.mslib.uccollaborationlib.IUtilities getUtilities() throws ComException {
    final Object obj = this._dispatchCall(1610809350,"Utilities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IUtilitiesImpl.class);
  }
  @DeclDISPID(1610809351)  public com.wilutions.mslib.uccollaborationlib.IApplicationRegistration CreateApplicationRegistration(String _appGuid, String _appName) throws ComException {
    assert(_appGuid != null);
    assert(_appName != null);
    final Object obj = this._dispatchCall(1610809351,"CreateApplicationRegistration", DISPATCH_METHOD,null,_appGuid,_appName);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IApplicationRegistrationImpl.class);
  }
  @DeclDISPID(1610809352)  public Boolean getInSuppressedMode() throws ComException {
    final Object obj = this._dispatchCall(1610809352,"InSuppressedMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610809353)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Initialize(String _clientName, String _version, String _clientShortName, String _clientNameAbbreviation, String _clientLongName, com.wilutions.mslib.uccollaborationlib.SupportedFeatures _supportedFeatures, Object _CommunicatorClientCallback, Object _state) throws ComException {
    assert(_clientName != null);
    assert(_version != null);
    assert(_clientShortName != null);
    assert(_clientNameAbbreviation != null);
    assert(_clientLongName != null);
    assert(_supportedFeatures != null);
    assert(_CommunicatorClientCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809353,"Initialize", DISPATCH_METHOD,null,_clientName,_version,_clientShortName,_clientNameAbbreviation,_clientLongName,_supportedFeatures.value,_CommunicatorClientCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  @DeclDISPID(1610809354)  public com.wilutions.mslib.uccollaborationlib.IAsynchronousOperation Shutdown(Object _CommunicatorClientCallback, Object _state) throws ComException {
    assert(_CommunicatorClientCallback != null);
    assert(_state != null);
    final Object obj = this._dispatchCall(1610809354,"Shutdown", DISPATCH_METHOD,null,_CommunicatorClientCallback,_state);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IAsynchronousOperationImpl.class);
  }
  public ILyncClientImpl(String progId) throws ComException {
    super(progId, "{C413A27F-601E-4261-B9E3-0EB966F4E7D1}");
  }
  protected ILyncClientImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ILyncClientImpl" + super.toString() + "]";
  }
}
