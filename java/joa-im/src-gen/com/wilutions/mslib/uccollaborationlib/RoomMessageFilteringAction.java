/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomMessageFilteringAction.
 * Enumerates the room message filter action. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomMessageFilteringAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomMessageFilteringAction ucRoomMessageFilterCanceled = new RoomMessageFilteringAction(0);
  public final static RoomMessageFilteringAction ucRoomMessageFilterReplaced = new RoomMessageFilteringAction(1);
  public final static RoomMessageFilteringAction ucRoomMessageFilterPassed = new RoomMessageFilteringAction(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomMessageFilterCanceled = 0;
  public final static int _ucRoomMessageFilterReplaced = 1;
  public final static int _ucRoomMessageFilterPassed = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomMessageFilteringAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomMessageFilteringAction valueOf(int value) {
    switch(value) {
    case 0: return ucRoomMessageFilterCanceled;
    case 1: return ucRoomMessageFilterReplaced;
    case 2: return ucRoomMessageFilterPassed;
    default: return new RoomMessageFilteringAction(value);
    }
  }
}
