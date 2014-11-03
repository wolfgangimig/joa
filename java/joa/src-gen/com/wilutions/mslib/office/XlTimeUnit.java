/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlTimeUnit.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14710A1D-071F-4BFF-B1C2-4BEF5E8B2CEA}")
public enum XlTimeUnit {
  xlDays(0),
  xlMonths(1),
  xlYears(2);

  public final int value;
  private XlTimeUnit(int value) { this.value = value; }
  public static  XlTimeUnit valueOf(int value) {
    switch(value) {
    case 0: return xlDays;
    case 1: return xlMonths;
    case 2: return xlYears;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlTimeUnit.class);
    }
  }
}
