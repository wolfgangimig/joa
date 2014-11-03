/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAddressListType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAddressListType {
  olExchangeGlobalAddressList(0),
  olExchangeContainer(1),
  olOutlookAddressList(2),
  olOutlookLdapAddressList(3),
  olCustomAddressList(4);

  public final int value;
  private OlAddressListType(int value) { this.value = value; }
  public static  OlAddressListType valueOf(int value) {
    switch(value) {
    case 0: return olExchangeGlobalAddressList;
    case 1: return olExchangeContainer;
    case 2: return olOutlookAddressList;
    case 3: return olOutlookLdapAddressList;
    case 4: return olCustomAddressList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAddressListType.class);
    }
  }
}
