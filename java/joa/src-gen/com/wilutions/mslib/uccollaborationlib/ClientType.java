/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ClientType.
 * Enumerates the client type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ClientType {
  ucClientTypeUC(1),
  ucClientTypeDelegator(2),
  ucClientTypeResponseGroup(3),
  ucClientTypeAnonymous(4);

  public final int value;
  private ClientType(int value) { this.value = value; }
  public static  ClientType valueOf(int value) {
    switch(value) {
    case 1: return ucClientTypeUC;
    case 2: return ucClientTypeDelegator;
    case 3: return ucClientTypeResponseGroup;
    case 4: return ucClientTypeAnonymous;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ClientType.class);
    }
  }
}
