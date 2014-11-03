/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlItemType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlItemType {
  olMailItem(0),
  olAppointmentItem(1),
  olContactItem(2),
  olTaskItem(3),
  olJournalItem(4),
  olNoteItem(5),
  olPostItem(6),
  olDistributionListItem(7),
  olMobileItemSMS(11),
  olMobileItemMMS(12);

  public final int value;
  private OlItemType(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlItemType.class);
    }
  }
}
