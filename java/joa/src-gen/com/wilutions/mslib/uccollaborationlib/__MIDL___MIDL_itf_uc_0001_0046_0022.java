/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0022.
 * Enumerates the representation type of the representation info. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0022 {
  ucRepresentationTypeDelegate(0),
  ucRepresentationTypeTeam(1),
  ucRepresentationTypeAutomaticCallDistributor(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0022(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0022 valueOf(int value) {
    switch(value) {
    case 0: return ucRepresentationTypeDelegate;
    case 1: return ucRepresentationTypeTeam;
    case 2: return ucRepresentationTypeAutomaticCallDistributor;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0022.class);
    }
  }
}
