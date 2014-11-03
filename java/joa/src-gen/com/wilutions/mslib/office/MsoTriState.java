/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTriState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTriState {
  msoTrue(-1),
  msoFalse(0),
  msoCTrue(1),
  msoTriStateToggle(-3),
  msoTriStateMixed(-2);

  public final int value;
  private MsoTriState(int value) { this.value = value; }
  public static  MsoTriState valueOf(int value) {
    switch(value) {
    case -1: return msoTrue;
    case 0: return msoFalse;
    case 1: return msoCTrue;
    case -3: return msoTriStateToggle;
    case -2: return msoTriStateMixed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTriState.class);
    }
  }
}
