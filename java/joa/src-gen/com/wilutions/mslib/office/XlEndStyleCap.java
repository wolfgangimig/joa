/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlEndStyleCap.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlEndStyleCap {
  xlCap(1),
  xlNoCap(2);

  public final int value;
  private XlEndStyleCap(int value) { this.value = value; }
  public static  XlEndStyleCap valueOf(int value) {
    switch(value) {
    case 1: return xlCap;
    case 2: return xlNoCap;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlEndStyleCap.class);
    }
  }
}
