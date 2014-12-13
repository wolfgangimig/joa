/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatDuration.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatDuration implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatDuration olFormatDurationShort = new OlFormatDuration(1);
  public final static OlFormatDuration olFormatDurationLong = new OlFormatDuration(2);
  public final static OlFormatDuration olFormatDurationShortBusiness = new OlFormatDuration(3);
  public final static OlFormatDuration olFormatDurationLongBusiness = new OlFormatDuration(4);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatDurationShort = 1;
  public final static int _olFormatDurationLong = 2;
  public final static int _olFormatDurationShortBusiness = 3;
  public final static int _olFormatDurationLongBusiness = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatDuration(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatDuration valueOf(int value) {
    switch(value) {
    case 1: return olFormatDurationShort;
    case 2: return olFormatDurationLong;
    case 3: return olFormatDurationShortBusiness;
    case 4: return olFormatDurationLongBusiness;
    default: return new OlFormatDuration(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olFormatDurationShort";
    case 2: return "olFormatDurationLong";
    case 3: return "olFormatDurationShortBusiness";
    case 4: return "olFormatDurationLongBusiness";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olFormatDurationShort");
      if ((value & 2) != 0) sbuf.append("|olFormatDurationLong");
      if ((value & 3) != 0) sbuf.append("|olFormatDurationShortBusiness");
      if ((value & 4) != 0) sbuf.append("|olFormatDurationLongBusiness");
      return sbuf.toString();
      }
    }
  }
}
