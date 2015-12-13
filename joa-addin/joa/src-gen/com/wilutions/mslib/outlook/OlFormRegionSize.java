/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormRegionSize implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormRegionSize olFormRegionTypeSeparate = new OlFormRegionSize(0);
  public final static OlFormRegionSize olFormRegionTypeAdjoining = new OlFormRegionSize(1);

  // Integer constants for bitsets and switch statements
  public final static int _olFormRegionTypeSeparate = 0;
  public final static int _olFormRegionTypeAdjoining = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormRegionSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormRegionSize valueOf(int value) {
    switch(value) {
    case 0: return olFormRegionTypeSeparate;
    case 1: return olFormRegionTypeAdjoining;
    default: return new OlFormRegionSize(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "olFormRegionTypeSeparate";
    case 1: return "olFormRegionTypeAdjoining";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|olFormRegionTypeSeparate");
      if ((value & 1) != 0) sbuf.append("|olFormRegionTypeAdjoining");
      return sbuf.toString();
      }
    }
  }
}
