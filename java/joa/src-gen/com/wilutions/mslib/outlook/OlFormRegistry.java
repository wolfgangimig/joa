/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegistry.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormRegistry {
  olDefaultRegistry(0),
  olPersonalRegistry(2),
  olFolderRegistry(3),
  olOrganizationRegistry(4);

  public final int value;
  private OlFormRegistry(int value) { this.value = value; }
  public static  OlFormRegistry valueOf(int value) {
    switch(value) {
    case 0: return olDefaultRegistry;
    case 2: return olPersonalRegistry;
    case 3: return olFolderRegistry;
    case 4: return olOrganizationRegistry;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormRegistry.class);
    }
  }
}
