/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatNumber.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatNumber implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatNumber olFormatNumberAllDigits = new OlFormatNumber(1);
  public final static OlFormatNumber olFormatNumberTruncated = new OlFormatNumber(2);
  public final static OlFormatNumber olFormatNumber1Decimal = new OlFormatNumber(3);
  public final static OlFormatNumber olFormatNumber2Decimal = new OlFormatNumber(4);
  public final static OlFormatNumber olFormatNumberScientific = new OlFormatNumber(5);
  public final static OlFormatNumber olFormatNumberComputer1 = new OlFormatNumber(6);
  public final static OlFormatNumber olFormatNumberComputer2 = new OlFormatNumber(7);
  public final static OlFormatNumber olFormatNumberComputer3 = new OlFormatNumber(8);
  public final static OlFormatNumber olFormatNumberRaw = new OlFormatNumber(9);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatNumberAllDigits = 1;
  public final static int _olFormatNumberTruncated = 2;
  public final static int _olFormatNumber1Decimal = 3;
  public final static int _olFormatNumber2Decimal = 4;
  public final static int _olFormatNumberScientific = 5;
  public final static int _olFormatNumberComputer1 = 6;
  public final static int _olFormatNumberComputer2 = 7;
  public final static int _olFormatNumberComputer3 = 8;
  public final static int _olFormatNumberRaw = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatNumber(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new OlFormatNumber(value);
    }
  }

  public String toString() {
    switch(value) {
    case 9: return "olFormatNumberRaw";
    case 1: return "olFormatNumberAllDigits";
    case 2: return "olFormatNumberTruncated";
    case 3: return "olFormatNumber1Decimal";
    case 4: return "olFormatNumber2Decimal";
    case 5: return "olFormatNumberScientific";
    case 6: return "olFormatNumberComputer1";
    case 7: return "olFormatNumberComputer2";
    case 8: return "olFormatNumberComputer3";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 9) != 0) sbuf.append("|olFormatNumberRaw");
      if ((value & 1) != 0) sbuf.append("|olFormatNumberAllDigits");
      if ((value & 2) != 0) sbuf.append("|olFormatNumberTruncated");
      if ((value & 3) != 0) sbuf.append("|olFormatNumber1Decimal");
      if ((value & 4) != 0) sbuf.append("|olFormatNumber2Decimal");
      if ((value & 5) != 0) sbuf.append("|olFormatNumberScientific");
      if ((value & 6) != 0) sbuf.append("|olFormatNumberComputer1");
      if ((value & 7) != 0) sbuf.append("|olFormatNumberComputer2");
      if ((value & 8) != 0) sbuf.append("|olFormatNumberComputer3");
      return sbuf.toString();
      }
    }
  }
}
