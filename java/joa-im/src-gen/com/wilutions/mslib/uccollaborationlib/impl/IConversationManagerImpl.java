/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{03882C46-3AFD-9EEC-3CAC-3BFF449FA782}")
public class IConversationManagerImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConversationManager {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates getSummarizerStates() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"SummarizerStates", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConversationSummarizerStates.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IConversationCollection getConversations() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Conversations", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationCollectionImpl.class);
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IConversation AddConversation() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"AddConversation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743811)  public com.wilutions.mslib.uccollaborationlib.IConversation JoinConference(String _conferenceUrl) throws ComException {
    assert(_conferenceUrl != null);
    final Object obj = this._dispatchCall(1610743811,"JoinConference", DISPATCH_METHOD,null,_conferenceUrl);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConversationImpl.class);
  }
  @DeclDISPID(1610743812)  public com.wilutions.mslib.uccollaborationlib.IVoiceMailsManager getVoiceMailsManager() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"VoiceMailsManager", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IVoiceMailsManagerImpl.class);
  }
  @DeclDISPID(1610743813)  public com.wilutions.mslib.uccollaborationlib.IPreviousConversationsManagerDictionary getPreviousConversationsManagers() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"PreviousConversationsManagers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IPreviousConversationsManagerDictionaryImpl.class);
  }
  public IConversationManagerImpl(String progId) throws ComException {
    super(progId, "{C31FB52D-9E9E-45AD-A102-5218E1685B78}");
  }
  protected IConversationManagerImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConversationManagerImpl" + super.toString() + "]";
  }
}
