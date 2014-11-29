/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IParticipant.
 * IParticipant Interface 
 */
@CoInterface(guid="{4875C050-BA9C-4A05-891E-E7B0A9463664}")
public interface IParticipant extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IModalityDictionary getModalities() throws ComException;
  @DeclDISPID(1610743809)  public Boolean getIsSelf() throws ComException;
  @DeclDISPID(1610743810)  public IContact getContact() throws ComException;
  @DeclDISPID(1610743811)  public IConversation getConversation() throws ComException;
  @DeclDISPID(1610743812)  public IParticipantPropertyDictionary getProperties() throws ComException;
  @DeclDISPID(1610743813)  public IAsynchronousOperation SetProperty(ParticipantProperty _propertyType, Object _propertyValue, Object _participantCallback, Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation SetMute(Boolean _mute, Object _participantCallback, Object _state) throws ComException;
  @DeclDISPID(1610743815)  public Boolean getIsMuted() throws ComException;
  @DeclDISPID(1610743816)  public Boolean CanSetProperty(ParticipantProperty _participantProperty) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation Admit(Object _participantCallback, Object _state) throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation Deny(Object _participantCallback, Object _state) throws ComException;
  @DeclDISPID(1610743819)  public Boolean CanAdmit() throws ComException;
  @DeclDISPID(1610743820)  public Boolean CanDeny() throws ComException;
  @DeclDISPID(1610743821)  public Boolean CanBeMuted() throws ComException;
  @DeclDISPID(1610743822)  public Boolean CanInvoke(ParticipantAction _action) throws ComException;
}
