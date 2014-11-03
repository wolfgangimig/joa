/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecurrenceType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRecurrenceType {
  olRecursDaily(0),
  olRecursWeekly(1),
  olRecursMonthly(2),
  olRecursMonthNth(3),
  olRecursYearly(5),
  olRecursYearNth(6);

  public final int value;
  private OlRecurrenceType(int value) { this.value = value; }
  public static  OlRecurrenceType valueOf(int value) {
    switch(value) {
    case 0: return olRecursDaily;
    case 1: return olRecursWeekly;
    case 2: return olRecursMonthly;
    case 3: return olRecursMonthNth;
    case 5: return olRecursYearly;
    case 6: return olRecursYearNth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRecurrenceType.class);
    }
  }
}
