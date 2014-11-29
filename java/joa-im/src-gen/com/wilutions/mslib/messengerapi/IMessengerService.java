/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerService.
 * Messenger Service Interface 
 */
@CoInterface(guid="{2E50547C-A8AA-4F60-B57E-1F414711007B}")
public interface IMessengerService extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2178)  public String getServiceName() throws ComException;
  @DeclDISPID(2183)  public String getServiceId() throws ComException;
  @DeclDISPID(2179)  public String getMyFriendlyName() throws ComException;
  @DeclDISPID(2181)  public MISTATUS getMyStatus() throws ComException;
  @DeclDISPID(2184)  public String getMySigninName() throws ComException;
  @DeclDISPID(2182)  public Object getProperty(final MSERVICEPROPERTY ePropType) throws ComException;
  @DeclDISPID(2182)  public void setProperty(final MSERVICEPROPERTY ePropType, final Object value2) throws ComException;
}
