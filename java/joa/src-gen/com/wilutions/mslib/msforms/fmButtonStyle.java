/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{FDE774C0-9AA8-11CD-84DB-00006B82871A}")
public class fmButtonStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmButtonStyle fmButtonStylePushButton = new fmButtonStyle(0);
  public final static fmButtonStyle fmButtonStyleToggleButton = new fmButtonStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmButtonStylePushButton = 0;
  public final static int _fmButtonStyleToggleButton = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmButtonStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmButtonStyle valueOf(int value) {
    switch(value) {
    case 0: return fmButtonStylePushButton;
    case 1: return fmButtonStyleToggleButton;
    default: return new fmButtonStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmButtonStylePushButton";
    case 1: return "fmButtonStyleToggleButton";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmButtonStylePushButton");
      if ((value & 1) != 0) sbuf.append("|fmButtonStyleToggleButton");
      return sbuf.toString();
      }
    }
  }
}
