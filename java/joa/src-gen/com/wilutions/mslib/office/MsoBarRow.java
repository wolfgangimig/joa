/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarRow.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBarRow {

  // Typed constants
  public final static MsoBarRow msoBarRowFirst = new MsoBarRow(0);
  public final static MsoBarRow msoBarRowLast = new MsoBarRow(-1);

  // Integer constants for bitsets and switch statements
  public final static int _msoBarRowFirst = 0;
  public final static int _msoBarRowLast = -1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBarRow(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBarRow valueOf(int value) {
    switch(value) {
    case 0: return msoBarRowFirst;
    case -1: return msoBarRowLast;
    default: return new MsoBarRow(value);
    }
  }
}
