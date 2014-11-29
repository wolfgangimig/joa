/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0004.
 * Enumerates the modality states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0004 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityDisconnected = new __MIDL___MIDL_itf_uc_0001_0046_0004(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityConnecting = new __MIDL___MIDL_itf_uc_0001_0046_0004(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityNotified = new __MIDL___MIDL_itf_uc_0001_0046_0004(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityJoining = new __MIDL___MIDL_itf_uc_0001_0046_0004(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityConnectingToCaller = new __MIDL___MIDL_itf_uc_0001_0046_0004(4);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityConnected = new __MIDL___MIDL_itf_uc_0001_0046_0004(5);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalitySuspended = new __MIDL___MIDL_itf_uc_0001_0046_0004(6);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0004(7);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityForwarding = new __MIDL___MIDL_itf_uc_0001_0046_0004(8);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityTransferring = new __MIDL___MIDL_itf_uc_0001_0046_0004(9);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0004 ucModalityDisconnecting = new __MIDL___MIDL_itf_uc_0001_0046_0004(10);

  // Integer constants for bitsets and switch statements
  public final static int _ucModalityDisconnected = 0;
  public final static int _ucModalityConnecting = 1;
  public final static int _ucModalityNotified = 2;
  public final static int _ucModalityJoining = 3;
  public final static int _ucModalityConnectingToCaller = 4;
  public final static int _ucModalityConnected = 5;
  public final static int _ucModalitySuspended = 6;
  public final static int _ucModalityOnHold = 7;
  public final static int _ucModalityForwarding = 8;
  public final static int _ucModalityTransferring = 9;
  public final static int _ucModalityDisconnecting = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0004 valueOf(int value) {
    switch(value) {
    case 0: return ucModalityDisconnected;
    case 1: return ucModalityConnecting;
    case 2: return ucModalityNotified;
    case 3: return ucModalityJoining;
    case 4: return ucModalityConnectingToCaller;
    case 5: return ucModalityConnected;
    case 6: return ucModalitySuspended;
    case 7: return ucModalityOnHold;
    case 8: return ucModalityForwarding;
    case 9: return ucModalityTransferring;
    case 10: return ucModalityDisconnecting;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0004(value);
    }
  }
}
