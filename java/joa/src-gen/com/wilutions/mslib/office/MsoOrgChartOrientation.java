/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrgChartOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoOrgChartOrientation {
  msoOrgChartOrientationMixed(-2),
  msoOrgChartOrientationVertical(1);

  public final int value;
  private MsoOrgChartOrientation(int value) { this.value = value; }
  public static  MsoOrgChartOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoOrgChartOrientationMixed;
    case 1: return msoOrgChartOrientationVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoOrgChartOrientation.class);
    }
  }
}
