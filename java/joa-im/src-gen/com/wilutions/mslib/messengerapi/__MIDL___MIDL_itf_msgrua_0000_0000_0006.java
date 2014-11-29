/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0006.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0006 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_GENERAL_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_PRIVACY_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_EXCHANGE_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(2);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_ACCOUNTS_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(3);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_CONNECTION_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(4);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_PREFERENCES_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(5);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_SERVICES_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(6);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0006 MOPT_PHONE_PAGE = new __MIDL___MIDL_itf_msgrua_0000_0000_0006(7);

  // Integer constants for bitsets and switch statements
  public final static int _MOPT_GENERAL_PAGE = 0;
  public final static int _MOPT_PRIVACY_PAGE = 1;
  public final static int _MOPT_EXCHANGE_PAGE = 2;
  public final static int _MOPT_ACCOUNTS_PAGE = 3;
  public final static int _MOPT_CONNECTION_PAGE = 4;
  public final static int _MOPT_PREFERENCES_PAGE = 5;
  public final static int _MOPT_SERVICES_PAGE = 6;
  public final static int _MOPT_PHONE_PAGE = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0006 valueOf(int value) {
    switch(value) {
    case 0: return MOPT_GENERAL_PAGE;
    case 1: return MOPT_PRIVACY_PAGE;
    case 2: return MOPT_EXCHANGE_PAGE;
    case 3: return MOPT_ACCOUNTS_PAGE;
    case 4: return MOPT_CONNECTION_PAGE;
    case 5: return MOPT_PREFERENCES_PAGE;
    case 6: return MOPT_SERVICES_PAGE;
    case 7: return MOPT_PHONE_PAGE;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0006(value);
    }
  }
}
