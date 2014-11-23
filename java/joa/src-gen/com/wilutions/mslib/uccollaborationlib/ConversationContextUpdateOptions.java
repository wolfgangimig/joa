/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextUpdateOptions.
 * Enumerates the conversation context update option flags. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationContextUpdateOptions {
  ucConversationContextUpdateNone(0),
  ucConversationContextUpdateAssociatedInfo(1);

  public final int value;
  private ConversationContextUpdateOptions(int value) { this.value = value; }
  public static  ConversationContextUpdateOptions valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextUpdateNone;
    case 1: return ucConversationContextUpdateAssociatedInfo;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationContextUpdateOptions.class);
    }
  }
}
