/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlInspectorClose.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlInspectorClose {
  olSave(0),
  olDiscard(1),
  olPromptForSave(2);

  public final int value;
  private OlInspectorClose(int value) { this.value = value; }
  public static  OlInspectorClose valueOf(int value) {
    switch(value) {
    case 0: return olSave;
    case 1: return olDiscard;
    case 2: return olPromptForSave;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlInspectorClose.class);
    }
  }
}
