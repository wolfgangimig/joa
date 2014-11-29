/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9A1E-A463-DB41-5DAE-69E7A5F7FCBC}")
public class UserPermissionImpl extends Dispatch implements com.wilutions.mslib.office.UserPermission {
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Application", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Creator", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(0)  public String getUserId() throws ComException {
    final Object obj = this._dispatchCall(0,"UserId", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1)  public Integer getPermission() throws ComException {
    final Object obj = this._dispatchCall(1,"Permission", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Integer)obj;
  }
  @DeclDISPID(1)  public void setPermission(final Integer value) throws ComException {
    assert(value != null);
    this._dispatchCall(1,"Permission", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(2)  public Object getExpirationDate() throws ComException {
    final Object obj = this._dispatchCall(2,"ExpirationDate", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(2)  public void setExpirationDate(final Object value) throws ComException {
    assert(value != null);
    this._dispatchCall(2,"ExpirationDate", DISPATCH_PROPERTYPUT,value);
  }
  @DeclDISPID(3)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(3,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  @DeclDISPID(4)  public void Remove() throws ComException {
    this._dispatchCall(4,"Remove", DISPATCH_METHOD,null);
  }
  public UserPermissionImpl(String progId) throws ComException {
    super(progId, "{000C0375-0000-0000-C000-000000000046}");
  }
  protected UserPermissionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[UserPermissionImpl" + super.toString() + "]";
  }
}
