/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGridLineStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlGridLineStyle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlGridLineStyle olGridLineNone = new OlGridLineStyle(0);
  public final static OlGridLineStyle olGridLineSmallDots = new OlGridLineStyle(1);
  public final static OlGridLineStyle olGridLineLargeDots = new OlGridLineStyle(2);
  public final static OlGridLineStyle olGridLineDashes = new OlGridLineStyle(3);
  public final static OlGridLineStyle olGridLineSolid = new OlGridLineStyle(4);

  // Integer constants for bitsets and switch statements
  public final static int _olGridLineNone = 0;
  public final static int _olGridLineSmallDots = 1;
  public final static int _olGridLineLargeDots = 2;
  public final static int _olGridLineDashes = 3;
  public final static int _olGridLineSolid = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlGridLineStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlGridLineStyle valueOf(int value) {
    switch(value) {
    case 0: return olGridLineNone;
    case 1: return olGridLineSmallDots;
    case 2: return olGridLineLargeDots;
    case 3: return olGridLineDashes;
    case 4: return olGridLineSolid;
    default: return new OlGridLineStyle(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olGridLineNone";
    case 1: return "olGridLineSmallDots";
    case 2: return "olGridLineLargeDots";
    case 3: return "olGridLineDashes";
    case 4: return "olGridLineSolid";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olGridLineNone");
      if ((value & 1) != 0) sbuf.append("|olGridLineSmallDots");
      if ((value & 2) != 0) sbuf.append("|olGridLineLargeDots");
      if ((value & 3) != 0) sbuf.append("|olGridLineDashes");
      if ((value & 4) != 0) sbuf.append("|olGridLineSolid");
      return sbuf.toString();
      }
    }
  }
}
