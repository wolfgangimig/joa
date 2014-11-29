/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAutoDiscoverConnectionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAutoDiscoverConnectionMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAutoDiscoverConnectionMode olAutoDiscoverConnectionUnknown = new OlAutoDiscoverConnectionMode(0);
  public final static OlAutoDiscoverConnectionMode olAutoDiscoverConnectionExternal = new OlAutoDiscoverConnectionMode(1);
  public final static OlAutoDiscoverConnectionMode olAutoDiscoverConnectionInternal = new OlAutoDiscoverConnectionMode(2);
  public final static OlAutoDiscoverConnectionMode olAutoDiscoverConnectionInternalDomain = new OlAutoDiscoverConnectionMode(3);

  // Integer constants for bitsets and switch statements
  public final static int _olAutoDiscoverConnectionUnknown = 0;
  public final static int _olAutoDiscoverConnectionExternal = 1;
  public final static int _olAutoDiscoverConnectionInternal = 2;
  public final static int _olAutoDiscoverConnectionInternalDomain = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAutoDiscoverConnectionMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAutoDiscoverConnectionMode valueOf(int value) {
    switch(value) {
    case 0: return olAutoDiscoverConnectionUnknown;
    case 1: return olAutoDiscoverConnectionExternal;
    case 2: return olAutoDiscoverConnectionInternal;
    case 3: return olAutoDiscoverConnectionInternalDomain;
    default: return new OlAutoDiscoverConnectionMode(value);
    }
  }
}
