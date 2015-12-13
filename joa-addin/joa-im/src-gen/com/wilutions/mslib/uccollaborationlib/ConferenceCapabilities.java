/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceCapabilities.
 * ConferenceCapabilities Class 
 */
@CoClass(guid="{488F9CE1-5468-48EC-B4DB-FC2F7F1AB247}")
public class ConferenceCapabilities extends Dispatch implements IConferenceCapabilities {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public Integer getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public ConferenceAdmissionType getDefaultAdmissionType() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"DefaultAdmissionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConferenceAdmissionType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743810)  public Boolean getIsPstnBridgingEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"IsPstnBridgingEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public Integer getVersion() throws ComException {
    final Object obj = this._dispatchCall(1610743811,"Version", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743812)  public Boolean getIsConferenceKeyOptional() throws ComException {
    final Object obj = this._dispatchCall(1610743812,"IsConferenceKeyOptional", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743813)  public Boolean getIsAnonymousAllowed() throws ComException {
    final Object obj = this._dispatchCall(1610743813,"IsAnonymousAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743814)  public String getPstnBridgingAccessNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"PstnBridgingAccessNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743815)  public Integer getStaticMeetingLimit() throws ComException {
    final Object obj = this._dispatchCall(1610743815,"StaticMeetingLimit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743816)  public ConferenceAutoPromoteType getAutoPromoteAllow() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"AutoPromoteAllow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConferenceAutoPromoteType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743817)  public Boolean getIsDefaultMeetingStatic() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"IsDefaultMeetingStatic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public IConferenceTelephoneAccessInformation getTelephoneAccessNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"TelephoneAccessNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IConferenceTelephoneAccessInformationImpl.class);
  }
  @DeclDISPID(1610743819)  public Boolean getIsPSTNLobbyByPassAllowed() throws ComException {
    final Object obj = this._dispatchCall(1610743819,"IsPSTNLobbyByPassAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743820)  public Boolean getAreGlobalAnnouncementsAllowed() throws ComException {
    final Object obj = this._dispatchCall(1610743820,"AreGlobalAnnouncementsAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743821)  public ConferenceAutoPromoteType getDefaultAutoPromote() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"DefaultAutoPromote", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return ConferenceAutoPromoteType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743822)  public Boolean getIsACPEnabled() throws ComException {
    final Object obj = this._dispatchCall(1610743822,"IsACPEnabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743823)  public Boolean getDefaultGlobalAnnouncements() throws ComException {
    final Object obj = this._dispatchCall(1610743823,"DefaultGlobalAnnouncements", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public ConferenceCapabilities() throws ComException {
    super("{488F9CE1-5468-48EC-B4DB-FC2F7F1AB247}", "{E0E8B413-BB57-4B58-B1FB-288F3A269E35}");
  }
  protected ConferenceCapabilities(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ConferenceCapabilities" + super.toString() + "]";
  }
}
