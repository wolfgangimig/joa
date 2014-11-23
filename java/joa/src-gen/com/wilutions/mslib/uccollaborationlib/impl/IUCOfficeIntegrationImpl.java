/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{AAB5B8FE-523D-9D3E-12D9-82FFAE2FAE72}")
public class IUCOfficeIntegrationImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IUCOfficeIntegration {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.OIFeature GetSupportedFeatures(String _version) throws ComException {
    assert(_version != null);
    final Object obj = this._dispatchCall(1610743808,"GetSupportedFeatures", DISPATCH_METHOD,null,_version);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.OIFeature.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String GetAuthenticationInfo(String _version) throws ComException {
    assert(_version != null);
    final Object obj = this._dispatchCall(1610743809,"GetAuthenticationInfo", DISPATCH_METHOD,null,_version);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public Dispatch GetInterface(String _version, com.wilutions.mslib.uccollaborationlib.OIInterface _interface) throws ComException {
    assert(_version != null);
    assert(_interface != null);
    final Object obj = this._dispatchCall(1610743810,"GetInterface", DISPATCH_METHOD,null,_version,_interface.value);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  public IUCOfficeIntegrationImpl(String progId) throws ComException {
    super(progId, "{6A222195-F65E-467F-8F77-EB180BD85288}");
  }
  protected IUCOfficeIntegrationImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IUCOfficeIntegrationImpl" + super.toString() + "]";
  }
}
