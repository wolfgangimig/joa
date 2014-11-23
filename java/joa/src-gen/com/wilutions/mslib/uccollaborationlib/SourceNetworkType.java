/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * SourceNetworkType.
 * Enumerates source network (network of origin) types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum SourceNetworkType {
  ucSourceNetworkUnknown(0),
  ucSourceNetworkEnterprise(1),
  ucSourceNetworkFederatedEnterprise(2),
  ucSourceNetworkFederatedPublic(3);

  public final int value;
  private SourceNetworkType(int value) { this.value = value; }
  public static  SourceNetworkType valueOf(int value) {
    switch(value) {
    case 0: return ucSourceNetworkUnknown;
    case 1: return ucSourceNetworkEnterprise;
    case 2: return ucSourceNetworkFederatedEnterprise;
    case 3: return ucSourceNetworkFederatedPublic;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + SourceNetworkType.class);
    }
  }
}
