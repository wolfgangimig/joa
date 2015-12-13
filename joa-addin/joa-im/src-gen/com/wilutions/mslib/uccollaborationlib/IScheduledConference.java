/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * IScheduledConference.
 * IScheduledConference Interface 
 */
@CoInterface(guid="{71A054B3-4D4B-4643-B14F-4572494B19E7}")
public interface IScheduledConference extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getConferenceId() throws ComException;
  @DeclDISPID(1610743809)  public String getOrganizer() throws ComException;
  @DeclDISPID(1610743810)  public String getOrganizerUri() throws ComException;
  @DeclDISPID(1610743811)  public java.util.Date getStartTime() throws ComException;
  @DeclDISPID(1610743812)  public java.util.Date getEndTime() throws ComException;
  @DeclDISPID(1610743813)  public String getLocation() throws ComException;
  @DeclDISPID(1610743814)  public String getSubject() throws ComException;
  @DeclDISPID(1610743815)  public String getConferenceURL() throws ComException;
  @DeclDISPID(1610743816)  public String getConferenceExternalURL() throws ComException;
}
