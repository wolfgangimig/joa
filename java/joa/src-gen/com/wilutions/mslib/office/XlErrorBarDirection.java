/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlErrorBarDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlErrorBarDirection {
  xlChartX(-4168),
  xlChartY(1);

  public final int value;
  private XlErrorBarDirection(int value) { this.value = value; }
  public static  XlErrorBarDirection valueOf(int value) {
    switch(value) {
    case -4168: return xlChartX;
    case 1: return xlChartY;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlErrorBarDirection.class);
    }
  }
}
