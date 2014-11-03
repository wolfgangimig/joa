/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmButtonStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{FDE774C0-9AA8-11CD-84DB-00006B82871A}")
public enum fmButtonStyle {
  fmButtonStylePushButton(0),
  fmButtonStyleToggleButton(1);

  public final int value;
  private fmButtonStyle(int value) { this.value = value; }
  public static  fmButtonStyle valueOf(int value) {
    switch(value) {
    case 0: return fmButtonStylePushButton;
    case 1: return fmButtonStyleToggleButton;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmButtonStyle.class);
    }
  }
}
