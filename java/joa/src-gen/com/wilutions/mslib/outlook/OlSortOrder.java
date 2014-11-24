/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSortOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlSortOrder {

  // Typed constants
  public final static OlSortOrder olSortNone = new OlSortOrder(0);
  public final static OlSortOrder olAscending = new OlSortOrder(1);
  public final static OlSortOrder olDescending = new OlSortOrder(2);

  // Integer constants for bitsets and switch statements
  public final static int _olSortNone = 0;
  public final static int _olAscending = 1;
  public final static int _olDescending = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlSortOrder(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlSortOrder valueOf(int value) {
    switch(value) {
    case 0: return olSortNone;
    case 1: return olAscending;
    case 2: return olDescending;
    default: return new OlSortOrder(value);
    }
  }
}
