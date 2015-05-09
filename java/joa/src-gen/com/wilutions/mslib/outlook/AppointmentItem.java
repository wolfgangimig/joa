/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * AppointmentItem.
 * 
 */
@CoClass(guid="{00061030-0000-0000-C000-000000000046}")
public class AppointmentItem extends Dispatch implements _AppointmentItem {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(63511)  public Actions getActions() throws ComException {
    final Object obj = this._dispatchCall(63511,"Actions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ActionsImpl.class);
  }
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException {
    final Object obj = this._dispatchCall(63509,"Attachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AttachmentsImpl.class);
  }
  @DeclDISPID(34101)  public String getBillingInformation() throws ComException {
    final Object obj = this._dispatchCall(34101,"BillingInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34101)  public void setBillingInformation(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34101,"BillingInformation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(37120)  public String getBody() throws ComException {
    final Object obj = this._dispatchCall(37120,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(37120)  public void setBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(37120,"Body", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(36865)  public String getCategories() throws ComException {
    final Object obj = this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(36865)  public void setCategories(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34107)  public String getCompanies() throws ComException {
    final Object obj = this._dispatchCall(34107,"Companies", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34107)  public void setCompanies(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34107,"Companies", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64192)  public String getConversationIndex() throws ComException {
    final Object obj = this._dispatchCall(64192,"ConversationIndex", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(112)  public String getConversationTopic() throws ComException {
    final Object obj = this._dispatchCall(112,"ConversationTopic", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12295)  public java.util.Date getCreationTime() throws ComException {
    final Object obj = this._dispatchCall(12295,"CreationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(61470)  public String getEntryID() throws ComException {
    final Object obj = this._dispatchCall(61470,"EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61589)  public FormDescription getFormDescription() throws ComException {
    final Object obj = this._dispatchCall(61589,"FormDescription", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.FormDescriptionImpl.class);
  }
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException {
    final Object obj = this._dispatchCall(61502,"GetInspector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(23)  public OlImportance getImportance() throws ComException {
    final Object obj = this._dispatchCall(23,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlImportance.valueOf((Integer)obj);
  }
  @DeclDISPID(23)  public void setImportance(final OlImportance value) throws ComException {
    assert(value != null);
    this._dispatchCall(23,"Importance", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(12296)  public java.util.Date getLastModificationTime() throws ComException {
    final Object obj = this._dispatchCall(12296,"LastModificationTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(26)  public String getMessageClass() throws ComException {
    final Object obj = this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(26)  public void setMessageClass(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34100)  public String getMileage() throws ComException {
    final Object obj = this._dispatchCall(34100,"Mileage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34100)  public void setMileage(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34100,"Mileage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34062)  public Boolean getNoAging() throws ComException {
    final Object obj = this._dispatchCall(34062,"NoAging", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34062)  public void setNoAging(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34062,"NoAging", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34130)  public Integer getOutlookInternalVersion() throws ComException {
    final Object obj = this._dispatchCall(34130,"OutlookInternalVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(34132)  public String getOutlookVersion() throws ComException {
    final Object obj = this._dispatchCall(34132,"OutlookVersion", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61603)  public Boolean getSaved() throws ComException {
    final Object obj = this._dispatchCall(61603,"Saved", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(54)  public OlSensitivity getSensitivity() throws ComException {
    final Object obj = this._dispatchCall(54,"Sensitivity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlSensitivity.valueOf((Integer)obj);
  }
  @DeclDISPID(54)  public void setSensitivity(final OlSensitivity value) throws ComException {
    assert(value != null);
    this._dispatchCall(54,"Sensitivity", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3592)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(3592,"Size", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(55)  public String getSubject() throws ComException {
    final Object obj = this._dispatchCall(55,"Subject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(55)  public void setSubject(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(55,"Subject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61468)  public Boolean getUnRead() throws ComException {
    final Object obj = this._dispatchCall(61468,"UnRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(61468)  public void setUnRead(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(61468,"UnRead", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.UserPropertiesImpl.class);
  }
  @DeclDISPID(61475)  public void Close(final OlInspectorClose SaveMode) throws ComException {
    assert(SaveMode != null);
    this._dispatchCall(61475,"Close", DISPATCH_METHOD,null,SaveMode.value);
  }
  @DeclDISPID(61490)  public IDispatch Copy() throws ComException {
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61606)  public void Display(final Object Modal) throws ComException {
    assert(Modal != null);
    this._dispatchCall(61606,"Display", DISPATCH_METHOD,null,Variant.param(Modal));
  }
  @DeclDISPID(61492)  public IDispatch Move(final MAPIFolder DestFldr) throws ComException {
    final Object obj = this._dispatchCall(61492,"Move", DISPATCH_METHOD,null,Dispatch.param(DestFldr));
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(61491)  public void PrintOut() throws ComException {
    this._dispatchCall(61491,"PrintOut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61521)  public void SaveAs(final String Path, final Object Type) throws ComException {
    assert(Path != null);
    assert(Type != null);
    this._dispatchCall(61521,"SaveAs", DISPATCH_METHOD,null,Path,Variant.param(Type));
  }
  @DeclDISPID(33301)  public Boolean getAllDayEvent() throws ComException {
    final Object obj = this._dispatchCall(33301,"AllDayEvent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33301)  public void setAllDayEvent(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(33301,"AllDayEvent", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33285)  public OlBusyStatus getBusyStatus() throws ComException {
    final Object obj = this._dispatchCall(33285,"BusyStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlBusyStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(33285)  public void setBusyStatus(final OlBusyStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(33285,"BusyStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(33299)  public Integer getDuration() throws ComException {
    final Object obj = this._dispatchCall(33299,"Duration", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(33299)  public void setDuration(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(33299,"Duration", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33294)  public java.util.Date getEnd() throws ComException {
    final Object obj = this._dispatchCall(33294,"End", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33294)  public void setEnd(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33294,"End", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33315)  public Boolean getIsRecurring() throws ComException {
    final Object obj = this._dispatchCall(33315,"IsRecurring", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33288)  public String getLocation() throws ComException {
    final Object obj = this._dispatchCall(33288,"Location", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33288)  public void setLocation(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33288,"Location", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33303)  public OlMeetingStatus getMeetingStatus() throws ComException {
    final Object obj = this._dispatchCall(33303,"MeetingStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlMeetingStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(33303)  public void setMeetingStatus(final OlMeetingStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(33303,"MeetingStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3587)  public String getOptionalAttendees() throws ComException {
    final Object obj = this._dispatchCall(3587,"OptionalAttendees", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3587)  public void setOptionalAttendees(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3587,"OptionalAttendees", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(66)  public String getOrganizer() throws ComException {
    final Object obj = this._dispatchCall(66,"Organizer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException {
    final Object obj = this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
  }
  @DeclDISPID(62789)  public OlRecurrenceState getRecurrenceState() throws ComException {
    final Object obj = this._dispatchCall(62789,"RecurrenceState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRecurrenceState.valueOf((Integer)obj);
  }
  @DeclDISPID(34049)  public Integer getReminderMinutesBeforeStart() throws ComException {
    final Object obj = this._dispatchCall(34049,"ReminderMinutesBeforeStart", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(34049)  public void setReminderMinutesBeforeStart(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(34049,"ReminderMinutesBeforeStart", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34076)  public Boolean getReminderOverrideDefault() throws ComException {
    final Object obj = this._dispatchCall(34076,"ReminderOverrideDefault", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34076)  public void setReminderOverrideDefault(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34076,"ReminderOverrideDefault", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34078)  public Boolean getReminderPlaySound() throws ComException {
    final Object obj = this._dispatchCall(34078,"ReminderPlaySound", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34078)  public void setReminderPlaySound(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34078,"ReminderPlaySound", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34051)  public Boolean getReminderSet() throws ComException {
    final Object obj = this._dispatchCall(34051,"ReminderSet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34051)  public void setReminderSet(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34051,"ReminderSet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34079)  public String getReminderSoundFile() throws ComException {
    final Object obj = this._dispatchCall(34079,"ReminderSoundFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34079)  public void setReminderSoundFile(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34079,"ReminderSoundFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33312)  public java.util.Date getReplyTime() throws ComException {
    final Object obj = this._dispatchCall(33312,"ReplyTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33312)  public void setReplyTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33312,"ReplyTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3588)  public String getRequiredAttendees() throws ComException {
    final Object obj = this._dispatchCall(3588,"RequiredAttendees", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3588)  public void setRequiredAttendees(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3588,"RequiredAttendees", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3586)  public String getResources() throws ComException {
    final Object obj = this._dispatchCall(3586,"Resources", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3586)  public void setResources(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3586,"Resources", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(99)  public Boolean getResponseRequested() throws ComException {
    final Object obj = this._dispatchCall(99,"ResponseRequested", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(99)  public void setResponseRequested(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(99,"ResponseRequested", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33304)  public OlResponseStatus getResponseStatus() throws ComException {
    final Object obj = this._dispatchCall(33304,"ResponseStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlResponseStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(33293)  public java.util.Date getStart() throws ComException {
    final Object obj = this._dispatchCall(33293,"Start", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33293)  public void setStart(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33293,"Start", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61605)  public void ClearRecurrencePattern() throws ComException {
    this._dispatchCall(61605,"ClearRecurrencePattern", DISPATCH_METHOD,null);
  }
  @DeclDISPID(62791)  public MailItem ForwardAsVcal() throws ComException {
    final Object obj = this._dispatchCall(62791,"ForwardAsVcal", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MailItem.class);
  }
  @DeclDISPID(61604)  public RecurrencePattern GetRecurrencePattern() throws ComException {
    final Object obj = this._dispatchCall(61604,"GetRecurrencePattern", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecurrencePatternImpl.class);
  }
  @DeclDISPID(62722)  public MeetingItem Respond(final OlMeetingResponse Response, final Object fNoUI, final Object fAdditionalTextDialog) throws ComException {
    assert(Response != null);
    assert(fNoUI != null);
    assert(fAdditionalTextDialog != null);
    final Object obj = this._dispatchCall(62722,"Respond", DISPATCH_METHOD,null,Response.value,Variant.param(fNoUI),Variant.param(fAdditionalTextDialog));
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MeetingItem.class);
  }
  @DeclDISPID(61557)  public void Send() throws ComException {
    this._dispatchCall(61557,"Send", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException {
    final Object obj = this._dispatchCall(64077,"DownloadState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDownloadState.valueOf((Integer)obj);
  }
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException {
    this._dispatchCall(64011,"ShowCategoriesDialog", DISPATCH_METHOD,null);
  }
  @DeclDISPID(16350)  public Integer getInternetCodepage() throws ComException {
    final Object obj = this._dispatchCall(16350,"InternetCodepage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(16350)  public void setInternetCodepage(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(16350,"InternetCodepage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException {
    final Object obj = this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRemoteStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(34161)  public void setMarkForDownload(final OlRemoteStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException {
    final Object obj = this._dispatchCall(64164,"IsConflict", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33289)  public String getMeetingWorkspaceURL() throws ComException {
    final Object obj = this._dispatchCall(33289,"MeetingWorkspaceURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException {
    final Object obj = this._dispatchCall(64186,"AutoResolvedWinner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException {
    final Object obj = this._dispatchCall(64187,"Conflicts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictsImpl.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(PropertyAccessor.class);
  }
  @DeclDISPID(64209)  public Account getSendUsingAccount() throws ComException {
    final Object obj = this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(Account.class);
  }
  @DeclDISPID(64209)  public void setSendUsingAccount(final Account value) throws ComException {
    this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(64509)  public String getGlobalAppointmentID() throws ComException {
    final Object obj = this._dispatchCall(64509,"GlobalAppointmentID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(62778)  public Boolean getForceUpdateToAllAttendees() throws ComException {
    final Object obj = this._dispatchCall(62778,"ForceUpdateToAllAttendees", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(62778)  public void setForceUpdateToAllAttendees(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(62778,"ForceUpdateToAllAttendees", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33384)  public java.util.Date getStartUTC() throws ComException {
    final Object obj = this._dispatchCall(33384,"StartUTC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33384)  public void setStartUTC(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33384,"StartUTC", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33385)  public java.util.Date getEndUTC() throws ComException {
    final Object obj = this._dispatchCall(33385,"EndUTC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33385)  public void setEndUTC(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33385,"EndUTC", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33382)  public java.util.Date getStartInStartTimeZone() throws ComException {
    final Object obj = this._dispatchCall(33382,"StartInStartTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33382)  public void setStartInStartTimeZone(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33382,"StartInStartTimeZone", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33383)  public java.util.Date getEndInEndTimeZone() throws ComException {
    final Object obj = this._dispatchCall(33383,"EndInEndTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33383)  public void setEndInEndTimeZone(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33383,"EndInEndTimeZone", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64551)  public _TimeZone getStartTimeZone() throws ComException {
    final Object obj = this._dispatchCall(64551,"StartTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  @DeclDISPID(64551)  public void setStartTimeZone(final _TimeZone value) throws ComException {
    this._dispatchCall(64551,"StartTimeZone", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(64552)  public _TimeZone getEndTimeZone() throws ComException {
    final Object obj = this._dispatchCall(64552,"EndTimeZone", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._TimeZoneImpl.class);
  }
  @DeclDISPID(64552)  public void setEndTimeZone(final _TimeZone value) throws ComException {
    this._dispatchCall(64552,"EndTimeZone", DISPATCH_PROPERTYPUT,Dispatch.param(value));
  }
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException {
    final Object obj = this._dispatchCall(64596,"GetConversation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ConversationImpl.class);
  }
  @DeclDISPID(64629)  public String getConversationID() throws ComException {
    final Object obj = this._dispatchCall(64629,"ConversationID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64274)  public _AppointmentItem CopyTo(final MAPIFolder DestinationFolder, final OlAppointmentCopyOptions CopyOptions) throws ComException {
    assert(CopyOptions != null);
    final Object obj = this._dispatchCall(64274,"CopyTo", DISPATCH_METHOD,null,Dispatch.param(DestinationFolder),CopyOptions.value);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._AppointmentItemImpl.class);
  }
  @DeclDISPID(64644)  public Object getRTFBody() throws ComException {
    final Object obj = this._dispatchCall(64644,"RTFBody", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64644)  public void setRTFBody(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(64644,"RTFBody", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64648)  public AddressEntry GetOrganizer() throws ComException {
    final Object obj = this._dispatchCall(64648,"GetOrganizer", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.AddressEntryImpl.class);
  }
  public AppointmentItem() throws ComException {
    super("{00061030-0000-0000-C000-000000000046}", "{00063033-0000-0000-C000-000000000046}");
  }
  protected AppointmentItem(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AppointmentItem" + super.toString() + "]";
  }
}
