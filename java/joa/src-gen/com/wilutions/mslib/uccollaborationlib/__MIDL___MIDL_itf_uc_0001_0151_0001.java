/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0151_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0151_0001 {
  ucAlertPrivacyLow(20),
  ucAlertPrivacyNeutral(50),
  ucAlertPrivacyHigh(80);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0151_0001(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0151_0001 valueOf(int value) {
    switch(value) {
    case 20: return ucAlertPrivacyLow;
    case 50: return ucAlertPrivacyNeutral;
    case 80: return ucAlertPrivacyHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0151_0001.class);
    }
  }
}
