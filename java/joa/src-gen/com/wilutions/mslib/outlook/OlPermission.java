/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlPermission.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlPermission {
  olUnrestricted(0),
  olDoNotForward(1),
  olPermissionTemplate(2);

  public final int value;
  private OlPermission(int value) { this.value = value; }
  public static  OlPermission valueOf(int value) {
    switch(value) {
    case 0: return olUnrestricted;
    case 1: return olDoNotForward;
    case 2: return olPermissionTemplate;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlPermission.class);
    }
  }
}
