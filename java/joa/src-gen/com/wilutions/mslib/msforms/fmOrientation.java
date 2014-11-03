/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{16E571E0-040B-11CF-8283-00AA004BA6AE}")
public enum fmOrientation {
  fmOrientationAuto(-1),
  fmOrientationVertical(0),
  fmOrientationHorizontal(1);

  public final int value;
  private fmOrientation(int value) { this.value = value; }
  public static  fmOrientation valueOf(int value) {
    switch(value) {
    case -1: return fmOrientationAuto;
    case 0: return fmOrientationVertical;
    case 1: return fmOrientationHorizontal;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmOrientation.class);
    }
  }
}
