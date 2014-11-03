/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBaselineAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBaselineAlignment {
  msoBaselineAlignMixed(-2),
  msoBaselineAlignBaseline(1),
  msoBaselineAlignTop(2),
  msoBaselineAlignCenter(3),
  msoBaselineAlignFarEast50(4),
  msoBaselineAlignAuto(5);

  public final int value;
  private MsoBaselineAlignment(int value) { this.value = value; }
  public static  MsoBaselineAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoBaselineAlignMixed;
    case 1: return msoBaselineAlignBaseline;
    case 2: return msoBaselineAlignTop;
    case 3: return msoBaselineAlignCenter;
    case 4: return msoBaselineAlignFarEast50;
    case 5: return msoBaselineAlignAuto;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBaselineAlignment.class);
    }
  }
}
