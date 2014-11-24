/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisCrosses.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{89FF0BFE-5E70-4183-88C8-5EF4B213451F}")
public class XlAxisCrosses {

  // Typed constants
  public final static XlAxisCrosses xlAxisCrossesAutomatic = new XlAxisCrosses(-4105);
  public final static XlAxisCrosses xlAxisCrossesCustom = new XlAxisCrosses(-4114);
  public final static XlAxisCrosses xlAxisCrossesMaximum = new XlAxisCrosses(2);
  public final static XlAxisCrosses xlAxisCrossesMinimum = new XlAxisCrosses(4);

  // Integer constants for bitsets and switch statements
  public final static int _xlAxisCrossesAutomatic = -4105;
  public final static int _xlAxisCrossesCustom = -4114;
  public final static int _xlAxisCrossesMaximum = 2;
  public final static int _xlAxisCrossesMinimum = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlAxisCrosses(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlAxisCrosses valueOf(int value) {
    switch(value) {
    case -4105: return xlAxisCrossesAutomatic;
    case -4114: return xlAxisCrossesCustom;
    case 2: return xlAxisCrossesMaximum;
    case 4: return xlAxisCrossesMinimum;
    default: return new XlAxisCrosses(value);
    }
  }
}
