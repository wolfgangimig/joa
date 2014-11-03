/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextOrientation {
  msoTextOrientationMixed(-2),
  msoTextOrientationHorizontal(1),
  msoTextOrientationUpward(2),
  msoTextOrientationDownward(3),
  msoTextOrientationVerticalFarEast(4),
  msoTextOrientationVertical(5),
  msoTextOrientationHorizontalRotatedFarEast(6);

  public final int value;
  private MsoTextOrientation(int value) { this.value = value; }
  public static  MsoTextOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoTextOrientationMixed;
    case 1: return msoTextOrientationHorizontal;
    case 2: return msoTextOrientationUpward;
    case 3: return msoTextOrientationDownward;
    case 4: return msoTextOrientationVerticalFarEast;
    case 5: return msoTextOrientationVertical;
    case 6: return msoTextOrientationHorizontalRotatedFarEast;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextOrientation.class);
    }
  }
}
