/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationState.
 * Enumerates the conversation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationState {
  ucConversationInactive(0),
  ucConversationActive(1),
  ucConversationParked(2),
  ucConversationTerminated(3);

  public final int value;
  private ConversationState(int value) { this.value = value; }
  public static  ConversationState valueOf(int value) {
    switch(value) {
    case 0: return ucConversationInactive;
    case 1: return ucConversationActive;
    case 2: return ucConversationParked;
    case 3: return ucConversationTerminated;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationState.class);
    }
  }
}
