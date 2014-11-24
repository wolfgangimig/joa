/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0008.
 * Enumerates the search provider types. It is obselete 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0008 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderDefault = new __MIDL___MIDL_itf_uc_0001_0004_0008(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderExchangeService = new __MIDL___MIDL_itf_uc_0001_0004_0008(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderGlobalAddressList = new __MIDL___MIDL_itf_uc_0001_0004_0008(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderWindowsAddressBook = new __MIDL___MIDL_itf_uc_0001_0004_0008(4);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderOtherContacts = new __MIDL___MIDL_itf_uc_0001_0004_0008(8);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderPersonalContacts = new __MIDL___MIDL_itf_uc_0001_0004_0008(5);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderExpert = new __MIDL___MIDL_itf_uc_0001_0004_0008(65535);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0008 ucSearchProviderLync = new __MIDL___MIDL_itf_uc_0001_0004_0008(65534);

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
  private __MIDL___MIDL_itf_uc_0001_0004_0008(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
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
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0008(value);
    }
  }
}
