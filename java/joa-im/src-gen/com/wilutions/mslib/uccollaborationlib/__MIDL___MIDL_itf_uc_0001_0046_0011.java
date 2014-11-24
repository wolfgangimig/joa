/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0011.
 * Enumerates the progressive stages of a conversation's escalation to conference. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0011 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationNotStarted = new __MIDL___MIDL_itf_uc_0001_0046_0011(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationSchedulingConference = new __MIDL___MIDL_itf_uc_0001_0046_0011(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationConnectingToConference = new __MIDL___MIDL_itf_uc_0001_0046_0011(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationConnectedToLobby = new __MIDL___MIDL_itf_uc_0001_0046_0011(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationJoiningLocalMedia = new __MIDL___MIDL_itf_uc_0001_0046_0011(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationWaitingForPair = new __MIDL___MIDL_itf_uc_0001_0046_0011(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationWaitingForPeer = new __MIDL___MIDL_itf_uc_0001_0046_0011(6);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationCompleted = new __MIDL___MIDL_itf_uc_0001_0046_0011(7);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationFailed = new __MIDL___MIDL_itf_uc_0001_0046_0011(8);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationAwaitingDisclaimerResponse = new __MIDL___MIDL_itf_uc_0001_0046_0011(9);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0011 ConferenceEscalationAwaitingJoinDialogResponse = new __MIDL___MIDL_itf_uc_0001_0046_0011(10);

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
  private __MIDL___MIDL_itf_uc_0001_0046_0011(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0011 valueOf(int value) {
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
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0011(value);
    }
  }
}
