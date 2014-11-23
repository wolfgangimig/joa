/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationAction.
 * Enumerates the conversation actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationAction {
  ucConversationActionMerge(0),
  ucConversationActionPark(1),
  ucConversationActionAddParticipant(2),
  ucConversationActionRemoveParticipant(3);

  public final int value;
  private ConversationAction(int value) { this.value = value; }
  public static  ConversationAction valueOf(int value) {
    switch(value) {
    case 0: return ucConversationActionMerge;
    case 1: return ucConversationActionPark;
    case 2: return ucConversationActionAddParticipant;
    case 3: return ucConversationActionRemoveParticipant;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationAction.class);
    }
  }
}
