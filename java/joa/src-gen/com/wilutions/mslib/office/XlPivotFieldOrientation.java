/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPivotFieldOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class XlPivotFieldOrientation {

  // Typed constants
  public final static XlPivotFieldOrientation xlColumnField = new XlPivotFieldOrientation(2);
  public final static XlPivotFieldOrientation xlDataField = new XlPivotFieldOrientation(4);
  public final static XlPivotFieldOrientation xlHidden = new XlPivotFieldOrientation(0);
  public final static XlPivotFieldOrientation xlPageField = new XlPivotFieldOrientation(3);
  public final static XlPivotFieldOrientation xlRowField = new XlPivotFieldOrientation(1);

  // Integer constants for bitsets and switch statements
  public final static int _xlColumnField = 2;
  public final static int _xlDataField = 4;
  public final static int _xlHidden = 0;
  public final static int _xlPageField = 3;
  public final static int _xlRowField = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private XlPivotFieldOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  XlPivotFieldOrientation valueOf(int value) {
    switch(value) {
    case 2: return xlColumnField;
    case 4: return xlDataField;
    case 0: return xlHidden;
    case 3: return xlPageField;
    case 1: return xlRowField;
    default: return new XlPivotFieldOrientation(value);
    }
  }
}
