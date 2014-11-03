/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoButtonState {
  msoButtonUp(0),
  msoButtonDown(-1),
  msoButtonMixed(2);

  public final int value;
  private MsoButtonState(int value) { this.value = value; }
  public static  MsoButtonState valueOf(int value) {
    switch(value) {
    case 0: return msoButtonUp;
    case -1: return msoButtonDown;
    case 2: return msoButtonMixed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoButtonState.class);
    }
  }
}
