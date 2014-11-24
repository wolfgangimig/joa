/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecurrenceType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRecurrenceType {

  // Typed constants
  public final static OlRecurrenceType olRecursDaily = new OlRecurrenceType(0);
  public final static OlRecurrenceType olRecursWeekly = new OlRecurrenceType(1);
  public final static OlRecurrenceType olRecursMonthly = new OlRecurrenceType(2);
  public final static OlRecurrenceType olRecursMonthNth = new OlRecurrenceType(3);
  public final static OlRecurrenceType olRecursYearly = new OlRecurrenceType(5);
  public final static OlRecurrenceType olRecursYearNth = new OlRecurrenceType(6);

  // Integer constants for bitsets and switch statements
  public final static int _olRecursDaily = 0;
  public final static int _olRecursWeekly = 1;
  public final static int _olRecursMonthly = 2;
  public final static int _olRecursMonthNth = 3;
  public final static int _olRecursYearly = 5;
  public final static int _olRecursYearNth = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRecurrenceType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRecurrenceType valueOf(int value) {
    switch(value) {
    case 0: return olRecursDaily;
    case 1: return olRecursWeekly;
    case 2: return olRecursMonthly;
    case 3: return olRecursMonthNth;
    case 5: return olRecursYearly;
    case 6: return olRecursYearNth;
    default: return new OlRecurrenceType(value);
    }
  }
}
