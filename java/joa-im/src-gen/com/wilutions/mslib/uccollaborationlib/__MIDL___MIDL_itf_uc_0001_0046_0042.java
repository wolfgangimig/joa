/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0042.
 * Enumerates the possible reasons for the most recent SoftMute state change. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0042 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0042 ucMuteInitiatorLocal = new __MIDL___MIDL_itf_uc_0001_0046_0042(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0042 ucMuteInitiatorRemote = new __MIDL___MIDL_itf_uc_0001_0046_0042(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0042 ucMuteInitiatorJoin = new __MIDL___MIDL_itf_uc_0001_0046_0042(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucMuteInitiatorLocal = 0;
  public final static int _ucMuteInitiatorRemote = 1;
  public final static int _ucMuteInitiatorJoin = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0042(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0042 valueOf(int value) {
    switch(value) {
    case 0: return ucMuteInitiatorLocal;
    case 1: return ucMuteInitiatorRemote;
    case 2: return ucMuteInitiatorJoin;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0042(value);
    }
  }
}
