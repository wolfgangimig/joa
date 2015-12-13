/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomSearchModeType.
 * Enumerates the room seach mode type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomSearchModeType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomSearchModeType ucRoomSearchModeRegular = new RoomSearchModeType(0);
  public final static RoomSearchModeType ucRoomSearchModeExtended = new RoomSearchModeType(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomSearchModeRegular = 0;
  public final static int _ucRoomSearchModeExtended = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomSearchModeType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomSearchModeType valueOf(int value) {
    switch(value) {
    case 0: return ucRoomSearchModeRegular;
    case 1: return ucRoomSearchModeExtended;
    default: return new RoomSearchModeType(value);
    }
  }
}
