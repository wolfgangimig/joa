/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTimelineViewMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTimelineViewMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTimelineViewMode olTimelineViewDay = new OlTimelineViewMode(0);
  public final static OlTimelineViewMode olTimelineViewWeek = new OlTimelineViewMode(1);
  public final static OlTimelineViewMode olTimelineViewMonth = new OlTimelineViewMode(2);

  // Integer constants for bitsets and switch statements
  public final static int _olTimelineViewDay = 0;
  public final static int _olTimelineViewWeek = 1;
  public final static int _olTimelineViewMonth = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTimelineViewMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTimelineViewMode valueOf(int value) {
    switch(value) {
    case 0: return olTimelineViewDay;
    case 1: return olTimelineViewWeek;
    case 2: return olTimelineViewMonth;
    default: return new OlTimelineViewMode(value);
    }
  }
}
