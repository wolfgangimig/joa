/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0143_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0143_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityNone = new __MIDL___MIDL_itf_uc_0001_0143_0001(0);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityFree = new __MIDL___MIDL_itf_uc_0001_0143_0001(3500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityFreeIdle = new __MIDL___MIDL_itf_uc_0001_0143_0001(5000);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityBusy = new __MIDL___MIDL_itf_uc_0001_0143_0001(6500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityBusyIdle = new __MIDL___MIDL_itf_uc_0001_0143_0001(7500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityDoNotDisturb = new __MIDL___MIDL_itf_uc_0001_0143_0001(9500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityTemporarilyAway = new __MIDL___MIDL_itf_uc_0001_0143_0001(12500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityAway = new __MIDL___MIDL_itf_uc_0001_0143_0001(15500);
  public final static __MIDL___MIDL_itf_uc_0001_0143_0001 ucAvailabilityOffline = new __MIDL___MIDL_itf_uc_0001_0143_0001(18500);

  // Integer constants for bitsets and switch statements
  public final static int _ucAvailabilityNone = 0;
  public final static int _ucAvailabilityFree = 3500;
  public final static int _ucAvailabilityFreeIdle = 5000;
  public final static int _ucAvailabilityBusy = 6500;
  public final static int _ucAvailabilityBusyIdle = 7500;
  public final static int _ucAvailabilityDoNotDisturb = 9500;
  public final static int _ucAvailabilityTemporarilyAway = 12500;
  public final static int _ucAvailabilityAway = 15500;
  public final static int _ucAvailabilityOffline = 18500;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0143_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0143_0001 valueOf(int value) {
    switch(value) {
    case 0: return ucAvailabilityNone;
    case 3500: return ucAvailabilityFree;
    case 5000: return ucAvailabilityFreeIdle;
    case 6500: return ucAvailabilityBusy;
    case 7500: return ucAvailabilityBusyIdle;
    case 9500: return ucAvailabilityDoNotDisturb;
    case 12500: return ucAvailabilityTemporarilyAway;
    case 15500: return ucAvailabilityAway;
    case 18500: return ucAvailabilityOffline;
    default: return new __MIDL___MIDL_itf_uc_0001_0143_0001(value);
    }
  }
}
