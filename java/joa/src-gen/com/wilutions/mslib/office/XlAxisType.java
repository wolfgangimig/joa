/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{23D8FDAA-ABF3-4735-99B8-F234EA2BE64C}")
public class XlAxisType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlAxisType xlCategory = new XlAxisType(1);
  public final static XlAxisType xlSeriesAxis = new XlAxisType(3);
  public final static XlAxisType xlValue = new XlAxisType(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlCategory = 1;
  public final static int _xlSeriesAxis = 3;
  public final static int _xlValue = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlAxisType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlAxisType valueOf(int value) {
    switch(value) {
    case 1: return xlCategory;
    case 3: return xlSeriesAxis;
    case 2: return xlValue;
    default: return new XlAxisType(value);
    }
  }
}
