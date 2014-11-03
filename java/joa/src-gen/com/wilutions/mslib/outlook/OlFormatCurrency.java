/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatCurrency.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatCurrency {
  olFormatCurrencyDecimal(1),
  olFormatCurrencyNonDecimal(2);

  public final int value;
  private OlFormatCurrency(int value) { this.value = value; }
  public static  OlFormatCurrency valueOf(int value) {
    switch(value) {
    case 1: return olFormatCurrencyDecimal;
    case 2: return olFormatCurrencyNonDecimal;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatCurrency.class);
    }
  }
}
