/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConferenceAdmissionType.
 * Enumerates the conference admission types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConferenceAdmissionType {

  // Typed constants
  public final static ConferenceAdmissionType ucOpenAuthenticated = new ConferenceAdmissionType(1);
  public final static ConferenceAdmissionType ucClosedAuthenticated = new ConferenceAdmissionType(2);
  public final static ConferenceAdmissionType ucAnonymous = new ConferenceAdmissionType(3);
  public final static ConferenceAdmissionType ucLocked = new ConferenceAdmissionType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucOpenAuthenticated = 1;
  public final static int _ucClosedAuthenticated = 2;
  public final static int _ucAnonymous = 3;
  public final static int _ucLocked = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConferenceAdmissionType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConferenceAdmissionType valueOf(int value) {
    switch(value) {
    case 1: return ucOpenAuthenticated;
    case 2: return ucClosedAuthenticated;
    case 3: return ucAnonymous;
    case 4: return ucLocked;
    default: return new ConferenceAdmissionType(value);
    }
  }
}
