/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{A5208C19-F75B-9889-03E2-98386386E62B}")
public class IAccessEntryImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAccessEntry {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.AccessEntryScope getScope() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Scope", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.AccessEntryScope.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public com.wilutions.mslib.uccollaborationlib.IAccessPermission getPermission() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Permission", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAccessPermissionImpl.class);
  }
  @DeclDISPID(1610743811)  public void SetPermission(final com.wilutions.mslib.uccollaborationlib.IAccessPermission _permission) throws ComException {
    this._dispatchCall(1610743811,"SetPermission", DISPATCH_METHOD,null,(_permission!=null?_permission:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public void ClearPermission() throws ComException {
    this._dispatchCall(1610743812,"ClearPermission", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public Boolean CanSetPermission(final com.wilutions.mslib.uccollaborationlib.IAccessPermission _permission) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"CanSetPermission", DISPATCH_METHOD,null,(_permission!=null?_permission:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743814)  public Boolean CanClearPermission() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"CanClearPermission", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public IAccessEntryImpl(String progId) throws ComException {
    super(progId, "{65B71572-5338-43C8-9E4C-F1DFC6711AD1}");
  }
  protected IAccessEntryImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAccessEntryImpl" + super.toString() + "]";
  }
}
