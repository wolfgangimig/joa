/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerContact.
 * Messenger Contact for IMessenger 
 */
@CoInterface(guid="{E7479A0F-BB19-44A5-968F-6F41D93EE0BC}")
public interface IMessengerContact extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1536)  public String getFriendlyName() throws ComException;
  @DeclDISPID(1537)  public MISTATUS getStatus() throws ComException;
  @DeclDISPID(1538)  public String getSigninName() throws ComException;
  @DeclDISPID(1539)  public String getServiceName() throws ComException;
  @DeclDISPID(1540)  public Boolean getBlocked() throws ComException;
  @DeclDISPID(1540)  public void setBlocked(final Boolean value) throws ComException;
  @DeclDISPID(1543)  public Boolean getCanPage() throws ComException;
  @DeclDISPID(1544)  public String getPhoneNumber(final MPHONE_TYPE PhoneType) throws ComException;
  @DeclDISPID(1541)  public Boolean getIsSelf() throws ComException;
  @DeclDISPID(1542)  public Object getProperty(final MCONTACTPROPERTY ePropType) throws ComException;
  @DeclDISPID(1542)  public void setProperty(final MCONTACTPROPERTY ePropType, final Object value2) throws ComException;
  @DeclDISPID(1545)  public String getServiceId() throws ComException;
}
