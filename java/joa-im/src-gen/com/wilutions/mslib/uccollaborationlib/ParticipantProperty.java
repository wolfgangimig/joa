/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantProperty.
 * Enumerates the participant properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ParticipantProperty {

  // Typed constants
  public final static ParticipantProperty ucParticipantRepresentedBy = new ParticipantProperty(1074397184);
  public final static ParticipantProperty ucParticipantReferredByUri = new ParticipantProperty(1074397185);
  public final static ParticipantProperty ucParticipantName = new ParticipantProperty(655362);
  public final static ParticipantProperty ucParticipantIsAnonymous = new ParticipantProperty(269090819);
  public final static ParticipantProperty ucParticipantIsAuthenticated = new ParticipantProperty(269090820);
  public final static ParticipantProperty ucParticipantIsInLobby = new ParticipantProperty(269090821);
  public final static ParticipantProperty ucParticipantIsLeader = new ParticipantProperty(269090822);
  public final static ParticipantProperty ucParticipantIsCallParkService = new ParticipantProperty(269090823);
  public final static ParticipantProperty ucParticipantParkedCall = new ParticipantProperty(655368);
  public final static ParticipantProperty ucParticipantSoftMuteChangeInitiator = new ParticipantProperty(805961737);
  public final static ParticipantProperty ucParticipantIsRecording = new ParticipantProperty(269090826);
  public final static ParticipantProperty ucParticipantIsPresenter = new ParticipantProperty(269090827);
  public final static ParticipantProperty ucParticipantEndorserName = new ParticipantProperty(655372);
  public final static ParticipantProperty ucParticipantEndorserUri = new ParticipantProperty(655373);
  public final static ParticipantProperty ucParticipantIsPinned = new ParticipantProperty(269090830);
  public final static ParticipantProperty ucParticipantIsLocked = new ParticipantProperty(269090831);
  public final static ParticipantProperty ucParticipantAnonymizedResponseGroupAgent = new ParticipantProperty(269123585);
  public final static ParticipantProperty ucParticipantAsOrganizer = new ParticipantProperty(269123586);

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
  private ParticipantProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ParticipantProperty(value);
    }
  }
}
