/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTickLabelPosition.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{964562FD-22B1-4E15-9931-C555434E6538}")
public class XlTickLabelPosition {

  // Typed constants
  public final static XlTickLabelPosition xlTickLabelPositionHigh = new XlTickLabelPosition(-4127);
  public final static XlTickLabelPosition xlTickLabelPositionLow = new XlTickLabelPosition(-4134);
  public final static XlTickLabelPosition xlTickLabelPositionNextToAxis = new XlTickLabelPosition(4);
  public final static XlTickLabelPosition xlTickLabelPositionNone = new XlTickLabelPosition(-4142);

  // Integer constants for bitsets and switch statements
  public final static int _xlTickLabelPositionHigh = -4127;
  public final static int _xlTickLabelPositionLow = -4134;
  public final static int _xlTickLabelPositionNextToAxis = 4;
  public final static int _xlTickLabelPositionNone = -4142;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlTickLabelPosition(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlTickLabelPosition valueOf(int value) {
    switch(value) {
    case -4127: return xlTickLabelPositionHigh;
    case -4134: return xlTickLabelPositionLow;
    case 4: return xlTickLabelPositionNextToAxis;
    case -4142: return xlTickLabelPositionNone;
    default: return new XlTickLabelPosition(value);
    }
  }
}
