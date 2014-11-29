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
  @DeclDISPID(0)  public IConversationContext getItem(final Integer _index) throws ComException;
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException;
  @DeclDISPID(1610809344)  public void Add(final IConversationContext _context) throws ComException;
  @DeclDISPID(1610809345)  public void Remove(final IConversationContext _context) throws ComException;
  @DeclDISPID(1610809346)  public IConversationContext CreateContext(final String _id, final ConversationContextType _contextType, final Boolean _doMakeActive) throws ComException;
  @DeclDISPID(1610809347)  public void ModifyActiveContext(final String _contextId, final String _contextData, final ConversationContextUpdateOptions _contextUpdateOptions) throws ComException;
}
