/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousConversationsManagerDictionary.
 * IPreviousConversationsManagerDictionary Interface 
 */
@CoInterface(guid="{15D4461D-C7EB-45CB-B214-F1C45FED1DB2}")
public interface IPreviousConversationsManagerDictionary extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getCount() throws ComException;
  @DeclDISPID(0)  public IPreviousConversationsManager getItem(PreviousConversationsType _key) throws ComException;
  @DeclDISPID(1610743810)  public PreviousConversationsType[] getKeys() throws ComException;
  @DeclDISPID(1610743811)  public IPreviousConversationsManager[] getValues() throws ComException;
  @DeclDISPID(1610743812)  public PreviousConversationsType GetKeyAt(Integer _index) throws ComException;
  @DeclDISPID(1610743813)  public IPreviousConversationsManager GetValueAt(Integer _index) throws ComException;
  @DeclDISPID(1610743814)  public Boolean TryGetValue(PreviousConversationsType _type, ByRef<IPreviousConversationsManager> _pastConversations) throws ComException;
  @DeclDISPID(1610743815)  public Boolean ContainsKey(PreviousConversationsType _type) throws ComException;
}
