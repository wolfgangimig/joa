/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * RoomJoinState.
 * Room join state. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class RoomJoinState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static RoomJoinState ucNotJoined = new RoomJoinState(0);
  public final static RoomJoinState ucPending = new RoomJoinState(1);
  public final static RoomJoinState ucSuccess = new RoomJoinState(2);
  public final static RoomJoinState ucFailed = new RoomJoinState(3);
  public final static RoomJoinState ucFailedUnauthorized = new RoomJoinState(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucNotJoined = 0;
  public final static int _ucPending = 1;
  public final static int _ucSuccess = 2;
  public final static int _ucFailed = 3;
  public final static int _ucFailedUnauthorized = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private RoomJoinState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  RoomJoinState valueOf(int value) {
    switch(value) {
    case 0: return ucNotJoined;
    case 1: return ucPending;
    case 2: return ucSuccess;
    case 3: return ucFailed;
    case 4: return ucFailedUnauthorized;
    default: return new RoomJoinState(value);
    }
  }
}
