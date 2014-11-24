/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipationState.
 * Enumerates the application sharing participation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ParticipationState {

  // Typed constants
  public final static ParticipationState ucParticipationStateNone = new ParticipationState(0);
  public final static ParticipationState ucParticipationStateViewing = new ParticipationState(1);
  public final static ParticipationState ucParticipationStateRequestingControl = new ParticipationState(2);
  public final static ParticipationState ucParticipationStateControlling = new ParticipationState(3);
  public final static ParticipationState ucParticipationStateSharing = new ParticipationState(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucParticipationStateNone = 0;
  public final static int _ucParticipationStateViewing = 1;
  public final static int _ucParticipationStateRequestingControl = 2;
  public final static int _ucParticipationStateControlling = 3;
  public final static int _ucParticipationStateSharing = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ParticipationState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ParticipationState valueOf(int value) {
    switch(value) {
    case 0: return ucParticipationStateNone;
    case 1: return ucParticipationStateViewing;
    case 2: return ucParticipationStateRequestingControl;
    case 3: return ucParticipationStateControlling;
    case 4: return ucParticipationStateSharing;
    default: return new ParticipationState(value);
    }
  }
}
