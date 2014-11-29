/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlImportance.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlImportance {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlImportance olImportanceLow = new OlImportance(0);
  public final static OlImportance olImportanceNormal = new OlImportance(1);
  public final static OlImportance olImportanceHigh = new OlImportance(2);

  // Integer constants for bitsets and switch statements
  public final static int _olImportanceLow = 0;
  public final static int _olImportanceNormal = 1;
  public final static int _olImportanceHigh = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlImportance(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlImportance valueOf(int value) {
    switch(value) {
    case 0: return olImportanceLow;
    case 1: return olImportanceNormal;
    case 2: return olImportanceHigh;
    default: return new OlImportance(value);
    }
  }
}
