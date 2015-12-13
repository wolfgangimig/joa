/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMultiLine.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMultiLine implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMultiLine olWidthMultiLine = new OlMultiLine(0);
  public final static OlMultiLine olAlwaysSingleLine = new OlMultiLine(1);
  public final static OlMultiLine olAlwaysMultiLine = new OlMultiLine(2);

  // Integer constants for bitsets and switch statements
  public final static int _olWidthMultiLine = 0;
  public final static int _olAlwaysSingleLine = 1;
  public final static int _olAlwaysMultiLine = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMultiLine(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMultiLine valueOf(int value) {
    switch(value) {
    case 0: return olWidthMultiLine;
    case 1: return olAlwaysSingleLine;
    case 2: return olAlwaysMultiLine;
    default: return new OlMultiLine(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olWidthMultiLine";
    case 1: return "olAlwaysSingleLine";
    case 2: return "olAlwaysMultiLine";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olWidthMultiLine");
      if ((value & 1) != 0) sbuf.append("|olAlwaysSingleLine");
      if ((value & 2) != 0) sbuf.append("|olAlwaysMultiLine");
      return sbuf.toString();
      }
    }
  }
}
