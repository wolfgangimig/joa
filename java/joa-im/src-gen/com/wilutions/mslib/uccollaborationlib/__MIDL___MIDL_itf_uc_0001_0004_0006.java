/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0004_0006.
 * Enumerates contact subscription freshness. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0004_0006 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0004_0006 ucSubscriptionFreshnessNone = new __MIDL___MIDL_itf_uc_0001_0004_0006(0);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0006 ucSubscriptionFreshnessLow = new __MIDL___MIDL_itf_uc_0001_0004_0006(1);
  public final static __MIDL___MIDL_itf_uc_0001_0004_0006 ucSubscriptionFreshnessHigh = new __MIDL___MIDL_itf_uc_0001_0004_0006(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucSubscriptionFreshnessNone = 0;
  public final static int _ucSubscriptionFreshnessLow = 1;
  public final static int _ucSubscriptionFreshnessHigh = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0004_0006(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0004_0006 valueOf(int value) {
    switch(value) {
    case 0: return ucSubscriptionFreshnessNone;
    case 1: return ucSubscriptionFreshnessLow;
    case 2: return ucSubscriptionFreshnessHigh;
    default: return new __MIDL___MIDL_itf_uc_0001_0004_0006(value);
    }
  }
}
