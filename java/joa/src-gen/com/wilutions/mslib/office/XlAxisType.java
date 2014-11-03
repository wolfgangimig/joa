/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{23D8FDAA-ABF3-4735-99B8-F234EA2BE64C}")
public enum XlAxisType {
  xlCategory(1),
  xlSeriesAxis(3),
  xlValue(2);

  public final int value;
  private XlAxisType(int value) { this.value = value; }
  public static  XlAxisType valueOf(int value) {
    switch(value) {
    case 1: return xlCategory;
    case 3: return xlSeriesAxis;
    case 2: return xlValue;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlAxisType.class);
    }
  }
}
