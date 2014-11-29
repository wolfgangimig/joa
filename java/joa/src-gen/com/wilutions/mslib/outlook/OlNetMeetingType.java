/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlNetMeetingType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlNetMeetingType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlNetMeetingType olNetMeeting = new OlNetMeetingType(0);
  public final static OlNetMeetingType olNetShow = new OlNetMeetingType(1);
  public final static OlNetMeetingType olExchangeConferencing = new OlNetMeetingType(2);

  // Integer constants for bitsets and switch statements
  public final static int _olNetMeeting = 0;
  public final static int _olNetShow = 1;
  public final static int _olExchangeConferencing = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlNetMeetingType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlNetMeetingType valueOf(int value) {
    switch(value) {
    case 0: return olNetMeeting;
    case 1: return olNetShow;
    case 2: return olExchangeConferencing;
    default: return new OlNetMeetingType(value);
    }
  }
}
