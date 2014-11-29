/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlJournalRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlJournalRecipientType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlJournalRecipientType olAssociatedContact = new OlJournalRecipientType(1);

  // Integer constants for bitsets and switch statements
  public final static int _olAssociatedContact = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlJournalRecipientType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlJournalRecipientType valueOf(int value) {
    switch(value) {
    case 1: return olAssociatedContact;
    default: return new OlJournalRecipientType(value);
    }
  }
}
