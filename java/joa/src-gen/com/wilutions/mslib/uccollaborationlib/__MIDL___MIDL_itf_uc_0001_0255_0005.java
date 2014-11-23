/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0005.
 * Enumerates uc Client configuration modes. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0005 {
  ucConfigurationModeAuto(0),
  ucConfigurationModeManual(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0005(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0005 valueOf(int value) {
    switch(value) {
    case 0: return ucConfigurationModeAuto;
    case 1: return ucConfigurationModeManual;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0005.class);
    }
  }
}
