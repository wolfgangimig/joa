/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0009.
 * Enumerates search filter properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0009 {
  ucSearchFirstName(1),
  ucSearchLastName(2),
  ucSearchDisplayName(4),
  ucSearchCompany(8),
  ucSearchPrimaryEmailAddress(16),
  ucSearchEmailAddresses(32),
  ucSearchAlias(64),
  ucSearchPhoneNumbers(128),
  ucSearchPhoneExtention(256),
  ucSearchAllFields(-1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0009(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0009 valueOf(int value) {
    switch(value) {
    case 1: return ucSearchFirstName;
    case 2: return ucSearchLastName;
    case 4: return ucSearchDisplayName;
    case 8: return ucSearchCompany;
    case 16: return ucSearchPrimaryEmailAddress;
    case 32: return ucSearchEmailAddresses;
    case 64: return ucSearchAlias;
    case 128: return ucSearchPhoneNumbers;
    case 256: return ucSearchPhoneExtention;
    case -1: return ucSearchAllFields;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0009.class);
    }
  }
}
