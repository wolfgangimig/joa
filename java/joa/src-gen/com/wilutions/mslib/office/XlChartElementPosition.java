/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartElementPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{05B0478C-9CD6-4F60-B113-A55E6A6CB1DC}")
public enum XlChartElementPosition {
  xlChartElementPositionAutomatic(-4105),
  xlChartElementPositionCustom(-4114);

  public final int value;
  private XlChartElementPosition(int value) { this.value = value; }
  public static  XlChartElementPosition valueOf(int value) {
    switch(value) {
    case -4105: return xlChartElementPositionAutomatic;
    case -4114: return xlChartElementPositionCustom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartElementPosition.class);
    }
  }
}
