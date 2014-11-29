/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IRoomCollection.
 * IRoomCollection Interface 
 */
@CoInterface(guid="{05789509-AFA1-4E90-B4FA-1A7820DB9796}")
public interface IRoomCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IRoom getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public Integer IndexOf(IRoom _room) throws ComException;
}
