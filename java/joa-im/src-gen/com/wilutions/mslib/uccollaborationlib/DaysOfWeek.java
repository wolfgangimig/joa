/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * DaysOfWeek.
 * Defines days of the week for presence working hours. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class DaysOfWeek {

  // Typed constants
  public final static DaysOfWeek ucSunday = new DaysOfWeek(1);
  public final static DaysOfWeek ucMonday = new DaysOfWeek(2);
  public final static DaysOfWeek ucTuesday = new DaysOfWeek(4);
  public final static DaysOfWeek ucWednesday = new DaysOfWeek(8);
  public final static DaysOfWeek ucThursday = new DaysOfWeek(16);
  public final static DaysOfWeek ucFriday = new DaysOfWeek(32);
  public final static DaysOfWeek ucSaturday = new DaysOfWeek(64);

  // Integer constants for bitsets and switch statements
  public final static int _ucSunday = 1;
  public final static int _ucMonday = 2;
  public final static int _ucTuesday = 4;
  public final static int _ucWednesday = 8;
  public final static int _ucThursday = 16;
  public final static int _ucFriday = 32;
  public final static int _ucSaturday = 64;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private DaysOfWeek(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  DaysOfWeek valueOf(int value) {
    switch(value) {
    case 1: return ucSunday;
    case 2: return ucMonday;
    case 4: return ucTuesday;
    case 8: return ucWednesday;
    case 16: return ucThursday;
    case 32: return ucFriday;
    case 64: return ucSaturday;
    default: return new DaysOfWeek(value);
    }
  }
}
