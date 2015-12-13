/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomType.
 * Enumerates the room type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomType ucRoomNormal = new RoomType(0);
  public final static RoomType ucRoomAuditorium = new RoomType(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomNormal = 0;
  public final static int _ucRoomAuditorium = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomNormal;
    case 1: return ucRoomAuditorium;
    default: return new RoomType(value);
    }
  }
}
