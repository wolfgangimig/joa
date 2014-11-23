/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationManager.
 * IConversationManager Interface 
 */
@CoInterface(guid="{C31FB52D-9E9E-45AD-A102-5218E1685B78}")
public interface IConversationManager extends IDispatch {
  @DeclDISPID(1610743808)  public ConversationSummarizerStates getSummarizerStates() throws ComException;
  @DeclDISPID(1610743809)  public IConversationCollection getConversations() throws ComException;
  @DeclDISPID(1610743810)  public IConversation AddConversation() throws ComException;
  @DeclDISPID(1610743811)  public IConversation JoinConference(String _conferenceUrl) throws ComException;
  @DeclDISPID(1610743812)  public IVoiceMailsManager getVoiceMailsManager() throws ComException;
  @DeclDISPID(1610743813)  public IPreviousConversationsManagerDictionary getPreviousConversationsManagers() throws ComException;
}
