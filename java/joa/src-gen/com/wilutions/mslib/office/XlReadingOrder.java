/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlReadingOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlReadingOrder {
  xlContext(-5002),
  xlLTR(-5003),
  xlRTL(-5004);

  public final int value;
  private XlReadingOrder(int value) { this.value = value; }
  public static  XlReadingOrder valueOf(int value) {
    switch(value) {
    case -5002: return xlContext;
    case -5003: return xlLTR;
    case -5004: return xlRTL;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlReadingOrder.class);
    }
  }
}
