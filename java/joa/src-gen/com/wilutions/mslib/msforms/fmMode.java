/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C63BD250-BCAA-11CE-B64D-00AA004CD6D8}")
public class fmMode implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmMode fmModeInherit = new fmMode(-2);
  public final static fmMode fmModeOn = new fmMode(-1);
  public final static fmMode fmModeOff = new fmMode(0);

  // Integer constants for bitsets and switch statements
  public final static int _fmModeInherit = -2;
  public final static int _fmModeOn = -1;
  public final static int _fmModeOff = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmMode valueOf(int value) {
    switch(value) {
    case -2: return fmModeInherit;
    case -1: return fmModeOn;
    case 0: return fmModeOff;
    default: return new fmMode(value);
    }
  }

  public String toString() {
    switch(value) {
    case -2: return "fmModeInherit";
    case -1: return "fmModeOn";
    case 0: return "fmModeOff";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -2) != 0) sbuf.append("|fmModeInherit");
      if ((value & -1) != 0) sbuf.append("|fmModeOn");
      if ((value & 0) != 0) sbuf.append("|fmModeOff");
      return sbuf.toString();
      }
    }
  }
}
