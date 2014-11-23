/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{207F2D78-1F34-9019-2C55-41689FD162CF}")
public class IConferenceCapabilitiesImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IConferenceCapabilities {
  @DeclDISPID(1610743808)  public Integer getModalities() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Modalities", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.ConferenceAdmissionType getDefaultAdmissionType() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"DefaultAdmissionType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConferenceAdmissionType.valueOf((Integer)obj);
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
  @DeclDISPID(1610743816)  public com.wilutions.mslib.uccollaborationlib.ConferenceAutoPromoteType getAutoPromoteAllow() throws ComException {
    final Object obj = this._dispatchCall(1610743816,"AutoPromoteAllow", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConferenceAutoPromoteType.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743817)  public Boolean getIsDefaultMeetingStatic() throws ComException {
    final Object obj = this._dispatchCall(1610743817,"IsDefaultMeetingStatic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743818)  public com.wilutions.mslib.uccollaborationlib.IConferenceTelephoneAccessInformation getTelephoneAccessNumbers() throws ComException {
    final Object obj = this._dispatchCall(1610743818,"TelephoneAccessNumbers", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.uccollaborationlib.impl.IConferenceTelephoneAccessInformationImpl.class);
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
  @DeclDISPID(1610743821)  public com.wilutions.mslib.uccollaborationlib.ConferenceAutoPromoteType getDefaultAutoPromote() throws ComException {
    final Object obj = this._dispatchCall(1610743821,"DefaultAutoPromote", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.ConferenceAutoPromoteType.valueOf((Integer)obj);
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
  public IConferenceCapabilitiesImpl(String progId) throws ComException {
    super(progId, "{E0E8B413-BB57-4B58-B1FB-288F3A269E35}");
  }
  protected IConferenceCapabilitiesImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IConferenceCapabilitiesImpl" + super.toString() + "]";
  }
}
