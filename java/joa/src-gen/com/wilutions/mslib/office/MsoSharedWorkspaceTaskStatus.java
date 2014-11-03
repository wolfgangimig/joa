/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSharedWorkspaceTaskStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSharedWorkspaceTaskStatus {
  msoSharedWorkspaceTaskStatusNotStarted(1),
  msoSharedWorkspaceTaskStatusInProgress(2),
  msoSharedWorkspaceTaskStatusCompleted(3),
  msoSharedWorkspaceTaskStatusDeferred(4),
  msoSharedWorkspaceTaskStatusWaiting(5);

  public final int value;
  private MsoSharedWorkspaceTaskStatus(int value) { this.value = value; }
  public static  MsoSharedWorkspaceTaskStatus valueOf(int value) {
    switch(value) {
    case 1: return msoSharedWorkspaceTaskStatusNotStarted;
    case 2: return msoSharedWorkspaceTaskStatusInProgress;
    case 3: return msoSharedWorkspaceTaskStatusCompleted;
    case 4: return msoSharedWorkspaceTaskStatusDeferred;
    case 5: return msoSharedWorkspaceTaskStatusWaiting;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSharedWorkspaceTaskStatus.class);
    }
  }
}
