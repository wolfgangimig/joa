/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{B421539B-D13D-9E0C-35B7-B9039C18AE6C}")
public class IPublicCloudProviderInfoImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IPublicCloudProviderInfo {
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
  public IPublicCloudProviderInfoImpl(String progId) throws ComException {
    super(progId, "{74B6CAF0-755E-454D-A819-D0E439EF5296}");
  }
  protected IPublicCloudProviderInfoImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IPublicCloudProviderInfoImpl" + super.toString() + "]";
  }
}
