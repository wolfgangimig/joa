/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ISignInConfiguration.
 * ISignInConfiguration Interface 
 */
@CoInterface(guid="{F8DF0B4B-A4CE-476B-81D3-9FBA98461B62}")
public interface ISignInConfiguration extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Boolean CanSet(final SignInConfigurationType _configurationType) throws ComException;
  @DeclDISPID(1610743809)  public LyncClientConfigurationMode getMode() throws ComException;
  @DeclDISPID(1610743809)  public void setMode(final LyncClientConfigurationMode value) throws ComException;
  @DeclDISPID(1610743811)  public TransportMode getTransportMode() throws ComException;
  @DeclDISPID(1610743811)  public void setTransportMode(final TransportMode value) throws ComException;
  @DeclDISPID(1610743813)  public String getInternalServerUrl() throws ComException;
  @DeclDISPID(1610743813)  public void setInternalServerUrl(final String value) throws ComException;
  @DeclDISPID(1610743815)  public String getExternalServerUrl() throws ComException;
  @DeclDISPID(1610743815)  public void setExternalServerUrl(final String value) throws ComException;
  @DeclDISPID(1610743817)  public String getUserName() throws ComException;
  @DeclDISPID(1610743818)  public Boolean getIsPasswordSaved() throws ComException;
  @DeclDISPID(1610743818)  public void setIsPasswordSaved(final Boolean value) throws ComException;
  @DeclDISPID(1610743820)  public Boolean getSignInAutoRetry() throws ComException;
  @DeclDISPID(1610743820)  public void setSignInAutoRetry(final Boolean value) throws ComException;
  @DeclDISPID(1610743822)  public ContactAvailability getSignInAsAvailability() throws ComException;
  @DeclDISPID(1610743822)  public void setSignInAsAvailability(final ContactAvailability value) throws ComException;
  @DeclDISPID(1610743824)  public Boolean getSignedInFromIntranet() throws ComException;
  @DeclDISPID(1610743825)  public void setDisplayName(final String value) throws ComException;
}
