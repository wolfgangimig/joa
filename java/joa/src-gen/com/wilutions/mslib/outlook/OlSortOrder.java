/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSortOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSortOrder {
  olSortNone(0),
  olAscending(1),
  olDescending(2);

  public final int value;
  private OlSortOrder(int value) { this.value = value; }
  public static  OlSortOrder valueOf(int value) {
    switch(value) {
    case 0: return olSortNone;
    case 1: return olAscending;
    case 2: return olDescending;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSortOrder.class);
    }
  }
}
