/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IPreviousConversation.
 * IPreviousConversation Interface 
 */
@CoInterface(guid="{DF414A68-5051-4465-AAE2-4F301315734E}")
public interface IPreviousConversation extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getId() throws ComException;
  @DeclDISPID(1610743809)  public String getFrom() throws ComException;
  @DeclDISPID(1610743810)  public String getFromUri() throws ComException;
  @DeclDISPID(1610743811)  public String getConferenceUri() throws ComException;
  @DeclDISPID(1610743812)  public ModalityTypes getModalityTypes() throws ComException;
  @DeclDISPID(1610743813)  public ConversationDirection getDirection() throws ComException;
  @DeclDISPID(1610743814)  public String getSubject() throws ComException;
  @DeclDISPID(1610743815)  public java.util.Date getReceiveTime() throws ComException;
  @DeclDISPID(1610743816)  public INamedPropertyList getProperties() throws ComException;
  @DeclDISPID(1610743817)  public Boolean getIsRead() throws ComException;
}
