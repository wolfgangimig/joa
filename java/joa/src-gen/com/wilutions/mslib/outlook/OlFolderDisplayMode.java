/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFolderDisplayMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFolderDisplayMode {
  olFolderDisplayNormal(0),
  olFolderDisplayFolderOnly(1),
  olFolderDisplayNoNavigation(2);

  public final int value;
  private OlFolderDisplayMode(int value) { this.value = value; }
  public static  OlFolderDisplayMode valueOf(int value) {
    switch(value) {
    case 0: return olFolderDisplayNormal;
    case 1: return olFolderDisplayFolderOnly;
    case 2: return olFolderDisplayNoNavigation;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFolderDisplayMode.class);
    }
  }
}
