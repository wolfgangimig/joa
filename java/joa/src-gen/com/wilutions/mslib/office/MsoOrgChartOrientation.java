/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoOrgChartOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoOrgChartOrientation {

  // Typed constants
  public final static MsoOrgChartOrientation msoOrgChartOrientationMixed = new MsoOrgChartOrientation(-2);
  public final static MsoOrgChartOrientation msoOrgChartOrientationVertical = new MsoOrgChartOrientation(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoOrgChartOrientationMixed = -2;
  public final static int _msoOrgChartOrientationVertical = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoOrgChartOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoOrgChartOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoOrgChartOrientationMixed;
    case 1: return msoOrgChartOrientationVertical;
    default: return new MsoOrgChartOrientation(value);
    }
  }
}
