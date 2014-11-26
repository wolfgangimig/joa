/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversation.
 * IConversation Interface 
 */
@CoInterface(guid="{533891F1-A460-43E6-8BDA-6D0D2C13ADDE}")
public interface IConversation extends IDispatch {
  @DeclDISPID(1610743808)  public ConversationState getState() throws ComException;
  @DeclDISPID(1610743809)  public IParticipant getSelfParticipant() throws ComException;
  @DeclDISPID(1610743810)  public IModalityDictionary getModalities() throws ComException;
  @DeclDISPID(1610743811)  public IParticipantCollection getParticipants() throws ComException;
  @DeclDISPID(1610743812)  public IParticipant AddParticipant(IDispatch _contactOrCollaborationEndpoint) throws ComException;
  @DeclDISPID(1610743813)  public void RemoveParticipant(IParticipant _participant) throws ComException;
  @DeclDISPID(1610743814)  public IConversationContextList getContexts() throws ComException;
  @DeclDISPID(1610743815)  public IConversationHistory getHistory() throws ComException;
  @DeclDISPID(1610743816)  public IConversationPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation SetProperty(ConversationProperty _propertyType, Object _propertyValue, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation SendInitialContext(ContextType[] _contextTypes, Object[] _contextDatas, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743819)  public IAsynchronousOperation SendContextData(String _applicationId, String _dataType, String _data, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743820)  public String GetApplicationData(String _appGuid) throws ComException;
  @DeclDISPID(1610743821)  public IConversationManager getConversationManager() throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation Merge(IConversation _conversation, ModalityTypes _modalityTypes, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation AdmitParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743824)  public IAsynchronousOperation DenyParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743825)  public IAsynchronousOperation Park(Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743826)  public void End() throws ComException;
  @DeclDISPID(1610743827)  public Boolean CanInvoke(ConversationAction _action) throws ComException;
  @DeclDISPID(1610743828)  public Boolean CanSetProperty(ConversationProperty _convProperty) throws ComException;
  @DeclDISPID(1610743829)  public ConversationDirection getDirection() throws ComException;
  @DeclDISPID(1610743830)  public IAsynchronousOperation MuteParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException;
  @DeclDISPID(1610743831)  public IAsynchronousOperation UnmuteParticipants(IParticipant[] _participants, Object _conversationCallback, Object _state) throws ComException;
}
