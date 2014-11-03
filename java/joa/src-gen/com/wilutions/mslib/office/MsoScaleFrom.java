/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScaleFrom.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoScaleFrom {
  msoScaleFromTopLeft(0),
  msoScaleFromMiddle(1),
  msoScaleFromBottomRight(2);

  public final int value;
  private MsoScaleFrom(int value) { this.value = value; }
  public static  MsoScaleFrom valueOf(int value) {
    switch(value) {
    case 0: return msoScaleFromTopLeft;
    case 1: return msoScaleFromMiddle;
    case 2: return msoScaleFromBottomRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoScaleFrom.class);
    }
  }
}
