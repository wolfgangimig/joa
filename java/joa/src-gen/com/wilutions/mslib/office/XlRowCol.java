/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlRowCol.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlRowCol {
  xlColumns(2),
  xlRows(1);

  public final int value;
  private XlRowCol(int value) { this.value = value; }
  public static  XlRowCol valueOf(int value) {
    switch(value) {
    case 2: return xlColumns;
    case 1: return xlRows;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlRowCol.class);
    }
  }
}
