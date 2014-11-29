/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationHistoryAction.
 * Enumerates the Conversation History related actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationHistoryAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationHistoryAction ucConversationHistorySaveAllHistory = new ConversationHistoryAction(0);
  public final static ConversationHistoryAction ucConversationHistoryRetrievePast = new ConversationHistoryAction(1);
  public final static ConversationHistoryAction ucConversationHistoryRetrievePastByEntryId = new ConversationHistoryAction(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationHistorySaveAllHistory = 0;
  public final static int _ucConversationHistoryRetrievePast = 1;
  public final static int _ucConversationHistoryRetrievePastByEntryId = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationHistoryAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationHistoryAction valueOf(int value) {
    switch(value) {
    case 0: return ucConversationHistorySaveAllHistory;
    case 1: return ucConversationHistoryRetrievePast;
    case 2: return ucConversationHistoryRetrievePastByEntryId;
    default: return new ConversationHistoryAction(value);
    }
  }
}
