/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * Address.
 * Class representing an address 
 */
@CoClass(guid="{99880CD9-73B0-4B84-93FF-95BCD18C9EF8}")
public class Address extends Dispatch implements IAddress {
  static boolean __typelib__loaded = __TypeLib.load();
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
  public Address() throws ComException {
    super("{99880CD9-73B0-4B84-93FF-95BCD18C9EF8}", "{DC63D621-11C8-4490-B017-B8C57EE1BE25}");
  }
  protected Address(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[Address" + super.toString() + "]";
  }
}
