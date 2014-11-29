/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AccessEntry.
 * AccessEntry Class 
 */
@CoClass(guid="{B37552F7-36B6-4EF3-80C2-47F17957E683}")
public class AccessEntry extends Dispatch implements IAccessEntry {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public AccessEntryScope getScope() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"Scope", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return AccessEntryScope.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public String getId() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"Id", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(1610743810)  public IAccessPermission getPermission() throws ComException {
    final Object obj = this._dispatchCall(1610743810,"Permission", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return Dispatch.as(obj, com.wilutions.mslib.uccollaborationlib.impl.IAccessPermissionImpl.class);
  }
  @DeclDISPID(1610743811)  public void SetPermission(IAccessPermission _permission) throws ComException {
    this._dispatchCall(1610743811,"SetPermission", DISPATCH_METHOD,null,(_permission!=null?_permission:Dispatch.NULL));
  }
  @DeclDISPID(1610743812)  public void ClearPermission() throws ComException {
    this._dispatchCall(1610743812,"ClearPermission", DISPATCH_METHOD,null);
  }
  @DeclDISPID(1610743813)  public Boolean CanSetPermission(IAccessPermission _permission) throws ComException {
    final Object obj = this._dispatchCall(1610743813,"CanSetPermission", DISPATCH_METHOD,null,(_permission!=null?_permission:Dispatch.NULL));
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743814)  public Boolean CanClearPermission() throws ComException {
    final Object obj = this._dispatchCall(1610743814,"CanClearPermission", DISPATCH_METHOD,null);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  public AccessEntry() throws ComException {
    super("{B37552F7-36B6-4EF3-80C2-47F17957E683}", "{65B71572-5338-43C8-9E4C-F1DFC6711AD1}");
  }
  protected AccessEntry(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AccessEntry" + super.toString() + "]";
  }
}
