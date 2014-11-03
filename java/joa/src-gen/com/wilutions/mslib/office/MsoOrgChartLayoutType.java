/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrgChartLayoutType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoOrgChartLayoutType {
  msoOrgChartLayoutMixed(-2),
  msoOrgChartLayoutStandard(1),
  msoOrgChartLayoutBothHanging(2),
  msoOrgChartLayoutLeftHanging(3),
  msoOrgChartLayoutRightHanging(4),
  msoOrgChartLayoutDefault(5);

  public final int value;
  private MsoOrgChartLayoutType(int value) { this.value = value; }
  public static  MsoOrgChartLayoutType valueOf(int value) {
    switch(value) {
    case -2: return msoOrgChartLayoutMixed;
    case 1: return msoOrgChartLayoutStandard;
    case 2: return msoOrgChartLayoutBothHanging;
    case 3: return msoOrgChartLayoutLeftHanging;
    case 4: return msoOrgChartLayoutRightHanging;
    case 5: return msoOrgChartLayoutDefault;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoOrgChartLayoutType.class);
    }
  }
}
