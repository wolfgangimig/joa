/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * UCOfficeIntegration.
 * UCOfficeIntegration Class 
 */
@CoClass(guid="{A0651028-BA7A-4D71-877F-12E0175A5806}")
public class UCOfficeIntegration extends Dispatch implements IUCOfficeIntegration {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public OIFeature GetSupportedFeatures(String _version) throws ComException {
    assert(_version != null);
    final Object obj = this._dispatchCall(1610743808,"GetSupportedFeatures", DISPATCH_METHOD,null,_version);
    if (obj == null) return null;
    return OIFeature.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String GetAuthenticationInfo(String _version) throws ComException {
    assert(_version != null);
    final Object obj = this._dispatchCall(1610743809,"GetAuthenticationInfo", DISPATCH_METHOD,null,_version);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public IDispatch GetInterface(String _version, OIInterface _interface) throws ComException {
    assert(_version != null);
    assert(_interface != null);
    final Object obj = this._dispatchCall(1610743810,"GetInterface", DISPATCH_METHOD,null,_version,_interface.value);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public UCOfficeIntegration() throws ComException {
    super("{A0651028-BA7A-4D71-877F-12E0175A5806}", "{6A222195-F65E-467F-8F77-EB180BD85288}");
  }
  protected UCOfficeIntegration(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UCOfficeIntegration" + super.toString() + "]";
  }
}
