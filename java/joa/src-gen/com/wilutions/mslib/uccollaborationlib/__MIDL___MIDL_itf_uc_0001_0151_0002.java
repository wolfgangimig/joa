/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0151_0002.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0151_0002 {
  ucAlertModeVisual(1),
  ucAlertModeAudio(2),
  ucAlertModeAny(-1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0151_0002(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0151_0002 valueOf(int value) {
    switch(value) {
    case 1: return ucAlertModeVisual;
    case 2: return ucAlertModeAudio;
    case -1: return ucAlertModeAny;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0151_0002.class);
    }
  }
}
