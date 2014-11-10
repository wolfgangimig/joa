/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * DistListItem.
 * 
 */
@CoClass(guid="{0006103C-0000-0000-C000-000000000046}")
public class DistListItem extends Dispatch implements _DistListItem {
  @DeclDISPID(61440)  public _Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public _NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(63511)  public Actions getActions() throws ComException {
    final Object obj = this._dispatchCall(63511,"Actions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ActionsImpl.class);
  }
  @DeclDISPID(63509)  public Attachments getAttachments() throws ComException {
    final Object obj = this._dispatchCall(63509,"Attachments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AttachmentsImpl.class);
  }
  @DeclDISPID(34101)  public String getBillingInformation() throws ComException {
    final Object obj = this._dispatchCall(34101,"BillingInformation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34101)  public void setBillingInformation(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34101,"BillingInformation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(37120)  public String getBody() throws ComException {
    final Object obj = this._dispatchCall(37120,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(37120)  public void setBody(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(37120,"Body", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(36865)  public String getCategories() throws ComException {
    final Object obj = this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(36865)  public void setCategories(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(36865,"Categories", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34107)  public String getCompanies() throws ComException {
    final Object obj = this._dispatchCall(34107,"Companies", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34107)  public void setCompanies(String value) throws ComException {
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
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.FormDescriptionImpl.class);
  }
  @DeclDISPID(61502)  public _Inspector getGetInspector() throws ComException {
    final Object obj = this._dispatchCall(61502,"GetInspector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(23)  public OlImportance getImportance() throws ComException {
    final Object obj = this._dispatchCall(23,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlImportance.valueOf((Integer)obj);
  }
  @DeclDISPID(23)  public void setImportance(OlImportance value) throws ComException {
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
  @DeclDISPID(26)  public void setMessageClass(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(26,"MessageClass", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34100)  public String getMileage() throws ComException {
    final Object obj = this._dispatchCall(34100,"Mileage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34100)  public void setMileage(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34100,"Mileage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34062)  public Boolean getNoAging() throws ComException {
    final Object obj = this._dispatchCall(34062,"NoAging", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34062)  public void setNoAging(Boolean value) throws ComException {
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
  @DeclDISPID(54)  public void setSensitivity(OlSensitivity value) throws ComException {
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
  @DeclDISPID(55)  public void setSubject(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(55,"Subject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(61468)  public Boolean getUnRead() throws ComException {
    final Object obj = this._dispatchCall(61468,"UnRead", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(61468)  public void setUnRead(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(61468,"UnRead", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63510)  public UserProperties getUserProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.UserPropertiesImpl.class);
  }
  @DeclDISPID(61475)  public void Close(OlInspectorClose SaveMode) throws ComException {
    assert(SaveMode != null);
    this._dispatchCall(61475,"Close", DISPATCH_METHOD,null,SaveMode.value);
  }
  @DeclDISPID(61490)  public Dispatch Copy() throws ComException {
    final Object obj = this._dispatchCall(61490,"Copy", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(61514)  public void Delete() throws ComException {
    this._dispatchCall(61514,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61606)  public void Display(Object Modal) throws ComException {
    assert(Modal != null);
    this._dispatchCall(61606,"Display", DISPATCH_METHOD,null,Modal);
  }
  @DeclDISPID(61492)  public Dispatch Move(MAPIFolder DestFldr) throws ComException {
    final Object obj = this._dispatchCall(61492,"Move", DISPATCH_METHOD,null,(DestFldr!=null?DestFldr:Dispatch.NULL));
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(61491)  public void PrintOut() throws ComException {
    this._dispatchCall(61491,"PrintOut", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61512)  public void Save() throws ComException {
    this._dispatchCall(61512,"Save", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61521)  public void SaveAs(String Path, Object Type) throws ComException {
    assert(Path != null);
    assert(Type != null);
    this._dispatchCall(61521,"SaveAs", DISPATCH_METHOD,null,Path,Type);
  }
  @DeclDISPID(32851)  public String getDLName() throws ComException {
    final Object obj = this._dispatchCall(32851,"DLName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32851)  public void setDLName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32851,"DLName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32843)  public Integer getMemberCount() throws ComException {
    final Object obj = this._dispatchCall(32843,"MemberCount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(63744)  public void AddMembers(Recipients Recipients) throws ComException {
    this._dispatchCall(63744,"AddMembers", DISPATCH_METHOD,null,(Recipients!=null?Recipients:Dispatch.NULL));
  }
  @DeclDISPID(63745)  public void RemoveMembers(Recipients Recipients) throws ComException {
    this._dispatchCall(63745,"RemoveMembers", DISPATCH_METHOD,null,(Recipients!=null?Recipients:Dispatch.NULL));
  }
  @DeclDISPID(63749)  public Recipient GetMember(Integer Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(63749,"GetMember", DISPATCH_METHOD,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.RecipientImpl.class);
  }
  @DeclDISPID(64077)  public OlDownloadState getDownloadState() throws ComException {
    final Object obj = this._dispatchCall(64077,"DownloadState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDownloadState.valueOf((Integer)obj);
  }
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException {
    this._dispatchCall(64011,"ShowCategoriesDialog", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64140)  public void AddMember(Recipient Recipient) throws ComException {
    this._dispatchCall(64140,"AddMember", DISPATCH_METHOD,null,(Recipient!=null?Recipient:Dispatch.NULL));
  }
  @DeclDISPID(64141)  public void RemoveMember(Recipient Recipient) throws ComException {
    this._dispatchCall(64141,"RemoveMember", DISPATCH_METHOD,null,(Recipient!=null?Recipient:Dispatch.NULL));
  }
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(34161)  public OlRemoteStatus getMarkForDownload() throws ComException {
    final Object obj = this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRemoteStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(34161)  public void setMarkForDownload(OlRemoteStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64164)  public Boolean getIsConflict() throws ComException {
    final Object obj = this._dispatchCall(64164,"IsConflict", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64186)  public Boolean getAutoResolvedWinner() throws ComException {
    final Object obj = this._dispatchCall(64186,"AutoResolvedWinner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException {
    final Object obj = this._dispatchCall(64187,"Conflicts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.ConflictsImpl.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(PropertyAccessor.class);
  }
  @DeclDISPID(64543)  public String getTaskSubject() throws ComException {
    final Object obj = this._dispatchCall(64543,"TaskSubject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64543)  public void setTaskSubject(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64543,"TaskSubject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33029)  public java.util.Date getTaskDueDate() throws ComException {
    final Object obj = this._dispatchCall(33029,"TaskDueDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33029)  public void setTaskDueDate(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33029,"TaskDueDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33028)  public java.util.Date getTaskStartDate() throws ComException {
    final Object obj = this._dispatchCall(33028,"TaskStartDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33028)  public void setTaskStartDate(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33028,"TaskStartDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33039)  public java.util.Date getTaskCompletedDate() throws ComException {
    final Object obj = this._dispatchCall(33039,"TaskCompletedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33039)  public void setTaskCompletedDate(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33039,"TaskCompletedDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34208)  public java.util.Date getToDoTaskOrdinal() throws ComException {
    final Object obj = this._dispatchCall(34208,"ToDoTaskOrdinal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(34208)  public void setToDoTaskOrdinal(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(34208,"ToDoTaskOrdinal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34076)  public Boolean getReminderOverrideDefault() throws ComException {
    final Object obj = this._dispatchCall(34076,"ReminderOverrideDefault", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34076)  public void setReminderOverrideDefault(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34076,"ReminderOverrideDefault", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34078)  public Boolean getReminderPlaySound() throws ComException {
    final Object obj = this._dispatchCall(34078,"ReminderPlaySound", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34078)  public void setReminderPlaySound(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34078,"ReminderPlaySound", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34051)  public Boolean getReminderSet() throws ComException {
    final Object obj = this._dispatchCall(34051,"ReminderSet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(34051)  public void setReminderSet(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(34051,"ReminderSet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34079)  public String getReminderSoundFile() throws ComException {
    final Object obj = this._dispatchCall(34079,"ReminderSoundFile", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34079)  public void setReminderSoundFile(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34079,"ReminderSoundFile", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34050)  public java.util.Date getReminderTime() throws ComException {
    final Object obj = this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(34050)  public void setReminderTime(java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64510)  public void MarkAsTask(OlMarkInterval MarkInterval) throws ComException {
    assert(MarkInterval != null);
    this._dispatchCall(64510,"MarkAsTask", DISPATCH_METHOD,null,MarkInterval.value);
  }
  @DeclDISPID(64521)  public void ClearTaskFlag() throws ComException {
    this._dispatchCall(64521,"ClearTaskFlag", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64522)  public Boolean getIsMarkedAsTask() throws ComException {
    final Object obj = this._dispatchCall(64522,"IsMarkedAsTask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64629)  public String getConversationID() throws ComException {
    final Object obj = this._dispatchCall(64629,"ConversationID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64596)  public _Conversation GetConversation() throws ComException {
    final Object obj = this._dispatchCall(64596,"GetConversation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ConversationImpl.class);
  }
  @DeclDISPID(64644)  public Object getRTFBody() throws ComException {
    final Object obj = this._dispatchCall(64644,"RTFBody", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(64644)  public void setRTFBody(Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(64644,"RTFBody", DISPATCH_PROPERTYPUT,value);
  }
  public DistListItem() throws ComException {
    super("{0006103C-0000-0000-C000-000000000046}");
  }
  protected DistListItem(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[DistListItem" + super.toString() + "]";
  }
}
