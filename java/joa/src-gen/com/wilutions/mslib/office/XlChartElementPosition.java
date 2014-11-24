/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartElementPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{05B0478C-9CD6-4F60-B113-A55E6A6CB1DC}")
public class XlChartElementPosition {

  // Typed constants
  public final static XlChartElementPosition xlChartElementPositionAutomatic = new XlChartElementPosition(-4105);
  public final static XlChartElementPosition xlChartElementPositionCustom = new XlChartElementPosition(-4114);

  // Integer constants for bitsets and switch statements
  public final static int _xlChartElementPositionAutomatic = -4105;
  public final static int _xlChartElementPositionCustom = -4114;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartElementPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartElementPosition valueOf(int value) {
    switch(value) {
    case -4105: return xlChartElementPositionAutomatic;
    case -4114: return xlChartElementPositionCustom;
    default: return new XlChartElementPosition(value);
    }
  }
}
