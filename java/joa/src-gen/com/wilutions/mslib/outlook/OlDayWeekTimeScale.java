/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDayWeekTimeScale.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlDayWeekTimeScale {

  // Typed constants
  public final static OlDayWeekTimeScale olTimeScale5Minutes = new OlDayWeekTimeScale(0);
  public final static OlDayWeekTimeScale olTimeScale6Minutes = new OlDayWeekTimeScale(1);
  public final static OlDayWeekTimeScale olTimeScale10Minutes = new OlDayWeekTimeScale(2);
  public final static OlDayWeekTimeScale olTimeScale15Minutes = new OlDayWeekTimeScale(3);
  public final static OlDayWeekTimeScale olTimeScale30Minutes = new OlDayWeekTimeScale(4);
  public final static OlDayWeekTimeScale olTimeScale60Minutes = new OlDayWeekTimeScale(5);

  // Integer constants for bitsets and switch statements
  public final static int _olTimeScale5Minutes = 0;
  public final static int _olTimeScale6Minutes = 1;
  public final static int _olTimeScale10Minutes = 2;
  public final static int _olTimeScale15Minutes = 3;
  public final static int _olTimeScale30Minutes = 4;
  public final static int _olTimeScale60Minutes = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlDayWeekTimeScale(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlDayWeekTimeScale valueOf(int value) {
    switch(value) {
    case 0: return olTimeScale5Minutes;
    case 1: return olTimeScale6Minutes;
    case 2: return olTimeScale10Minutes;
    case 3: return olTimeScale15Minutes;
    case 4: return olTimeScale30Minutes;
    case 5: return olTimeScale60Minutes;
    default: return new OlDayWeekTimeScale(value);
    }
  }
}
