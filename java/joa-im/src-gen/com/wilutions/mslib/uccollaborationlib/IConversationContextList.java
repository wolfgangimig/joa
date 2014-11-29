/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationContextList.
 * IConversationContextList Interface 
 */
@CoInterface(guid="{855AD949-E2EB-473D-AAF2-9800008EA303}")
public interface IConversationContextList extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IConversationContext getItem(Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809344)  public void Add(IConversationContext _context) throws ComException;
  @DeclDISPID(1610809345)  public void Remove(IConversationContext _context) throws ComException;
  @DeclDISPID(1610809346)  public IConversationContext CreateContext(String _id, ConversationContextType _contextType, Boolean _doMakeActive) throws ComException;
  @DeclDISPID(1610809347)  public void ModifyActiveContext(String _contextId, String _contextData, ConversationContextUpdateOptions _contextUpdateOptions) throws ComException;
}
