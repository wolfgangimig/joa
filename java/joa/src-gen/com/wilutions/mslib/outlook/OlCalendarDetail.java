/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlCalendarDetail.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlCalendarDetail {
  olFreeBusyOnly(0),
  olFreeBusyAndSubject(1),
  olFullDetails(2);

  public final int value;
  private OlCalendarDetail(int value) { this.value = value; }
  public static  OlCalendarDetail valueOf(int value) {
    switch(value) {
    case 0: return olFreeBusyOnly;
    case 1: return olFreeBusyAndSubject;
    case 2: return olFullDetails;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlCalendarDetail.class);
    }
  }
}
