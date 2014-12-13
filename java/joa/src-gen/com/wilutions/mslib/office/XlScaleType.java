/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlScaleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6A0D7E5C-F9AD-4927-A850-5638891724B2}")
public class XlScaleType implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlScaleType xlScaleLinear = new XlScaleType(-4132);
  public final static XlScaleType xlScaleLogarithmic = new XlScaleType(-4133);

  // Integer constants for bitsets and switch statements
  public final static int _xlScaleLinear = -4132;
  public final static int _xlScaleLogarithmic = -4133;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlScaleType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlScaleType valueOf(int value) {
    switch(value) {
    case -4132: return xlScaleLinear;
    case -4133: return xlScaleLogarithmic;
    default: return new XlScaleType(value);
    }
  }

  public String toString() {
    switch(value) {
    case -4132: return "xlScaleLinear";
    case -4133: return "xlScaleLogarithmic";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -4132) != 0) sbuf.append("|xlScaleLinear");
      if ((value & -4133) != 0) sbuf.append("|xlScaleLogarithmic");
      return sbuf.toString();
      }
    }
  }
}
