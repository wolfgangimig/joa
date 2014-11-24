/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SignInConfiguration.
 * Configuration Class which handles the endpoint configuration, such as TranspotMode, 
 * Internal Server and External Server addresses, sign in auto retry etc. This class object can be 
 * obtained by the property Configuration from the LyncClient object. 
 */
@CoClass(guid="{6A69DC0B-F5AB-47E7-8500-00ED31486C01}")
public class SignInConfiguration extends Dispatch implements ISignInConfiguration {
  @DeclDISPID(1610743808)  public Boolean CanSet(SignInConfigurationType _configurationType) throws ComException {
    assert(_configurationType != null);
    final Object obj = this._dispatchCall(1610743808,"CanSet", DISPATCH_METHOD,null,_configurationType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public LyncClientConfigurationMode getMode() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Mode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return LyncClientConfigurationMode.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public void setMode(LyncClientConfigurationMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743809,"Mode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743811)  public TransportMode getTransportMode() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"TransportMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return TransportMode.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743811)  public void setTransportMode(TransportMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743811,"TransportMode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743813)  public String getInternalServerUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"InternalServerUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743813)  public void setInternalServerUrl(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743813,"InternalServerUrl", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743815)  public String getExternalServerUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"ExternalServerUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public void setExternalServerUrl(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743815,"ExternalServerUrl", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743817)  public String getUserName() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"UserName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743818)  public Boolean getIsPasswordSaved() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"IsPasswordSaved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public void setIsPasswordSaved(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743818,"IsPasswordSaved", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743820)  public Boolean getSignInAutoRetry() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"SignInAutoRetry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743820)  public void setSignInAutoRetry(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743820,"SignInAutoRetry", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(1610743822)  public ContactAvailability getSignInAsAvailability() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"SignInAsAvailability", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ContactAvailability.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743822)  public void setSignInAsAvailability(ContactAvailability value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743822,"SignInAsAvailability", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743824)  public Boolean getSignedInFromIntranet() throws ComException {
    final Object obj = this._dispatchCall(1610743824,"SignedInFromIntranet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743825)  public void setDisplayName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743825,"DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  public SignInConfiguration() throws ComException {
    super("{6A69DC0B-F5AB-47E7-8500-00ED31486C01}", "{F8DF0B4B-A4CE-476B-81D3-9FBA98461B62}");
  }
  protected SignInConfiguration(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SignInConfiguration" + super.toString() + "]";
  }
}
