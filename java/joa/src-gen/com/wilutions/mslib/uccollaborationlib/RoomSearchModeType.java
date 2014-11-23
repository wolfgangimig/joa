/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomSearchModeType.
 * Enumerates the room seach mode type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomSearchModeType {
  ucRoomSearchModeRegular(0),
  ucRoomSearchModeExtended(1);

  public final int value;
  private RoomSearchModeType(int value) { this.value = value; }
  public static  RoomSearchModeType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomSearchModeRegular;
    case 1: return ucRoomSearchModeExtended;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomSearchModeType.class);
    }
  }
}
