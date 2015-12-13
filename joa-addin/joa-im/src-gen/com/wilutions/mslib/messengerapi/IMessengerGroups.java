/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerGroups.
 * Messenger Groups Interface 
 */
@CoInterface(guid="{E1AF1028-B884-44CB-A535-1C3C11A3D1DB}")
public interface IMessengerGroups extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1665)  public void Remove(final IDispatch pGroup) throws ComException;
  @DeclDISPID(1666)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
