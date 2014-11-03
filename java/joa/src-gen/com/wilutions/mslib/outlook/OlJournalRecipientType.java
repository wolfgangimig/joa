/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlJournalRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlJournalRecipientType {
  olAssociatedContact(1);

  public final int value;
  private OlJournalRecipientType(int value) { this.value = value; }
  public static  OlJournalRecipientType valueOf(int value) {
    switch(value) {
    case 1: return olAssociatedContact;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlJournalRecipientType.class);
    }
  }
}
