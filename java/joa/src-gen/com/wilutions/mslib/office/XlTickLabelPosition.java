/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickLabelPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{964562FD-22B1-4E15-9931-C555434E6538}")
public enum XlTickLabelPosition {
  xlTickLabelPositionHigh(-4127),
  xlTickLabelPositionLow(-4134),
  xlTickLabelPositionNextToAxis(4),
  xlTickLabelPositionNone(-4142);

  public final int value;
  private XlTickLabelPosition(int value) { this.value = value; }
  public static  XlTickLabelPosition valueOf(int value) {
    switch(value) {
    case -4127: return xlTickLabelPositionHigh;
    case -4134: return xlTickLabelPositionLow;
    case 4: return xlTickLabelPositionNextToAxis;
    case -4142: return xlTickLabelPositionNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlTickLabelPosition.class);
    }
  }
}
