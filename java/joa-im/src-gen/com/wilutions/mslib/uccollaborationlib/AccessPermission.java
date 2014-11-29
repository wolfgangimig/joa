/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AccessPermission.
 * AccessPermission Class 
 */
@CoClass(guid="{19CC2B4B-2489-450C-9708-A6C28282AA76}")
public class AccessPermission extends Dispatch implements IAccessPermission {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public AccessLevel getAccessLevel() throws ComException {
    final Object obj = this._dispatchCall(1610743808,"AccessLevel", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return AccessLevel.valueOf((Integer)obj);
  }
  @DeclDISPID(1610743809)  public IAccessEntry[] getAccessEntries() throws ComException {
    final Object obj = this._dispatchCall(1610743809,"AccessEntries", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IAccessEntry[])obj;
  }
  @DeclDISPID(1610743810)  public Boolean TryGetValue(final AccessEntryScope _scope, final String _entryId, final ByRef<IAccessEntry> _accessEntry) throws ComException {
    assert(_scope != null);
    assert(_entryId != null);
    assert(_accessEntry != null);
    final Object obj = this._dispatchCall(1610743810,"TryGetValue", DISPATCH_METHOD,null,_scope.value,_entryId,_accessEntry);
    if (obj == null) return null;
    return (Boolean)obj;
  }
  @DeclDISPID(1610743811)  public void GetAccessEntry(final AccessEntryScope _scope, final String _entryId, final ByRef<IAccessEntry> _accessEntry) throws ComException {
    assert(_scope != null);
    assert(_entryId != null);
    assert(_accessEntry != null);
    this._dispatchCall(1610743811,"GetAccessEntry", DISPATCH_METHOD,null,_scope.value,_entryId,_accessEntry);
  }
  public AccessPermission() throws ComException {
    super("{19CC2B4B-2489-450C-9708-A6C28282AA76}", "{DD181E97-EEE0-4D65-BAD1-16866D0C7953}");
  }
  protected AccessPermission(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[AccessPermission" + super.toString() + "]";
  }
}
