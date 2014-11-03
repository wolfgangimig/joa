/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlRecipientSelectors.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlRecipientSelectors {
  olShowNone(0),
  olShowTo(1),
  olShowToCc(2),
  olShowToCcBcc(3);

  public final int value;
  private OlRecipientSelectors(int value) { this.value = value; }
  public static  OlRecipientSelectors valueOf(int value) {
    switch(value) {
    case 0: return olShowNone;
    case 1: return olShowTo;
    case 2: return olShowToCc;
    case 3: return olShowToCcBcc;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlRecipientSelectors.class);
    }
  }
}
