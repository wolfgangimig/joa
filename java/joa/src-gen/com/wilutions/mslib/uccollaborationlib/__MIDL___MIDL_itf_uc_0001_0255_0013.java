/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0013.
 * Enumerates actions of which IUCOfficeIntegrationHelper can notify. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0013 {
  oiActionStartup(0),
  oiActionShutdown(1);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0013(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0013 valueOf(int value) {
    switch(value) {
    case 0: return oiActionStartup;
    case 1: return oiActionShutdown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0013.class);
    }
  }
}
