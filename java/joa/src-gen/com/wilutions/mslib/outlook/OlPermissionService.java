/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPermissionService.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlPermissionService {
  olUnknown(0),
  olWindows(1),
  olPassport(2);

  public final int value;
  private OlPermissionService(int value) { this.value = value; }
  public static  OlPermissionService valueOf(int value) {
    switch(value) {
    case 0: return olUnknown;
    case 1: return olWindows;
    case 2: return olPassport;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlPermissionService.class);
    }
  }
}
