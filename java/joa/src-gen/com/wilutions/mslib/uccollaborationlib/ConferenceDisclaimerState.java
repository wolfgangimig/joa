/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceDisclaimerState.
 * Enumerates the various states of the disclaimer response property. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConferenceDisclaimerState {
  ucConferenceDisclaimerNone(0),
  ucConferenceDisclaimerRejected(1),
  ucConferenceDisclaimerAccepted(2);

  public final int value;
  private ConferenceDisclaimerState(int value) { this.value = value; }
  public static  ConferenceDisclaimerState valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceDisclaimerNone;
    case 1: return ucConferenceDisclaimerRejected;
    case 2: return ucConferenceDisclaimerAccepted;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConferenceDisclaimerState.class);
    }
  }
}
