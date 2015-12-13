/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationCollection.
 * IConversationCollection Interface 
 */
@CoInterface(guid="{A4E1D1E4-7839-473B-95FA-5D33DDC0D2DD}")
public interface IConversationCollection extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConversation getItem(final Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610743811)  public Integer IndexOf(final IConversation _conversation) throws ComException;
}
