/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoSortOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoSortOrder {

  // Typed constants
  public final static MsoSortOrder msoSortOrderAscending = new MsoSortOrder(1);
  public final static MsoSortOrder msoSortOrderDescending = new MsoSortOrder(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoSortOrderAscending = 1;
  public final static int _msoSortOrderDescending = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoSortOrder(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoSortOrder valueOf(int value) {
    switch(value) {
    case 1: return msoSortOrderAscending;
    case 2: return msoSortOrderDescending;
    default: return new MsoSortOrder(value);
    }
  }
}
