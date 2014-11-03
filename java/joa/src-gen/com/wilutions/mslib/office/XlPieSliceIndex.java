/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPieSliceIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{2B4C8AB7-6E70-422A-B7CC-206452289F16}")
public enum XlPieSliceIndex {
  xlOuterCounterClockwisePoint(1),
  xlOuterCenterPoint(2),
  xlOuterClockwisePoint(3),
  xlMidClockwiseRadiusPoint(4),
  xlCenterPoint(5),
  xlMidCounterClockwiseRadiusPoint(6),
  xlInnerClockwisePoint(7),
  xlInnerCenterPoint(8),
  xlInnerCounterClockwisePoint(9);

  public final int value;
  private XlPieSliceIndex(int value) { this.value = value; }
  public static  XlPieSliceIndex valueOf(int value) {
    switch(value) {
    case 1: return xlOuterCounterClockwisePoint;
    case 2: return xlOuterCenterPoint;
    case 3: return xlOuterClockwisePoint;
    case 4: return xlMidClockwiseRadiusPoint;
    case 5: return xlCenterPoint;
    case 6: return xlMidCounterClockwiseRadiusPoint;
    case 7: return xlInnerClockwisePoint;
    case 8: return xlInnerCenterPoint;
    case 9: return xlInnerCounterClockwisePoint;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlPieSliceIndex.class);
    }
  }
}
