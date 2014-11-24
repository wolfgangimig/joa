/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0046_0037.
 * Enumerates the quality levels of modality's media session. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0046_0037 {

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0046_0037 ucMediaQualityNotSet = new __MIDL___MIDL_itf_uc_0001_0046_0037(0);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0037 ucMediaQualityUnknown = new __MIDL___MIDL_itf_uc_0001_0046_0037(1);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0037 ucMediaQualityGood = new __MIDL___MIDL_itf_uc_0001_0046_0037(2);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0037 ucMediaQualityFair = new __MIDL___MIDL_itf_uc_0001_0046_0037(3);
  public final static __MIDL___MIDL_itf_uc_0001_0046_0037 ucMediaQualityBad = new __MIDL___MIDL_itf_uc_0001_0046_0037(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucMediaQualityNotSet = 0;
  public final static int _ucMediaQualityUnknown = 1;
  public final static int _ucMediaQualityGood = 2;
  public final static int _ucMediaQualityFair = 3;
  public final static int _ucMediaQualityBad = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0046_0037(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0046_0037 valueOf(int value) {
    switch(value) {
    case 0: return ucMediaQualityNotSet;
    case 1: return ucMediaQualityUnknown;
    case 2: return ucMediaQualityGood;
    case 3: return ucMediaQualityFair;
    case 4: return ucMediaQualityBad;
    default: return new __MIDL___MIDL_itf_uc_0001_0046_0037(value);
    }
  }
}
