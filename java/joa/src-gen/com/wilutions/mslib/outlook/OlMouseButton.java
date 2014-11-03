/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMouseButton.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0DCB2F52-1065-4FD4-BC45-1C11E6D1B279}")
public enum OlMouseButton {
  olMouseButtonLeft(1),
  olMouseButtonRight(2),
  olMouseButtonMiddle(4);

  public final int value;
  private OlMouseButton(int value) { this.value = value; }
  public static  OlMouseButton valueOf(int value) {
    switch(value) {
    case 1: return olMouseButtonLeft;
    case 2: return olMouseButtonRight;
    case 4: return olMouseButtonMiddle;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMouseButton.class);
    }
  }
}
