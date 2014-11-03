/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlReferenceType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlReferenceType {
  olWeak(0),
  olStrong(1);

  public final int value;
  private OlReferenceType(int value) { this.value = value; }
  public static  OlReferenceType valueOf(int value) {
    switch(value) {
    case 0: return olWeak;
    case 1: return olStrong;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlReferenceType.class);
    }
  }
}
