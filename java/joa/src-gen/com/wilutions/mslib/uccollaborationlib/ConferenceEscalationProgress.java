/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceEscalationProgress.
 * Enumerates the progressive stages of a conversation's escalation to conference. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConferenceEscalationProgress {
  ConferenceEscalationNotStarted(0),
  ConferenceEscalationSchedulingConference(1),
  ConferenceEscalationConnectingToConference(2),
  ConferenceEscalationConnectedToLobby(3),
  ConferenceEscalationJoiningLocalMedia(4),
  ConferenceEscalationWaitingForPair(5),
  ConferenceEscalationWaitingForPeer(6),
  ConferenceEscalationCompleted(7),
  ConferenceEscalationFailed(8),
  ConferenceEscalationAwaitingDisclaimerResponse(9),
  ConferenceEscalationAwaitingJoinDialogResponse(10);

  public final int value;
  private ConferenceEscalationProgress(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConferenceEscalationProgress.class);
    }
  }
}
