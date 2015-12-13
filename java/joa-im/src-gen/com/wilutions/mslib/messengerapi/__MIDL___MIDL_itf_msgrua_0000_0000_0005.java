/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0005.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0005 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0005 MPHONE_TYPE_ALL = new __MIDL___MIDL_itf_msgrua_0000_0000_0005(-1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0005 MPHONE_TYPE_HOME = new __MIDL___MIDL_itf_msgrua_0000_0000_0005(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0005 MPHONE_TYPE_WORK = new __MIDL___MIDL_itf_msgrua_0000_0000_0005(1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0005 MPHONE_TYPE_MOBILE = new __MIDL___MIDL_itf_msgrua_0000_0000_0005(2);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0005 MPHONE_TYPE_CUSTOM = new __MIDL___MIDL_itf_msgrua_0000_0000_0005(3);

  // Integer constants for bitsets and switch statements
  public final static int _MPHONE_TYPE_ALL = -1;
  public final static int _MPHONE_TYPE_HOME = 0;
  public final static int _MPHONE_TYPE_WORK = 1;
  public final static int _MPHONE_TYPE_MOBILE = 2;
  public final static int _MPHONE_TYPE_CUSTOM = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0005(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0005 valueOf(int value) {
    switch(value) {
    case -1: return MPHONE_TYPE_ALL;
    case 0: return MPHONE_TYPE_HOME;
    case 1: return MPHONE_TYPE_WORK;
    case 2: return MPHONE_TYPE_MOBILE;
    case 3: return MPHONE_TYPE_CUSTOM;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0005(value);
    }
  }
}
