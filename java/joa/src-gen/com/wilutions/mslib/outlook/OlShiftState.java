/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlShiftState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{B791AC59-1E79-4007-A6A1-4A4FE62F8D03}")
public enum OlShiftState {
  olShiftStateShiftMask(1),
  olShiftStateCtrlMask(2),
  olShiftStateAltMask(4);

  public final int value;
  private OlShiftState(int value) { this.value = value; }
  public static  OlShiftState valueOf(int value) {
    switch(value) {
    case 1: return olShiftStateShiftMask;
    case 2: return olShiftStateCtrlMask;
    case 4: return olShiftStateAltMask;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlShiftState.class);
    }
  }
}
