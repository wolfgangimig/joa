/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0047.
 * Enumerates the detail of why sharing a particular resource is allowed or not allowed. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0047 {
  ucCanShareDetailAllowed(0),
  ucCanShareDetailDisabledByPolicy(1),
  ucCanShareDetailDisabledByOrganizerPolicy(2),
  ucCanShareDetailDisabledByRole(3),
  ucCanShareDetailCannotConnect(4),
  ucCanShareDetailDisabledForOtherReason(5);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0047(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0047 valueOf(int value) {
    switch(value) {
    case 0: return ucCanShareDetailAllowed;
    case 1: return ucCanShareDetailDisabledByPolicy;
    case 2: return ucCanShareDetailDisabledByOrganizerPolicy;
    case 3: return ucCanShareDetailDisabledByRole;
    case 4: return ucCanShareDetailCannotConnect;
    case 5: return ucCanShareDetailDisabledForOtherReason;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0047.class);
    }
  }
}
