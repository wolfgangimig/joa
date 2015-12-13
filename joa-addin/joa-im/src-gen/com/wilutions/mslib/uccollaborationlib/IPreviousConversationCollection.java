/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousConversationCollection.
 * IPreviousConversationCollection Interface 
 */
@CoInterface(guid="{81C9D13F-A4F9-4E13-92D3-BB271E8DF3D2}")
public interface IPreviousConversationCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IPreviousConversation getItem(final Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
}
