/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlCalendarViewMode {
  olCalendarViewDay(0),
  olCalendarViewWeek(1),
  olCalendarViewMonth(2),
  olCalendarViewMultiDay(3),
  olCalendarView5DayWeek(4);

  public final int value;
  private OlCalendarViewMode(int value) { this.value = value; }
  public static  OlCalendarViewMode valueOf(int value) {
    switch(value) {
    case 0: return olCalendarViewDay;
    case 1: return olCalendarViewWeek;
    case 2: return olCalendarViewMonth;
    case 3: return olCalendarViewMultiDay;
    case 4: return olCalendarView5DayWeek;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlCalendarViewMode.class);
    }
  }
}
