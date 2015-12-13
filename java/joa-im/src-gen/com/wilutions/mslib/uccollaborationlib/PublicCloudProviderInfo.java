/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PublicCloudProviderInfo.
 * Public cloud provider info 
 */
@CoClass(guid="{8E99DE73-6A8B-47A9-BAE6-6B03E53622E8}")
public class PublicCloudProviderInfo extends Dispatch implements IPublicCloudProviderInfo {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getIconUrl() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"IconUrl", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getProxyFqdn() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"ProxyFqdn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getNameDecorationDomain() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"NameDecorationDomain", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public PublicCloudProviderInfo() throws ComException {
    super("{8E99DE73-6A8B-47A9-BAE6-6B03E53622E8}", "{74B6CAF0-755E-454D-A819-D0E439EF5296}");
  }
  protected PublicCloudProviderInfo(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PublicCloudProviderInfo" + super.toString() + "]";
  }
}
