/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecurrenceState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRecurrenceState {

  // Typed constants
  public final static OlRecurrenceState olApptNotRecurring = new OlRecurrenceState(0);
  public final static OlRecurrenceState olApptMaster = new OlRecurrenceState(1);
  public final static OlRecurrenceState olApptOccurrence = new OlRecurrenceState(2);
  public final static OlRecurrenceState olApptException = new OlRecurrenceState(3);

  // Integer constants for bitsets and switch statements
  public final static int _olApptNotRecurring = 0;
  public final static int _olApptMaster = 1;
  public final static int _olApptOccurrence = 2;
  public final static int _olApptException = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRecurrenceState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRecurrenceState valueOf(int value) {
    switch(value) {
    case 0: return olApptNotRecurring;
    case 1: return olApptMaster;
    case 2: return olApptOccurrence;
    case 3: return olApptException;
    default: return new OlRecurrenceState(value);
    }
  }
}
