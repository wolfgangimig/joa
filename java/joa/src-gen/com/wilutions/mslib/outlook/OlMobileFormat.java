/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMobileFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlMobileFormat {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMobileFormat olSMS = new OlMobileFormat(0);
  public final static OlMobileFormat olMMS = new OlMobileFormat(1);

  // Integer constants for bitsets and switch statements
  public final static int _olSMS = 0;
  public final static int _olMMS = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMobileFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMobileFormat valueOf(int value) {
    switch(value) {
    case 0: return olSMS;
    case 1: return olMMS;
    default: return new OlMobileFormat(value);
    }
  }
}
