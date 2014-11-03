/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlDisplayBlanksAs.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3439EA79-5069-4404-A6E3-8EE3A1B9BD0E}")
public enum XlDisplayBlanksAs {
  xlInterpolated(3),
  xlNotPlotted(1),
  xlZero(2);

  public final int value;
  private XlDisplayBlanksAs(int value) { this.value = value; }
  public static  XlDisplayBlanksAs valueOf(int value) {
    switch(value) {
    case 3: return xlInterpolated;
    case 1: return xlNotPlotted;
    case 2: return xlZero;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlDisplayBlanksAs.class);
    }
  }
}
