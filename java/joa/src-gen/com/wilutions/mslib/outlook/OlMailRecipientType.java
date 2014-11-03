/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlMailRecipientType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlMailRecipientType {
  olOriginator(0),
  olTo(1),
  olCC(2),
  olBCC(3);

  public final int value;
  private OlMailRecipientType(int value) { this.value = value; }
  public static  OlMailRecipientType valueOf(int value) {
    switch(value) {
    case 0: return olOriginator;
    case 1: return olTo;
    case 2: return olCC;
    case 3: return olBCC;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlMailRecipientType.class);
    }
  }
}
