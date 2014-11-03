/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMailingAddress.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMailingAddress {
  olNone(0),
  olHome(1),
  olBusiness(2),
  olOther(3);

  public final int value;
  private OlMailingAddress(int value) { this.value = value; }
  public static  OlMailingAddress valueOf(int value) {
    switch(value) {
    case 0: return olNone;
    case 1: return olHome;
    case 2: return olBusiness;
    case 3: return olOther;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMailingAddress.class);
    }
  }
}
