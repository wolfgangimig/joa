/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTabOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EBC7FDE1-6899-11CE-80C0-00AA00611080}")
public enum fmTabOrientation {
  fmTabOrientationTop(0),
  fmTabOrientationBottom(1),
  fmTabOrientationLeft(2),
  fmTabOrientationRight(3);

  public final int value;
  private fmTabOrientation(int value) { this.value = value; }
  public static  fmTabOrientation valueOf(int value) {
    switch(value) {
    case 0: return fmTabOrientationTop;
    case 1: return fmTabOrientationBottom;
    case 2: return fmTabOrientationLeft;
    case 3: return fmTabOrientationRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmTabOrientation.class);
    }
  }
}
