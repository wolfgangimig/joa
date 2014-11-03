/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineDashStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoLineDashStyle {
  msoLineDashStyleMixed(-2),
  msoLineSolid(1),
  msoLineSquareDot(2),
  msoLineRoundDot(3),
  msoLineDash(4),
  msoLineDashDot(5),
  msoLineDashDotDot(6),
  msoLineLongDash(7),
  msoLineLongDashDot(8),
  msoLineLongDashDotDot(9),
  msoLineSysDash(10),
  msoLineSysDot(11),
  msoLineSysDashDot(12);

  public final int value;
  private MsoLineDashStyle(int value) { this.value = value; }
  public static  MsoLineDashStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineDashStyleMixed;
    case 1: return msoLineSolid;
    case 2: return msoLineSquareDot;
    case 3: return msoLineRoundDot;
    case 4: return msoLineDash;
    case 5: return msoLineDashDot;
    case 6: return msoLineDashDotDot;
    case 7: return msoLineLongDash;
    case 8: return msoLineLongDashDot;
    case 9: return msoLineLongDashDotDot;
    case 10: return msoLineSysDash;
    case 11: return msoLineSysDot;
    case 12: return msoLineSysDashDot;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoLineDashStyle.class);
    }
  }
}
