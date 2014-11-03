/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C63BD250-BCAA-11CE-B64D-00AA004CD6D8}")
public enum fmMode {
  fmModeInherit(-2),
  fmModeOn(-1),
  fmModeOff(0);

  public final int value;
  private fmMode(int value) { this.value = value; }
  public static  fmMode valueOf(int value) {
    switch(value) {
    case -2: return fmModeInherit;
    case -1: return fmModeOn;
    case 0: return fmModeOff;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmMode.class);
    }
  }
}
