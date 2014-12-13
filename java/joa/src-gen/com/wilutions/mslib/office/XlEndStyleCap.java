/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlEndStyleCap.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlEndStyleCap implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static XlEndStyleCap xlCap = new XlEndStyleCap(1);
  public final static XlEndStyleCap xlNoCap = new XlEndStyleCap(2);

  // Integer constants for bitsets and switch statements
  public final static int _xlCap = 1;
  public final static int _xlNoCap = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlEndStyleCap(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlEndStyleCap valueOf(int value) {
    switch(value) {
    case 1: return xlCap;
    case 2: return xlNoCap;
    default: return new XlEndStyleCap(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "xlCap";
    case 2: return "xlNoCap";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|xlCap");
      if ((value & 2) != 0) sbuf.append("|xlNoCap");
      return sbuf.toString();
      }
    }
  }
}
