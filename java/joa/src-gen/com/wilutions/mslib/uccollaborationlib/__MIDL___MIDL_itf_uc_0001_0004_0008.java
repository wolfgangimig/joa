/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0008.
 * Enumerates the search provider types. It is obselete 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0008 {
  ucSearchProviderDefault(0),
  ucSearchProviderExchangeService(1),
  ucSearchProviderGlobalAddressList(2),
  ucSearchProviderWindowsAddressBook(4),
  ucSearchProviderOtherContacts(8),
  ucSearchProviderPersonalContacts(5),
  ucSearchProviderExpert(65535),
  ucSearchProviderLync(65534);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0008(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0008 valueOf(int value) {
    switch(value) {
    case 0: return ucSearchProviderDefault;
    case 1: return ucSearchProviderExchangeService;
    case 2: return ucSearchProviderGlobalAddressList;
    case 4: return ucSearchProviderWindowsAddressBook;
    case 8: return ucSearchProviderOtherContacts;
    case 5: return ucSearchProviderPersonalContacts;
    case 65535: return ucSearchProviderExpert;
    case 65534: return ucSearchProviderLync;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0008.class);
    }
  }
}
