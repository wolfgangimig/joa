/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatKeywords.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatKeywords {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFormatKeywords olFormatKeywordsText = new OlFormatKeywords(1);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatKeywordsText = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatKeywords(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatKeywords valueOf(int value) {
    switch(value) {
    case 1: return olFormatKeywordsText;
    default: return new OlFormatKeywords(value);
    }
  }
}
