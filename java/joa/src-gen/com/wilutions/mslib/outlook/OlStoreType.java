/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlStoreType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlStoreType {
  olStoreDefault(1),
  olStoreUnicode(2),
  olStoreANSI(3);

  public final int value;
  private OlStoreType(int value) { this.value = value; }
  public static  OlStoreType valueOf(int value) {
    switch(value) {
    case 1: return olStoreDefault;
    case 2: return olStoreUnicode;
    case 3: return olStoreANSI;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlStoreType.class);
    }
  }
}
