/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContactSourceTypes.
 * Enumerates the contact provider type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContactSourceTypes {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ContactSourceTypes ucContactSourceUnknown = new ContactSourceTypes(0);
  public final static ContactSourceTypes ucContactSourceGlobalAddressList = new ContactSourceTypes(1);
  public final static ContactSourceTypes ucContactSourceWindowsAddressBook = new ContactSourceTypes(2);
  public final static ContactSourceTypes ucContactSourceExchangeService = new ContactSourceTypes(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactSourceUnknown = 0;
  public final static int _ucContactSourceGlobalAddressList = 1;
  public final static int _ucContactSourceWindowsAddressBook = 2;
  public final static int _ucContactSourceExchangeService = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContactSourceTypes(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContactSourceTypes valueOf(int value) {
    switch(value) {
    case 0: return ucContactSourceUnknown;
    case 1: return ucContactSourceGlobalAddressList;
    case 2: return ucContactSourceWindowsAddressBook;
    case 4: return ucContactSourceExchangeService;
    default: return new ContactSourceTypes(value);
    }
  }
}
