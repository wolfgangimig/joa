/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlAxisGroup.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7D8D95F5-EFE7-4189-8D68-0B3BCCEA097A}")
public enum XlAxisGroup {
  xlPrimary(1),
  xlSecondary(2);

  public final int value;
  private XlAxisGroup(int value) { this.value = value; }
  public static  XlAxisGroup valueOf(int value) {
    switch(value) {
    case 1: return xlPrimary;
    case 2: return xlSecondary;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlAxisGroup.class);
    }
  }
}
