/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A95E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _TaskItemImpl extends Dispatch implements com.wilutions.mslib.outlook._TaskItem {
  @DeclDISPID(61440)  public com.wilutions.mslib.outlook._Application getApplication() throws ComException {
    final Object obj = this._dispatchCall(61440,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ApplicationImpl.class);
  }
  @DeclDISPID(61450)  public com.wilutions.mslib.outlook.OlObjectClass getClass_() throws ComException {
    final Object obj = this._dispatchCall(61450,"Class", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlObjectClass.valueOf((Integer)obj);
  }
  @DeclDISPID(61451)  public com.wilutions.mslib.outlook._NameSpace getSession() throws ComException {
    final Object obj = this._dispatchCall(61451,"Session", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._NameSpaceImpl.class);
  }
  @DeclDISPID(61441)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(61441,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(63511)  public com.wilutions.mslib.outlook.Actions getActions() throws ComException {
    final Object obj = this._dispatchCall(63511,"Actions", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ActionsImpl.class);
  }
  @DeclDISPID(63509)  public com.wilutions.mslib.outlook.Attachments getAttachments() throws ComException {
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
  @DeclDISPID(61589)  public com.wilutions.mslib.outlook.FormDescription getFormDescription() throws ComException {
    final Object obj = this._dispatchCall(61589,"FormDescription", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.FormDescriptionImpl.class);
  }
  @DeclDISPID(61502)  public com.wilutions.mslib.outlook._Inspector getGetInspector() throws ComException {
    final Object obj = this._dispatchCall(61502,"GetInspector", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._InspectorImpl.class);
  }
  @DeclDISPID(23)  public com.wilutions.mslib.outlook.OlImportance getImportance() throws ComException {
    final Object obj = this._dispatchCall(23,"Importance", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlImportance.valueOf((Integer)obj);
  }
  @DeclDISPID(23)  public void setImportance(final com.wilutions.mslib.outlook.OlImportance value) throws ComException {
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
  @DeclDISPID(54)  public com.wilutions.mslib.outlook.OlSensitivity getSensitivity() throws ComException {
    final Object obj = this._dispatchCall(54,"Sensitivity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlSensitivity.valueOf((Integer)obj);
  }
  @DeclDISPID(54)  public void setSensitivity(final com.wilutions.mslib.outlook.OlSensitivity value) throws ComException {
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
  @DeclDISPID(63510)  public com.wilutions.mslib.outlook.UserProperties getUserProperties() throws ComException {
    final Object obj = this._dispatchCall(63510,"UserProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.UserPropertiesImpl.class);
  }
  @DeclDISPID(61475)  public void Close(final com.wilutions.mslib.outlook.OlInspectorClose SaveMode) throws ComException {
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
    this._dispatchCall(61606,"Display", DISPATCH_METHOD,null,Modal);
  }
  @DeclDISPID(61492)  public IDispatch Move(final com.wilutions.mslib.outlook.MAPIFolder DestFldr) throws ComException {
    final Object obj = this._dispatchCall(61492,"Move", DISPATCH_METHOD,null,(DestFldr!=null?DestFldr:Dispatch.NULL));
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
    this._dispatchCall(61521,"SaveAs", DISPATCH_METHOD,null,Path,Type);
  }
  @DeclDISPID(33040)  public Integer getActualWork() throws ComException {
    final Object obj = this._dispatchCall(33040,"ActualWork", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(33040)  public void setActualWork(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(33040,"ActualWork", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33067)  public String getCardData() throws ComException {
    final Object obj = this._dispatchCall(33067,"CardData", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33067)  public void setCardData(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33067,"CardData", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33052)  public Boolean getComplete() throws ComException {
    final Object obj = this._dispatchCall(33052,"Complete", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33052)  public void setComplete(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(33052,"Complete", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34108)  public String getContactNames() throws ComException {
    final Object obj = this._dispatchCall(34108,"ContactNames", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34108)  public void setContactNames(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34108,"ContactNames", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33039)  public java.util.Date getDateCompleted() throws ComException {
    final Object obj = this._dispatchCall(33039,"DateCompleted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33039)  public void setDateCompleted(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33039,"DateCompleted", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33066)  public com.wilutions.mslib.outlook.OlTaskDelegationState getDelegationState() throws ComException {
    final Object obj = this._dispatchCall(33066,"DelegationState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTaskDelegationState.valueOf((Integer)obj);
  }
  @DeclDISPID(33057)  public String getDelegator() throws ComException {
    final Object obj = this._dispatchCall(33057,"Delegator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33029)  public java.util.Date getDueDate() throws ComException {
    final Object obj = this._dispatchCall(33029,"DueDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33029)  public void setDueDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33029,"DueDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(62999)  public Boolean getIsRecurring() throws ComException {
    final Object obj = this._dispatchCall(62999,"IsRecurring", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33059)  public Integer getOrdinal() throws ComException {
    final Object obj = this._dispatchCall(33059,"Ordinal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(33059)  public void setOrdinal(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(33059,"Ordinal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33055)  public String getOwner() throws ComException {
    final Object obj = this._dispatchCall(33055,"Owner", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33055)  public void setOwner(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33055,"Owner", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33065)  public com.wilutions.mslib.outlook.OlTaskOwnership getOwnership() throws ComException {
    final Object obj = this._dispatchCall(33065,"Ownership", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTaskOwnership.valueOf((Integer)obj);
  }
  @DeclDISPID(63007)  public Integer getPercentComplete() throws ComException {
    final Object obj = this._dispatchCall(63007,"PercentComplete", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(63007)  public void setPercentComplete(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(63007,"PercentComplete", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63508)  public com.wilutions.mslib.outlook.Recipients getRecipients() throws ComException {
    final Object obj = this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
  }
  @DeclDISPID(34050)  public java.util.Date getReminderTime() throws ComException {
    final Object obj = this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(34050)  public void setReminderTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(63011)  public com.wilutions.mslib.outlook.OlTaskResponse getResponseState() throws ComException {
    final Object obj = this._dispatchCall(63011,"ResponseState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTaskResponse.valueOf((Integer)obj);
  }
  @DeclDISPID(33063)  public String getRole() throws ComException {
    final Object obj = this._dispatchCall(33063,"Role", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33063)  public void setRole(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33063,"Role", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33071)  public String getSchedulePlusPriority() throws ComException {
    final Object obj = this._dispatchCall(33071,"SchedulePlusPriority", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(33071)  public void setSchedulePlusPriority(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(33071,"SchedulePlusPriority", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33028)  public java.util.Date getStartDate() throws ComException {
    final Object obj = this._dispatchCall(33028,"StartDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33028)  public void setStartDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33028,"StartDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33025)  public com.wilutions.mslib.outlook.OlTaskStatus getStatus() throws ComException {
    final Object obj = this._dispatchCall(33025,"Status", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlTaskStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(33025)  public void setStatus(final com.wilutions.mslib.outlook.OlTaskStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(33025,"Status", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(3586)  public String getStatusOnCompletionRecipients() throws ComException {
    final Object obj = this._dispatchCall(3586,"StatusOnCompletionRecipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3586)  public void setStatusOnCompletionRecipients(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3586,"StatusOnCompletionRecipients", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3587)  public String getStatusUpdateRecipients() throws ComException {
    final Object obj = this._dispatchCall(3587,"StatusUpdateRecipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3587)  public void setStatusUpdateRecipients(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3587,"StatusUpdateRecipients", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33027)  public Boolean getTeamTask() throws ComException {
    final Object obj = this._dispatchCall(33027,"TeamTask", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(33027)  public void setTeamTask(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(33027,"TeamTask", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33041)  public Integer getTotalWork() throws ComException {
    final Object obj = this._dispatchCall(33041,"TotalWork", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(33041)  public void setTotalWork(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(33041,"TotalWork", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63008)  public com.wilutions.mslib.outlook.TaskItem Assign() throws ComException {
    final Object obj = this._dispatchCall(63008,"Assign", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.TaskItem.class);
  }
  @DeclDISPID(63010)  public void CancelResponseState() throws ComException {
    this._dispatchCall(63010,"CancelResponseState", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61605)  public void ClearRecurrencePattern() throws ComException {
    this._dispatchCall(61605,"ClearRecurrencePattern", DISPATCH_METHOD,null);
  }
  @DeclDISPID(61604)  public com.wilutions.mslib.outlook.RecurrencePattern GetRecurrencePattern() throws ComException {
    final Object obj = this._dispatchCall(61604,"GetRecurrencePattern", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecurrencePatternImpl.class);
  }
  @DeclDISPID(62989)  public void MarkComplete() throws ComException {
    this._dispatchCall(62989,"MarkComplete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(63009)  public com.wilutions.mslib.outlook.TaskItem Respond(final com.wilutions.mslib.outlook.OlTaskResponse Response, final Object fNoUI, final Object fAdditionalTextDialog) throws ComException {
    assert(Response != null);
    assert(fNoUI != null);
    assert(fAdditionalTextDialog != null);
    final Object obj = this._dispatchCall(63009,"Respond", DISPATCH_METHOD,null,Response.value,fNoUI,fAdditionalTextDialog);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.TaskItem.class);
  }
  @DeclDISPID(61557)  public void Send() throws ComException {
    this._dispatchCall(61557,"Send", DISPATCH_METHOD,null);
  }
  @DeclDISPID(63012)  public Boolean SkipRecurrence() throws ComException {
    final Object obj = this._dispatchCall(63012,"SkipRecurrence", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(62994)  public IDispatch StatusReport() throws ComException {
    final Object obj = this._dispatchCall(62994,"StatusReport", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(64077)  public com.wilutions.mslib.outlook.OlDownloadState getDownloadState() throws ComException {
    final Object obj = this._dispatchCall(64077,"DownloadState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDownloadState.valueOf((Integer)obj);
  }
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException {
    this._dispatchCall(64011,"ShowCategoriesDialog", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64009)  public com.wilutions.mslib.outlook.ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
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
  @DeclDISPID(34161)  public com.wilutions.mslib.outlook.OlRemoteStatus getMarkForDownload() throws ComException {
    final Object obj = this._dispatchCall(34161,"MarkForDownload", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlRemoteStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(34161)  public void setMarkForDownload(final com.wilutions.mslib.outlook.OlRemoteStatus value) throws ComException {
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
  @DeclDISPID(64187)  public com.wilutions.mslib.outlook.Conflicts getConflicts() throws ComException {
    final Object obj = this._dispatchCall(64187,"Conflicts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictsImpl.class);
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(64209)  public com.wilutions.mslib.outlook.Account getSendUsingAccount() throws ComException {
    final Object obj = this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Account.class);
  }
  @DeclDISPID(64209)  public void setSendUsingAccount(final com.wilutions.mslib.outlook.Account value) throws ComException {
    this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYPUT,(value!=null?value:Dispatch.NULL));
  }
  @DeclDISPID(34208)  public java.util.Date getToDoTaskOrdinal() throws ComException {
    final Object obj = this._dispatchCall(34208,"ToDoTaskOrdinal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(34208)  public void setToDoTaskOrdinal(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(34208,"ToDoTaskOrdinal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64596)  public com.wilutions.mslib.outlook._Conversation GetConversation() throws ComException {
    final Object obj = this._dispatchCall(64596,"GetConversation", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl._ConversationImpl.class);
  }
  @DeclDISPID(64629)  public String getConversationID() throws ComException {
    final Object obj = this._dispatchCall(64629,"ConversationID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
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
  public _TaskItemImpl(String progId) throws ComException {
    super(progId, "{00063035-0000-0000-C000-000000000046}");
  }
  protected _TaskItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_TaskItemImpl" + super.toString() + "]";
  }
}
