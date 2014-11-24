/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0030.
 * Enumerates the participant properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0030 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantRepresentedBy = new __MIDL___MIDL_itf_uc_0001_0046_0030(1074397184);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantReferredByUri = new __MIDL___MIDL_itf_uc_0001_0046_0030(1074397185);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantName = new __MIDL___MIDL_itf_uc_0001_0046_0030(655362);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsAnonymous = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090819);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsAuthenticated = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090820);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsInLobby = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090821);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsLeader = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090822);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsCallParkService = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090823);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantParkedCall = new __MIDL___MIDL_itf_uc_0001_0046_0030(655368);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantSoftMuteChangeInitiator = new __MIDL___MIDL_itf_uc_0001_0046_0030(805961737);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsRecording = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090826);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsPresenter = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090827);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantEndorserName = new __MIDL___MIDL_itf_uc_0001_0046_0030(655372);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantEndorserUri = new __MIDL___MIDL_itf_uc_0001_0046_0030(655373);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsPinned = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090830);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantIsLocked = new __MIDL___MIDL_itf_uc_0001_0046_0030(269090831);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantAnonymizedResponseGroupAgent = new __MIDL___MIDL_itf_uc_0001_0046_0030(269123585);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0030 ucParticipantAsOrganizer = new __MIDL___MIDL_itf_uc_0001_0046_0030(269123586);

  // Integer constants for bitsets and switch statements
  public final static int _ucParticipantRepresentedBy = 1074397184;
  public final static int _ucParticipantReferredByUri = 1074397185;
  public final static int _ucParticipantName = 655362;
  public final static int _ucParticipantIsAnonymous = 269090819;
  public final static int _ucParticipantIsAuthenticated = 269090820;
  public final static int _ucParticipantIsInLobby = 269090821;
  public final static int _ucParticipantIsLeader = 269090822;
  public final static int _ucParticipantIsCallParkService = 269090823;
  public final static int _ucParticipantParkedCall = 655368;
  public final static int _ucParticipantSoftMuteChangeInitiator = 805961737;
  public final static int _ucParticipantIsRecording = 269090826;
  public final static int _ucParticipantIsPresenter = 269090827;
  public final static int _ucParticipantEndorserName = 655372;
  public final static int _ucParticipantEndorserUri = 655373;
  public final static int _ucParticipantIsPinned = 269090830;
  public final static int _ucParticipantIsLocked = 269090831;
  public final static int _ucParticipantAnonymizedResponseGroupAgent = 269123585;
  public final static int _ucParticipantAsOrganizer = 269123586;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0030(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0030 valueOf(int value) {
    switch(value) {
    case 1074397184: return ucParticipantRepresentedBy;
    case 1074397185: return ucParticipantReferredByUri;
    case 655362: return ucParticipantName;
    case 269090819: return ucParticipantIsAnonymous;
    case 269090820: return ucParticipantIsAuthenticated;
    case 269090821: return ucParticipantIsInLobby;
    case 269090822: return ucParticipantIsLeader;
    case 269090823: return ucParticipantIsCallParkService;
    case 655368: return ucParticipantParkedCall;
    case 805961737: return ucParticipantSoftMuteChangeInitiator;
    case 269090826: return ucParticipantIsRecording;
    case 269090827: return ucParticipantIsPresenter;
    case 655372: return ucParticipantEndorserName;
    case 655373: return ucParticipantEndorserUri;
    case 269090830: return ucParticipantIsPinned;
    case 269090831: return ucParticipantIsLocked;
    case 269123585: return ucParticipantAnonymizedResponseGroupAgent;
    case 269123586: return ucParticipantAsOrganizer;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0030(value);
    }
  }
}
