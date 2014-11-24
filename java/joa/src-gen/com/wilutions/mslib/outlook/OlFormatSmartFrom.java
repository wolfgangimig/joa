/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatSmartFrom.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFormatSmartFrom {

  // Typed constants
  public final static OlFormatSmartFrom olFormatSmartFromFromTo = new OlFormatSmartFrom(1);
  public final static OlFormatSmartFrom olFormatSmartFromFromOnly = new OlFormatSmartFrom(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFormatSmartFromFromTo = 1;
  public final static int _olFormatSmartFromFromOnly = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFormatSmartFrom(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFormatSmartFrom valueOf(int value) {
    switch(value) {
    case 1: return olFormatSmartFromFromTo;
    case 2: return olFormatSmartFromFromOnly;
    default: return new OlFormatSmartFrom(value);
    }
  }
}
