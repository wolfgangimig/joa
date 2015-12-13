/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlCalendarViewMode implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlCalendarViewMode olCalendarViewDay = new OlCalendarViewMode(0);
  public final static OlCalendarViewMode olCalendarViewWeek = new OlCalendarViewMode(1);
  public final static OlCalendarViewMode olCalendarViewMonth = new OlCalendarViewMode(2);
  public final static OlCalendarViewMode olCalendarViewMultiDay = new OlCalendarViewMode(3);
  public final static OlCalendarViewMode olCalendarView5DayWeek = new OlCalendarViewMode(4);

  // Integer constants for bitsets and switch statements
  public final static int _olCalendarViewDay = 0;
  public final static int _olCalendarViewWeek = 1;
  public final static int _olCalendarViewMonth = 2;
  public final static int _olCalendarViewMultiDay = 3;
  public final static int _olCalendarView5DayWeek = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlCalendarViewMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlCalendarViewMode valueOf(int value) {
    switch(value) {
    case 0: return olCalendarViewDay;
    case 1: return olCalendarViewWeek;
    case 2: return olCalendarViewMonth;
    case 3: return olCalendarViewMultiDay;
    case 4: return olCalendarView5DayWeek;
    default: return new OlCalendarViewMode(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olCalendarViewDay";
    case 1: return "olCalendarViewWeek";
    case 2: return "olCalendarViewMonth";
    case 3: return "olCalendarViewMultiDay";
    case 4: return "olCalendarView5DayWeek";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olCalendarViewDay");
      if ((value & 1) != 0) sbuf.append("|olCalendarViewWeek");
      if ((value & 2) != 0) sbuf.append("|olCalendarViewMonth");
      if ((value & 3) != 0) sbuf.append("|olCalendarViewMultiDay");
      if ((value & 4) != 0) sbuf.append("|olCalendarView5DayWeek");
      return sbuf.toString();
      }
    }
  }
}
