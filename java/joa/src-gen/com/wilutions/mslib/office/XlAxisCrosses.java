/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisCrosses.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{89FF0BFE-5E70-4183-88C8-5EF4B213451F}")
public enum XlAxisCrosses {
  xlAxisCrossesAutomatic(-4105),
  xlAxisCrossesCustom(-4114),
  xlAxisCrossesMaximum(2),
  xlAxisCrossesMinimum(4);

  public final int value;
  private XlAxisCrosses(int value) { this.value = value; }
  public static  XlAxisCrosses valueOf(int value) {
    switch(value) {
    case -4105: return xlAxisCrossesAutomatic;
    case -4114: return xlAxisCrossesCustom;
    case 2: return xlAxisCrossesMaximum;
    case 4: return xlAxisCrossesMinimum;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlAxisCrosses.class);
    }
  }
}
