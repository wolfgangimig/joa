/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNetMeetingType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlNetMeetingType {
  olNetMeeting(0),
  olNetShow(1),
  olExchangeConferencing(2);

  public final int value;
  private OlNetMeetingType(int value) { this.value = value; }
  public static  OlNetMeetingType valueOf(int value) {
    switch(value) {
    case 0: return olNetMeeting;
    case 1: return olNetShow;
    case 2: return olExchangeConferencing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlNetMeetingType.class);
    }
  }
}
