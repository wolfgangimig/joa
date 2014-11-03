/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoGradientStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoGradientStyle {
  msoGradientMixed(-2),
  msoGradientHorizontal(1),
  msoGradientVertical(2),
  msoGradientDiagonalUp(3),
  msoGradientDiagonalDown(4),
  msoGradientFromCorner(5),
  msoGradientFromTitle(6),
  msoGradientFromCenter(7);

  public final int value;
  private MsoGradientStyle(int value) { this.value = value; }
  public static  MsoGradientStyle valueOf(int value) {
    switch(value) {
    case -2: return msoGradientMixed;
    case 1: return msoGradientHorizontal;
    case 2: return msoGradientVertical;
    case 3: return msoGradientDiagonalUp;
    case 4: return msoGradientDiagonalDown;
    case 5: return msoGradientFromCorner;
    case 6: return msoGradientFromTitle;
    case 7: return msoGradientFromCenter;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoGradientStyle.class);
    }
  }
}
