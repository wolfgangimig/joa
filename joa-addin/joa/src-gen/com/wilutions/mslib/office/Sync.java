/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * Sync.
 * 
 */
@CoInterface(guid="{000C0386-0000-0000-C000-000000000046}")
public interface Sync extends IDispatch {
  static boolean __typelib__loaded = __TypeLib.load();
  @DeclDISPID(1610743808)  public IDispatch getApplication() throws ComException;
  @DeclDISPID(1610743809)  public Integer getCreator() throws ComException;
  @DeclDISPID(0)  public MsoSyncStatusType getStatus() throws ComException;
  @DeclDISPID(1)  public String getWorkspaceLastChangedBy() throws ComException;
  @DeclDISPID(2)  public Object getLastSyncTime() throws ComException;
  @DeclDISPID(4)  public MsoSyncErrorType getErrorType() throws ComException;
  @DeclDISPID(6)  public void GetUpdate() throws ComException;
  @DeclDISPID(7)  public void PutUpdate() throws ComException;
  @DeclDISPID(8)  public void OpenVersion(final MsoSyncVersionType SyncVersionType) throws ComException;
  @DeclDISPID(9)  public void ResolveConflict(final MsoSyncConflictResolutionType SyncConflictResolution) throws ComException;
  @DeclDISPID(10)  public void Unsuspend() throws ComException;
  @DeclDISPID(14)  public IDispatch getParent() throws ComException;
}
