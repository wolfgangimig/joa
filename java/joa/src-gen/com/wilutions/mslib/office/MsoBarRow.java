/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarRow.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoBarRow {
  msoBarRowFirst(0),
  msoBarRowLast(-1);

  public final int value;
  private MsoBarRow(int value) { this.value = value; }
  public static  MsoBarRow valueOf(int value) {
    switch(value) {
    case 0: return msoBarRowFirst;
    case -1: return msoBarRowLast;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoBarRow.class);
    }
  }
}
