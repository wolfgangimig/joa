/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0036.
 * Enumerates the hold features. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0036 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0036 ucHoldFeatureNone = new __MIDL___MIDL_itf_uc_0001_0046_0036(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0036 ucHoldFeatureMusicOnHold = new __MIDL___MIDL_itf_uc_0001_0046_0036(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0036 ucHoldFeatureOther = new __MIDL___MIDL_itf_uc_0001_0046_0036(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucHoldFeatureNone = 0;
  public final static int _ucHoldFeatureMusicOnHold = 1;
  public final static int _ucHoldFeatureOther = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0036(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0036 valueOf(int value) {
    switch(value) {
    case 0: return ucHoldFeatureNone;
    case 1: return ucHoldFeatureMusicOnHold;
    case 2: return ucHoldFeatureOther;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0036(value);
    }
  }
}
