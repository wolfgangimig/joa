/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * OIInterface.
 * Enumerates the interfaces that can be returned in IUCOfficeIntegration.GetInterface. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OIInterface {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OIInterface oiInterfaceILyncClient = new OIInterface(1);
  public final static OIInterface oiInterfaceIAutomation = new OIInterface(2);
  public final static OIInterface oiInterfaceIInteropHelper = new OIInterface(3);
  public final static OIInterface oiInterfaceILyncClientRaw = new OIInterface(256);
  public final static OIInterface oiInterfaceIAutomationRaw = new OIInterface(257);

  // Integer constants for bitsets and switch statements
  public final static int _oiInterfaceILyncClient = 1;
  public final static int _oiInterfaceIAutomation = 2;
  public final static int _oiInterfaceIInteropHelper = 3;
  public final static int _oiInterfaceILyncClientRaw = 256;
  public final static int _oiInterfaceIAutomationRaw = 257;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OIInterface(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OIInterface valueOf(int value) {
    switch(value) {
    case 1: return oiInterfaceILyncClient;
    case 2: return oiInterfaceIAutomation;
    case 3: return oiInterfaceIInteropHelper;
    case 256: return oiInterfaceILyncClientRaw;
    case 257: return oiInterfaceIAutomationRaw;
    default: return new OIInterface(value);
    }
  }
}
