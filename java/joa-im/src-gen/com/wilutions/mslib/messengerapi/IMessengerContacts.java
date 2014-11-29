/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerContacts.
 * Messenger Contacts Collection for IMessenger 
 */
@CoInterface(guid="{E7479A0D-BB19-44A5-968F-6F41D93EE0BC}")
public interface IMessengerContacts extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1792)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Integer Index) throws ComException;
  @DeclDISPID(1793)  public void Remove(final IDispatch pMContact) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
