/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecurrenceState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRecurrenceState {
  olApptNotRecurring(0),
  olApptMaster(1),
  olApptOccurrence(2),
  olApptException(3);

  public final int value;
  private OlRecurrenceState(int value) { this.value = value; }
  public static  OlRecurrenceState valueOf(int value) {
    switch(value) {
    case 0: return olApptNotRecurring;
    case 1: return olApptMaster;
    case 2: return olApptOccurrence;
    case 3: return olApptException;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRecurrenceState.class);
    }
  }
}
