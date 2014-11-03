/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncStatusType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncStatusType {
  msoSyncStatusNoSharedWorkspace(0),
  msoSyncStatusNotRoaming(0),
  msoSyncStatusLatest(1),
  msoSyncStatusNewerAvailable(2),
  msoSyncStatusLocalChanges(3),
  msoSyncStatusConflict(4),
  msoSyncStatusSuspended(5),
  msoSyncStatusError(6);

  public final int value;
  private MsoSyncStatusType(int value) { this.value = value; }
  public static  MsoSyncStatusType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncStatusNoSharedWorkspace;
    //se 0: return msoSyncStatusNotRoaming; // same as msoSyncStatusNoSharedWorkspace
    case 1: return msoSyncStatusLatest;
    case 2: return msoSyncStatusNewerAvailable;
    case 3: return msoSyncStatusLocalChanges;
    case 4: return msoSyncStatusConflict;
    case 5: return msoSyncStatusSuspended;
    case 6: return msoSyncStatusError;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncStatusType.class);
    }
  }
}
