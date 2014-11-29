/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBroadcastState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBroadcastState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBroadcastState NoBroadcast = new MsoBroadcastState(0);
  public final static MsoBroadcastState BroadcastStarted = new MsoBroadcastState(1);
  public final static MsoBroadcastState BroadcastPaused = new MsoBroadcastState(2);

  // Integer constants for bitsets and switch statements
  public final static int _NoBroadcast = 0;
  public final static int _BroadcastStarted = 1;
  public final static int _BroadcastPaused = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBroadcastState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBroadcastState valueOf(int value) {
    switch(value) {
    case 0: return NoBroadcast;
    case 1: return BroadcastStarted;
    case 2: return BroadcastPaused;
    default: return new MsoBroadcastState(value);
    }
  }
}
