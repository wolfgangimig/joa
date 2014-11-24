/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlExchangeStoreType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlExchangeStoreType {

  // Typed constants
  public final static OlExchangeStoreType olPrimaryExchangeMailbox = new OlExchangeStoreType(0);
  public final static OlExchangeStoreType olExchangeMailbox = new OlExchangeStoreType(1);
  public final static OlExchangeStoreType olExchangePublicFolder = new OlExchangeStoreType(2);
  public final static OlExchangeStoreType olNotExchange = new OlExchangeStoreType(3);
  public final static OlExchangeStoreType olAdditionalExchangeMailbox = new OlExchangeStoreType(4);

  // Integer constants for bitsets and switch statements
  public final static int _olPrimaryExchangeMailbox = 0;
  public final static int _olExchangeMailbox = 1;
  public final static int _olExchangePublicFolder = 2;
  public final static int _olNotExchange = 3;
  public final static int _olAdditionalExchangeMailbox = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlExchangeStoreType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlExchangeStoreType valueOf(int value) {
    switch(value) {
    case 0: return olPrimaryExchangeMailbox;
    case 1: return olExchangeMailbox;
    case 2: return olExchangePublicFolder;
    case 3: return olNotExchange;
    case 4: return olAdditionalExchangeMailbox;
    default: return new OlExchangeStoreType(value);
    }
  }
}
