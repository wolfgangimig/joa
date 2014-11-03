/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoVerticalAnchor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoVerticalAnchor {
  msoVerticalAnchorMixed(-2),
  msoAnchorTop(1),
  msoAnchorTopBaseline(2),
  msoAnchorMiddle(3),
  msoAnchorBottom(4),
  msoAnchorBottomBaseLine(5);

  public final int value;
  private MsoVerticalAnchor(int value) { this.value = value; }
  public static  MsoVerticalAnchor valueOf(int value) {
    switch(value) {
    case -2: return msoVerticalAnchorMixed;
    case 1: return msoAnchorTop;
    case 2: return msoAnchorTopBaseline;
    case 3: return msoAnchorMiddle;
    case 4: return msoAnchorBottom;
    case 5: return msoAnchorBottomBaseLine;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoVerticalAnchor.class);
    }
  }
}
