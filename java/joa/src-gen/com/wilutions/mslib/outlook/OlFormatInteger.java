/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatInteger.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatInteger {
  olFormatIntegerPlain(1),
  olFormatIntegerComputer1(2),
  olFormatIntegerComputer2(3),
  olFormatIntegerComputer3(4);

  public final int value;
  private OlFormatInteger(int value) { this.value = value; }
  public static  OlFormatInteger valueOf(int value) {
    switch(value) {
    case 1: return olFormatIntegerPlain;
    case 2: return olFormatIntegerComputer1;
    case 3: return olFormatIntegerComputer2;
    case 4: return olFormatIntegerComputer3;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatInteger.class);
    }
  }
}
