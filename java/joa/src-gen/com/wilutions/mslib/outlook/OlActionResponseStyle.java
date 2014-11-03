/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlActionResponseStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlActionResponseStyle {
  olOpen(0),
  olSend(1),
  olPrompt(2);

  public final int value;
  private OlActionResponseStyle(int value) { this.value = value; }
  public static  OlActionResponseStyle valueOf(int value) {
    switch(value) {
    case 0: return olOpen;
    case 1: return olSend;
    case 2: return olPrompt;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlActionResponseStyle.class);
    }
  }
}
