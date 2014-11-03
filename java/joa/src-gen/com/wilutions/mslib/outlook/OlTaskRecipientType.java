/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTaskRecipientType {
  olUpdate(2),
  olFinalStatus(3);

  public final int value;
  private OlTaskRecipientType(int value) { this.value = value; }
  public static  OlTaskRecipientType valueOf(int value) {
    switch(value) {
    case 2: return olUpdate;
    case 3: return olFinalStatus;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTaskRecipientType.class);
    }
  }
}
