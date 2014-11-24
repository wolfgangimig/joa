/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationManager.
 * Conversations manager class manages conversation creation, retrieves the collection of the 
 * conversations, joins a conference, etc. This class handles the events defined in the 
 * interface IConversationManagerEvents. 
 */
@CoClass(guid="{C87287D3-0A25-414D-9A92-16A11A2099F0}")
public class ConversationManager extends Dispatch implements IConversationManager {
  @DeclDISPID(1610743808)  public ConversationSummarizerStates getSummarizerStates() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"SummarizerStates", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConversationSummarizerStates.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public IConversationCollection getConversations() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Conversations", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationCollectionImpl.class);
  }
  @DeclDISPID(1610743810)  public IConversation AddConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AddConversation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public IConversation JoinConference(String _conferenceUrl) throws ComException {
    assert(_conferenceUrl != null);
    final Object obj = this._dispatchCall(1610743811,"JoinConference", DISPATCH_METHOD,null,_conferenceUrl);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743812)  public IVoiceMailsManager getVoiceMailsManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"VoiceMailsManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVoiceMailsManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public IPreviousConversationsManagerDictionary getPreviousConversationsManagers() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"PreviousConversationsManagers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerDictionaryImpl.class);
  }
  public ConversationManager() throws ComException {
    super("{C87287D3-0A25-414D-9A92-16A11A2099F0}", "{C31FB52D-9E9E-45AD-A102-5218E1685B78}");
  }
  protected ConversationManager(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConversationManager" + super.toString() + "]";
  }
}
