/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{94E08815-49E8-45BB-9BC2-8972405756CF}")
public class XlChartOrientation {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlChartOrientation xlDownward = new XlChartOrientation(-4170);
  public final static XlChartOrientation xlHorizontal = new XlChartOrientation(-4128);
  public final static XlChartOrientation xlUpward = new XlChartOrientation(-4171);
  public final static XlChartOrientation xlVertical = new XlChartOrientation(-4166);

  // Integer constants for bitsets and switch statements
  public final static int _xlDownward = -4170;
  public final static int _xlHorizontal = -4128;
  public final static int _xlUpward = -4171;
  public final static int _xlVertical = -4166;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlChartOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlChartOrientation valueOf(int value) {
    switch(value) {
    case -4170: return xlDownward;
    case -4128: return xlHorizontal;
    case -4171: return xlUpward;
    case -4166: return xlVertical;
    default: return new XlChartOrientation(value);
    }
  }
}
