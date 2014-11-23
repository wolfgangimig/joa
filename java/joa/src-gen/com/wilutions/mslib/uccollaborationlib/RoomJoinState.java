/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomJoinState.
 * Room join state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomJoinState {
  ucNotJoined(0),
  ucPending(1),
  ucSuccess(2),
  ucFailed(3),
  ucFailedUnauthorized(4);

  public final int value;
  private RoomJoinState(int value) { this.value = value; }
  public static  RoomJoinState valueOf(int value) {
    switch(value) {
    case 0: return ucNotJoined;
    case 1: return ucPending;
    case 2: return ucSuccess;
    case 3: return ucFailed;
    case 4: return ucFailedUnauthorized;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomJoinState.class);
    }
  }
}
