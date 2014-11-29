/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IAddress.
 * IAddress Interface 
 */
@CoInterface(guid="{DC63D621-11C8-4490-B017-B8C57EE1BE25}")
public interface IAddress extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getStreetAddress() throws ComException;
  @DeclDISPID(1610743809)  public String getCity() throws ComException;
  @DeclDISPID(1610743810)  public String getState() throws ComException;
  @DeclDISPID(1610743811)  public String getPostalCode() throws ComException;
  @DeclDISPID(1610743812)  public String getCountryCode() throws ComException;
}
