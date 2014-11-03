/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * _ConversationHeader.
 * 
 */
@CoInterface(guid="{00063107-0000-0000-C000-000000000046}")
public interface _ConversationHeader extends IDispatch {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException;
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException;
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException;
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException;
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException;
  @DeclDISPID(64629)  public String getConversationID() throws ComException;
  @DeclDISPID(64646)  public String getConversationTopic() throws ComException;
  @DeclDISPID(8457)  public SimpleItems GetItems() throws ComException;
}
