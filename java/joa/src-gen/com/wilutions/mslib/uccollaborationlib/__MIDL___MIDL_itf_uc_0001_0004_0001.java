/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0001.
 * Contact settings. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0001 {
  ucContactTagged(268435456),
  ucContactAccessLevel(805306369),
  ucContactExchangeServiceEntryId(2),
  ucContactSource(805306371),
  ucContactDefaultContactEndpoint(1073741828);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0001 valueOf(int value) {
    switch(value) {
    case 268435456: return ucContactTagged;
    case 805306369: return ucContactAccessLevel;
    case 2: return ucContactExchangeServiceEntryId;
    case 805306371: return ucContactSource;
    case 1073741828: return ucContactDefaultContactEndpoint;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0001.class);
    }
  }
}
