/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatCurrency.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatCurrency {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatCurrency olFormatCurrencyDecimal = new OlFormatCurrency(1);
  public final static OlFormatCurrency olFormatCurrencyNonDecimal = new OlFormatCurrency(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatCurrencyDecimal = 1;
  public final static int _olFormatCurrencyNonDecimal = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatCurrency(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatCurrency valueOf(int value) {
    switch(value) {
    case 1: return olFormatCurrencyDecimal;
    case 2: return olFormatCurrencyNonDecimal;
    default: return new OlFormatCurrency(value);
    }
  }
}
