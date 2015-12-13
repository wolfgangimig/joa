/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ParticipantEventStateChangeAlsoRingingOthers.
 * Enumerates participant event state change also ringing others property values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ParticipantEventStateChangeAlsoRingingOthers {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ParticipantEventStateChangeAlsoRingingOthers ucAlsoRingingOthersAdmins = new ParticipantEventStateChangeAlsoRingingOthers(0);
  public final static ParticipantEventStateChangeAlsoRingingOthers ucAlsoRingingOthersTeam = new ParticipantEventStateChangeAlsoRingingOthers(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucAlsoRingingOthersAdmins = 0;
  public final static int _ucAlsoRingingOthersTeam = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ParticipantEventStateChangeAlsoRingingOthers(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ParticipantEventStateChangeAlsoRingingOthers valueOf(int value) {
    switch(value) {
    case 0: return ucAlsoRingingOthersAdmins;
    case 1: return ucAlsoRingingOthersTeam;
    default: return new ParticipantEventStateChangeAlsoRingingOthers(value);
    }
  }
}
