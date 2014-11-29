/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBodyFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlBodyFormat {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlBodyFormat olFormatUnspecified = new OlBodyFormat(0);
  public final static OlBodyFormat olFormatPlain = new OlBodyFormat(1);
  public final static OlBodyFormat olFormatHTML = new OlBodyFormat(2);
  public final static OlBodyFormat olFormatRichText = new OlBodyFormat(3);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatUnspecified = 0;
  public final static int _olFormatPlain = 1;
  public final static int _olFormatHTML = 2;
  public final static int _olFormatRichText = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlBodyFormat(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlBodyFormat valueOf(int value) {
    switch(value) {
    case 0: return olFormatUnspecified;
    case 1: return olFormatPlain;
    case 2: return olFormatHTML;
    case 3: return olFormatRichText;
    default: return new OlBodyFormat(value);
    }
  }
}
