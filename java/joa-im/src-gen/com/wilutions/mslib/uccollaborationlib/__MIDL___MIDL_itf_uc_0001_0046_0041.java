/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0041.
 * Defines the specific reason why a previously-parked call was unparked. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0041 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonNone = new __MIDL___MIDL_itf_uc_0001_0046_0041(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonAbandoned = new __MIDL___MIDL_itf_uc_0001_0046_0041(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonDisconnected = new __MIDL___MIDL_itf_uc_0001_0046_0041(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonFallback = new __MIDL___MIDL_itf_uc_0001_0046_0041(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonRetrieved = new __MIDL___MIDL_itf_uc_0001_0046_0041(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonRingback = new __MIDL___MIDL_itf_uc_0001_0046_0041(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0041 ucUnparkReasonUnknown = new __MIDL___MIDL_itf_uc_0001_0046_0041(6);

  // Integer constants for bitsets and switch statements
  public final static int _ucUnparkReasonNone = 0;
  public final static int _ucUnparkReasonAbandoned = 1;
  public final static int _ucUnparkReasonDisconnected = 2;
  public final static int _ucUnparkReasonFallback = 3;
  public final static int _ucUnparkReasonRetrieved = 4;
  public final static int _ucUnparkReasonRingback = 5;
  public final static int _ucUnparkReasonUnknown = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0041(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0041 valueOf(int value) {
    switch(value) {
    case 0: return ucUnparkReasonNone;
    case 1: return ucUnparkReasonAbandoned;
    case 2: return ucUnparkReasonDisconnected;
    case 3: return ucUnparkReasonFallback;
    case 4: return ucUnparkReasonRetrieved;
    case 5: return ucUnparkReasonRingback;
    case 6: return ucUnparkReasonUnknown;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0041(value);
    }
  }
}
