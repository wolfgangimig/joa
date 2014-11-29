/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPieSliceLocation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{B270C821-56A3-4F6D-9274-74E6CDF4D10C}")
public class XlPieSliceLocation {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlPieSliceLocation xlHorizontalCoordinate = new XlPieSliceLocation(1);
  public final static XlPieSliceLocation xlVerticalCoordinate = new XlPieSliceLocation(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlHorizontalCoordinate = 1;
  public final static int _xlVerticalCoordinate = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlPieSliceLocation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlPieSliceLocation valueOf(int value) {
    switch(value) {
    case 1: return xlHorizontalCoordinate;
    case 2: return xlVerticalCoordinate;
    default: return new XlPieSliceLocation(value);
    }
  }
}
