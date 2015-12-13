/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ScheduledConference.
 * ScheduledConference Class 
 */
@CoClass(guid="{BB99483D-2DF9-424F-96A8-6718CD7FBB9F}")
public class ScheduledConference extends Dispatch implements IScheduledConference {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public String getConferenceId() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"ConferenceId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743809)  public String getOrganizer() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Organizer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public String getOrganizerUri() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"OrganizerUri", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743811)  public java.util.Date getStartTime() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"StartTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743812)  public java.util.Date getEndTime() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"EndTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(1610743813)  public String getLocation() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"Location", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743814)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public String getConferenceURL() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"ConferenceURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743816)  public String getConferenceExternalURL() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"ConferenceExternalURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public ScheduledConference() throws ComException {
    super("{BB99483D-2DF9-424F-96A8-6718CD7FBB9F}", "{71A054B3-4D4B-4643-B14F-4572494B19E7}");
  }
  protected ScheduledConference(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ScheduledConference" + super.toString() + "]";
  }
}
