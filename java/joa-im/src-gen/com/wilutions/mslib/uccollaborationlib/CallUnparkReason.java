/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * CallUnparkReason.
 * Defines the specific reason why a previously-parked call was unparked. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class CallUnparkReason {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static CallUnparkReason ucUnparkReasonNone = new CallUnparkReason(0);
  public final static CallUnparkReason ucUnparkReasonAbandoned = new CallUnparkReason(1);
  public final static CallUnparkReason ucUnparkReasonDisconnected = new CallUnparkReason(2);
  public final static CallUnparkReason ucUnparkReasonFallback = new CallUnparkReason(3);
  public final static CallUnparkReason ucUnparkReasonRetrieved = new CallUnparkReason(4);
  public final static CallUnparkReason ucUnparkReasonRingback = new CallUnparkReason(5);
  public final static CallUnparkReason ucUnparkReasonUnknown = new CallUnparkReason(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucUnparkReasonNone = 0;
  public final static int _ucUnparkReasonAbandoned = 1;
  public final static int _ucUnparkReasonDisconnected = 2;
  public final static int _ucUnparkReasonFallback = 3;
  public final static int _ucUnparkReasonRetrieved = 4;
  public final static int _ucUnparkReasonRingback = 5;
  public final static int _ucUnparkReasonUnknown = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private CallUnparkReason(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  CallUnparkReason valueOf(int value) {
    switch(value) {
    case 0: return ucUnparkReasonNone;
    case 1: return ucUnparkReasonAbandoned;
    case 2: return ucUnparkReasonDisconnected;
    case 3: return ucUnparkReasonFallback;
    case 4: return ucUnparkReasonRetrieved;
    case 5: return ucUnparkReasonRingback;
    case 6: return ucUnparkReasonUnknown;
    default: return new CallUnparkReason(value);
    }
  }
}
