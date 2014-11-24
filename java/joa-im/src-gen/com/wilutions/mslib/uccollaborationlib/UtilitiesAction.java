/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * UtilitiesAction.
 * Enumerates the actions on collaboration utilities. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class UtilitiesAction {

  // Typed constants
  public final static UtilitiesAction ucUtilitiesActionShowPropertiesDialog = new UtilitiesAction(0);
  public final static UtilitiesAction ucUtilitiesActionAddToExternalContacts = new UtilitiesAction(1);
  public final static UtilitiesAction ucUtilitiesActionFindPreviousConverstations = new UtilitiesAction(2);
  public final static UtilitiesAction ucUtilitiesActionComposeEmail = new UtilitiesAction(3);
  public final static UtilitiesAction ucUtilitiesActionScheduleMeeting = new UtilitiesAction(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucUtilitiesActionShowPropertiesDialog = 0;
  public final static int _ucUtilitiesActionAddToExternalContacts = 1;
  public final static int _ucUtilitiesActionFindPreviousConverstations = 2;
  public final static int _ucUtilitiesActionComposeEmail = 3;
  public final static int _ucUtilitiesActionScheduleMeeting = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private UtilitiesAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  UtilitiesAction valueOf(int value) {
    switch(value) {
    case 0: return ucUtilitiesActionShowPropertiesDialog;
    case 1: return ucUtilitiesActionAddToExternalContacts;
    case 2: return ucUtilitiesActionFindPreviousConverstations;
    case 3: return ucUtilitiesActionComposeEmail;
    case 4: return ucUtilitiesActionScheduleMeeting;
    default: return new UtilitiesAction(value);
    }
  }
}
