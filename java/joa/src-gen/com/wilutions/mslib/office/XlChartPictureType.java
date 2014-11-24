/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartPictureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlChartPictureType {

  // Typed constants
  public final static XlChartPictureType xlStackScale = new XlChartPictureType(3);
  public final static XlChartPictureType xlStack = new XlChartPictureType(2);
  public final static XlChartPictureType xlStretch = new XlChartPictureType(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlStackScale = 3;
  public final static int _xlStack = 2;
  public final static int _xlStretch = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartPictureType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartPictureType valueOf(int value) {
    switch(value) {
    case 3: return xlStackScale;
    case 2: return xlStack;
    case 1: return xlStretch;
    default: return new XlChartPictureType(value);
    }
  }
}
