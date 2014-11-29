/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTimeStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{4FD8B708-E730-49B5-BDD3-B807F48E5B83}")
public class OlTimeStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTimeStyle olTimeStyleTimeOnly = new OlTimeStyle(0);
  public final static OlTimeStyle olTimeStyleTimeDuration = new OlTimeStyle(1);
  public final static OlTimeStyle olTimeStyleShortDuration = new OlTimeStyle(4);

  // Integer constants for bitsets and switch statements
  public final static int _olTimeStyleTimeOnly = 0;
  public final static int _olTimeStyleTimeDuration = 1;
  public final static int _olTimeStyleShortDuration = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTimeStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTimeStyle valueOf(int value) {
    switch(value) {
    case 0: return olTimeStyleTimeOnly;
    case 1: return olTimeStyleTimeDuration;
    case 4: return olTimeStyleShortDuration;
    default: return new OlTimeStyle(value);
    }
  }
}
