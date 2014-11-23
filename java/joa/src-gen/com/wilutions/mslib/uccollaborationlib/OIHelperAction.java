/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIHelperAction.
 * Enumerates actions of which IUCOfficeIntegrationHelper can notify. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OIHelperAction {
  oiActionStartup(0),
  oiActionShutdown(1);

  public final int value;
  private OIHelperAction(int value) { this.value = value; }
  public static  OIHelperAction valueOf(int value) {
    switch(value) {
    case 0: return oiActionStartup;
    case 1: return oiActionShutdown;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OIHelperAction.class);
    }
  }
}
