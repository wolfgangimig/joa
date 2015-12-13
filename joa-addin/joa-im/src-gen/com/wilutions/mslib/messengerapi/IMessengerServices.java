/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * IMessengerServices.
 * Messenger Services Interface 
 */
@CoInterface(guid="{2E50547B-A8AA-4F60-B57E-1F414711007B}")
public interface IMessengerServices extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(2176)  public IDispatch getPrimaryService() throws ComException;
  @DeclDISPID(2177)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IDispatch Item(final Integer Index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
