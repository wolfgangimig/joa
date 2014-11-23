/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageFilteringAction.
 * Enumerates the room message filter action. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomMessageFilteringAction {
  ucRoomMessageFilterCanceled(0),
  ucRoomMessageFilterReplaced(1),
  ucRoomMessageFilterPassed(2);

  public final int value;
  private RoomMessageFilteringAction(int value) { this.value = value; }
  public static  RoomMessageFilteringAction valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageFilterCanceled;
    case 1: return ucRoomMessageFilterReplaced;
    case 2: return ucRoomMessageFilterPassed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomMessageFilteringAction.class);
    }
  }
}
