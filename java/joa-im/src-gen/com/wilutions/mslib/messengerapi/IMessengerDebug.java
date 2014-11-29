/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerDebug.
 * Messenger Debug Private Interface 
 */
@CoInterface(guid="{D50C3386-0289-48F8-B204-3604629DEE10}")
public interface IMessengerDebug extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610678272)  public Object GetTransportService() throws ComException;
  @DeclDISPID(1610678273)  public Object GetPresenceService() throws ComException;
  @DeclDISPID(1610678274)  public Object getConversationMgr() throws ComException;
}
