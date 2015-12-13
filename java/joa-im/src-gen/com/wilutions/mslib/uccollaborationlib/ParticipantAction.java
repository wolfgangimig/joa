/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantAction.
 * Enumerates the participant actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ParticipantAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ParticipantAction ucParticipantActionSetProperty = new ParticipantAction(0);
  public final static ParticipantAction ucParticipantActionAdmit = new ParticipantAction(1);
  public final static ParticipantAction ucParticipantActionDeny = new ParticipantAction(2);
  public final static ParticipantAction ucParticipantActionPin = new ParticipantAction(3);
  public final static ParticipantAction ucParticipantActionLock = new ParticipantAction(4);
  public final static ParticipantAction ucParticipantActionSetMute = new ParticipantAction(5);
  public final static ParticipantAction ucParticipantEjectAction = new ParticipantAction(5000);
  public final static ParticipantAction ucParticipantRemoveAction = new ParticipantAction(5001);

  // Integer constants for bitsets and switch statements
  public final static int _ucParticipantActionSetProperty = 0;
  public final static int _ucParticipantActionAdmit = 1;
  public final static int _ucParticipantActionDeny = 2;
  public final static int _ucParticipantActionPin = 3;
  public final static int _ucParticipantActionLock = 4;
  public final static int _ucParticipantActionSetMute = 5;
  public final static int _ucParticipantEjectAction = 5000;
  public final static int _ucParticipantRemoveAction = 5001;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ParticipantAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new ParticipantAction(value);
    }
  }
}
