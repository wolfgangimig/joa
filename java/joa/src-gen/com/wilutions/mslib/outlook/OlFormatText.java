/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFormatText.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFormatText {
  olFormatTextText(1);

  public final int value;
  private OlFormatText(int value) { this.value = value; }
  public static  OlFormatText valueOf(int value) {
    switch(value) {
    case 1: return olFormatTextText;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFormatText.class);
    }
  }
}
