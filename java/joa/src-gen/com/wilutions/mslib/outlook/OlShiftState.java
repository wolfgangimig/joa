/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlShiftState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{B791AC59-1E79-4007-A6A1-4A4FE62F8D03}")
public class OlShiftState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlShiftState olShiftStateShiftMask = new OlShiftState(1);
  public final static OlShiftState olShiftStateCtrlMask = new OlShiftState(2);
  public final static OlShiftState olShiftStateAltMask = new OlShiftState(4);

  // Integer constants for bitsets and switch statements
  public final static int _olShiftStateShiftMask = 1;
  public final static int _olShiftStateCtrlMask = 2;
  public final static int _olShiftStateAltMask = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlShiftState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlShiftState valueOf(int value) {
    switch(value) {
    case 1: return olShiftStateShiftMask;
    case 2: return olShiftStateCtrlMask;
    case 4: return olShiftStateAltMask;
    default: return new OlShiftState(value);
    }
  }
}
