/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormRegionMode {
  olFormRegionRead(0),
  olFormRegionCompose(1),
  olFormRegionPreview(2);

  public final int value;
  private OlFormRegionMode(int value) { this.value = value; }
  public static  OlFormRegionMode valueOf(int value) {
    switch(value) {
    case 0: return olFormRegionRead;
    case 1: return olFormRegionCompose;
    case 2: return olFormRegionPreview;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormRegionMode.class);
    }
  }
}
