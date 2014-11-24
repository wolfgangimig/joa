/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlItemType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlItemType {

  // Typed constants
  public final static OlItemType olMailItem = new OlItemType(0);
  public final static OlItemType olAppointmentItem = new OlItemType(1);
  public final static OlItemType olContactItem = new OlItemType(2);
  public final static OlItemType olTaskItem = new OlItemType(3);
  public final static OlItemType olJournalItem = new OlItemType(4);
  public final static OlItemType olNoteItem = new OlItemType(5);
  public final static OlItemType olPostItem = new OlItemType(6);
  public final static OlItemType olDistributionListItem = new OlItemType(7);
  public final static OlItemType olMobileItemSMS = new OlItemType(11);
  public final static OlItemType olMobileItemMMS = new OlItemType(12);

  // Integer constants for bitsets and switch statements
  public final static int _olMailItem = 0;
  public final static int _olAppointmentItem = 1;
  public final static int _olContactItem = 2;
  public final static int _olTaskItem = 3;
  public final static int _olJournalItem = 4;
  public final static int _olNoteItem = 5;
  public final static int _olPostItem = 6;
  public final static int _olDistributionListItem = 7;
  public final static int _olMobileItemSMS = 11;
  public final static int _olMobileItemMMS = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlItemType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlItemType valueOf(int value) {
    switch(value) {
    case 0: return olMailItem;
    case 1: return olAppointmentItem;
    case 2: return olContactItem;
    case 3: return olTaskItem;
    case 4: return olJournalItem;
    case 5: return olNoteItem;
    case 6: return olPostItem;
    case 7: return olDistributionListItem;
    case 11: return olMobileItemSMS;
    case 12: return olMobileItemMMS;
    default: return new OlItemType(value);
    }
  }
}
