/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0003.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0003 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0003 MCONTACTPROP_INVALID_PROPERTY = new __MIDL___MIDL_itf_msgrua_0000_0000_0003(-1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0003 MCONTACTPROP_GROUPS_PROPERTY = new __MIDL___MIDL_itf_msgrua_0000_0000_0003(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0003 MCONTACTPROP_EMAIL = new __MIDL___MIDL_itf_msgrua_0000_0000_0003(1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0003 MCONTACTPROP_USERTILE_PATH = new __MIDL___MIDL_itf_msgrua_0000_0000_0003(2);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0003 MCONTACTPROP_CUSTOMER_ID = new __MIDL___MIDL_itf_msgrua_0000_0000_0003(3);

  // Integer constants for bitsets and switch statements
  public final static int _MCONTACTPROP_INVALID_PROPERTY = -1;
  public final static int _MCONTACTPROP_GROUPS_PROPERTY = 0;
  public final static int _MCONTACTPROP_EMAIL = 1;
  public final static int _MCONTACTPROP_USERTILE_PATH = 2;
  public final static int _MCONTACTPROP_CUSTOMER_ID = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0003(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0003 valueOf(int value) {
    switch(value) {
    case -1: return MCONTACTPROP_INVALID_PROPERTY;
    case 0: return MCONTACTPROP_GROUPS_PROPERTY;
    case 1: return MCONTACTPROP_EMAIL;
    case 2: return MCONTACTPROP_USERTILE_PATH;
    case 3: return MCONTACTPROP_CUSTOMER_ID;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0003(value);
    }
  }
}
