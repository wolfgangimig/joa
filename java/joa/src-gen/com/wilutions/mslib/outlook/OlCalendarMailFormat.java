/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarMailFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlCalendarMailFormat {

  // Typed constants
  public final static OlCalendarMailFormat olCalendarMailFormatDailySchedule = new OlCalendarMailFormat(0);
  public final static OlCalendarMailFormat olCalendarMailFormatEventList = new OlCalendarMailFormat(1);

  // Integer constants for bitsets and switch statements
  public final static int _olCalendarMailFormatDailySchedule = 0;
  public final static int _olCalendarMailFormatEventList = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlCalendarMailFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlCalendarMailFormat valueOf(int value) {
    switch(value) {
    case 0: return olCalendarMailFormatDailySchedule;
    case 1: return olCalendarMailFormatEventList;
    default: return new OlCalendarMailFormat(value);
    }
  }
}
