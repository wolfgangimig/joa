/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSortOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoSortOrder {
  msoSortOrderAscending(1),
  msoSortOrderDescending(2);

  public final int value;
  private MsoSortOrder(int value) { this.value = value; }
  public static  MsoSortOrder valueOf(int value) {
    switch(value) {
    case 1: return msoSortOrderAscending;
    case 2: return msoSortOrderDescending;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoSortOrder.class);
    }
  }
}
