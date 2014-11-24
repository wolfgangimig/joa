/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0047.
 * Enumerates the detail of why sharing a particular resource is allowed or not allowed. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0047 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailAllowed = new __MIDL___MIDL_itf_uc_0001_0046_0047(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailDisabledByPolicy = new __MIDL___MIDL_itf_uc_0001_0046_0047(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailDisabledByOrganizerPolicy = new __MIDL___MIDL_itf_uc_0001_0046_0047(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailDisabledByRole = new __MIDL___MIDL_itf_uc_0001_0046_0047(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailCannotConnect = new __MIDL___MIDL_itf_uc_0001_0046_0047(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0047 ucCanShareDetailDisabledForOtherReason = new __MIDL___MIDL_itf_uc_0001_0046_0047(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucCanShareDetailAllowed = 0;
  public final static int _ucCanShareDetailDisabledByPolicy = 1;
  public final static int _ucCanShareDetailDisabledByOrganizerPolicy = 2;
  public final static int _ucCanShareDetailDisabledByRole = 3;
  public final static int _ucCanShareDetailCannotConnect = 4;
  public final static int _ucCanShareDetailDisabledForOtherReason = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0047(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0047 valueOf(int value) {
    switch(value) {
    case 0: return ucCanShareDetailAllowed;
    case 1: return ucCanShareDetailDisabledByPolicy;
    case 2: return ucCanShareDetailDisabledByOrganizerPolicy;
    case 3: return ucCanShareDetailDisabledByRole;
    case 4: return ucCanShareDetailCannotConnect;
    case 5: return ucCanShareDetailDisabledForOtherReason;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0047(value);
    }
  }
}
