/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlBarShape.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlBarShape {
  xlBox(0),
  xlPyramidToPoint(1),
  xlPyramidToMax(2),
  xlCylinder(3),
  xlConeToPoint(4),
  xlConeToMax(5);

  public final int value;
  private XlBarShape(int value) { this.value = value; }
  public static  XlBarShape valueOf(int value) {
    switch(value) {
    case 0: return xlBox;
    case 1: return xlPyramidToPoint;
    case 2: return xlPyramidToMax;
    case 3: return xlCylinder;
    case 4: return xlConeToPoint;
    case 5: return xlConeToMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlBarShape.class);
    }
  }
}
