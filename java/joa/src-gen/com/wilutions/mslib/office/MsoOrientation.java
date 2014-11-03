/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoOrientation {
  msoOrientationMixed(-2),
  msoOrientationHorizontal(1),
  msoOrientationVertical(2);

  public final int value;
  private MsoOrientation(int value) { this.value = value; }
  public static  MsoOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoOrientationMixed;
    case 1: return msoOrientationHorizontal;
    case 2: return msoOrientationVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoOrientation.class);
    }
  }
}
