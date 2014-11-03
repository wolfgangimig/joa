/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDaysOfWeek.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDaysOfWeek {
  olSunday(1),
  olMonday(2),
  olTuesday(4),
  olWednesday(8),
  olThursday(16),
  olFriday(32),
  olSaturday(64);

  public final int value;
  private OlDaysOfWeek(int value) { this.value = value; }
  public static  OlDaysOfWeek valueOf(int value) {
    switch(value) {
    case 1: return olSunday;
    case 2: return olMonday;
    case 4: return olTuesday;
    case 8: return olWednesday;
    case 16: return olThursday;
    case 32: return olFriday;
    case 64: return olSaturday;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDaysOfWeek.class);
    }
  }
}
