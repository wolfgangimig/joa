/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConversationContext.
 * IConversationContext Interface: Provides access to the conversation details. 
 */
@CoInterface(guid="{04378C72-E58F-47C0-8621-901B85CA2ED4}")
public interface IConversationContext extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException;
  @DeclDISPID(1610743809)  public ConversationContextType getType() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getIsActive() throws ComException;
  @DeclDISPID(1610743811)  public Boolean getIsRequired() throws ComException;
  @DeclDISPID(1610743811)  public void setIsRequired(final Boolean value) throws ComException;
  @DeclDISPID(1610743813)  public IParticipantInfo getFrom() throws ComException;
  @DeclDISPID(1610743813)  public void setFrom(final IParticipantInfo value) throws ComException;
  @DeclDISPID(1610743815)  public IParticipantInfo getTo() throws ComException;
  @DeclDISPID(1610743815)  public void setTo(final IParticipantInfo value) throws ComException;
  @DeclDISPID(1610743817)  public String getConversationId() throws ComException;
  @DeclDISPID(1610743817)  public void setConversationId(final String value) throws ComException;
  @DeclDISPID(1610743819)  public String getDate() throws ComException;
  @DeclDISPID(1610743819)  public void setDate(final String value) throws ComException;
  @DeclDISPID(1610743821)  public IParticipantInfo[] getParticipants() throws ComException;
  @DeclDISPID(1610743821)  public void setParticipants(final IParticipantInfo[] value) throws ComException;
  @DeclDISPID(1610743823)  public ModalityTypes getModalityTypes() throws ComException;
  @DeclDISPID(1610743823)  public void setModalityTypes(final ModalityTypes value) throws ComException;
  @DeclDISPID(1610743825)  public String getDataFormat() throws ComException;
  @DeclDISPID(1610743825)  public void setDataFormat(final String value) throws ComException;
  @DeclDISPID(1610743827)  public String getData() throws ComException;
  @DeclDISPID(1610743827)  public void setData(final String value) throws ComException;
  @DeclDISPID(1610743829)  public IConversationContextCollection getSubContexts() throws ComException;
  @DeclDISPID(1610743830)  public IParticipantInfo CreateParticipantInfo(final String _uri, final String _representedUri) throws ComException;
}
