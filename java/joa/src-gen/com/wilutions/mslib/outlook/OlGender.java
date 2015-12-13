/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGender.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlGender implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlGender olUnspecified = new OlGender(0);
  public final static OlGender olFemale = new OlGender(1);
  public final static OlGender olMale = new OlGender(2);

  // Integer constants for bitsets and switch statements
  public final static int _olUnspecified = 0;
  public final static int _olFemale = 1;
  public final static int _olMale = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlGender(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlGender valueOf(int value) {
    switch(value) {
    case 0: return olUnspecified;
    case 1: return olFemale;
    case 2: return olMale;
    default: return new OlGender(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olUnspecified";
    case 1: return "olFemale";
    case 2: return "olMale";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olUnspecified");
      if ((value & 1) != 0) sbuf.append("|olFemale");
      if ((value & 2) != 0) sbuf.append("|olMale");
      return sbuf.toString();
      }
    }
  }
}
