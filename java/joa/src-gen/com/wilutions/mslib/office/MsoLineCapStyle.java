/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineCapStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLineCapStyle {
  msoLineCapMixed(-2),
  msoLineCapSquare(1),
  msoLineCapRound(2),
  msoLineCapFlat(3);

  public final int value;
  private MsoLineCapStyle(int value) { this.value = value; }
  public static  MsoLineCapStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineCapMixed;
    case 1: return msoLineCapSquare;
    case 2: return msoLineCapRound;
    case 3: return msoLineCapFlat;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLineCapStyle.class);
    }
  }
}
