/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ExchangeUser.
 * 
 */
@CoClass(guid="{000610C9-0000-0000-C000-000000000046}")
public class ExchangeUser extends Dispatch implements _ExchangeUser {
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
  @DeclDISPID(12291)  public String getAddress() throws ComException {
    final Object obj = this._dispatchCall(12291,"Address", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12291)  public void setAddress(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12291,"Address", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14592)  public OlDisplayType getDisplayType() throws ComException {
    final Object obj = this._dispatchCall(14592,"DisplayType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlDisplayType.valueOf((Integer)obj);
  }
  @DeclDISPID(61470)  public String getID() throws ComException {
    final Object obj = this._dispatchCall(61470,"ID", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public String getName() throws ComException {
    final Object obj = this._dispatchCall(12289,"Name", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12289)  public void setName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12289,"Name", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12290)  public String getType() throws ComException {
    final Object obj = this._dispatchCall(12290,"Type", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12290)  public void setType(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12290,"Type", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(770)  public void Delete() throws ComException {
    this._dispatchCall(770,"Delete", DISPATCH_METHOD,null);
  }
  @DeclDISPID(769)  public void Details(Object HWnd) throws ComException {
    assert(HWnd != null);
    this._dispatchCall(769,"Details", DISPATCH_METHOD,null,HWnd);
  }
  @DeclDISPID(774)  public String GetFreeBusy(java.util.Date Start, Integer MinPerChar, Object CompleteFormat) throws ComException {
    assert(Start != null);
    assert(MinPerChar != null);
    assert(CompleteFormat != null);
    final Object obj = this._dispatchCall(774,"GetFreeBusy", DISPATCH_METHOD,null,Start,MinPerChar,CompleteFormat);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(768)  public void Update(Object MakePermanent, Object Refresh) throws ComException {
    assert(MakePermanent != null);
    assert(Refresh != null);
    this._dispatchCall(768,"Update", DISPATCH_METHOD,null,MakePermanent,Refresh);
  }
  @DeclDISPID(64240)  public _ContactItem GetContact() throws ComException {
    final Object obj = this._dispatchCall(64240,"GetContact", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl._ContactItemImpl.class);
  }
  @DeclDISPID(64241)  public ExchangeUser GetExchangeUser() throws ComException {
    final Object obj = this._dispatchCall(64241,"GetExchangeUser", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ExchangeUser.class);
  }
  @DeclDISPID(64242)  public OlAddressEntryUserType getAddressEntryUserType() throws ComException {
    final Object obj = this._dispatchCall(64242,"AddressEntryUserType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return OlAddressEntryUserType.valueOf((Integer)obj);
  }
  @DeclDISPID(64239)  public ExchangeDistributionList GetExchangeDistributionList() throws ComException {
    final Object obj = this._dispatchCall(64239,"GetExchangeDistributionList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ExchangeDistributionList.class);
  }
  @DeclDISPID(64253)  public PropertyAccessor getPropertyAccessor() throws ComException {
    final Object obj = this._dispatchCall(64253,"PropertyAccessor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(PropertyAccessor.class);
  }
  @DeclDISPID(64243)  public AddressEntries GetDirectReports() throws ComException {
    final Object obj = this._dispatchCall(64243,"GetDirectReports", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  @DeclDISPID(64244)  public AddressEntries GetMemberOfList() throws ComException {
    final Object obj = this._dispatchCall(64244,"GetMemberOfList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  @DeclDISPID(14848)  public String getAlias() throws ComException {
    final Object obj = this._dispatchCall(14848,"Alias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14896)  public String getAssistantName() throws ComException {
    final Object obj = this._dispatchCall(14896,"AssistantName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14896)  public void setAssistantName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14896,"AssistantName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14856)  public String getBusinessTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14856,"BusinessTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14856)  public void setBusinessTelephoneNumber(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14856,"BusinessTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14887)  public String getCity() throws ComException {
    final Object obj = this._dispatchCall(14887,"City", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14887)  public void setCity(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14887,"City", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12292)  public String getComments() throws ComException {
    final Object obj = this._dispatchCall(12292,"Comments", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12292)  public void setComments(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12292,"Comments", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14870)  public String getCompanyName() throws ComException {
    final Object obj = this._dispatchCall(14870,"CompanyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14870)  public void setCompanyName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14870,"CompanyName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14872)  public String getDepartment() throws ComException {
    final Object obj = this._dispatchCall(14872,"Department", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14872)  public void setDepartment(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14872,"Department", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14854)  public String getFirstName() throws ComException {
    final Object obj = this._dispatchCall(14854,"FirstName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14854)  public void setFirstName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14854,"FirstName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14871)  public String getJobTitle() throws ComException {
    final Object obj = this._dispatchCall(14871,"JobTitle", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14871)  public void setJobTitle(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14871,"JobTitle", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14865)  public String getLastName() throws ComException {
    final Object obj = this._dispatchCall(14865,"LastName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14865)  public void setLastName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14865,"LastName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14876)  public String getMobileTelephoneNumber() throws ComException {
    final Object obj = this._dispatchCall(14876,"MobileTelephoneNumber", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14876)  public void setMobileTelephoneNumber(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14876,"MobileTelephoneNumber", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14873)  public String getOfficeLocation() throws ComException {
    final Object obj = this._dispatchCall(14873,"OfficeLocation", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14873)  public void setOfficeLocation(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14873,"OfficeLocation", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14890)  public String getPostalCode() throws ComException {
    final Object obj = this._dispatchCall(14890,"PostalCode", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14890)  public void setPostalCode(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14890,"PostalCode", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64245)  public String getPrimarySmtpAddress() throws ComException {
    final Object obj = this._dispatchCall(64245,"PrimarySmtpAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14888)  public String getStateOrProvince() throws ComException {
    final Object obj = this._dispatchCall(14888,"StateOrProvince", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14888)  public void setStateOrProvince(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14888,"StateOrProvince", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(14889)  public String getStreetAddress() throws ComException {
    final Object obj = this._dispatchCall(14889,"StreetAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(14889)  public void setStreetAddress(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(14889,"StreetAddress", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64249)  public ExchangeUser GetExchangeUserManager() throws ComException {
    final Object obj = this._dispatchCall(64249,"GetExchangeUserManager", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(ExchangeUser.class);
  }
  @DeclDISPID(32814)  public String getYomiCompanyName() throws ComException {
    final Object obj = this._dispatchCall(32814,"YomiCompanyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32814)  public void setYomiCompanyName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32814,"YomiCompanyName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32812)  public String getYomiFirstName() throws ComException {
    final Object obj = this._dispatchCall(32812,"YomiFirstName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32812)  public void setYomiFirstName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32812,"YomiFirstName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(32813)  public String getYomiLastName() throws ComException {
    final Object obj = this._dispatchCall(32813,"YomiLastName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(32813)  public void setYomiLastName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(32813,"YomiLastName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64487)  public String getYomiDisplayName() throws ComException {
    final Object obj = this._dispatchCall(64487,"YomiDisplayName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64487)  public void setYomiDisplayName(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64487,"YomiDisplayName", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64488)  public String getYomiDepartment() throws ComException {
    final Object obj = this._dispatchCall(64488,"YomiDepartment", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64488)  public void setYomiDepartment(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(64488,"YomiDepartment", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(64631)  public com.wilutions.mslib.stdole.Picture GetPicture() throws ComException {
    final Object obj = this._dispatchCall(64631,"GetPicture", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.stdole.impl.PictureImpl.class);
  }
  public ExchangeUser() throws ComException {
    super("{000610C9-0000-0000-C000-000000000046}");
  }
  protected ExchangeUser(long ndisp) {
    super(ndisp);
  }
  public ExchangeUser(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ExchangeUser" + super.toString() + "]";
  }
}
