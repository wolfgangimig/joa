/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmSnapPoint.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{317A54C1-C7B1-11CE-9AFD-00AA00600AB8}")
public enum fmSnapPoint {
  fmSnapPointTopLeft(0),
  fmSnapPointTopCenter(1),
  fmSnapPointTopRight(2),
  fmSnapPointCenterLeft(3),
  fmSnapPointCenter(4),
  fmSnapPointCenterRight(5),
  fmSnapPointBottomLeft(6),
  fmSnapPointBottomCenter(7),
  fmSnapPointBottomRight(8);

  public final int value;
  private fmSnapPoint(int value) { this.value = value; }
  public static  fmSnapPoint valueOf(int value) {
    switch(value) {
    case 0: return fmSnapPointTopLeft;
    case 1: return fmSnapPointTopCenter;
    case 2: return fmSnapPointTopRight;
    case 3: return fmSnapPointCenterLeft;
    case 4: return fmSnapPointCenter;
    case 5: return fmSnapPointCenterRight;
    case 6: return fmSnapPointBottomLeft;
    case 7: return fmSnapPointBottomCenter;
    case 8: return fmSnapPointBottomRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmSnapPoint.class);
    }
  }
}
