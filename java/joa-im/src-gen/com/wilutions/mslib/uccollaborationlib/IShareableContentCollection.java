/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IShareableContentCollection.
 * Maintains a collection of all Shareable content objects. 
 */
@CoInterface(guid="{A58F54D2-9786-4309-964D-96549AEC7611}")
public interface IShareableContentCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IShareableContent getItem(Integer index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
