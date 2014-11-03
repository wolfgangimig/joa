/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDayWeekTimeScale.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlDayWeekTimeScale {
  olTimeScale5Minutes(0),
  olTimeScale6Minutes(1),
  olTimeScale10Minutes(2),
  olTimeScale15Minutes(3),
  olTimeScale30Minutes(4),
  olTimeScale60Minutes(5);

  public final int value;
  private OlDayWeekTimeScale(int value) { this.value = value; }
  public static  OlDayWeekTimeScale valueOf(int value) {
    switch(value) {
    case 0: return olTimeScale5Minutes;
    case 1: return olTimeScale6Minutes;
    case 2: return olTimeScale10Minutes;
    case 3: return olTimeScale15Minutes;
    case 4: return olTimeScale30Minutes;
    case 5: return olTimeScale60Minutes;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDayWeekTimeScale.class);
    }
  }
}
