/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationDirection.
 * Enumerates the Conversation direction values range. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationDirection {
  ucConversationDirectionNone(0),
  ucConversationDirectionIncoming(1),
  ucConversationDirectionOutgoing(2);

  public final int value;
  private ConversationDirection(int value) { this.value = value; }
  public static  ConversationDirection valueOf(int value) {
    switch(value) {
    case 0: return ucConversationDirectionNone;
    case 1: return ucConversationDirectionIncoming;
    case 2: return ucConversationDirectionOutgoing;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationDirection.class);
    }
  }
}
