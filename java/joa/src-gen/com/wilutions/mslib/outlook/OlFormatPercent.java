/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatPercent.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatPercent implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatPercent olFormatPercentRounded = new OlFormatPercent(1);
  public final static OlFormatPercent olFormatPercent1Decimal = new OlFormatPercent(2);
  public final static OlFormatPercent olFormatPercent2Decimal = new OlFormatPercent(3);
  public final static OlFormatPercent olFormatPercentAllDigits = new OlFormatPercent(4);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatPercentRounded = 1;
  public final static int _olFormatPercent1Decimal = 2;
  public final static int _olFormatPercent2Decimal = 3;
  public final static int _olFormatPercentAllDigits = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatPercent(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatPercent valueOf(int value) {
    switch(value) {
    case 1: return olFormatPercentRounded;
    case 2: return olFormatPercent1Decimal;
    case 3: return olFormatPercent2Decimal;
    case 4: return olFormatPercentAllDigits;
    default: return new OlFormatPercent(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olFormatPercentRounded";
    case 2: return "olFormatPercent1Decimal";
    case 3: return "olFormatPercent2Decimal";
    case 4: return "olFormatPercentAllDigits";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olFormatPercentRounded");
      if ((value & 2) != 0) sbuf.append("|olFormatPercent1Decimal");
      if ((value & 3) != 0) sbuf.append("|olFormatPercent2Decimal");
      if ((value & 4) != 0) sbuf.append("|olFormatPercentAllDigits");
      return sbuf.toString();
      }
    }
  }
}
