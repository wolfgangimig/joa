/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactCalendarState.
 * Defines contact calendar states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactCalendarState {
  ucCalendarStateAvailable(0),
  ucCalendarStateTentative(1),
  ucCalendarStateOutsideWorkPeriod(2),
  ucCalendarStateBusy(3),
  ucCalendarStateOutOfOffice(4),
  ucCalendarStateNotAvailable(5),
  ucCalendarStateUnknown(6),
  ucCalendarStateWorkingElsewhere(7);

  public final int value;
  private ContactCalendarState(int value) { this.value = value; }
  public static  ContactCalendarState valueOf(int value) {
    switch(value) {
    case 0: return ucCalendarStateAvailable;
    case 1: return ucCalendarStateTentative;
    case 2: return ucCalendarStateOutsideWorkPeriod;
    case 3: return ucCalendarStateBusy;
    case 4: return ucCalendarStateOutOfOffice;
    case 5: return ucCalendarStateNotAvailable;
    case 6: return ucCalendarStateUnknown;
    case 7: return ucCalendarStateWorkingElsewhere;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactCalendarState.class);
    }
  }
}
