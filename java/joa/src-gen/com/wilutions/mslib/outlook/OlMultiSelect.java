/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMultiSelect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5A0FB768-AAF4-4E8C-9C57-89ACA8B6249F}")
public class OlMultiSelect {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlMultiSelect olMultiSelectSingle = new OlMultiSelect(0);
  public final static OlMultiSelect olMultiSelectMulti = new OlMultiSelect(1);
  public final static OlMultiSelect olMultiSelectExtended = new OlMultiSelect(2);

  // Integer constants for bitsets and switch statements
  public final static int _olMultiSelectSingle = 0;
  public final static int _olMultiSelectMulti = 1;
  public final static int _olMultiSelectExtended = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlMultiSelect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlMultiSelect valueOf(int value) {
    switch(value) {
    case 0: return olMultiSelectSingle;
    case 1: return olMultiSelectMulti;
    case 2: return olMultiSelectExtended;
    default: return new OlMultiSelect(value);
    }
  }
}
