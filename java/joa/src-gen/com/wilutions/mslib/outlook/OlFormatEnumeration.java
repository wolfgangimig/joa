/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatEnumeration.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatEnumeration {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatEnumeration olFormatEnumBitmap = new OlFormatEnumeration(1);
  public final static OlFormatEnumeration olFormatEnumText = new OlFormatEnumeration(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatEnumBitmap = 1;
  public final static int _olFormatEnumText = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatEnumeration(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatEnumeration valueOf(int value) {
    switch(value) {
    case 1: return olFormatEnumBitmap;
    case 2: return olFormatEnumText;
    default: return new OlFormatEnumeration(value);
    }
  }
}
