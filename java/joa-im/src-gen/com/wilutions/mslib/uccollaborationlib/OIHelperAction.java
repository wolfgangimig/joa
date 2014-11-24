/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIHelperAction.
 * Enumerates actions of which IUCOfficeIntegrationHelper can notify. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OIHelperAction {

  // Typed constants
  public final static OIHelperAction oiActionStartup = new OIHelperAction(0);
  public final static OIHelperAction oiActionShutdown = new OIHelperAction(1);

  // Integer constants for bitsets and switch statements
  public final static int _oiActionStartup = 0;
  public final static int _oiActionShutdown = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OIHelperAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OIHelperAction valueOf(int value) {
    switch(value) {
    case 0: return oiActionStartup;
    case 1: return oiActionShutdown;
    default: return new OIHelperAction(value);
    }
  }
}
