/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _Conversation.
 * 
 */
@CoInterface(guid="{00063101-0000-0000-C000-000000000046}")
public interface _Conversation extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(64591)  public Table GetTable() throws ComException;
  @DeclDISPID(64592)  public SimpleItems GetChildren(Dispatch Item) throws ComException;
  @DeclDISPID(64594)  public Dispatch GetParent(Dispatch Item) throws ComException;
  @DeclDISPID(64595)  public SimpleItems GetRootItems() throws ComException;
  @DeclDISPID(64602)  public String GetAlwaysAssignCategories(_Store Store) throws ComException;
  @DeclDISPID(64603)  public OlAlwaysDeleteConversation GetAlwaysDelete(_Store Store) throws ComException;
  @DeclDISPID(64604)  public MAPIFolder GetAlwaysMoveToFolder(_Store Store) throws ComException;
  @DeclDISPID(64605)  public void MarkAsRead() throws ComException;
  @DeclDISPID(64606)  public void MarkAsUnread() throws ComException;
  @DeclDISPID(64607)  public void SetAlwaysAssignCategories(String Categories, _Store Store) throws ComException;
  @DeclDISPID(64608)  public void SetAlwaysDelete(OlAlwaysDeleteConversation AlwaysDelete, _Store Store) throws ComException;
  @DeclDISPID(64609)  public void SetAlwaysMoveToFolder(MAPIFolder MoveToFolder, _Store Store) throws ComException;
  @DeclDISPID(64610)  public void ClearAlwaysAssignCategories(_Store Store) throws ComException;
  @DeclDISPID(64611)  public void StopAlwaysDelete(_Store Store) throws ComException;
  @DeclDISPID(64612)  public void StopAlwaysMoveToFolder(_Store Store) throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
}
