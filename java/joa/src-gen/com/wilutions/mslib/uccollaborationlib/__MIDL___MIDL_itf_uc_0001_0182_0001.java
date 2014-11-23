/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0182_0001.
 * Enumerates the actions on collaboration utilities. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0182_0001 {
  ucUtilitiesActionShowPropertiesDialog(0),
  ucUtilitiesActionAddToExternalContacts(1),
  ucUtilitiesActionFindPreviousConverstations(2),
  ucUtilitiesActionComposeEmail(3),
  ucUtilitiesActionScheduleMeeting(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0182_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0182_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucUtilitiesActionShowPropertiesDialog;
    case 1: return ucUtilitiesActionAddToExternalContacts;
    case 2: return ucUtilitiesActionFindPreviousConverstations;
    case 3: return ucUtilitiesActionComposeEmail;
    case 4: return ucUtilitiesActionScheduleMeeting;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0182_0001.class);
    }
  }
}
