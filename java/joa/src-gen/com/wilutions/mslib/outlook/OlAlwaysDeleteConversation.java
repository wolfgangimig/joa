/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlwaysDeleteConversation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlAlwaysDeleteConversation {
  olDoNotDelete(0),
  olAlwaysDelete(1),
  olAlwaysDeleteUnsupported(2);

  public final int value;
  private OlAlwaysDeleteConversation(int value) { this.value = value; }
  public static  OlAlwaysDeleteConversation valueOf(int value) {
    switch(value) {
    case 0: return olDoNotDelete;
    case 1: return olAlwaysDelete;
    case 2: return olAlwaysDeleteUnsupported;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlAlwaysDeleteConversation.class);
    }
  }
}
