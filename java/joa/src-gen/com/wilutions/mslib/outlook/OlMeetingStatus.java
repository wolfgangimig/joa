/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMeetingStatus {
  olNonMeeting(0),
  olMeeting(1),
  olMeetingReceived(3),
  olMeetingCanceled(5),
  olMeetingReceivedAndCanceled(7);

  public final int value;
  private OlMeetingStatus(int value) { this.value = value; }
  public static  OlMeetingStatus valueOf(int value) {
    switch(value) {
    case 0: return olNonMeeting;
    case 1: return olMeeting;
    case 3: return olMeetingReceived;
    case 5: return olMeetingCanceled;
    case 7: return olMeetingReceivedAndCanceled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMeetingStatus.class);
    }
  }
}
