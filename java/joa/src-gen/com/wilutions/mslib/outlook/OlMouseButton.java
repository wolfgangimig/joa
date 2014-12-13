/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMouseButton.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0DCB2F52-1065-4FD4-BC45-1C11E6D1B279}")
public class OlMouseButton implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMouseButton olMouseButtonLeft = new OlMouseButton(1);
  public final static OlMouseButton olMouseButtonRight = new OlMouseButton(2);
  public final static OlMouseButton olMouseButtonMiddle = new OlMouseButton(4);

  // Integer constants for bitsets and switch statements
  public final static int _olMouseButtonLeft = 1;
  public final static int _olMouseButtonRight = 2;
  public final static int _olMouseButtonMiddle = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMouseButton(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMouseButton valueOf(int value) {
    switch(value) {
    case 1: return olMouseButtonLeft;
    case 2: return olMouseButtonRight;
    case 4: return olMouseButtonMiddle;
    default: return new OlMouseButton(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "olMouseButtonLeft";
    case 2: return "olMouseButtonRight";
    case 4: return "olMouseButtonMiddle";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|olMouseButtonLeft");
      if ((value & 2) != 0) sbuf.append("|olMouseButtonRight");
      if ((value & 4) != 0) sbuf.append("|olMouseButtonMiddle");
      return sbuf.toString();
      }
    }
  }
}
