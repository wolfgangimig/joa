/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlResponseStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlResponseStatus implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlResponseStatus olResponseNone = new OlResponseStatus(0);
  public final static OlResponseStatus olResponseOrganized = new OlResponseStatus(1);
  public final static OlResponseStatus olResponseTentative = new OlResponseStatus(2);
  public final static OlResponseStatus olResponseAccepted = new OlResponseStatus(3);
  public final static OlResponseStatus olResponseDeclined = new OlResponseStatus(4);
  public final static OlResponseStatus olResponseNotResponded = new OlResponseStatus(5);

  // Integer constants for bitsets and switch statements
  public final static int _olResponseNone = 0;
  public final static int _olResponseOrganized = 1;
  public final static int _olResponseTentative = 2;
  public final static int _olResponseAccepted = 3;
  public final static int _olResponseDeclined = 4;
  public final static int _olResponseNotResponded = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlResponseStatus(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlResponseStatus valueOf(int value) {
    switch(value) {
    case 0: return olResponseNone;
    case 1: return olResponseOrganized;
    case 2: return olResponseTentative;
    case 3: return olResponseAccepted;
    case 4: return olResponseDeclined;
    case 5: return olResponseNotResponded;
    default: return new OlResponseStatus(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olResponseNone";
    case 1: return "olResponseOrganized";
    case 2: return "olResponseTentative";
    case 3: return "olResponseAccepted";
    case 4: return "olResponseDeclined";
    case 5: return "olResponseNotResponded";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olResponseNone");
      if ((value & 1) != 0) sbuf.append("|olResponseOrganized");
      if ((value & 2) != 0) sbuf.append("|olResponseTentative");
      if ((value & 3) != 0) sbuf.append("|olResponseAccepted");
      if ((value & 4) != 0) sbuf.append("|olResponseDeclined");
      if ((value & 5) != 0) sbuf.append("|olResponseNotResponded");
      return sbuf.toString();
      }
    }
  }
}
