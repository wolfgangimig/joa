/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_msgrua_0000_0000_0004.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_msgrua_0000_0000_0004 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0004 MWINDOWPROP_INVALID_PROPERTY = new __MIDL___MIDL_itf_msgrua_0000_0000_0004(-1);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0004 MWINDOWPROP_VIEW_SIDEBAR = new __MIDL___MIDL_itf_msgrua_0000_0000_0004(0);
  public final static __MIDL___MIDL_itf_msgrua_0000_0000_0004 MWINDOWPROP_VIEW_TOOLBAR = new __MIDL___MIDL_itf_msgrua_0000_0000_0004(1);

  // Integer constants for bitsets and switch statements
  public final static int _MWINDOWPROP_INVALID_PROPERTY = -1;
  public final static int _MWINDOWPROP_VIEW_SIDEBAR = 0;
  public final static int _MWINDOWPROP_VIEW_TOOLBAR = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_msgrua_0000_0000_0004(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_msgrua_0000_0000_0004 valueOf(int value) {
    switch(value) {
    case -1: return MWINDOWPROP_INVALID_PROPERTY;
    case 0: return MWINDOWPROP_VIEW_SIDEBAR;
    case 1: return MWINDOWPROP_VIEW_TOOLBAR;
    default: return new __MIDL___MIDL_itf_msgrua_0000_0000_0004(value);
    }
  }
}
