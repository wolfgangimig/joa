/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomMessageCollection.
 * IRoomMessageCollection Interface 
 */
@CoInterface(guid="{21C41EDE-7ED8-4D97-9B0D-DD785781AF9B}")
public interface IRoomMessageCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IRoomMessage getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public void Clear() throws ComException;
  @DeclDISPID(1610743812)  public Integer IndexOf(IRoomMessage _roomMesssage) throws ComException;
}
