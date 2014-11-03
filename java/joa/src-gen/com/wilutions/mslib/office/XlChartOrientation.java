/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{94E08815-49E8-45BB-9BC2-8972405756CF}")
public enum XlChartOrientation {
  xlDownward(-4170),
  xlHorizontal(-4128),
  xlUpward(-4171),
  xlVertical(-4166);

  public final int value;
  private XlChartOrientation(int value) { this.value = value; }
  public static  XlChartOrientation valueOf(int value) {
    switch(value) {
    case -4170: return xlDownward;
    case -4128: return xlHorizontal;
    case -4171: return xlUpward;
    case -4166: return xlVertical;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartOrientation.class);
    }
  }
}
