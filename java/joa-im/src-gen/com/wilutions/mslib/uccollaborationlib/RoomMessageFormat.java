/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageFormat.
 * Enumerates the room message format. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomMessageFormat {

  // Typed constants
  public final static RoomMessageFormat ucRoomMessagePlainText = new RoomMessageFormat(0);
  public final static RoomMessageFormat ucRoomMessageRtf = new RoomMessageFormat(1);
  public final static RoomMessageFormat ucRoomMessageMAX = new RoomMessageFormat(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessagePlainText = 0;
  public final static int _ucRoomMessageRtf = 1;
  public final static int _ucRoomMessageMAX = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomMessageFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomMessageFormat valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessagePlainText;
    case 1: return ucRoomMessageRtf;
    case 2: return ucRoomMessageMAX;
    default: return new RoomMessageFormat(value);
    }
  }
}
