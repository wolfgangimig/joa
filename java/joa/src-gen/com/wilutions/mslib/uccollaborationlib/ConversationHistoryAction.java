/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationHistoryAction.
 * Enumerates the Conversation History related actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationHistoryAction {
  ucConversationHistorySaveAllHistory(0),
  ucConversationHistoryRetrievePast(1),
  ucConversationHistoryRetrievePastByEntryId(2);

  public final int value;
  private ConversationHistoryAction(int value) { this.value = value; }
  public static  ConversationHistoryAction valueOf(int value) {
    switch(value) {
    case 0: return ucConversationHistorySaveAllHistory;
    case 1: return ucConversationHistoryRetrievePast;
    case 2: return ucConversationHistoryRetrievePastByEntryId;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationHistoryAction.class);
    }
  }
}
