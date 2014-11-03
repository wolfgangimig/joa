/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMultiLine.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMultiLine {
  olWidthMultiLine(0),
  olAlwaysSingleLine(1),
  olAlwaysMultiLine(2);

  public final int value;
  private OlMultiLine(int value) { this.value = value; }
  public static  OlMultiLine valueOf(int value) {
    switch(value) {
    case 0: return olWidthMultiLine;
    case 1: return olAlwaysSingleLine;
    case 2: return olAlwaysMultiLine;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMultiLine.class);
    }
  }
}
