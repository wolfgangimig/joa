/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office.impl;
import com.wilutions.com.*;

@SuppressWarnings("all")
@CoClass(guid="{C09B9AED-A463-DB41-5DAE-69E7A5F7FCBC}")
public class SyncImpl extends Dispatch implements com.wilutions.mslib.office.Sync {
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
  @DeclDISPID(0)  public com.wilutions.mslib.office.MsoSyncStatusType getStatus() throws ComException {
    final Object obj = this._dispatchCall(0,"Status", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSyncStatusType.valueOf((Integer)obj);
  }
  @DeclDISPID(1)  public String getWorkspaceLastChangedBy() throws ComException {
    final Object obj = this._dispatchCall(1,"WorkspaceLastChangedBy", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (String)obj;
  }
  @DeclDISPID(2)  public Object getLastSyncTime() throws ComException {
    final Object obj = this._dispatchCall(2,"LastSyncTime", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (Object)obj;
  }
  @DeclDISPID(4)  public com.wilutions.mslib.office.MsoSyncErrorType getErrorType() throws ComException {
    final Object obj = this._dispatchCall(4,"ErrorType", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return com.wilutions.mslib.office.MsoSyncErrorType.valueOf((Integer)obj);
  }
  @DeclDISPID(6)  public void GetUpdate() throws ComException {
    this._dispatchCall(6,"GetUpdate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(7)  public void PutUpdate() throws ComException {
    this._dispatchCall(7,"PutUpdate", DISPATCH_METHOD,null);
  }
  @DeclDISPID(8)  public void OpenVersion(com.wilutions.mslib.office.MsoSyncVersionType SyncVersionType) throws ComException {
    assert(SyncVersionType != null);
    this._dispatchCall(8,"OpenVersion", DISPATCH_METHOD,null,SyncVersionType.value);
  }
  @DeclDISPID(9)  public void ResolveConflict(com.wilutions.mslib.office.MsoSyncConflictResolutionType SyncConflictResolution) throws ComException {
    assert(SyncConflictResolution != null);
    this._dispatchCall(9,"ResolveConflict", DISPATCH_METHOD,null,SyncConflictResolution.value);
  }
  @DeclDISPID(10)  public void Unsuspend() throws ComException {
    this._dispatchCall(10,"Unsuspend", DISPATCH_METHOD,null);
  }
  @DeclDISPID(14)  public IDispatch getParent() throws ComException {
    final Object obj = this._dispatchCall(14,"Parent", DISPATCH_PROPERTYGET,null);
    if (obj == null) return null;
    return (IDispatch)obj;
  }
  public SyncImpl(String progId) throws ComException {
    super(progId, "{000C0386-0000-0000-C000-000000000046}");
  }
  protected SyncImpl(long ndisp) {
    super(ndisp);
  }
  public String toString() {
    return "[SyncImpl" + super.toString() + "]";
  }
}
