/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMobileFormat.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMobileFormat {
  olSMS(0),
  olMMS(1);

  public final int value;
  private OlMobileFormat(int value) { this.value = value; }
  public static  OlMobileFormat valueOf(int value) {
    switch(value) {
    case 0: return olSMS;
    case 1: return olMMS;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMobileFormat.class);
    }
  }
}
