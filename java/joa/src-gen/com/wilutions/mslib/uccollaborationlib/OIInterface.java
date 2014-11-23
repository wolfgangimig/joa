/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIInterface.
 * Enumerates the interfaces that can be returned in IUCOfficeIntegration.GetInterface. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OIInterface {
  oiInterfaceILyncClient(1),
  oiInterfaceIAutomation(2),
  oiInterfaceIInteropHelper(3),
  oiInterfaceILyncClientRaw(256),
  oiInterfaceIAutomationRaw(257);

  public final int value;
  private OIInterface(int value) { this.value = value; }
  public static  OIInterface valueOf(int value) {
    switch(value) {
    case 1: return oiInterfaceILyncClient;
    case 2: return oiInterfaceIAutomation;
    case 3: return oiInterfaceIInteropHelper;
    case 256: return oiInterfaceILyncClientRaw;
    case 257: return oiInterfaceIAutomationRaw;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OIInterface.class);
    }
  }
}
