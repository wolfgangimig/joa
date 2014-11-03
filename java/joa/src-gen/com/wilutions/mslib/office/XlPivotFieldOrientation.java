/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * XlPivotFieldOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum XlPivotFieldOrientation {
  xlColumnField(2),
  xlDataField(4),
  xlHidden(0),
  xlPageField(3),
  xlRowField(1);

  public final int value;
  private XlPivotFieldOrientation(int value) { this.value = value; }
  public static  XlPivotFieldOrientation valueOf(int value) {
    switch(value) {
    case 2: return xlColumnField;
    case 4: return xlDataField;
    case 0: return xlHidden;
    case 3: return xlPageField;
    case 1: return xlRowField;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + XlPivotFieldOrientation.class);
    }
  }
}
