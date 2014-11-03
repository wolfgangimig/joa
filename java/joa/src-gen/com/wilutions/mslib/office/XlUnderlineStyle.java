/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlUnderlineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{9B1665EA-5EA9-4D9B-9B61-D6D1E7C087E2}")
public enum XlUnderlineStyle {
  xlUnderlineStyleDouble(-4119),
  xlUnderlineStyleDoubleAccounting(5),
  xlUnderlineStyleNone(-4142),
  xlUnderlineStyleSingle(2),
  xlUnderlineStyleSingleAccounting(4);

  public final int value;
  private XlUnderlineStyle(int value) { this.value = value; }
  public static  XlUnderlineStyle valueOf(int value) {
    switch(value) {
    case -4119: return xlUnderlineStyleDouble;
    case 5: return xlUnderlineStyleDoubleAccounting;
    case -4142: return xlUnderlineStyleNone;
    case 2: return xlUnderlineStyleSingle;
    case 4: return xlUnderlineStyleSingleAccounting;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlUnderlineStyle.class);
    }
  }
}
