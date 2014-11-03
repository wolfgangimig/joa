/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSyncConflictResolutionType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSyncConflictResolutionType {
  msoSyncConflictClientWins(0),
  msoSyncConflictServerWins(1),
  msoSyncConflictMerge(2);

  public final int value;
  private MsoSyncConflictResolutionType(int value) { this.value = value; }
  public static  MsoSyncConflictResolutionType valueOf(int value) {
    switch(value) {
    case 0: return msoSyncConflictClientWins;
    case 1: return msoSyncConflictServerWins;
    case 2: return msoSyncConflictMerge;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSyncConflictResolutionType.class);
    }
  }
}
