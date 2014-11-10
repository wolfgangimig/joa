/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A1D-A463-DB41-5DAE-69E7A5F7FCBC}")
public class PermissionImpl extends Dispatch implements com.wilutions.mslib.office.Permission {
  @DeclDISPID(1610743808)  public Dispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public com.wilutions.mslib.office.UserPermission getItem(Object Index) throws ComException {
    assert(Index != null);
    final Object obj = this._dispatchCall(0,"Item", DISPATCH_PROPERTYGET,null,Index);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.UserPermissionImpl.class);
  }
  @DeclDISPID(1)  public Integer getCount() throws ComException {
    final Object obj = this._dispatchCall(1,"Count", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(2)  public Boolean getEnableTrustedBrowser() throws ComException {
    final Object obj = this._dispatchCall(2,"EnableTrustedBrowser", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(2)  public void setEnableTrustedBrowser(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"EnableTrustedBrowser", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public com.wilutions.mslib.office.UserPermission Add(String UserId, Object Permission, Object ExpirationDate) throws ComException {
    assert(UserId != null);
    assert(Permission != null);
    assert(ExpirationDate != null);
    final Object obj = this._dispatchCall(3,"Add", DISPATCH_METHOD,null,UserId,Permission,ExpirationDate);
    if (obj == null) return null;
    final Dispatch disp = (Dispatch)obj;
    return disp.uncheckedAs(com.wilutions.mslib.office.impl.UserPermissionImpl.class);
  }
  @DeclDISPID(4)  public void ApplyPolicy(String FileName) throws ComException {
    assert(FileName != null);
    this._dispatchCall(4,"ApplyPolicy", DISPATCH_METHOD,null,FileName);
  }
  @DeclDISPID(5)  public Dispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(5,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Dispatch)obj;
  }
  @DeclDISPID(6)  public void RemoveAll() throws ComException {
    this._dispatchCall(6,"RemoveAll", DISPATCH_METHOD,null);
  }
  @DeclDISPID(7)  public Boolean getEnabled() throws ComException {
    final Object obj = this._dispatchCall(7,"Enabled", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(7)  public void setEnabled(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(7,"Enabled", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(8)  public String getRequestPermissionURL() throws ComException {
    final Object obj = this._dispatchCall(8,"RequestPermissionURL", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(8)  public void setRequestPermissionURL(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(8,"RequestPermissionURL", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(9)  public String getPolicyName() throws ComException {
    final Object obj = this._dispatchCall(9,"PolicyName", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(10)  public String getPolicyDescription() throws ComException {
    final Object obj = this._dispatchCall(10,"PolicyDescription", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(11)  public Boolean getStoreLicenses() throws ComException {
    final Object obj = this._dispatchCall(11,"StoreLicenses", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(11)  public void setStoreLicenses(Boolean value) throws ComException {
    assert(value != null);
    this._dispatchCall(11,"StoreLicenses", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(12)  public String getDocumentAuthor() throws ComException {
    final Object obj = this._dispatchCall(12,"DocumentAuthor", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(12)  public void setDocumentAuthor(String value) throws ComException {
    assert(value != null);
    this._dispatchCall(12,"DocumentAuthor", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(13)  public Boolean getPermissionFromPolicy() throws ComException {
    final Object obj = this._dispatchCall(13,"PermissionFromPolicy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(-4)  public Object get_NewEnum() throws ComException {
    final Object obj = this._dispatchCall(-4,"_NewEnum", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  public PermissionImpl(String progId) throws ComException {
    super(progId);
  }
  protected PermissionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[PermissionImpl" + super.toString() + "]";
  }
}
