/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0007.
 * Enumerates the contact provider type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0007 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0007 ucContactSourceUnknown = new __MIDL___MIDL_itf_uc_0001_0004_0007(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0007 ucContactSourceGlobalAddressList = new __MIDL___MIDL_itf_uc_0001_0004_0007(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0007 ucContactSourceWindowsAddressBook = new __MIDL___MIDL_itf_uc_0001_0004_0007(2);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0007 ucContactSourceExchangeService = new __MIDL___MIDL_itf_uc_0001_0004_0007(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucContactSourceUnknown = 0;
  public final static int _ucContactSourceGlobalAddressList = 1;
  public final static int _ucContactSourceWindowsAddressBook = 2;
  public final static int _ucContactSourceExchangeService = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0007(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0007 valueOf(int value) {
    switch(value) {
    case 0: return ucContactSourceUnknown;
    case 1: return ucContactSourceGlobalAddressList;
    case 2: return ucContactSourceWindowsAddressBook;
    case 4: return ucContactSourceExchangeService;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0007(value);
    }
  }
}
