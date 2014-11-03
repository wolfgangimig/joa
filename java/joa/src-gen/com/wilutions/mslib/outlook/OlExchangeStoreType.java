/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlExchangeStoreType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlExchangeStoreType {
  olPrimaryExchangeMailbox(0),
  olExchangeMailbox(1),
  olExchangePublicFolder(2),
  olNotExchange(3),
  olAdditionalExchangeMailbox(4);

  public final int value;
  private OlExchangeStoreType(int value) { this.value = value; }
  public static  OlExchangeStoreType valueOf(int value) {
    switch(value) {
    case 0: return olPrimaryExchangeMailbox;
    case 1: return olExchangeMailbox;
    case 2: return olExchangePublicFolder;
    case 3: return olNotExchange;
    case 4: return olAdditionalExchangeMailbox;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlExchangeStoreType.class);
    }
  }
}
