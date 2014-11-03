/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDataLabelPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlDataLabelPosition {
  xlLabelPositionCenter(-4108),
  xlLabelPositionAbove(0),
  xlLabelPositionBelow(1),
  xlLabelPositionLeft(-4131),
  xlLabelPositionRight(-4152),
  xlLabelPositionOutsideEnd(2),
  xlLabelPositionInsideEnd(3),
  xlLabelPositionInsideBase(4),
  xlLabelPositionBestFit(5),
  xlLabelPositionMixed(6),
  xlLabelPositionCustom(7);

  public final int value;
  private XlDataLabelPosition(int value) { this.value = value; }
  public static  XlDataLabelPosition valueOf(int value) {
    switch(value) {
    case -4108: return xlLabelPositionCenter;
    case 0: return xlLabelPositionAbove;
    case 1: return xlLabelPositionBelow;
    case -4131: return xlLabelPositionLeft;
    case -4152: return xlLabelPositionRight;
    case 2: return xlLabelPositionOutsideEnd;
    case 3: return xlLabelPositionInsideEnd;
    case 4: return xlLabelPositionInsideBase;
    case 5: return xlLabelPositionBestFit;
    case 6: return xlLabelPositionMixed;
    case 7: return xlLabelPositionCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlDataLabelPosition.class);
    }
  }
}
