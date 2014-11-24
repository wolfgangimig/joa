/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IConferenceCapabilities.
 * IConferenceCapabilities Interface 
 */
@CoInterface(guid="{E0E8B413-BB57-4B58-B1FB-288F3A269E35}")
public interface IConferenceCapabilities extends IDispatch {
  @DeclDISPID(1610743808)  public Integer getModalities() throws ComException;
  @DeclDISPID(1610743809)  public ConferenceAdmissionType getDefaultAdmissionType() throws ComException;
  @DeclDISPID(1610743810)  public Boolean getIsPstnBridgingEnabled() throws ComException;
  @DeclDISPID(1610743811)  public Integer getVersion() throws ComException;
  @DeclDISPID(1610743812)  public Boolean getIsConferenceKeyOptional() throws ComException;
  @DeclDISPID(1610743813)  public Boolean getIsAnonymousAllowed() throws ComException;
  @DeclDISPID(1610743814)  public String getPstnBridgingAccessNumbers() throws ComException;
  @DeclDISPID(1610743815)  public Integer getStaticMeetingLimit() throws ComException;
  @DeclDISPID(1610743816)  public ConferenceAutoPromoteType getAutoPromoteAllow() throws ComException;
  @DeclDISPID(1610743817)  public Boolean getIsDefaultMeetingStatic() throws ComException;
  @DeclDISPID(1610743818)  public IConferenceTelephoneAccessInformation getTelephoneAccessNumbers() throws ComException;
  @DeclDISPID(1610743819)  public Boolean getIsPSTNLobbyByPassAllowed() throws ComException;
  @DeclDISPID(1610743820)  public Boolean getAreGlobalAnnouncementsAllowed() throws ComException;
  @DeclDISPID(1610743821)  public ConferenceAutoPromoteType getDefaultAutoPromote() throws ComException;
  @DeclDISPID(1610743822)  public Boolean getIsACPEnabled() throws ComException;
  @DeclDISPID(1610743823)  public Boolean getDefaultGlobalAnnouncements() throws ComException;
}
