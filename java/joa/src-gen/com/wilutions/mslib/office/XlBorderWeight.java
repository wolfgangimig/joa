/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlBorderWeight.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlBorderWeight {
  xlHairline(1),
  xlMedium(-4138),
  xlThick(4),
  xlThin(2);

  public final int value;
  private XlBorderWeight(int value) { this.value = value; }
  public static  XlBorderWeight valueOf(int value) {
    switch(value) {
    case 1: return xlHairline;
    case -4138: return xlMedium;
    case 4: return xlThick;
    case 2: return xlThin;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlBorderWeight.class);
    }
  }
}
