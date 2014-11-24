/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactType.
 * Enumerates the contact types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactType {

  // Typed constants
  public final static ContactType ucContactPresentityUnknown = new ContactType(0);
  public final static ContactType ucContactPresentityPerson = new ContactType(1);
  public final static ContactType ucContactPresentityHuntgroup = new ContactType(2);
  public final static ContactType ucContactPresentityAutoAttendant = new ContactType(3);
  public final static ContactType ucContactPresentityAutomatedBot = new ContactType(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactPresentityUnknown = 0;
  public final static int _ucContactPresentityPerson = 1;
  public final static int _ucContactPresentityHuntgroup = 2;
  public final static int _ucContactPresentityAutoAttendant = 3;
  public final static int _ucContactPresentityAutomatedBot = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactType valueOf(int value) {
    switch(value) {
    case 0: return ucContactPresentityUnknown;
    case 1: return ucContactPresentityPerson;
    case 2: return ucContactPresentityHuntgroup;
    case 3: return ucContactPresentityAutoAttendant;
    case 4: return ucContactPresentityAutomatedBot;
    default: return new ContactType(value);
    }
  }
}
