/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0013.
 * Enumerates source network (network of origin) types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0013 {
  ucSourceNetworkUnknown(0),
  ucSourceNetworkEnterprise(1),
  ucSourceNetworkFederatedEnterprise(2),
  ucSourceNetworkFederatedPublic(3);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0013(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0013 valueOf(int value) {
    switch(value) {
    case 0: return ucSourceNetworkUnknown;
    case 1: return ucSourceNetworkEnterprise;
    case 2: return ucSourceNetworkFederatedEnterprise;
    case 3: return ucSourceNetworkFederatedPublic;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0013.class);
    }
  }
}
