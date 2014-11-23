/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * UtilitiesAction.
 * Enumerates the actions on collaboration utilities. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum UtilitiesAction {
  ucUtilitiesActionShowPropertiesDialog(0),
  ucUtilitiesActionAddToExternalContacts(1),
  ucUtilitiesActionFindPreviousConverstations(2),
  ucUtilitiesActionComposeEmail(3),
  ucUtilitiesActionScheduleMeeting(4);

  public final int value;
  private UtilitiesAction(int value) { this.value = value; }
  public static  UtilitiesAction valueOf(int value) {
    switch(value) {
    case 0: return ucUtilitiesActionShowPropertiesDialog;
    case 1: return ucUtilitiesActionAddToExternalContacts;
    case 2: return ucUtilitiesActionFindPreviousConverstations;
    case 3: return ucUtilitiesActionComposeEmail;
    case 4: return ucUtilitiesActionScheduleMeeting;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + UtilitiesAction.class);
    }
  }
}
