/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0141_0003.
 * Enumerates the types for Display AD Photo. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0141_0003 {
  ucADPhotoDisplay(0),
  ucADPhotoDoNotDisplay(1),
  ucADPhotoDefault(2);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0141_0003(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0141_0003 valueOf(int value) {
    switch(value) {
    case 0: return ucADPhotoDisplay;
    case 1: return ucADPhotoDoNotDisplay;
    case 2: return ucADPhotoDefault;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0141_0003.class);
    }
  }
}
