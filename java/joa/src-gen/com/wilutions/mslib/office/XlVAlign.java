/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlVAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlVAlign {
  xlVAlignBottom(-4107),
  xlVAlignCenter(-4108),
  xlVAlignDistributed(-4117),
  xlVAlignJustify(-4130),
  xlVAlignTop(-4160);

  public final int value;
  private XlVAlign(int value) { this.value = value; }
  public static  XlVAlign valueOf(int value) {
    switch(value) {
    case -4107: return xlVAlignBottom;
    case -4108: return xlVAlignCenter;
    case -4117: return xlVAlignDistributed;
    case -4130: return xlVAlignJustify;
    case -4160: return xlVAlignTop;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlVAlign.class);
    }
  }
}
