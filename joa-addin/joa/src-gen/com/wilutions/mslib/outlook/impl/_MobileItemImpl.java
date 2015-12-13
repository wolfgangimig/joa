/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A995-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _MobileItemImpl extends Dispatch implements com.wilutions.mslib.outlook._MobileItem {
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
  @DeclDISPID(64587)  public String getBody() throws ComException {
    final Object obj = this._dispatchCall(64587,"Body", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64587)  public void setBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64587,"Body", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(64599)  public Integer getSize() throws ComException {
    final Object obj = this._dispatchCall(64599,"Size", DISPATCH_PROPERTYGET,null);
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
    this._dispatchCall(61606,"Display", DISPATCH_METHOD,null,Variant.param(Modal));
  }
  @DeclDISPID(61492)  public IDispatch Move(final com.wilutions.mslib.outlook.MAPIFolder DestFldr) throws ComException {
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
  @DeclDISPID(62468)  public String getHTMLBody() throws ComException {
    final Object obj = this._dispatchCall(62468,"HTMLBody", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(62468)  public void setHTMLBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(62468,"HTMLBody", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64588)  public com.wilutions.mslib.outlook.OlMobileFormat getMobileFormat() throws ComException {
    final Object obj = this._dispatchCall(64588,"MobileFormat", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMobileFormat.valueOf((Integer)obj);
  }
  @DeclDISPID(64589)  public String getSMILBody() throws ComException {
    final Object obj = this._dispatchCall(64589,"SMILBody", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64589)  public void setSMILBody(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64589,"SMILBody", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63504)  public com.wilutions.mslib.outlook.MobileItem Reply() throws ComException {
    final Object obj = this._dispatchCall(63504,"Reply", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.MobileItem.class);
  }
  @DeclDISPID(63505)  public com.wilutions.mslib.outlook.MobileItem ReplyAll() throws ComException {
    final Object obj = this._dispatchCall(63505,"ReplyAll", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.MobileItem.class);
  }
  @DeclDISPID(64597)  public void Send(final Boolean ForceSend) throws ComException {
    assert(ForceSend != null);
    this._dispatchCall(64597,"Send", DISPATCH_METHOD,null,ForceSend);
  }
  @DeclDISPID(63508)  public com.wilutions.mslib.outlook.Recipients getRecipients() throws ComException {
    final Object obj = this._dispatchCall(63508,"Recipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
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
  @DeclDISPID(63507)  public com.wilutions.mslib.outlook.MobileItem Forward() throws ComException {
    final Object obj = this._dispatchCall(63507,"Forward", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.MobileItem.class);
  }
  @DeclDISPID(80)  public String getReplyRecipientNames() throws ComException {
    final Object obj = this._dispatchCall(80,"ReplyRecipientNames", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(61459)  public com.wilutions.mslib.outlook.Recipients getReplyRecipients() throws ComException {
    final Object obj = this._dispatchCall(61459,"ReplyRecipients", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.RecipientsImpl.class);
  }
  @DeclDISPID(64598)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(64598,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(62467)  public Boolean getSubmitted() throws ComException {
    final Object obj = this._dispatchCall(62467,"Submitted", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64009)  public com.wilutions.mslib.outlook.ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(3590)  public java.util.Date getReceivedTime() throws ComException {
    final Object obj = this._dispatchCall(3590,"ReceivedTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(64209)  public com.wilutions.mslib.outlook.Account getSendUsingAccount() throws ComException {
    final Object obj = this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.Account.class);
  }
  @DeclDISPID(64209)  public void setSendUsingAccount(final com.wilutions.mslib.outlook.Account value) throws ComException {
    this._dispatchCall(64209,"SendUsingAccount", DISPATCH_PROPERTYPUT,Dispatch.param(value));
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
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
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
  @DeclDISPID(3098)  public String getSenderName() throws ComException {
    final Object obj = this._dispatchCall(3098,"SenderName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  public _MobileItemImpl(String progId) throws ComException {
    super(progId, "{000630FE-0000-0000-C000-000000000046}");
  }
  protected _MobileItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_MobileItemImpl" + super.toString() + "]";
  }
}
