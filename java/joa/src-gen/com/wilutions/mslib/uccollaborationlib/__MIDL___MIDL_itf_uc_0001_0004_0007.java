/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0007.
 * Enumerates the contact provider type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0007 {
  ucContactSourceUnknown(0),
  ucContactSourceGlobalAddressList(1),
  ucContactSourceWindowsAddressBook(2),
  ucContactSourceExchangeService(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0007(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucContactSourceUnknown;
    case 1: return ucContactSourceGlobalAddressList;
    case 2: return ucContactSourceWindowsAddressBook;
    case 4: return ucContactSourceExchangeService;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0007.class);
    }
  }
}
