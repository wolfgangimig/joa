/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAccountType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAccountType {
  olExchange(0),
  olImap(1),
  olPop3(2),
  olHttp(3),
  olEas(4),
  olOtherAccount(5);

  public final int value;
  private OlAccountType(int value) { this.value = value; }
  public static  OlAccountType valueOf(int value) {
    switch(value) {
    case 0: return olExchange;
    case 1: return olImap;
    case 2: return olPop3;
    case 3: return olHttp;
    case 4: return olEas;
    case 5: return olOtherAccount;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAccountType.class);
    }
  }
}
