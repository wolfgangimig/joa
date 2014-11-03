/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingResponse.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMeetingResponse {
  olMeetingTentative(2),
  olMeetingAccepted(3),
  olMeetingDeclined(4);

  public final int value;
  private OlMeetingResponse(int value) { this.value = value; }
  public static  OlMeetingResponse valueOf(int value) {
    switch(value) {
    case 2: return olMeetingTentative;
    case 3: return olMeetingAccepted;
    case 4: return olMeetingDeclined;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMeetingResponse.class);
    }
  }
}
