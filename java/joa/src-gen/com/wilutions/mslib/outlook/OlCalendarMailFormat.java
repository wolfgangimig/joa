/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarMailFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlCalendarMailFormat {
  olCalendarMailFormatDailySchedule(0),
  olCalendarMailFormatEventList(1);

  public final int value;
  private OlCalendarMailFormat(int value) { this.value = value; }
  public static  OlCalendarMailFormat valueOf(int value) {
    switch(value) {
    case 0: return olCalendarMailFormatDailySchedule;
    case 1: return olCalendarMailFormatEventList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlCalendarMailFormat.class);
    }
  }
}
