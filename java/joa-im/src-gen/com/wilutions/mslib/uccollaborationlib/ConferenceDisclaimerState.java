/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceDisclaimerState.
 * Enumerates the various states of the disclaimer response property. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceDisclaimerState {

  // Typed constants
  public final static ConferenceDisclaimerState ucConferenceDisclaimerNone = new ConferenceDisclaimerState(0);
  public final static ConferenceDisclaimerState ucConferenceDisclaimerRejected = new ConferenceDisclaimerState(1);
  public final static ConferenceDisclaimerState ucConferenceDisclaimerAccepted = new ConferenceDisclaimerState(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConferenceDisclaimerNone = 0;
  public final static int _ucConferenceDisclaimerRejected = 1;
  public final static int _ucConferenceDisclaimerAccepted = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceDisclaimerState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceDisclaimerState valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceDisclaimerNone;
    case 1: return ucConferenceDisclaimerRejected;
    case 2: return ucConferenceDisclaimerAccepted;
    default: return new ConferenceDisclaimerState(value);
    }
  }
}
