/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSharedWorkspaceTaskStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSharedWorkspaceTaskStatus {

  // Typed constants
  public final static MsoSharedWorkspaceTaskStatus msoSharedWorkspaceTaskStatusNotStarted = new MsoSharedWorkspaceTaskStatus(1);
  public final static MsoSharedWorkspaceTaskStatus msoSharedWorkspaceTaskStatusInProgress = new MsoSharedWorkspaceTaskStatus(2);
  public final static MsoSharedWorkspaceTaskStatus msoSharedWorkspaceTaskStatusCompleted = new MsoSharedWorkspaceTaskStatus(3);
  public final static MsoSharedWorkspaceTaskStatus msoSharedWorkspaceTaskStatusDeferred = new MsoSharedWorkspaceTaskStatus(4);
  public final static MsoSharedWorkspaceTaskStatus msoSharedWorkspaceTaskStatusWaiting = new MsoSharedWorkspaceTaskStatus(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoSharedWorkspaceTaskStatusNotStarted = 1;
  public final static int _msoSharedWorkspaceTaskStatusInProgress = 2;
  public final static int _msoSharedWorkspaceTaskStatusCompleted = 3;
  public final static int _msoSharedWorkspaceTaskStatusDeferred = 4;
  public final static int _msoSharedWorkspaceTaskStatusWaiting = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSharedWorkspaceTaskStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSharedWorkspaceTaskStatus valueOf(int value) {
    switch(value) {
    case 1: return msoSharedWorkspaceTaskStatusNotStarted;
    case 2: return msoSharedWorkspaceTaskStatusInProgress;
    case 3: return msoSharedWorkspaceTaskStatusCompleted;
    case 4: return msoSharedWorkspaceTaskStatusDeferred;
    case 5: return msoSharedWorkspaceTaskStatusWaiting;
    default: return new MsoSharedWorkspaceTaskStatus(value);
    }
  }
}
