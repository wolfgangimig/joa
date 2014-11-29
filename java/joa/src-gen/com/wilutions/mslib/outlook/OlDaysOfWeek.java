/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDaysOfWeek.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDaysOfWeek {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlDaysOfWeek olSunday = new OlDaysOfWeek(1);
  public final static OlDaysOfWeek olMonday = new OlDaysOfWeek(2);
  public final static OlDaysOfWeek olTuesday = new OlDaysOfWeek(4);
  public final static OlDaysOfWeek olWednesday = new OlDaysOfWeek(8);
  public final static OlDaysOfWeek olThursday = new OlDaysOfWeek(16);
  public final static OlDaysOfWeek olFriday = new OlDaysOfWeek(32);
  public final static OlDaysOfWeek olSaturday = new OlDaysOfWeek(64);

  // Integer constants for bitsets and switch statements
  public final static int _olSunday = 1;
  public final static int _olMonday = 2;
  public final static int _olTuesday = 4;
  public final static int _olWednesday = 8;
  public final static int _olThursday = 16;
  public final static int _olFriday = 32;
  public final static int _olSaturday = 64;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDaysOfWeek(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDaysOfWeek valueOf(int value) {
    switch(value) {
    case 1: return olSunday;
    case 2: return olMonday;
    case 4: return olTuesday;
    case 8: return olWednesday;
    case 16: return olThursday;
    case 32: return olFriday;
    case 64: return olSaturday;
    default: return new OlDaysOfWeek(value);
    }
  }
}
