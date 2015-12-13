/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * SharingItem.
 * 
 */
@CoClass(guid="{00061067-0000-0000-C000-000000000046}")
public class SharingItem extends Dispatch implements _SharingItem {
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
  @DeclDISPID(64495)  public void Allow() throws ComException {
    this._dispatchCall(64495,"Allow", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64507)  public SharingItem Deny() throws ComException {
    final Object obj = this._dispatchCall(64507,"Deny", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SharingItem.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(PropertyAccessor.class);
  }
  @DeclDISPID(64490)  public String getRemoteName() throws ComException {
    final Object obj = this._dispatchCall(64490,"RemoteName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64491)  public String getRemoteID() throws ComException {
    final Object obj = this._dispatchCall(64491,"RemoteID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64492)  public String getRemotePath() throws ComException {
    final Object obj = this._dispatchCall(64492,"RemotePath", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64494)  public String getSharingProviderGuid() throws ComException {
    final Object obj = this._dispatchCall(64494,"SharingProviderGuid", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64498)  public MAPIFolder OpenSharedFolder() throws ComException {
    final Object obj = this._dispatchCall(64498,"OpenSharedFolder", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(64501)  public OlSharingProvider getSharingProvider() throws ComException {
    final Object obj = this._dispatchCall(64501,"SharingProvider", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlSharingProvider.valueOf((Integer)obj);
  }
  @DeclDISPID(64504)  public Boolean getAllowWriteAccess() throws ComException {
    final Object obj = this._dispatchCall(64504,"AllowWriteAccess", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64504)  public void setAllowWriteAccess(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(64504,"AllowWriteAccess", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64505)  public OlSharingMsgType getType() throws ComException {
    final Object obj = this._dispatchCall(64505,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlSharingMsgType.valueOf((Integer)obj);
  }
  @DeclDISPID(64505)  public void setType(final OlSharingMsgType value) throws ComException {
    assert(value != null);
    this._dispatchCall(64505,"Type", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64506)  public OlDefaultFolders getRequestedFolder() throws ComException {
    final Object obj = this._dispatchCall(64506,"RequestedFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDefaultFolders.valueOf((Integer)obj);
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
  @DeclDISPID(2)  public Boolean getAlternateRecipientAllowed() throws ComException {
    final Object obj = this._dispatchCall(2,"AlternateRecipientAllowed", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public void setAlternateRecipientAllowed(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"AlternateRecipientAllowed", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(5)  public Boolean getAutoForwarded() throws ComException {
    final Object obj = this._dispatchCall(5,"AutoForwarded", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(5)  public void setAutoForwarded(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(5,"AutoForwarded", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3586)  public String getBCC() throws ComException {
    final Object obj = this._dispatchCall(3586,"BCC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3586)  public void setBCC(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3586,"BCC", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3587)  public String getCC() throws ComException {
    final Object obj = this._dispatchCall(3587,"CC", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3587)  public void setCC(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3587,"CC", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(15)  public java.util.Date getDeferredDeliveryTime() throws ComException {
    final Object obj = this._dispatchCall(15,"DeferredDeliveryTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(15)  public void setDeferredDeliveryTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(15,"DeferredDeliveryTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3585)  public Boolean getDeleteAfterSubmit() throws ComException {
    final Object obj = this._dispatchCall(3585,"DeleteAfterSubmit", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3585)  public void setDeleteAfterSubmit(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(3585,"DeleteAfterSubmit", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(21)  public java.util.Date getExpiryTime() throws ComException {
    final Object obj = this._dispatchCall(21,"ExpiryTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(21)  public void setExpiryTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(21,"ExpiryTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34096)  public String getFlagRequest() throws ComException {
    final Object obj = this._dispatchCall(34096,"FlagRequest", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(34096)  public void setFlagRequest(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(34096,"FlagRequest", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(62468)  public String getHTMLBody() throws ComException {
    final Object obj = this._dispatchCall(62468,"HTMLBody", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(62468)  public void setHTMLBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(62468,"HTMLBody", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(35)  public Boolean getOriginatorDeliveryReportRequested() throws ComException {
    final Object obj = this._dispatchCall(35,"OriginatorDeliveryReportRequested", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(35)  public void setOriginatorDeliveryReportRequested(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(35,"OriginatorDeliveryReportRequested", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(41)  public Boolean getReadReceiptRequested() throws ComException {
    final Object obj = this._dispatchCall(41,"ReadReceiptRequested", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(41)  public void setReadReceiptRequested(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(41,"ReadReceiptRequested", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63)  public String getReceivedByEntryID() throws ComException {
    final Object obj = this._dispatchCall(63,"ReceivedByEntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64)  public String getReceivedByName() throws ComException {
    final Object obj = this._dispatchCall(64,"ReceivedByName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(67)  public String getReceivedOnBehalfOfEntryID() throws ComException {
    final Object obj = this._dispatchCall(67,"ReceivedOnBehalfOfEntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(68)  public String getReceivedOnBehalfOfName() throws ComException {
    final Object obj = this._dispatchCall(68,"ReceivedOnBehalfOfName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3590)  public java.util.Date getReceivedTime() throws ComException {
    final Object obj = this._dispatchCall(3590,"ReceivedTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(43)  public Boolean getRecipientReassignmentProhibited() throws ComException {
    final Object obj = this._dispatchCall(43,"RecipientReassignmentProhibited", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(43)  public void setRecipientReassignmentProhibited(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(43,"RecipientReassignmentProhibited", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63508)  public Recipients getRecipients() throws ComException {
    final Object obj = this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
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
  @DeclDISPID(34050)  public java.util.Date getReminderTime() throws ComException {
    final Object obj = this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(34050)  public void setReminderTime(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(34050,"ReminderTime", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(34065)  public OlRemoteStatus getRemoteStatus() throws ComException {
    final Object obj = this._dispatchCall(34065,"RemoteStatus", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlRemoteStatus.valueOf((Integer)obj);
  }
  @DeclDISPID(34065)  public void setRemoteStatus(final OlRemoteStatus value) throws ComException {
    assert(value != null);
    this._dispatchCall(34065,"RemoteStatus", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(80)  public String getReplyRecipientNames() throws ComException {
    final Object obj = this._dispatchCall(80,"ReplyRecipientNames", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61459)  public Recipients getReplyRecipients() throws ComException {
    final Object obj = this._dispatchCall(61459,"ReplyRecipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
  }
  @DeclDISPID(62465)  public MAPIFolder getSaveSentMessageFolder() throws ComException {
    final Object obj = this._dispatchCall(62465,"SaveSentMessageFolder", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.MAPIFolderImpl.class);
  }
  @DeclDISPID(62465)  public void setSaveSentMessageFolder(final MAPIFolder value) throws ComException {
    this._dispatchCall(62465,"SaveSentMessageFolder", DISPATCH_PROPERTYPUTREF,Dispatch.param(value));
  }
  @DeclDISPID(3098)  public String getSenderName() throws ComException {
    final Object obj = this._dispatchCall(3098,"SenderName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(62466)  public Boolean getSent() throws ComException {
    final Object obj = this._dispatchCall(62466,"Sent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(57)  public java.util.Date getSentOn() throws ComException {
    final Object obj = this._dispatchCall(57,"SentOn", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(66)  public String getSentOnBehalfOfName() throws ComException {
    final Object obj = this._dispatchCall(66,"SentOnBehalfOfName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(66)  public void setSentOnBehalfOfName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(66,"SentOnBehalfOfName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(62467)  public Boolean getSubmitted() throws ComException {
    final Object obj = this._dispatchCall(62467,"Submitted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(3588)  public String getTo() throws ComException {
    final Object obj = this._dispatchCall(3588,"To", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3588)  public void setTo(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(3588,"To", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63522)  public void ClearConversationIndex() throws ComException {
    this._dispatchCall(63522,"ClearConversationIndex", DISPATCH_METHOD,null);
  }
  @DeclDISPID(63507)  public SharingItem Forward() throws ComException {
    final Object obj = this._dispatchCall(63507,"Forward", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(SharingItem.class);
  }
  @DeclDISPID(63504)  public MailItem Reply() throws ComException {
    final Object obj = this._dispatchCall(63504,"Reply", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MailItem.class);
  }
  @DeclDISPID(63505)  public MailItem ReplyAll() throws ComException {
    final Object obj = this._dispatchCall(63505,"ReplyAll", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(MailItem.class);
  }
  @DeclDISPID(61557)  public void Send() throws ComException {
    this._dispatchCall(61557,"Send", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64009)  public ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(64073)  public OlBodyFormat getBodyFormat() throws ComException {
    final Object obj = this._dispatchCall(64073,"BodyFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlBodyFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(64073)  public void setBodyFormat(final OlBodyFormat value) throws ComException {
    assert(value != null);
    this._dispatchCall(64073,"BodyFormat", DISPATCH_PROPERTYPUT,value.value);
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
  @DeclDISPID(64406)  public void AddBusinessCard(final ContactItem contact) throws ComException {
    this._dispatchCall(64406,"AddBusinessCard", DISPATCH_METHOD,null,Dispatch.param(contact));
  }
  @DeclDISPID(64543)  public String getTaskSubject() throws ComException {
    final Object obj = this._dispatchCall(64543,"TaskSubject", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64543)  public void setTaskSubject(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64543,"TaskSubject", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33029)  public java.util.Date getTaskDueDate() throws ComException {
    final Object obj = this._dispatchCall(33029,"TaskDueDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33029)  public void setTaskDueDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33029,"TaskDueDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33028)  public java.util.Date getTaskStartDate() throws ComException {
    final Object obj = this._dispatchCall(33028,"TaskStartDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33028)  public void setTaskStartDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33028,"TaskStartDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(33039)  public java.util.Date getTaskCompletedDate() throws ComException {
    final Object obj = this._dispatchCall(33039,"TaskCompletedDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(33039)  public void setTaskCompletedDate(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(33039,"TaskCompletedDate", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(64187)  public Conflicts getConflicts() throws ComException {
    final Object obj = this._dispatchCall(64187,"Conflicts", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ConflictsImpl.class);
  }
  @DeclDISPID(3103)  public String getSenderEmailAddress() throws ComException {
    final Object obj = this._dispatchCall(3103,"SenderEmailAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(3102)  public String getSenderEmailType() throws ComException {
    final Object obj = this._dispatchCall(3102,"SenderEmailType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64198)  public OlPermission getPermission() throws ComException {
    final Object obj = this._dispatchCall(64198,"Permission", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlPermission.valueOf((Integer)obj);
  }
  @DeclDISPID(64198)  public void setPermission(final OlPermission value) throws ComException {
    assert(value != null);
    this._dispatchCall(64198,"Permission", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64203)  public OlPermissionService getPermissionService() throws ComException {
    final Object obj = this._dispatchCall(64203,"PermissionService", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlPermissionService.valueOf((Integer)obj);
  }
  @DeclDISPID(64203)  public void setPermissionService(final OlPermissionService value) throws ComException {
    assert(value != null);
    this._dispatchCall(64203,"PermissionService", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(64510)  public void MarkAsTask(final OlMarkInterval MarkInterval) throws ComException {
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
  @DeclDISPID(64637)  public String getPermissionTemplateGuid() throws ComException {
    final Object obj = this._dispatchCall(64637,"PermissionTemplateGuid", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64637)  public void setPermissionTemplateGuid(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64637,"PermissionTemplateGuid", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(64651)  public String getRetentionPolicyName() throws ComException {
    final Object obj = this._dispatchCall(64651,"RetentionPolicyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64650)  public java.util.Date getRetentionExpirationDate() throws ComException {
    final Object obj = this._dispatchCall(64650,"RetentionExpirationDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  public SharingItem() throws ComException {
    super("{00061067-0000-0000-C000-000000000046}", "{0006302F-0000-0000-C000-000000000046}");
  }
  protected SharingItem(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SharingItem" + super.toString() + "]";
  }
}
