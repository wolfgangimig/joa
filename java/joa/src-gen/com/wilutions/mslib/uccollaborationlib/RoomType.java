/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomType.
 * Enumerates the room type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum RoomType {
  ucRoomNormal(0),
  ucRoomAuditorium(1);

  public final int value;
  private RoomType(int value) { this.value = value; }
  public static  RoomType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomNormal;
    case 1: return ucRoomAuditorium;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + RoomType.class);
    }
  }
}
