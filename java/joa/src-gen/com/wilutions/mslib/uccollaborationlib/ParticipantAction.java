/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantAction.
 * Enumerates the participant actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ParticipantAction {
  ucParticipantActionSetProperty(0),
  ucParticipantActionAdmit(1),
  ucParticipantActionDeny(2),
  ucParticipantActionPin(3),
  ucParticipantActionLock(4),
  ucParticipantActionSetMute(5),
  ucParticipantEjectAction(5000),
  ucParticipantRemoveAction(5001);

  public final int value;
  private ParticipantAction(int value) { this.value = value; }
  public static  ParticipantAction valueOf(int value) {
    switch(value) {
    case 0: return ucParticipantActionSetProperty;
    case 1: return ucParticipantActionAdmit;
    case 2: return ucParticipantActionDeny;
    case 3: return ucParticipantActionPin;
    case 4: return ucParticipantActionLock;
    case 5: return ucParticipantActionSetMute;
    case 5000: return ucParticipantEjectAction;
    case 5001: return ucParticipantRemoveAction;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ParticipantAction.class);
    }
  }
}
