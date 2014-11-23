/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactType.
 * Enumerates the contact types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactType {
  ucContactPresentityUnknown(0),
  ucContactPresentityPerson(1),
  ucContactPresentityHuntgroup(2),
  ucContactPresentityAutoAttendant(3),
  ucContactPresentityAutomatedBot(4);

  public final int value;
  private ContactType(int value) { this.value = value; }
  public static  ContactType valueOf(int value) {
    switch(value) {
    case 0: return ucContactPresentityUnknown;
    case 1: return ucContactPresentityPerson;
    case 2: return ucContactPresentityHuntgroup;
    case 3: return ucContactPresentityAutoAttendant;
    case 4: return ucContactPresentityAutomatedBot;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactType.class);
    }
  }
}
