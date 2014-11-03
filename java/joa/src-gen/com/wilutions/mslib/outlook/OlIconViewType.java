/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlIconViewType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlIconViewType {
  olIconViewLarge(0),
  olIconViewSmall(1),
  olIconViewList(2);

  public final int value;
  private OlIconViewType(int value) { this.value = value; }
  public static  OlIconViewType valueOf(int value) {
    switch(value) {
    case 0: return olIconViewLarge;
    case 1: return olIconViewSmall;
    case 2: return olIconViewList;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlIconViewType.class);
    }
  }
}
