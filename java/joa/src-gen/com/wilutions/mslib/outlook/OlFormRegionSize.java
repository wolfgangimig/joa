/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormRegionSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormRegionSize {
  olFormRegionTypeSeparate(0),
  olFormRegionTypeAdjoining(1);

  public final int value;
  private OlFormRegionSize(int value) { this.value = value; }
  public static  OlFormRegionSize valueOf(int value) {
    switch(value) {
    case 0: return olFormRegionTypeSeparate;
    case 1: return olFormRegionTypeAdjoining;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormRegionSize.class);
    }
  }
}
