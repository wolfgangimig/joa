/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatNumber.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatNumber {
  olFormatNumberAllDigits(1),
  olFormatNumberTruncated(2),
  olFormatNumber1Decimal(3),
  olFormatNumber2Decimal(4),
  olFormatNumberScientific(5),
  olFormatNumberComputer1(6),
  olFormatNumberComputer2(7),
  olFormatNumberComputer3(8),
  olFormatNumberRaw(9);

  public final int value;
  private OlFormatNumber(int value) { this.value = value; }
  public static  OlFormatNumber valueOf(int value) {
    switch(value) {
    case 1: return olFormatNumberAllDigits;
    case 2: return olFormatNumberTruncated;
    case 3: return olFormatNumber1Decimal;
    case 4: return olFormatNumber2Decimal;
    case 5: return olFormatNumberScientific;
    case 6: return olFormatNumberComputer1;
    case 7: return olFormatNumberComputer2;
    case 8: return olFormatNumberComputer3;
    case 9: return olFormatNumberRaw;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatNumber.class);
    }
  }
}
