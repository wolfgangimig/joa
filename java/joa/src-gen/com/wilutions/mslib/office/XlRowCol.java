/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlRowCol.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlRowCol {

  // Typed constants
  public final static XlRowCol xlColumns = new XlRowCol(2);
  public final static XlRowCol xlRows = new XlRowCol(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlColumns = 2;
  public final static int _xlRows = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlRowCol(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlRowCol valueOf(int value) {
    switch(value) {
    case 2: return xlColumns;
    case 1: return xlRows;
    default: return new XlRowCol(value);
    }
  }
}
