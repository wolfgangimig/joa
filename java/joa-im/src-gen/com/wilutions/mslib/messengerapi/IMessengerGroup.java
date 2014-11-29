/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerGroup.
 * Messenger Group Interface 
 */
@CoInterface(guid="{E1AF1038-B884-44CB-A535-1C3C11A3D1DB}")
public interface IMessengerGroup extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1667)  public IDispatch getContacts() throws ComException;
  @DeclDISPID(1668)  public String getName() throws ComException;
  @DeclDISPID(1668)  public void setName(final String value) throws ComException;
  @DeclDISPID(1669)  public void AddContact(final Object vContact) throws ComException;
  @DeclDISPID(1670)  public void RemoveContact(final Object vContact) throws ComException;
  @DeclDISPID(1671)  public IDispatch getService() throws ComException;
}
