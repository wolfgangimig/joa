/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0036.
 * Enumerates the hold features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0036 {
  ucHoldFeatureNone(0),
  ucHoldFeatureMusicOnHold(1),
  ucHoldFeatureOther(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0036(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0036 valueOf(int value) {
    switch(value) {
    case 0: return ucHoldFeatureNone;
    case 1: return ucHoldFeatureMusicOnHold;
    case 2: return ucHoldFeatureOther;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0036.class);
    }
  }
}
