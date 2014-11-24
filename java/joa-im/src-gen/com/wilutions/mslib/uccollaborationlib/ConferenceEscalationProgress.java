/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceEscalationProgress.
 * Enumerates the progressive stages of a conversation's escalation to conference. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceEscalationProgress {

  // Typed constants
  public final static ConferenceEscalationProgress ConferenceEscalationNotStarted = new ConferenceEscalationProgress(0);
  public final static ConferenceEscalationProgress ConferenceEscalationSchedulingConference = new ConferenceEscalationProgress(1);
  public final static ConferenceEscalationProgress ConferenceEscalationConnectingToConference = new ConferenceEscalationProgress(2);
  public final static ConferenceEscalationProgress ConferenceEscalationConnectedToLobby = new ConferenceEscalationProgress(3);
  public final static ConferenceEscalationProgress ConferenceEscalationJoiningLocalMedia = new ConferenceEscalationProgress(4);
  public final static ConferenceEscalationProgress ConferenceEscalationWaitingForPair = new ConferenceEscalationProgress(5);
  public final static ConferenceEscalationProgress ConferenceEscalationWaitingForPeer = new ConferenceEscalationProgress(6);
  public final static ConferenceEscalationProgress ConferenceEscalationCompleted = new ConferenceEscalationProgress(7);
  public final static ConferenceEscalationProgress ConferenceEscalationFailed = new ConferenceEscalationProgress(8);
  public final static ConferenceEscalationProgress ConferenceEscalationAwaitingDisclaimerResponse = new ConferenceEscalationProgress(9);
  public final static ConferenceEscalationProgress ConferenceEscalationAwaitingJoinDialogResponse = new ConferenceEscalationProgress(10);

  // Integer constants for bitsets and switch statements
  public final static int _ConferenceEscalationNotStarted = 0;
  public final static int _ConferenceEscalationSchedulingConference = 1;
  public final static int _ConferenceEscalationConnectingToConference = 2;
  public final static int _ConferenceEscalationConnectedToLobby = 3;
  public final static int _ConferenceEscalationJoiningLocalMedia = 4;
  public final static int _ConferenceEscalationWaitingForPair = 5;
  public final static int _ConferenceEscalationWaitingForPeer = 6;
  public final static int _ConferenceEscalationCompleted = 7;
  public final static int _ConferenceEscalationFailed = 8;
  public final static int _ConferenceEscalationAwaitingDisclaimerResponse = 9;
  public final static int _ConferenceEscalationAwaitingJoinDialogResponse = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceEscalationProgress(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceEscalationProgress valueOf(int value) {
    switch(value) {
    case 0: return ConferenceEscalationNotStarted;
    case 1: return ConferenceEscalationSchedulingConference;
    case 2: return ConferenceEscalationConnectingToConference;
    case 3: return ConferenceEscalationConnectedToLobby;
    case 4: return ConferenceEscalationJoiningLocalMedia;
    case 5: return ConferenceEscalationWaitingForPair;
    case 6: return ConferenceEscalationWaitingForPeer;
    case 7: return ConferenceEscalationCompleted;
    case 8: return ConferenceEscalationFailed;
    case 9: return ConferenceEscalationAwaitingDisclaimerResponse;
    case 10: return ConferenceEscalationAwaitingJoinDialogResponse;
    default: return new ConferenceEscalationProgress(value);
    }
  }
}
