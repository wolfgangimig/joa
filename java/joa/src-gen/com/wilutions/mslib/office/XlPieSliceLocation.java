/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPieSliceLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{B270C821-56A3-4F6D-9274-74E6CDF4D10C}")
public enum XlPieSliceLocation {
  xlHorizontalCoordinate(1),
  xlVerticalCoordinate(2);

  public final int value;
  private XlPieSliceLocation(int value) { this.value = value; }
  public static  XlPieSliceLocation valueOf(int value) {
    switch(value) {
    case 1: return xlHorizontalCoordinate;
    case 2: return xlVerticalCoordinate;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlPieSliceLocation.class);
    }
  }
}
