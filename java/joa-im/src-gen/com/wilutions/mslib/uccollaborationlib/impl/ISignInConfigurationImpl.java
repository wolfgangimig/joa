/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{38489220-00AD-9C2A-1C7D-F65D3DB1E798}")
public class ISignInConfigurationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.ISignInConfiguration {
  @DeclDISPID(1610743808)  public Boolean CanSet(com.wilutions.mslib.uccollaborationlib.SignInConfigurationType _configurationType) throws ComException {
    assert(_configurationType != null);
    final Object obj = this._dispatchCall(1610743808,"CanSet", DISPATCH_METHOD,null,_configurationType.value);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.LyncClientConfigurationMode getMode() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Mode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.LyncClientConfigurationMode.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public void setMode(com.wilutions.mslib.uccollaborationlib.LyncClientConfigurationMode value) throws ComException {
    assert(value != null);
    this._dispatchCall(1610743809,"Mode", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.TransportMode getTransportMode() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"TransportMode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.TransportMode.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743811)  public void setTransportMode(com.wilutions.mslib.uccollaborationlib.TransportMode value) throws ComException {
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
  @DeclDISPID(1610743822)  public com.wilutions.mslib.uccollaborationlib.ContactAvailability getSignInAsAvailability() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"SignInAsAvailability", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ContactAvailability.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743822)  public void setSignInAsAvailability(com.wilutions.mslib.uccollaborationlib.ContactAvailability value) throws ComException {
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
  public ISignInConfigurationImpl(String progId) throws ComException {
    super(progId, "{F8DF0B4B-A4CE-476B-81D3-9FBA98461B62}");
  }
  protected ISignInConfigurationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ISignInConfigurationImpl" + super.toString() + "]";
  }
}
