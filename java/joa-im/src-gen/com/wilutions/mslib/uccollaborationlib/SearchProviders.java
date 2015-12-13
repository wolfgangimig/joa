/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SearchProviders.
 * Enumerates the search provider types. It is obselete 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class SearchProviders {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static SearchProviders ucSearchProviderDefault = new SearchProviders(0);
  public final static SearchProviders ucSearchProviderExchangeService = new SearchProviders(1);
  public final static SearchProviders ucSearchProviderGlobalAddressList = new SearchProviders(2);
  public final static SearchProviders ucSearchProviderWindowsAddressBook = new SearchProviders(4);
  public final static SearchProviders ucSearchProviderOtherContacts = new SearchProviders(8);
  public final static SearchProviders ucSearchProviderPersonalContacts = new SearchProviders(5);
  public final static SearchProviders ucSearchProviderExpert = new SearchProviders(65535);
  public final static SearchProviders ucSearchProviderLync = new SearchProviders(65534);

  // Integer constants for bitsets and switch statements
  public final static int _ucSearchProviderDefault = 0;
  public final static int _ucSearchProviderExchangeService = 1;
  public final static int _ucSearchProviderGlobalAddressList = 2;
  public final static int _ucSearchProviderWindowsAddressBook = 4;
  public final static int _ucSearchProviderOtherContacts = 8;
  public final static int _ucSearchProviderPersonalContacts = 5;
  public final static int _ucSearchProviderExpert = 65535;
  public final static int _ucSearchProviderLync = 65534;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private SearchProviders(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  SearchProviders valueOf(int value) {
    switch(value) {
    case 0: return ucSearchProviderDefault;
    case 1: return ucSearchProviderExchangeService;
    case 2: return ucSearchProviderGlobalAddressList;
    case 4: return ucSearchProviderWindowsAddressBook;
    case 8: return ucSearchProviderOtherContacts;
    case 5: return ucSearchProviderPersonalContacts;
    case 65535: return ucSearchProviderExpert;
    case 65534: return ucSearchProviderLync;
    default: return new SearchProviders(value);
    }
  }
}
