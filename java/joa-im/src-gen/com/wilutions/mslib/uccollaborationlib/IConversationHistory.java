/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationHistory.
 * IConversationHistory Interface 
 */
@CoInterface(guid="{F5996C71-77AB-4020-9776-C2C270FEF2AE}")
public interface IConversationHistory extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IConversation getConversation() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsPastHistoryRetrieved() throws ComException;
  @DeclDISPID(1610743810)  public String[] getCurrentHistory() throws ComException;
  @DeclDISPID(1610743811)  public Object[] getAllHistory() throws ComException;
  @DeclDISPID(1610743812)  public Object[] getPastHistory() throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation RetrievePastHistory(Object _conversationHistoryCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation RetrievePastHistoryByEntryId(String _entryId, Object _conversationHistoryCallback, Object _state) throws ComException;
  @DeclDISPID(1610743815)  public IAsynchronousOperation SaveAllHistory(Object _conversationHistoryCallback, Object _state) throws ComException;
  @DeclDISPID(1610743816)  public Boolean CanInvoke(ConversationHistoryAction _action) throws ComException;
}
