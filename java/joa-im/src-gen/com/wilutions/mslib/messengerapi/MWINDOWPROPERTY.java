/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.messengerapi;
import com.wilutions.com.*;

/**
 * MWINDOWPROPERTY.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MWINDOWPROPERTY {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MWINDOWPROPERTY MWINDOWPROP_INVALID_PROPERTY = new MWINDOWPROPERTY(-1);
  public final static MWINDOWPROPERTY MWINDOWPROP_VIEW_SIDEBAR = new MWINDOWPROPERTY(0);
  public final static MWINDOWPROPERTY MWINDOWPROP_VIEW_TOOLBAR = new MWINDOWPROPERTY(1);

  // Integer constants for bitsets and switch statements
  public final static int _MWINDOWPROP_INVALID_PROPERTY = -1;
  public final static int _MWINDOWPROP_VIEW_SIDEBAR = 0;
  public final static int _MWINDOWPROP_VIEW_TOOLBAR = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MWINDOWPROPERTY(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MWINDOWPROPERTY valueOf(int value) {
    switch(value) {
    case -1: return MWINDOWPROP_INVALID_PROPERTY;
    case 0: return MWINDOWPROP_VIEW_SIDEBAR;
    case 1: return MWINDOWPROP_VIEW_TOOLBAR;
    default: return new MWINDOWPROPERTY(value);
    }
  }
}
