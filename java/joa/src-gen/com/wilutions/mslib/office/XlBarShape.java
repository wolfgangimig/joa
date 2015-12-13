/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlBarShape.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlBarShape implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlBarShape xlBox = new XlBarShape(0);
  public final static XlBarShape xlPyramidToPoint = new XlBarShape(1);
  public final static XlBarShape xlPyramidToMax = new XlBarShape(2);
  public final static XlBarShape xlCylinder = new XlBarShape(3);
  public final static XlBarShape xlConeToPoint = new XlBarShape(4);
  public final static XlBarShape xlConeToMax = new XlBarShape(5);

  // Integer constants for bitsets and switch statements
  public final static int _xlBox = 0;
  public final static int _xlPyramidToPoint = 1;
  public final static int _xlPyramidToMax = 2;
  public final static int _xlCylinder = 3;
  public final static int _xlConeToPoint = 4;
  public final static int _xlConeToMax = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlBarShape(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlBarShape valueOf(int value) {
    switch(value) {
    case 0: return xlBox;
    case 1: return xlPyramidToPoint;
    case 2: return xlPyramidToMax;
    case 3: return xlCylinder;
    case 4: return xlConeToPoint;
    case 5: return xlConeToMax;
    default: return new XlBarShape(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "xlBox";
    case 1: return "xlPyramidToPoint";
    case 2: return "xlPyramidToMax";
    case 3: return "xlCylinder";
    case 4: return "xlConeToPoint";
    case 5: return "xlConeToMax";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|xlBox");
      if ((value & 1) != 0) sbuf.append("|xlPyramidToPoint");
      if ((value & 2) != 0) sbuf.append("|xlPyramidToMax");
      if ((value & 3) != 0) sbuf.append("|xlCylinder");
      if ((value & 4) != 0) sbuf.append("|xlConeToPoint");
      if ((value & 5) != 0) sbuf.append("|xlConeToMax");
      return sbuf.toString();
      }
    }
  }
}
