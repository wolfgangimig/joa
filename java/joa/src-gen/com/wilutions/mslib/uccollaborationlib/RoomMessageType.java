/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageType.
 * Enumerates the room message type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomMessageType {
  ucRoomMessageAlert(0),
  ucRoomMessageRegular(1),
  ucRoomMessageStory(2),
  ucRoomMessageTypeMAX(3);

  public final int value;
  private RoomMessageType(int value) { this.value = value; }
  public static  RoomMessageType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageAlert;
    case 1: return ucRoomMessageRegular;
    case 2: return ucRoomMessageStory;
    case 3: return ucRoomMessageTypeMAX;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomMessageType.class);
    }
  }
}
