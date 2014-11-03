/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlGender.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlGender {
  olUnspecified(0),
  olFemale(1),
  olMale(2);

  public final int value;
  private OlGender(int value) { this.value = value; }
  public static  OlGender valueOf(int value) {
    switch(value) {
    case 0: return olUnspecified;
    case 1: return olFemale;
    case 2: return olMale;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlGender.class);
    }
  }
}
