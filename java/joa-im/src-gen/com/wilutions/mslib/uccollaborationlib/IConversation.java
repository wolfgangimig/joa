/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversation.
 * IConversation Interface 
 */
@CoInterface(guid="{533891F1-A460-43E6-8BDA-6D0D2C13ADDE}")
public interface IConversation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public ConversationState getState() throws ComException;
  @DeclDISPID(1610743809)  public IParticipant getSelfParticipant() throws ComException;
  @DeclDISPID(1610743810)  public IModalityDictionary getModalities() throws ComException;
  @DeclDISPID(1610743811)  public IParticipantCollection getParticipants() throws ComException;
  @DeclDISPID(1610743812)  public IParticipant AddParticipant(final IDispatch _contactOrCollaborationEndpoint) throws ComException;
  @DeclDISPID(1610743813)  public void RemoveParticipant(final IParticipant _participant) throws ComException;
  @DeclDISPID(1610743814)  public IConversationContextList getContexts() throws ComException;
  @DeclDISPID(1610743815)  public IConversationHistory getHistory() throws ComException;
  @DeclDISPID(1610743816)  public IConversationPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation SetProperty(final ConversationProperty _propertyType, final Object _propertyValue, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation SendInitialContext(final ContextType[] _contextTypes, final Object[] _contextDatas, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743819)  public IAsynchronousOperation SendContextData(final String _applicationId, final String _dataType, final String _data, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743820)  public String GetApplicationData(final String _appGuid) throws ComException;
  @DeclDISPID(1610743821)  public IConversationManager getConversationManager() throws ComException;
  @DeclDISPID(1610743822)  public IAsynchronousOperation Merge(final IConversation _conversation, final ModalityTypes _modalityTypes, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743823)  public IAsynchronousOperation AdmitParticipants(final IParticipant[] _participants, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743824)  public IAsynchronousOperation DenyParticipants(final IParticipant[] _participants, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743825)  public IAsynchronousOperation Park(final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743826)  public void End() throws ComException;
  @DeclDISPID(1610743827)  public Boolean CanInvoke(final ConversationAction _action) throws ComException;
  @DeclDISPID(1610743828)  public Boolean CanSetProperty(final ConversationProperty _convProperty) throws ComException;
  @DeclDISPID(1610743829)  public ConversationDirection getDirection() throws ComException;
  @DeclDISPID(1610743830)  public IAsynchronousOperation MuteParticipants(final IParticipant[] _participants, final Object _conversationCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743831)  public IAsynchronousOperation UnmuteParticipants(final IParticipant[] _participants, final Object _conversationCallback, final Object _state) throws ComException;
}
