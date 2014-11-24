/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMarkInterval.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMarkInterval {

  // Typed constants
  public final static OlMarkInterval olMarkToday = new OlMarkInterval(0);
  public final static OlMarkInterval olMarkTomorrow = new OlMarkInterval(1);
  public final static OlMarkInterval olMarkThisWeek = new OlMarkInterval(2);
  public final static OlMarkInterval olMarkNextWeek = new OlMarkInterval(3);
  public final static OlMarkInterval olMarkNoDate = new OlMarkInterval(4);
  public final static OlMarkInterval olMarkComplete = new OlMarkInterval(5);

  // Integer constants for bitsets and switch statements
  public final static int _olMarkToday = 0;
  public final static int _olMarkTomorrow = 1;
  public final static int _olMarkThisWeek = 2;
  public final static int _olMarkNextWeek = 3;
  public final static int _olMarkNoDate = 4;
  public final static int _olMarkComplete = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMarkInterval(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMarkInterval valueOf(int value) {
    switch(value) {
    case 0: return olMarkToday;
    case 1: return olMarkTomorrow;
    case 2: return olMarkThisWeek;
    case 3: return olMarkNextWeek;
    case 4: return olMarkNoDate;
    case 5: return olMarkComplete;
    default: return new OlMarkInterval(value);
    }
  }
}
