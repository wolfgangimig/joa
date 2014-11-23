/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipationState.
 * Enumerates the application sharing participation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ParticipationState {
  ucParticipationStateNone(0),
  ucParticipationStateViewing(1),
  ucParticipationStateRequestingControl(2),
  ucParticipationStateControlling(3),
  ucParticipationStateSharing(4);

  public final int value;
  private ParticipationState(int value) { this.value = value; }
  public static  ParticipationState valueOf(int value) {
    switch(value) {
    case 0: return ucParticipationStateNone;
    case 1: return ucParticipationStateViewing;
    case 2: return ucParticipationStateRequestingControl;
    case 3: return ucParticipationStateControlling;
    case 4: return ucParticipationStateSharing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ParticipationState.class);
    }
  }
}
