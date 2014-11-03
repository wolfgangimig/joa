/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAutoDiscoverConnectionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAutoDiscoverConnectionMode {
  olAutoDiscoverConnectionUnknown(0),
  olAutoDiscoverConnectionExternal(1),
  olAutoDiscoverConnectionInternal(2),
  olAutoDiscoverConnectionInternalDomain(3);

  public final int value;
  private OlAutoDiscoverConnectionMode(int value) { this.value = value; }
  public static  OlAutoDiscoverConnectionMode valueOf(int value) {
    switch(value) {
    case 0: return olAutoDiscoverConnectionUnknown;
    case 1: return olAutoDiscoverConnectionExternal;
    case 2: return olAutoDiscoverConnectionInternal;
    case 3: return olAutoDiscoverConnectionInternalDomain;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAutoDiscoverConnectionMode.class);
    }
  }
}
