/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlChartPictureType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlChartPictureType {
  xlStackScale(3),
  xlStack(2),
  xlStretch(1);

  public final int value;
  private XlChartPictureType(int value) { this.value = value; }
  public static  XlChartPictureType valueOf(int value) {
    switch(value) {
    case 3: return xlStackScale;
    case 2: return xlStack;
    case 1: return xlStretch;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlChartPictureType.class);
    }
  }
}
