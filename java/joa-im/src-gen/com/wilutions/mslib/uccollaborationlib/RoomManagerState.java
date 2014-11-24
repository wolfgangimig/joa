/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomManagerState.
 * Enumerates the room manager state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomManagerState {

  // Typed constants
  public final static RoomManagerState ucRoomManagerDisabled = new RoomManagerState(0);
  public final static RoomManagerState ucRoomManagerEnabled = new RoomManagerState(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucRoomManagerDisabled = 0;
  public final static int _ucRoomManagerEnabled = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomManagerState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomManagerState valueOf(int value) {
    switch(value) {
    case 0: return ucRoomManagerDisabled;
    case 1: return ucRoomManagerEnabled;
    default: return new RoomManagerState(value);
    }
  }
}
