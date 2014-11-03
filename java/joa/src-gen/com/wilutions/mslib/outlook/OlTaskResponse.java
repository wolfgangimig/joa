/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskResponse.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTaskResponse {
  olTaskSimple(0),
  olTaskAssign(1),
  olTaskAccept(2),
  olTaskDecline(3);

  public final int value;
  private OlTaskResponse(int value) { this.value = value; }
  public static  OlTaskResponse valueOf(int value) {
    switch(value) {
    case 0: return olTaskSimple;
    case 1: return olTaskAssign;
    case 2: return olTaskAccept;
    case 3: return olTaskDecline;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTaskResponse.class);
    }
  }
}
