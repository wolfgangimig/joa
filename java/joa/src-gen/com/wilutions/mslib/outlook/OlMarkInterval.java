/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMarkInterval.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMarkInterval {
  olMarkToday(0),
  olMarkTomorrow(1),
  olMarkThisWeek(2),
  olMarkNextWeek(3),
  olMarkNoDate(4),
  olMarkComplete(5);

  public final int value;
  private OlMarkInterval(int value) { this.value = value; }
  public static  OlMarkInterval valueOf(int value) {
    switch(value) {
    case 0: return olMarkToday;
    case 1: return olMarkTomorrow;
    case 2: return olMarkThisWeek;
    case 3: return olMarkNextWeek;
    case 4: return olMarkNoDate;
    case 5: return olMarkComplete;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMarkInterval.class);
    }
  }
}
