/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTimeStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{4FD8B708-E730-49B5-BDD3-B807F48E5B83}")
public enum OlTimeStyle {
  olTimeStyleTimeOnly(0),
  olTimeStyleTimeDuration(1),
  olTimeStyleShortDuration(4);

  public final int value;
  private OlTimeStyle(int value) { this.value = value; }
  public static  OlTimeStyle valueOf(int value) {
    switch(value) {
    case 0: return olTimeStyleTimeOnly;
    case 1: return olTimeStyleTimeDuration;
    case 4: return olTimeStyleShortDuration;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTimeStyle.class);
    }
  }
}
