/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * __MIDL___MIDL_itf_uc_0001_0255_0012.
 * Enumerates the interfaces that can be returned in IUCOfficeIntegration.GetInterface. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum __MIDL___MIDL_itf_uc_0001_0255_0012 {
  oiInterfaceILyncClient(1),
  oiInterfaceIAutomation(2),
  oiInterfaceIInteropHelper(3),
  oiInterfaceILyncClientRaw(256),
  oiInterfaceIAutomationRaw(257);

  public final int value;
  private __MIDL___MIDL_itf_uc_0001_0255_0012(int value) { this.value = value; }
  public static  __MIDL___MIDL_itf_uc_0001_0255_0012 valueOf(int value) {
    switch(value) {
    case 1: return oiInterfaceILyncClient;
    case 2: return oiInterfaceIAutomation;
    case 3: return oiInterfaceIInteropHelper;
    case 256: return oiInterfaceILyncClientRaw;
    case 257: return oiInterfaceIAutomationRaw;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + __MIDL___MIDL_itf_uc_0001_0255_0012.class);
    }
  }
}
