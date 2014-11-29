/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0151_0001.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class __MIDL___MIDL_itf_uc_0001_0151_0001 {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static __MIDL___MIDL_itf_uc_0001_0151_0001 ucAlertPrivacyLow = new __MIDL___MIDL_itf_uc_0001_0151_0001(20);
  public final static __MIDL___MIDL_itf_uc_0001_0151_0001 ucAlertPrivacyNeutral = new __MIDL___MIDL_itf_uc_0001_0151_0001(50);
  public final static __MIDL___MIDL_itf_uc_0001_0151_0001 ucAlertPrivacyHigh = new __MIDL___MIDL_itf_uc_0001_0151_0001(80);

  // Integer constants for bitsets and switch statements
  public final static int _ucAlertPrivacyLow = 20;
  public final static int _ucAlertPrivacyNeutral = 50;
  public final static int _ucAlertPrivacyHigh = 80;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private __MIDL___MIDL_itf_uc_0001_0151_0001(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  __MIDL___MIDL_itf_uc_0001_0151_0001 valueOf(int value) {
    switch(value) {
    case 20: return ucAlertPrivacyLow;
    case 50: return ucAlertPrivacyNeutral;
    case 80: return ucAlertPrivacyHigh;
    default: return new __MIDL___MIDL_itf_uc_0001_0151_0001(value);
    }
  }
}
