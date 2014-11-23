/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationStateChangeProperty.
 * Enumerates the conversation state change properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationStateChangeProperty {
  ucConversationStateChangeUnparkReason(805896192),
  ucConversationStateChangeUnparkTarget(589825);

  public final int value;
  private ConversationStateChangeProperty(int value) { this.value = value; }
  public static  ConversationStateChangeProperty valueOf(int value) {
    switch(value) {
    case 805896192: return ucConversationStateChangeUnparkReason;
    case 589825: return ucConversationStateChangeUnparkTarget;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationStateChangeProperty.class);
    }
  }
}
