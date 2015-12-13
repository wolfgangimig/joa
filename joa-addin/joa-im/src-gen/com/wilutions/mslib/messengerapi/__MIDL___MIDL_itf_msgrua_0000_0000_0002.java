/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0002 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0002 MMESSENGERPROP_VERSION = new __MIDL___MIDL_itf_msgrua_0000_0000_0002(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0002 MMESSENGERPROP_PLCID = new __MIDL___MIDL_itf_msgrua_0000_0000_0002(1);

  // Integer constants for bitsets and switch statements
  public final static int _MMESSENGERPROP_VERSION = 0;
  public final static int _MMESSENGERPROP_PLCID = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0002(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0002 valueOf(int value) {
    switch(value) {
    case 0: return MMESSENGERPROP_VERSION;
    case 1: return MMESSENGERPROP_PLCID;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0002(value);
    }
  }
}
