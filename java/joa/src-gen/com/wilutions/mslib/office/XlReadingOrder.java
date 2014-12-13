/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlReadingOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlReadingOrder implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlReadingOrder xlContext = new XlReadingOrder(-5002);
  public final static XlReadingOrder xlLTR = new XlReadingOrder(-5003);
  public final static XlReadingOrder xlRTL = new XlReadingOrder(-5004);

  // Integer constants for bitsets and switch statements
  public final static int _xlContext = -5002;
  public final static int _xlLTR = -5003;
  public final static int _xlRTL = -5004;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlReadingOrder(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlReadingOrder valueOf(int value) {
    switch(value) {
    case -5002: return xlContext;
    case -5003: return xlLTR;
    case -5004: return xlRTL;
    default: return new XlReadingOrder(value);
    }
  }

  public String toString() {
    switch(value) {
    case -5002: return "xlContext";
    case -5003: return "xlLTR";
    case -5004: return "xlRTL";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & -5002) != 0) sbuf.append("|xlContext");
      if ((value & -5003) != 0) sbuf.append("|xlLTR");
      if ((value & -5004) != 0) sbuf.append("|xlRTL");
      return sbuf.toString();
      }
    }
  }
}
