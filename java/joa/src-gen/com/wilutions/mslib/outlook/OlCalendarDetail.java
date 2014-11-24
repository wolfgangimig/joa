/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlCalendarDetail {

  // Typed constants
  public final static OlCalendarDetail olFreeBusyOnly = new OlCalendarDetail(0);
  public final static OlCalendarDetail olFreeBusyAndSubject = new OlCalendarDetail(1);
  public final static OlCalendarDetail olFullDetails = new OlCalendarDetail(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFreeBusyOnly = 0;
  public final static int _olFreeBusyAndSubject = 1;
  public final static int _olFullDetails = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlCalendarDetail(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlCalendarDetail valueOf(int value) {
    switch(value) {
    case 0: return olFreeBusyOnly;
    case 1: return olFreeBusyAndSubject;
    case 2: return olFullDetails;
    default: return new OlCalendarDetail(value);
    }
  }
}
