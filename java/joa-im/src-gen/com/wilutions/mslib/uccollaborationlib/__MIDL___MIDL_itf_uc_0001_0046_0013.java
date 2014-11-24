/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0013.
 * Enumerates the various states of the disclaimer response property. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0013 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0013 ucConferenceDisclaimerNone = new __MIDL___MIDL_itf_uc_0001_0046_0013(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0013 ucConferenceDisclaimerRejected = new __MIDL___MIDL_itf_uc_0001_0046_0013(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0013 ucConferenceDisclaimerAccepted = new __MIDL___MIDL_itf_uc_0001_0046_0013(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConferenceDisclaimerNone = 0;
  public final static int _ucConferenceDisclaimerRejected = 1;
  public final static int _ucConferenceDisclaimerAccepted = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0013(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0013 valueOf(int value) {
    switch(value) {
    case 0: return ucConferenceDisclaimerNone;
    case 1: return ucConferenceDisclaimerRejected;
    case 2: return ucConferenceDisclaimerAccepted;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0013(value);
    }
  }
}
