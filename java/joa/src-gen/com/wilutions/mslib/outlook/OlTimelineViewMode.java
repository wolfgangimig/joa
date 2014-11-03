/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTimelineViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTimelineViewMode {
  olTimelineViewDay(0),
  olTimelineViewWeek(1),
  olTimelineViewMonth(2);

  public final int value;
  private OlTimelineViewMode(int value) { this.value = value; }
  public static  OlTimelineViewMode valueOf(int value) {
    switch(value) {
    case 0: return olTimelineViewDay;
    case 1: return olTimelineViewWeek;
    case 2: return olTimelineViewMonth;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTimelineViewMode.class);
    }
  }
}
