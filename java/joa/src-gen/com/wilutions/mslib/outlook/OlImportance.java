/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlImportance.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlImportance {
  olImportanceLow(0),
  olImportanceNormal(1),
  olImportanceHigh(2);

  public final int value;
  private OlImportance(int value) { this.value = value; }
  public static  OlImportance valueOf(int value) {
    switch(value) {
    case 0: return olImportanceLow;
    case 1: return olImportanceNormal;
    case 2: return olImportanceHigh;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlImportance.class);
    }
  }
}
