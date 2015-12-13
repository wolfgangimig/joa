/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ILyncClient.
 * ILyncClient Interface 
 */
@CoInterface(guid="{C413A27F-601E-4261-B9E3-0EB966F4E7D1}")
public interface ILyncClient extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ClientType getType() throws ComException;
  @DeclDISPID(1610743809)  public ClientState getState() throws ComException;
  @DeclDISPID(1610743810)  public String getUri() throws ComException;
  @DeclDISPID(1610743811)  public ISelf getSelf() throws ComException;
  @DeclDISPID(1610743812)  public IContactManager getContactManager() throws ComException;
  @DeclDISPID(1610743813)  public IConversationManager getConversationManager() throws ComException;
  @DeclDISPID(1610743814)  public IConferenceScheduler getConferenceScheduler() throws ComException;
  @DeclDISPID(1610809344)  public IAsynchronousOperation SignIn(final String _userUri, final String _domainAndUsername, final String _password, final Object _CommunicatorClientCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809345)  public IAsynchronousOperation SignOut(final Object _CommunicatorClientCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809346)  public ISignInConfiguration getSignInConfiguration() throws ComException;
  @DeclDISPID(1610809347)  public LyncClientCapabilityTypes getCapabilities() throws ComException;
  @DeclDISPID(1610809348)  public IDeviceManager getDeviceManager() throws ComException;
  @DeclDISPID(1610809349)  public IDelegatorClient[] getDelegatorClients() throws ComException;
  @DeclDISPID(1610809350)  public IUtilities getUtilities() throws ComException;
  @DeclDISPID(1610809351)  public IApplicationRegistration CreateApplicationRegistration(final String _appGuid, final String _appName) throws ComException;
  @DeclDISPID(1610809352)  public Boolean getInSuppressedMode() throws ComException;
  @DeclDISPID(1610809353)  public IAsynchronousOperation Initialize(final String _clientName, final String _version, final String _clientShortName, final String _clientNameAbbreviation, final String _clientLongName, final SupportedFeatures _supportedFeatures, final Object _CommunicatorClientCallback, final Object _state) throws ComException;
  @DeclDISPID(1610809354)  public IAsynchronousOperation Shutdown(final Object _CommunicatorClientCallback, final Object _state) throws ComException;
}
