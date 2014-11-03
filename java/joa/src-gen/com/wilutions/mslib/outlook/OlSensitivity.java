/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSensitivity.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSensitivity {
  olNormal(0),
  olPersonal(1),
  olPrivate(2),
  olConfidential(3);

  public final int value;
  private OlSensitivity(int value) { this.value = value; }
  public static  OlSensitivity valueOf(int value) {
    switch(value) {
    case 0: return olNormal;
    case 1: return olPersonal;
    case 2: return olPrivate;
    case 3: return olConfidential;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSensitivity.class);
    }
  }
}
