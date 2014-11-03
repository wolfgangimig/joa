/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlScaleType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6A0D7E5C-F9AD-4927-A850-5638891724B2}")
public enum XlScaleType {
  xlScaleLinear(-4132),
  xlScaleLogarithmic(-4133);

  public final int value;
  private XlScaleType(int value) { this.value = value; }
  public static  XlScaleType valueOf(int value) {
    switch(value) {
    case -4132: return xlScaleLinear;
    case -4133: return xlScaleLogarithmic;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlScaleType.class);
    }
  }
}
