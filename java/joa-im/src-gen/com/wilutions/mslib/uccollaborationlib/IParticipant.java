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
  @DeclDISPID(1610743813)  public IAsynchronousOperation SetProperty(final ParticipantProperty _propertyType, final Object _propertyValue, final Object _participantCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743814)  public IAsynchronousOperation SetMute(final Boolean _mute, final Object _participantCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743815)  public Boolean getIsMuted() throws ComException;
  @DeclDISPID(1610743816)  public Boolean CanSetProperty(final ParticipantProperty _participantProperty) throws ComException;
  @DeclDISPID(1610743817)  public IAsynchronousOperation Admit(final Object _participantCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743818)  public IAsynchronousOperation Deny(final Object _participantCallback, final Object _state) throws ComException;
  @DeclDISPID(1610743819)  public Boolean CanAdmit() throws ComException;
  @DeclDISPID(1610743820)  public Boolean CanDeny() throws ComException;
  @DeclDISPID(1610743821)  public Boolean CanBeMuted() throws ComException;
  @DeclDISPID(1610743822)  public Boolean CanInvoke(final ParticipantAction _action) throws ComException;
}
