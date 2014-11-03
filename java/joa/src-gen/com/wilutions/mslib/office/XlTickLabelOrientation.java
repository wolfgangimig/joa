/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickLabelOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3A6700B4-6BC6-4848-AAA4-D360573F448C}")
public enum XlTickLabelOrientation {
  xlTickLabelOrientationAutomatic(-4105),
  xlTickLabelOrientationDownward(-4170),
  xlTickLabelOrientationHorizontal(-4128),
  xlTickLabelOrientationUpward(-4171),
  xlTickLabelOrientationVertical(-4166);

  public final int value;
  private XlTickLabelOrientation(int value) { this.value = value; }
  public static  XlTickLabelOrientation valueOf(int value) {
    switch(value) {
    case -4105: return xlTickLabelOrientationAutomatic;
    case -4170: return xlTickLabelOrientationDownward;
    case -4128: return xlTickLabelOrientationHorizontal;
    case -4171: return xlTickLabelOrientationUpward;
    case -4166: return xlTickLabelOrientationVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlTickLabelOrientation.class);
    }
  }
}
