/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantProperty.
 * Enumerates the participant properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ParticipantProperty {
  ucParticipantRepresentedBy(1074397184),
  ucParticipantReferredByUri(1074397185),
  ucParticipantName(655362),
  ucParticipantIsAnonymous(269090819),
  ucParticipantIsAuthenticated(269090820),
  ucParticipantIsInLobby(269090821),
  ucParticipantIsLeader(269090822),
  ucParticipantIsCallParkService(269090823),
  ucParticipantParkedCall(655368),
  ucParticipantSoftMuteChangeInitiator(805961737),
  ucParticipantIsRecording(269090826),
  ucParticipantIsPresenter(269090827),
  ucParticipantEndorserName(655372),
  ucParticipantEndorserUri(655373),
  ucParticipantIsPinned(269090830),
  ucParticipantIsLocked(269090831),
  ucParticipantAnonymizedResponseGroupAgent(269123585),
  ucParticipantAsOrganizer(269123586);

  public final int value;
  private ParticipantProperty(int value) { this.value = value; }
  public static  ParticipantProperty valueOf(int value) {
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ParticipantProperty.class);
    }
  }
}
