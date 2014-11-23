/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0013.
 * Enumerates the various states of the disclaimer response property. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0013 {
  ucConferenceDisclaimerNone(0),
  ucConferenceDisclaimerRejected(1),
  ucConferenceDisclaimerAccepted(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0013(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0013 valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceDisclaimerNone;
    case 1: return ucConferenceDisclaimerRejected;
    case 2: return ucConferenceDisclaimerAccepted;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0013.class);
    }
  }
}
