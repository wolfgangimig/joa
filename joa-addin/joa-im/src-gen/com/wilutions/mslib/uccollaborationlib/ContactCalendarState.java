/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactCalendarState.
 * Defines contact calendar states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactCalendarState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ContactCalendarState ucCalendarStateAvailable = new ContactCalendarState(0);
  public final static ContactCalendarState ucCalendarStateTentative = new ContactCalendarState(1);
  public final static ContactCalendarState ucCalendarStateOutsideWorkPeriod = new ContactCalendarState(2);
  public final static ContactCalendarState ucCalendarStateBusy = new ContactCalendarState(3);
  public final static ContactCalendarState ucCalendarStateOutOfOffice = new ContactCalendarState(4);
  public final static ContactCalendarState ucCalendarStateNotAvailable = new ContactCalendarState(5);
  public final static ContactCalendarState ucCalendarStateUnknown = new ContactCalendarState(6);
  public final static ContactCalendarState ucCalendarStateWorkingElsewhere = new ContactCalendarState(7);

  // Integer constants for bitsets and switch statements
  public final static int _ucCalendarStateAvailable = 0;
  public final static int _ucCalendarStateTentative = 1;
  public final static int _ucCalendarStateOutsideWorkPeriod = 2;
  public final static int _ucCalendarStateBusy = 3;
  public final static int _ucCalendarStateOutOfOffice = 4;
  public final static int _ucCalendarStateNotAvailable = 5;
  public final static int _ucCalendarStateUnknown = 6;
  public final static int _ucCalendarStateWorkingElsewhere = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactCalendarState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ContactCalendarState(value);
    }
  }
}
