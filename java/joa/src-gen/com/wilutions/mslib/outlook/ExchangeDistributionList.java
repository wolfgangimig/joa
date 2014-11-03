/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * ExchangeDistributionList.
 * 
 */
@CoClass(guid="{000610CA-0000-0000-C000-000000000046}")
public class ExchangeDistributionList extends Dispatch implements _ExchangeDistributionList {
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
  @DeclDISPID(64244)  public AddressEntries GetMemberOfList() throws ComException {
    final Object obj = this._dispatchCall(64244,"GetMemberOfList", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  @DeclDISPID(64246)  public AddressEntries GetExchangeDistributionListMembers() throws ComException {
    final Object obj = this._dispatchCall(64246,"GetExchangeDistributionListMembers", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  @DeclDISPID(14848)  public String getAlias() throws ComException {
    final Object obj = this._dispatchCall(14848,"Alias", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
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
  @DeclDISPID(64245)  public String getPrimarySmtpAddress() throws ComException {
    final Object obj = this._dispatchCall(64245,"PrimarySmtpAddress", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(64247)  public AddressEntries GetOwners() throws ComException {
    final Object obj = this._dispatchCall(64247,"GetOwners", DISPATCH_METHOD,null);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.outlook.impl.AddressEntriesImpl.class);
  }
  public ExchangeDistributionList() throws ComException {
    super("{000610CA-0000-0000-C000-000000000046}");
  }
  protected ExchangeDistributionList(long ndisp) {
    super(ndisp);
  }
  public ExchangeDistributionList(Dispatch ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[ExchangeDistributionList" + super.toString() + "]";
  }
}
