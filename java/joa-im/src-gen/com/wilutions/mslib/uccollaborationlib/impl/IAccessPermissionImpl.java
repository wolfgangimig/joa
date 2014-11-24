/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{1D8F87FC-4A83-9624-277F-7F61C8FB85A9}")
public class IAccessPermissionImpl extends Dispatch implements com.wilutions.mslib.uccollaborationlib.IAccessPermission {
  @DeclDISPID(1610743808)  public com.wilutions.mslib.uccollaborationlib.AccessLevel getAccessLevel() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AccessLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.uccollaborationlib.AccessLevel.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public com.wilutions.mslib.uccollaborationlib.IAccessEntry[] getAccessEntries() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AccessEntries", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (com.wilutions.mslib.uccollaborationlib.IAccessEntry[])obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetValue(com.wilutions.mslib.uccollaborationlib.AccessEntryScope _scope, String _entryId, ByRef<com.wilutions.mslib.uccollaborationlib.IAccessEntry> _accessEntry) throws ComException {
    assert(_scope != null);
    assert(_entryId != null);
    assert(_accessEntry != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetValue", DISPATCH_METHOD,null,_scope.value,_entryId,_accessEntry);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public void GetAccessEntry(com.wilutions.mslib.uccollaborationlib.AccessEntryScope _scope, String _entryId, ByRef<com.wilutions.mslib.uccollaborationlib.IAccessEntry> _accessEntry) throws ComException {
    assert(_scope != null);
    assert(_entryId != null);
    assert(_accessEntry != null);
    this._dispatchCall(1610743811,"GetAccessEntry", DISPATCH_METHOD,null,_scope.value,_entryId,_accessEntry);
  }
  public IAccessPermissionImpl(String progId) throws ComException {
    super(progId, "{DD181E97-EEE0-4D65-BAD1-16866D0C7953}");
  }
  protected IAccessPermissionImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[IAccessPermissionImpl" + super.toString() + "]";
  }
}
