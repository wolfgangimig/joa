/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSyncState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSyncState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSyncState olSyncStopped = new OlSyncState(0);
  public final static OlSyncState olSyncStarted = new OlSyncState(1);

  // Integer constants for bitsets and switch statements
  public final static int _olSyncStopped = 0;
  public final static int _olSyncStarted = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSyncState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSyncState valueOf(int value) {
    switch(value) {
    case 0: return olSyncStopped;
    case 1: return olSyncStarted;
    default: return new OlSyncState(value);
    }
  }
}
