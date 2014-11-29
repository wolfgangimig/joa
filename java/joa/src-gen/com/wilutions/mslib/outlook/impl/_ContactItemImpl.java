/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C091A94A-A463-DB41-5DAE-69E7A5F7FCBC}")
public class _ContactItemImpl extends Dispatch implements com.wilutions.mslib.outlook._ContactItem {
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
  @DeclDISPID(14848)  public String getAccount() throws ComException {
    final Object obj = this._dispatchCall(14848,"Account", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14848)  public void setAccount(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14848,"Account", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14913)  public java.util.Date getAnniversary() throws ComException {
    final Object obj = this._dispatchCall(14913,"Anniversary", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(14913)  public void setAnniversary(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(14913,"Anniversary", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14896)  public String getAssistantName() throws ComException {
    final Object obj = this._dispatchCall(14896,"AssistantName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14896)  public void setAssistantName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14896,"AssistantName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14894)  public String getAssistantTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14894,"AssistantTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14894)  public void setAssistantTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14894,"AssistantTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14914)  public java.util.Date getBirthday() throws ComException {
    final Object obj = this._dispatchCall(14914,"Birthday", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (java.util.Date)obj;
  }
  @DeclDISPID(14914)  public void setBirthday(final java.util.Date value) throws ComException {
    assert(value != null);
    this._dispatchCall(14914,"Birthday", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14875)  public String getBusiness2TelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14875,"Business2TelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14875)  public void setBusiness2TelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14875,"Business2TelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32795)  public String getBusinessAddress() throws ComException {
    final Object obj = this._dispatchCall(32795,"BusinessAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32795)  public void setBusinessAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32795,"BusinessAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32838)  public String getBusinessAddressCity() throws ComException {
    final Object obj = this._dispatchCall(32838,"BusinessAddressCity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32838)  public void setBusinessAddressCity(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32838,"BusinessAddressCity", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32841)  public String getBusinessAddressCountry() throws ComException {
    final Object obj = this._dispatchCall(32841,"BusinessAddressCountry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32841)  public void setBusinessAddressCountry(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32841,"BusinessAddressCountry", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32840)  public String getBusinessAddressPostalCode() throws ComException {
    final Object obj = this._dispatchCall(32840,"BusinessAddressPostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32840)  public void setBusinessAddressPostalCode(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32840,"BusinessAddressPostalCode", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32842)  public String getBusinessAddressPostOfficeBox() throws ComException {
    final Object obj = this._dispatchCall(32842,"BusinessAddressPostOfficeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32842)  public void setBusinessAddressPostOfficeBox(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32842,"BusinessAddressPostOfficeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32839)  public String getBusinessAddressState() throws ComException {
    final Object obj = this._dispatchCall(32839,"BusinessAddressState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32839)  public void setBusinessAddressState(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32839,"BusinessAddressState", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32837)  public String getBusinessAddressStreet() throws ComException {
    final Object obj = this._dispatchCall(32837,"BusinessAddressStreet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32837)  public void setBusinessAddressStreet(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32837,"BusinessAddressStreet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14884)  public String getBusinessFaxNumber() throws ComException {
    final Object obj = this._dispatchCall(14884,"BusinessFaxNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14884)  public void setBusinessFaxNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14884,"BusinessFaxNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14929)  public String getBusinessHomePage() throws ComException {
    final Object obj = this._dispatchCall(14929,"BusinessHomePage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14929)  public void setBusinessHomePage(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14929,"BusinessHomePage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14856)  public String getBusinessTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14856,"BusinessTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14856)  public void setBusinessTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14856,"BusinessTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14850)  public String getCallbackTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14850,"CallbackTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14850)  public void setCallbackTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14850,"CallbackTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14878)  public String getCarTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14878,"CarTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14878)  public void setCarTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14878,"CarTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32780)  public String getChildren() throws ComException {
    final Object obj = this._dispatchCall(32780,"Children", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32780)  public void setChildren(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32780,"Children", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32792)  public String getCompanyAndFullName() throws ComException {
    final Object obj = this._dispatchCall(32792,"CompanyAndFullName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32818)  public String getCompanyLastFirstNoSpace() throws ComException {
    final Object obj = this._dispatchCall(32818,"CompanyLastFirstNoSpace", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32819)  public String getCompanyLastFirstSpaceOnly() throws ComException {
    final Object obj = this._dispatchCall(32819,"CompanyLastFirstSpaceOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14935)  public String getCompanyMainTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14935,"CompanyMainTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14935)  public void setCompanyMainTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14935,"CompanyMainTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14870)  public String getCompanyName() throws ComException {
    final Object obj = this._dispatchCall(14870,"CompanyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14870)  public void setCompanyName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14870,"CompanyName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14921)  public String getComputerNetworkName() throws ComException {
    final Object obj = this._dispatchCall(14921,"ComputerNetworkName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14921)  public void setComputerNetworkName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14921,"ComputerNetworkName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14922)  public String getCustomerID() throws ComException {
    final Object obj = this._dispatchCall(14922,"CustomerID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14922)  public void setCustomerID(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14922,"CustomerID", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14872)  public String getDepartment() throws ComException {
    final Object obj = this._dispatchCall(14872,"Department", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14872)  public void setDepartment(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14872,"Department", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32899)  public String getEmail1Address() throws ComException {
    final Object obj = this._dispatchCall(32899,"Email1Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32899)  public void setEmail1Address(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32899,"Email1Address", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32898)  public String getEmail1AddressType() throws ComException {
    final Object obj = this._dispatchCall(32898,"Email1AddressType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32898)  public void setEmail1AddressType(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32898,"Email1AddressType", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32896)  public String getEmail1DisplayName() throws ComException {
    final Object obj = this._dispatchCall(32896,"Email1DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32901)  public String getEmail1EntryID() throws ComException {
    final Object obj = this._dispatchCall(32901,"Email1EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32915)  public String getEmail2Address() throws ComException {
    final Object obj = this._dispatchCall(32915,"Email2Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32915)  public void setEmail2Address(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32915,"Email2Address", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32914)  public String getEmail2AddressType() throws ComException {
    final Object obj = this._dispatchCall(32914,"Email2AddressType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32914)  public void setEmail2AddressType(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32914,"Email2AddressType", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32912)  public String getEmail2DisplayName() throws ComException {
    final Object obj = this._dispatchCall(32912,"Email2DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32917)  public String getEmail2EntryID() throws ComException {
    final Object obj = this._dispatchCall(32917,"Email2EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32931)  public String getEmail3Address() throws ComException {
    final Object obj = this._dispatchCall(32931,"Email3Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32931)  public void setEmail3Address(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32931,"Email3Address", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32930)  public String getEmail3AddressType() throws ComException {
    final Object obj = this._dispatchCall(32930,"Email3AddressType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32930)  public void setEmail3AddressType(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32930,"Email3AddressType", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32928)  public String getEmail3DisplayName() throws ComException {
    final Object obj = this._dispatchCall(32928,"Email3DisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32933)  public String getEmail3EntryID() throws ComException {
    final Object obj = this._dispatchCall(32933,"Email3EntryID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32773)  public String getFileAs() throws ComException {
    final Object obj = this._dispatchCall(32773,"FileAs", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32773)  public void setFileAs(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32773,"FileAs", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14854)  public String getFirstName() throws ComException {
    final Object obj = this._dispatchCall(14854,"FirstName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14854)  public void setFirstName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14854,"FirstName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14924)  public String getFTPSite() throws ComException {
    final Object obj = this._dispatchCall(14924,"FTPSite", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14924)  public void setFTPSite(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14924,"FTPSite", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12289)  public String getFullName() throws ComException {
    final Object obj = this._dispatchCall(12289,"FullName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setFullName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"FullName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32793)  public String getFullNameAndCompany() throws ComException {
    final Object obj = this._dispatchCall(32793,"FullNameAndCompany", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14925)  public com.wilutions.mslib.outlook.OlGender getGender() throws ComException {
    final Object obj = this._dispatchCall(14925,"Gender", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlGender.valueOf((Integer)obj);
  }
  @DeclDISPID(14925)  public void setGender(final com.wilutions.mslib.outlook.OlGender value) throws ComException {
    assert(value != null);
    this._dispatchCall(14925,"Gender", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(14855)  public String getGovernmentIDNumber() throws ComException {
    final Object obj = this._dispatchCall(14855,"GovernmentIDNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14855)  public void setGovernmentIDNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14855,"GovernmentIDNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14915)  public String getHobby() throws ComException {
    final Object obj = this._dispatchCall(14915,"Hobby", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14915)  public void setHobby(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14915,"Hobby", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14895)  public String getHome2TelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14895,"Home2TelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14895)  public void setHome2TelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14895,"Home2TelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32794)  public String getHomeAddress() throws ComException {
    final Object obj = this._dispatchCall(32794,"HomeAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32794)  public void setHomeAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32794,"HomeAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14937)  public String getHomeAddressCity() throws ComException {
    final Object obj = this._dispatchCall(14937,"HomeAddressCity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14937)  public void setHomeAddressCity(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14937,"HomeAddressCity", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14938)  public String getHomeAddressCountry() throws ComException {
    final Object obj = this._dispatchCall(14938,"HomeAddressCountry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14938)  public void setHomeAddressCountry(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14938,"HomeAddressCountry", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14939)  public String getHomeAddressPostalCode() throws ComException {
    final Object obj = this._dispatchCall(14939,"HomeAddressPostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14939)  public void setHomeAddressPostalCode(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14939,"HomeAddressPostalCode", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14942)  public String getHomeAddressPostOfficeBox() throws ComException {
    final Object obj = this._dispatchCall(14942,"HomeAddressPostOfficeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14942)  public void setHomeAddressPostOfficeBox(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14942,"HomeAddressPostOfficeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14940)  public String getHomeAddressState() throws ComException {
    final Object obj = this._dispatchCall(14940,"HomeAddressState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14940)  public void setHomeAddressState(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14940,"HomeAddressState", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14941)  public String getHomeAddressStreet() throws ComException {
    final Object obj = this._dispatchCall(14941,"HomeAddressStreet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14941)  public void setHomeAddressStreet(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14941,"HomeAddressStreet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14885)  public String getHomeFaxNumber() throws ComException {
    final Object obj = this._dispatchCall(14885,"HomeFaxNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14885)  public void setHomeFaxNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14885,"HomeFaxNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14857)  public String getHomeTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14857,"HomeTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14857)  public void setHomeTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14857,"HomeTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14858)  public String getInitials() throws ComException {
    final Object obj = this._dispatchCall(14858,"Initials", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14858)  public void setInitials(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14858,"Initials", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32984)  public String getInternetFreeBusyAddress() throws ComException {
    final Object obj = this._dispatchCall(32984,"InternetFreeBusyAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32984)  public void setInternetFreeBusyAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32984,"InternetFreeBusyAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14893)  public String getISDNNumber() throws ComException {
    final Object obj = this._dispatchCall(14893,"ISDNNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14893)  public void setISDNNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14893,"ISDNNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14871)  public String getJobTitle() throws ComException {
    final Object obj = this._dispatchCall(14871,"JobTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14871)  public void setJobTitle(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14871,"JobTitle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32805)  public Boolean getJournal() throws ComException {
    final Object obj = this._dispatchCall(32805,"Journal", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(32805)  public void setJournal(final Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(32805,"Journal", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14860)  public String getLanguage() throws ComException {
    final Object obj = this._dispatchCall(14860,"Language", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14860)  public void setLanguage(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14860,"Language", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32822)  public String getLastFirstAndSuffix() throws ComException {
    final Object obj = this._dispatchCall(32822,"LastFirstAndSuffix", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32816)  public String getLastFirstNoSpace() throws ComException {
    final Object obj = this._dispatchCall(32816,"LastFirstNoSpace", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32820)  public String getLastFirstNoSpaceCompany() throws ComException {
    final Object obj = this._dispatchCall(32820,"LastFirstNoSpaceCompany", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32817)  public String getLastFirstSpaceOnly() throws ComException {
    final Object obj = this._dispatchCall(32817,"LastFirstSpaceOnly", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32821)  public String getLastFirstSpaceOnlyCompany() throws ComException {
    final Object obj = this._dispatchCall(32821,"LastFirstSpaceOnlyCompany", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14865)  public String getLastName() throws ComException {
    final Object obj = this._dispatchCall(14865,"LastName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14865)  public void setLastName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14865,"LastName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32791)  public String getLastNameAndFirstName() throws ComException {
    final Object obj = this._dispatchCall(32791,"LastNameAndFirstName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14869)  public String getMailingAddress() throws ComException {
    final Object obj = this._dispatchCall(14869,"MailingAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14869)  public void setMailingAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14869,"MailingAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14887)  public String getMailingAddressCity() throws ComException {
    final Object obj = this._dispatchCall(14887,"MailingAddressCity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14887)  public void setMailingAddressCity(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14887,"MailingAddressCity", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14886)  public String getMailingAddressCountry() throws ComException {
    final Object obj = this._dispatchCall(14886,"MailingAddressCountry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14886)  public void setMailingAddressCountry(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14886,"MailingAddressCountry", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14890)  public String getMailingAddressPostalCode() throws ComException {
    final Object obj = this._dispatchCall(14890,"MailingAddressPostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14890)  public void setMailingAddressPostalCode(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14890,"MailingAddressPostalCode", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14891)  public String getMailingAddressPostOfficeBox() throws ComException {
    final Object obj = this._dispatchCall(14891,"MailingAddressPostOfficeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14891)  public void setMailingAddressPostOfficeBox(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14891,"MailingAddressPostOfficeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14888)  public String getMailingAddressState() throws ComException {
    final Object obj = this._dispatchCall(14888,"MailingAddressState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14888)  public void setMailingAddressState(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14888,"MailingAddressState", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14889)  public String getMailingAddressStreet() throws ComException {
    final Object obj = this._dispatchCall(14889,"MailingAddressStreet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14889)  public void setMailingAddressStreet(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14889,"MailingAddressStreet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14926)  public String getManagerName() throws ComException {
    final Object obj = this._dispatchCall(14926,"ManagerName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14926)  public void setManagerName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14926,"ManagerName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14916)  public String getMiddleName() throws ComException {
    final Object obj = this._dispatchCall(14916,"MiddleName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14916)  public void setMiddleName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14916,"MiddleName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14876)  public String getMobileTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14876,"MobileTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14876)  public void setMobileTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14876,"MobileTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32863)  public String getNetMeetingAlias() throws ComException {
    final Object obj = this._dispatchCall(32863,"NetMeetingAlias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32863)  public void setNetMeetingAlias(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32863,"NetMeetingAlias", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32864)  public String getNetMeetingServer() throws ComException {
    final Object obj = this._dispatchCall(32864,"NetMeetingServer", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32864)  public void setNetMeetingServer(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32864,"NetMeetingServer", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14927)  public String getNickName() throws ComException {
    final Object obj = this._dispatchCall(14927,"NickName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14927)  public void setNickName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14927,"NickName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14873)  public String getOfficeLocation() throws ComException {
    final Object obj = this._dispatchCall(14873,"OfficeLocation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14873)  public void setOfficeLocation(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14873,"OfficeLocation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14864)  public String getOrganizationalIDNumber() throws ComException {
    final Object obj = this._dispatchCall(14864,"OrganizationalIDNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14864)  public void setOrganizationalIDNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14864,"OrganizationalIDNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32796)  public String getOtherAddress() throws ComException {
    final Object obj = this._dispatchCall(32796,"OtherAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32796)  public void setOtherAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32796,"OtherAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14943)  public String getOtherAddressCity() throws ComException {
    final Object obj = this._dispatchCall(14943,"OtherAddressCity", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14943)  public void setOtherAddressCity(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14943,"OtherAddressCity", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14944)  public String getOtherAddressCountry() throws ComException {
    final Object obj = this._dispatchCall(14944,"OtherAddressCountry", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14944)  public void setOtherAddressCountry(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14944,"OtherAddressCountry", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14945)  public String getOtherAddressPostalCode() throws ComException {
    final Object obj = this._dispatchCall(14945,"OtherAddressPostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14945)  public void setOtherAddressPostalCode(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14945,"OtherAddressPostalCode", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14948)  public String getOtherAddressPostOfficeBox() throws ComException {
    final Object obj = this._dispatchCall(14948,"OtherAddressPostOfficeBox", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14948)  public void setOtherAddressPostOfficeBox(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14948,"OtherAddressPostOfficeBox", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14946)  public String getOtherAddressState() throws ComException {
    final Object obj = this._dispatchCall(14946,"OtherAddressState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14946)  public void setOtherAddressState(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14946,"OtherAddressState", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14947)  public String getOtherAddressStreet() throws ComException {
    final Object obj = this._dispatchCall(14947,"OtherAddressStreet", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14947)  public void setOtherAddressStreet(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14947,"OtherAddressStreet", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14883)  public String getOtherFaxNumber() throws ComException {
    final Object obj = this._dispatchCall(14883,"OtherFaxNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14883)  public void setOtherFaxNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14883,"OtherFaxNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14879)  public String getOtherTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14879,"OtherTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14879)  public void setOtherTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14879,"OtherTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14881)  public String getPagerNumber() throws ComException {
    final Object obj = this._dispatchCall(14881,"PagerNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14881)  public void setPagerNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14881,"PagerNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14928)  public String getPersonalHomePage() throws ComException {
    final Object obj = this._dispatchCall(14928,"PersonalHomePage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14928)  public void setPersonalHomePage(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14928,"PersonalHomePage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14874)  public String getPrimaryTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14874,"PrimaryTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14874)  public void setPrimaryTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14874,"PrimaryTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14918)  public String getProfession() throws ComException {
    final Object obj = this._dispatchCall(14918,"Profession", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14918)  public void setProfession(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14918,"Profession", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14877)  public String getRadioTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14877,"RadioTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14877)  public void setRadioTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14877,"RadioTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14919)  public String getReferredBy() throws ComException {
    final Object obj = this._dispatchCall(14919,"ReferredBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14919)  public void setReferredBy(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14919,"ReferredBy", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32802)  public com.wilutions.mslib.outlook.OlMailingAddress getSelectedMailingAddress() throws ComException {
    final Object obj = this._dispatchCall(32802,"SelectedMailingAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlMailingAddress.valueOf((Integer)obj);
  }
  @DeclDISPID(32802)  public void setSelectedMailingAddress(final com.wilutions.mslib.outlook.OlMailingAddress value) throws ComException {
    assert(value != null);
    this._dispatchCall(32802,"SelectedMailingAddress", DISPATCH_PROPERTYPUT,value.value);
  }
  @DeclDISPID(14920)  public String getSpouse() throws ComException {
    final Object obj = this._dispatchCall(14920,"Spouse", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14920)  public void setSpouse(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14920,"Spouse", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14853)  public String getSuffix() throws ComException {
    final Object obj = this._dispatchCall(14853,"Suffix", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14853)  public void setSuffix(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14853,"Suffix", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14892)  public String getTelexNumber() throws ComException {
    final Object obj = this._dispatchCall(14892,"TelexNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14892)  public void setTelexNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14892,"TelexNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14917)  public String getTitle() throws ComException {
    final Object obj = this._dispatchCall(14917,"Title", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14917)  public void setTitle(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14917,"Title", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14923)  public String getTTYTDDTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14923,"TTYTDDTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14923)  public void setTTYTDDTelephoneNumber(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14923,"TTYTDDTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32847)  public String getUser1() throws ComException {
    final Object obj = this._dispatchCall(32847,"User1", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32847)  public void setUser1(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32847,"User1", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32848)  public String getUser2() throws ComException {
    final Object obj = this._dispatchCall(32848,"User2", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32848)  public void setUser2(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32848,"User2", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32849)  public String getUser3() throws ComException {
    final Object obj = this._dispatchCall(32849,"User3", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32849)  public void setUser3(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32849,"User3", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32850)  public String getUser4() throws ComException {
    final Object obj = this._dispatchCall(32850,"User4", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32850)  public void setUser4(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32850,"User4", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32811)  public String getWebPage() throws ComException {
    final Object obj = this._dispatchCall(32811,"WebPage", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32811)  public void setWebPage(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32811,"WebPage", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32814)  public String getYomiCompanyName() throws ComException {
    final Object obj = this._dispatchCall(32814,"YomiCompanyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32814)  public void setYomiCompanyName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32814,"YomiCompanyName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32812)  public String getYomiFirstName() throws ComException {
    final Object obj = this._dispatchCall(32812,"YomiFirstName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32812)  public void setYomiFirstName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32812,"YomiFirstName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32813)  public String getYomiLastName() throws ComException {
    final Object obj = this._dispatchCall(32813,"YomiLastName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32813)  public void setYomiLastName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32813,"YomiLastName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(63649)  public com.wilutions.mslib.outlook.MailItem ForwardAsVcard() throws ComException {
    final Object obj = this._dispatchCall(63649,"ForwardAsVcard", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.MailItem.class);
  }
  @DeclDISPID(64009)  public com.wilutions.mslib.outlook.ItemProperties getItemProperties() throws ComException {
    final Object obj = this._dispatchCall(64009,"ItemProperties", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.outlook.impl.ItemPropertiesImpl.class);
  }
  @DeclDISPID(32824)  public String getLastFirstNoSpaceAndSuffix() throws ComException {
    final Object obj = this._dispatchCall(32824,"LastFirstNoSpaceAndSuffix", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64077)  public com.wilutions.mslib.outlook.OlDownloadState getDownloadState() throws ComException {
    final Object obj = this._dispatchCall(64077,"DownloadState", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlDownloadState.valueOf((Integer)obj);
  }
  @DeclDISPID(64011)  public void ShowCategoriesDialog() throws ComException {
    this._dispatchCall(64011,"ShowCategoriesDialog", DISPATCH_METHOD,null);
  }
  @DeclDISPID(32866)  public String getIMAddress() throws ComException {
    final Object obj = this._dispatchCall(32866,"IMAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32866)  public void setIMAddress(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32866,"IMAddress", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(32896)  public void setEmail1DisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32896,"Email1DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32912)  public void setEmail2DisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32912,"Email2DisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32928)  public void setEmail3DisplayName(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32928,"Email3DisplayName", DISPATCH_PROPERTYPUT,value);
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
  @DeclDISPID(64189)  public void AddPicture(final String Path) throws ComException {
    assert(Path != null);
    this._dispatchCall(64189,"AddPicture", DISPATCH_METHOD,null,Path);
  }
  @DeclDISPID(64190)  public void RemovePicture() throws ComException {
    this._dispatchCall(64190,"RemovePicture", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64191)  public Boolean getHasPicture() throws ComException {
    final Object obj = this._dispatchCall(64191,"HasPicture", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(64253)  public com.wilutions.mslib.outlook.PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.PropertyAccessor.class);
  }
  @DeclDISPID(64404)  public com.wilutions.mslib.outlook.MailItem ForwardAsBusinessCard() throws ComException {
    final Object obj = this._dispatchCall(64404,"ForwardAsBusinessCard", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.as(com.wilutions.mslib.outlook.MailItem.class);
  }
  @DeclDISPID(64405)  public void ShowBusinessCardEditor() throws ComException {
    this._dispatchCall(64405,"ShowBusinessCardEditor", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64407)  public void SaveBusinessCardImage(final String Path) throws ComException {
    assert(Path != null);
    this._dispatchCall(64407,"SaveBusinessCardImage", DISPATCH_METHOD,null,Path);
  }
  @DeclDISPID(64471)  public void ShowCheckPhoneDialog(final com.wilutions.mslib.outlook.OlContactPhoneNumber PhoneNumber) throws ComException {
    assert(PhoneNumber != null);
    this._dispatchCall(64471,"ShowCheckPhoneDialog", DISPATCH_METHOD,null,PhoneNumber.value);
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
  @DeclDISPID(64510)  public void MarkAsTask(final com.wilutions.mslib.outlook.OlMarkInterval MarkInterval) throws ComException {
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
  @DeclDISPID(64525)  public String getBusinessCardLayoutXml() throws ComException {
    final Object obj = this._dispatchCall(64525,"BusinessCardLayoutXml", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64525)  public void setBusinessCardLayoutXml(final String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64525,"BusinessCardLayoutXml", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64526)  public void ResetBusinessCard() throws ComException {
    this._dispatchCall(64526,"ResetBusinessCard", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64527)  public void AddBusinessCardLogoPicture(final String Path) throws ComException {
    assert(Path != null);
    this._dispatchCall(64527,"AddBusinessCardLogoPicture", DISPATCH_METHOD,null,Path);
  }
  @DeclDISPID(64528)  public com.wilutions.mslib.outlook.OlBusinessCardType getBusinessCardType() throws ComException {
    final Object obj = this._dispatchCall(64528,"BusinessCardType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.outlook.OlBusinessCardType.valueOf((Integer)obj);
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
  @DeclDISPID(64657)  public void ShowCheckFullNameDialog() throws ComException {
    this._dispatchCall(64657,"ShowCheckFullNameDialog", DISPATCH_METHOD,null);
  }
  @DeclDISPID(64656)  public void ShowCheckAddressDialog(final com.wilutions.mslib.outlook.OlMailingAddress MailingAddress) throws ComException {
    assert(MailingAddress != null);
    this._dispatchCall(64656,"ShowCheckAddressDialog", DISPATCH_METHOD,null,MailingAddress.value);
  }
  public _ContactItemImpl(String progId) throws ComException {
    super(progId, "{00063021-0000-0000-C000-000000000046}");
  }
  protected _ContactItemImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[_ContactItemImpl" + super.toString() + "]";
  }
}
