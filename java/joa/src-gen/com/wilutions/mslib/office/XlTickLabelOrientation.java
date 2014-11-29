/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickLabelOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3A6700B4-6BC6-4848-AAA4-D360573F448C}")
public class XlTickLabelOrientation {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlTickLabelOrientation xlTickLabelOrientationAutomatic = new XlTickLabelOrientation(-4105);
  public final static XlTickLabelOrientation xlTickLabelOrientationDownward = new XlTickLabelOrientation(-4170);
  public final static XlTickLabelOrientation xlTickLabelOrientationHorizontal = new XlTickLabelOrientation(-4128);
  public final static XlTickLabelOrientation xlTickLabelOrientationUpward = new XlTickLabelOrientation(-4171);
  public final static XlTickLabelOrientation xlTickLabelOrientationVertical = new XlTickLabelOrientation(-4166);

  // Integer constants for bitsets and switch statements
  public final static int _xlTickLabelOrientationAutomatic = -4105;
  public final static int _xlTickLabelOrientationDownward = -4170;
  public final static int _xlTickLabelOrientationHorizontal = -4128;
  public final static int _xlTickLabelOrientationUpward = -4171;
  public final static int _xlTickLabelOrientationVertical = -4166;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlTickLabelOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlTickLabelOrientation valueOf(int value) {
    switch(value) {
    case -4105: return xlTickLabelOrientationAutomatic;
    case -4170: return xlTickLabelOrientationDownward;
    case -4128: return xlTickLabelOrientationHorizontal;
    case -4171: return xlTickLabelOrientationUpward;
    case -4166: return xlTickLabelOrientationVertical;
    default: return new XlTickLabelOrientation(value);
    }
  }
}
