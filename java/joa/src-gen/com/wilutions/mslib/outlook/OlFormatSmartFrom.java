/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatSmartFrom.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatSmartFrom {
  olFormatSmartFromFromTo(1),
  olFormatSmartFromFromOnly(2);

  public final int value;
  private OlFormatSmartFrom(int value) { this.value = value; }
  public static  OlFormatSmartFrom valueOf(int value) {
    switch(value) {
    case 1: return olFormatSmartFromFromTo;
    case 2: return olFormatSmartFromFromOnly;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatSmartFrom.class);
    }
  }
}
