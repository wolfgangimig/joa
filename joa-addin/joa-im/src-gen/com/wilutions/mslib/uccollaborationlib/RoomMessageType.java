/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageType.
 * Enumerates the room message type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomMessageType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomMessageType ucRoomMessageAlert = new RoomMessageType(0);
  public final static RoomMessageType ucRoomMessageRegular = new RoomMessageType(1);
  public final static RoomMessageType ucRoomMessageStory = new RoomMessageType(2);
  public final static RoomMessageType ucRoomMessageTypeMAX = new RoomMessageType(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessageAlert = 0;
  public final static int _ucRoomMessageRegular = 1;
  public final static int _ucRoomMessageStory = 2;
  public final static int _ucRoomMessageTypeMAX = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomMessageType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomMessageType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageAlert;
    case 1: return ucRoomMessageRegular;
    case 2: return ucRoomMessageStory;
    case 3: return ucRoomMessageTypeMAX;
    default: return new RoomMessageType(value);
    }
  }
}
