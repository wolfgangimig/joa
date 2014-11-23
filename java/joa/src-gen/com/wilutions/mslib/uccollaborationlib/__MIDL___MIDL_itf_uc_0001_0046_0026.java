/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0026.
 * Enumerates participant event state change also ringing others property values. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0026 {
  ucAlsoRingingOthersAdmins(0),
  ucAlsoRingingOthersTeam(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0026(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0026 valueOf(int value) {
    switch(value) {
    case 0: return ucAlsoRingingOthersAdmins;
    case 1: return ucAlsoRingingOthersTeam;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0026.class);
    }
  }
}
