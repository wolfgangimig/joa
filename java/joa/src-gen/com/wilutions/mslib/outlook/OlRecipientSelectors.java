/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecipientSelectors.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlRecipientSelectors {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlRecipientSelectors olShowNone = new OlRecipientSelectors(0);
  public final static OlRecipientSelectors olShowTo = new OlRecipientSelectors(1);
  public final static OlRecipientSelectors olShowToCc = new OlRecipientSelectors(2);
  public final static OlRecipientSelectors olShowToCcBcc = new OlRecipientSelectors(3);

  // Integer constants for bitsets and switch statements
  public final static int _olShowNone = 0;
  public final static int _olShowTo = 1;
  public final static int _olShowToCc = 2;
  public final static int _olShowToCcBcc = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlRecipientSelectors(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlRecipientSelectors valueOf(int value) {
    switch(value) {
    case 0: return olShowNone;
    case 1: return olShowTo;
    case 2: return olShowToCc;
    case 3: return olShowToCcBcc;
    default: return new OlRecipientSelectors(value);
    }
  }
}
