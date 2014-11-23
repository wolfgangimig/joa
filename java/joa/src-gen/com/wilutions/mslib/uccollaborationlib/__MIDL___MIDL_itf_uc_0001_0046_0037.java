/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0037.
 * Enumerates the quality levels of modality's media session. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0046_0037 {
  ucMediaQualityNotSet(0),
  ucMediaQualityUnknown(1),
  ucMediaQualityGood(2),
  ucMediaQualityFair(3),
  ucMediaQualityBad(4);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0046_0037(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0046_0037 valueOf(int value) {
    switch(value) {
    case 0: return ucMediaQualityNotSet;
    case 1: return ucMediaQualityUnknown;
    case 2: return ucMediaQualityGood;
    case 3: return ucMediaQualityFair;
    case 4: return ucMediaQualityBad;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0046_0037.class);
    }
  }
}
