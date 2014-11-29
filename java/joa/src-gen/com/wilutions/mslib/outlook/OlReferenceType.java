/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlReferenceType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlReferenceType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlReferenceType olWeak = new OlReferenceType(0);
  public final static OlReferenceType olStrong = new OlReferenceType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olWeak = 0;
  public final static int _olStrong = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlReferenceType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlReferenceType valueOf(int value) {
    switch(value) {
    case 0: return olWeak;
    case 1: return olStrong;
    default: return new OlReferenceType(value);
    }
  }
}
