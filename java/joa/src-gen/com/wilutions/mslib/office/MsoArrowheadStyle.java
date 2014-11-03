/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoArrowheadStyle {
  msoArrowheadStyleMixed(-2),
  msoArrowheadNone(1),
  msoArrowheadTriangle(2),
  msoArrowheadOpen(3),
  msoArrowheadStealth(4),
  msoArrowheadDiamond(5),
  msoArrowheadOval(6);

  public final int value;
  private MsoArrowheadStyle(int value) { this.value = value; }
  public static  MsoArrowheadStyle valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadStyleMixed;
    case 1: return msoArrowheadNone;
    case 2: return msoArrowheadTriangle;
    case 3: return msoArrowheadOpen;
    case 4: return msoArrowheadStealth;
    case 5: return msoArrowheadDiamond;
    case 6: return msoArrowheadOval;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoArrowheadStyle.class);
    }
  }
}
