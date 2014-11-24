/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAddressListType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAddressListType {

  // Typed constants
  public final static OlAddressListType olExchangeGlobalAddressList = new OlAddressListType(0);
  public final static OlAddressListType olExchangeContainer = new OlAddressListType(1);
  public final static OlAddressListType olOutlookAddressList = new OlAddressListType(2);
  public final static OlAddressListType olOutlookLdapAddressList = new OlAddressListType(3);
  public final static OlAddressListType olCustomAddressList = new OlAddressListType(4);

  // Integer constants for bitsets and switch statements
  public final static int _olExchangeGlobalAddressList = 0;
  public final static int _olExchangeContainer = 1;
  public final static int _olOutlookAddressList = 2;
  public final static int _olOutlookLdapAddressList = 3;
  public final static int _olCustomAddressList = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAddressListType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAddressListType valueOf(int value) {
    switch(value) {
    case 0: return olExchangeGlobalAddressList;
    case 1: return olExchangeContainer;
    case 2: return olOutlookAddressList;
    case 3: return olOutlookLdapAddressList;
    case 4: return olCustomAddressList;
    default: return new OlAddressListType(value);
    }
  }
}
