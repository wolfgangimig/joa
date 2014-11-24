/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C63BD250-BCAA-11CE-B64D-00AA004CD6D8}")
public class fmMode {

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
}
