/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantEventStateChangeAlsoRingingOthers.
 * Enumerates participant event state change also ringing others property values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ParticipantEventStateChangeAlsoRingingOthers {
  ucAlsoRingingOthersAdmins(0),
  ucAlsoRingingOthersTeam(1);

  public final int value;
  private ParticipantEventStateChangeAlsoRingingOthers(int value) { this.value = value; }
  public static  ParticipantEventStateChangeAlsoRingingOthers valueOf(int value) {
    switch(value) {
    case 0: return ucAlsoRingingOthersAdmins;
    case 1: return ucAlsoRingingOthersTeam;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ParticipantEventStateChangeAlsoRingingOthers.class);
    }
  }
}
