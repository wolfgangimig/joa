/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1CF44F4A-B5AB-9FD1-2DB9-D122DB1642DF}")
public class IAddressImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAddress {
  @DeclDISPID(1610743808)  public String getStreetAddress() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"StreetAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getCity() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"City", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getState() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"State", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public String getPostalCode() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"PostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743812)  public String getCountryCode() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"CountryCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public IAddressImpl(String progId) throws ComException {
    super(progId, "{DC63D621-11C8-4490-B017-B8C57EE1BE25}");
  }
  protected IAddressImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAddressImpl" + super.toString() + "]";
  }
}
