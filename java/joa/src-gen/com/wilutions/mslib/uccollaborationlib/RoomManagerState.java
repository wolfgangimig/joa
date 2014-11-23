/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomManagerState.
 * Enumerates the room manager state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomManagerState {
  ucRoomManagerDisabled(0),
  ucRoomManagerEnabled(1);

  public final int value;
  private RoomManagerState(int value) { this.value = value; }
  public static  RoomManagerState valueOf(int value) {
    switch(value) {
    case 0: return ucRoomManagerDisabled;
    case 1: return ucRoomManagerEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomManagerState.class);
    }
  }
}
