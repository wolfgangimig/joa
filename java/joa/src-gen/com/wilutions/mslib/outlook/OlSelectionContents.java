/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlSelectionContents.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlSelectionContents {
  olConversationHeaders(1);

  public final int value;
  private OlSelectionContents(int value) { this.value = value; }
  public static  OlSelectionContents valueOf(int value) {
    switch(value) {
    case 1: return olConversationHeaders;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlSelectionContents.class);
    }
  }
}
