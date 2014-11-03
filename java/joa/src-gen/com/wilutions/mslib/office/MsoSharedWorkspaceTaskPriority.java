/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSharedWorkspaceTaskPriority.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSharedWorkspaceTaskPriority {
  msoSharedWorkspaceTaskPriorityHigh(1),
  msoSharedWorkspaceTaskPriorityNormal(2),
  msoSharedWorkspaceTaskPriorityLow(3);

  public final int value;
  private MsoSharedWorkspaceTaskPriority(int value) { this.value = value; }
  public static  MsoSharedWorkspaceTaskPriority valueOf(int value) {
    switch(value) {
    case 1: return msoSharedWorkspaceTaskPriorityHigh;
    case 2: return msoSharedWorkspaceTaskPriorityNormal;
    case 3: return msoSharedWorkspaceTaskPriorityLow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSharedWorkspaceTaskPriority.class);
    }
  }
}
