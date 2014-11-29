/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSelectionContents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSelectionContents {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlSelectionContents olConversationHeaders = new OlSelectionContents(1);

  // Integer constants for bitsets and switch statements
  public final static int _olConversationHeaders = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSelectionContents(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSelectionContents valueOf(int value) {
    switch(value) {
    case 1: return olConversationHeaders;
    default: return new OlSelectionContents(value);
    }
  }
}
