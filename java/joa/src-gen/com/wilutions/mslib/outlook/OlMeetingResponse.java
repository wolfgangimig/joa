/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMeetingResponse.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMeetingResponse {

  // Typed constants
  public final static OlMeetingResponse olMeetingTentative = new OlMeetingResponse(2);
  public final static OlMeetingResponse olMeetingAccepted = new OlMeetingResponse(3);
  public final static OlMeetingResponse olMeetingDeclined = new OlMeetingResponse(4);

  // Integer constants for bitsets and switch statements
  public final static int _olMeetingTentative = 2;
  public final static int _olMeetingAccepted = 3;
  public final static int _olMeetingDeclined = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMeetingResponse(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMeetingResponse valueOf(int value) {
    switch(value) {
    case 2: return olMeetingTentative;
    case 3: return olMeetingAccepted;
    case 4: return olMeetingDeclined;
    default: return new OlMeetingResponse(value);
    }
  }
}
