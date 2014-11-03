/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatPercent.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatPercent {
  olFormatPercentRounded(1),
  olFormatPercent1Decimal(2),
  olFormatPercent2Decimal(3),
  olFormatPercentAllDigits(4);

  public final int value;
  private OlFormatPercent(int value) { this.value = value; }
  public static  OlFormatPercent valueOf(int value) {
    switch(value) {
    case 1: return olFormatPercentRounded;
    case 2: return olFormatPercent1Decimal;
    case 3: return olFormatPercent2Decimal;
    case 4: return olFormatPercentAllDigits;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatPercent.class);
    }
  }
}
