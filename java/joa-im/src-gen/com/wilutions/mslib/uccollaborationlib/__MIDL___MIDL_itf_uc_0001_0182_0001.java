/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0182_0001.
 * Enumerates the actions on collaboration utilities. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0182_0001 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0182_0001 ucUtilitiesActionShowPropertiesDialog = new __MIDL___MIDL_itf_uc_0001_0182_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0182_0001 ucUtilitiesActionAddToExternalContacts = new __MIDL___MIDL_itf_uc_0001_0182_0001(1);
  public final static __MIDL___MIDL_itf_uc_0001_0182_0001 ucUtilitiesActionFindPreviousConverstations = new __MIDL___MIDL_itf_uc_0001_0182_0001(2);
  public final static __MIDL___MIDL_itf_uc_0001_0182_0001 ucUtilitiesActionComposeEmail = new __MIDL___MIDL_itf_uc_0001_0182_0001(3);
  public final static __MIDL___MIDL_itf_uc_0001_0182_0001 ucUtilitiesActionScheduleMeeting = new __MIDL___MIDL_itf_uc_0001_0182_0001(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucUtilitiesActionShowPropertiesDialog = 0;
  public final static int _ucUtilitiesActionAddToExternalContacts = 1;
  public final static int _ucUtilitiesActionFindPreviousConverstations = 2;
  public final static int _ucUtilitiesActionComposeEmail = 3;
  public final static int _ucUtilitiesActionScheduleMeeting = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0182_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0182_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucUtilitiesActionShowPropertiesDialog;
    case 1: return ucUtilitiesActionAddToExternalContacts;
    case 2: return ucUtilitiesActionFindPreviousConverstations;
    case 3: return ucUtilitiesActionComposeEmail;
    case 4: return ucUtilitiesActionScheduleMeeting;
    default: return new __MIDL___MIDL_itf_uc_0001_0182_0001(value);
    }
  }
}
