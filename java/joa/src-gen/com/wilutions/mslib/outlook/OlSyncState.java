/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSyncState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSyncState {
  olSyncStopped(0),
  olSyncStarted(1);

  public final int value;
  private OlSyncState(int value) { this.value = value; }
  public static  OlSyncState valueOf(int value) {
    switch(value) {
    case 0: return olSyncStopped;
    case 1: return olSyncStarted;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSyncState.class);
    }
  }
}
