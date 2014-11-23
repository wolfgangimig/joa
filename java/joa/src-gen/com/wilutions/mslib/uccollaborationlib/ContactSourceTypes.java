/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSourceTypes.
 * Enumerates the contact provider type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContactSourceTypes {
  ucContactSourceUnknown(0),
  ucContactSourceGlobalAddressList(1),
  ucContactSourceWindowsAddressBook(2),
  ucContactSourceExchangeService(4);

  public final int value;
  private ContactSourceTypes(int value) { this.value = value; }
  public static  ContactSourceTypes valueOf(int value) {
    switch(value) {
    case 0: return ucContactSourceUnknown;
    case 1: return ucContactSourceGlobalAddressList;
    case 2: return ucContactSourceWindowsAddressBook;
    case 4: return ucContactSourceExchangeService;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContactSourceTypes.class);
    }
  }
}
