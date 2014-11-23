/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0041.
 * Defines the specific reason why a previously-parked call was unparked. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0041 {
  ucUnparkReasonNone(0),
  ucUnparkReasonAbandoned(1),
  ucUnparkReasonDisconnected(2),
  ucUnparkReasonFallback(3),
  ucUnparkReasonRetrieved(4),
  ucUnparkReasonRingback(5),
  ucUnparkReasonUnknown(6);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0041(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0041 valueOf(int value) {
    switch(value) {
    case 0: return ucUnparkReasonNone;
    case 1: return ucUnparkReasonAbandoned;
    case 2: return ucUnparkReasonDisconnected;
    case 3: return ucUnparkReasonFallback;
    case 4: return ucUnparkReasonRetrieved;
    case 5: return ucUnparkReasonRingback;
    case 6: return ucUnparkReasonUnknown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0041.class);
    }
  }
}
