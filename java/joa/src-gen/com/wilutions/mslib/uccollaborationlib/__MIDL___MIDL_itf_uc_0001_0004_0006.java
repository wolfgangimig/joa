/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0006.
 * Enumerates contact subscription freshness. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0004_0006 {
  ucSubscriptionFreshnessNone(0),
  ucSubscriptionFreshnessLow(1),
  ucSubscriptionFreshnessHigh(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0004_0006(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0004_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucSubscriptionFreshnessNone;
    case 1: return ucSubscriptionFreshnessLow;
    case 2: return ucSubscriptionFreshnessHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0004_0006.class);
    }
  }
}
