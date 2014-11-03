/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlIconViewPlacement.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlIconViewPlacement {
  olIconDoNotArrange(0),
  olIconLineUp(1),
  olIconAutoArrange(2),
  olIconSortAndAutoArrange(3);

  public final int value;
  private OlIconViewPlacement(int value) { this.value = value; }
  public static  OlIconViewPlacement valueOf(int value) {
    switch(value) {
    case 0: return olIconDoNotArrange;
    case 1: return olIconLineUp;
    case 2: return olIconAutoArrange;
    case 3: return olIconSortAndAutoArrange;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlIconViewPlacement.class);
    }
  }
}
