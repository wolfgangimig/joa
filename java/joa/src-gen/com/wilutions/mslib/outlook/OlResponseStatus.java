/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlResponseStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlResponseStatus {
  olResponseNone(0),
  olResponseOrganized(1),
  olResponseTentative(2),
  olResponseAccepted(3),
  olResponseDeclined(4),
  olResponseNotResponded(5);

  public final int value;
  private OlResponseStatus(int value) { this.value = value; }
  public static  OlResponseStatus valueOf(int value) {
    switch(value) {
    case 0: return olResponseNone;
    case 1: return olResponseOrganized;
    case 2: return olResponseTentative;
    case 3: return olResponseAccepted;
    case 4: return olResponseDeclined;
    case 5: return olResponseNotResponded;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlResponseStatus.class);
    }
  }
}
