/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationHistoryRetrievalState.
 * Enumerates the possible task state of retrieving the archived history of previous 
 * conversation. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PreviousConversationHistoryRetrievalState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static PreviousConversationHistoryRetrievalState ucPreviousConversationHistoryRetrievalNotStarted = new PreviousConversationHistoryRetrievalState(0);
  public final static PreviousConversationHistoryRetrievalState ucPreviousConversationHistoryRetrievalInProgress = new PreviousConversationHistoryRetrievalState(1);
  public final static PreviousConversationHistoryRetrievalState ucPreviousConversationHistoryRetrievalComplete = new PreviousConversationHistoryRetrievalState(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationHistoryRetrievalNotStarted = 0;
  public final static int _ucPreviousConversationHistoryRetrievalInProgress = 1;
  public final static int _ucPreviousConversationHistoryRetrievalComplete = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PreviousConversationHistoryRetrievalState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PreviousConversationHistoryRetrievalState valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationHistoryRetrievalNotStarted;
    case 1: return ucPreviousConversationHistoryRetrievalInProgress;
    case 2: return ucPreviousConversationHistoryRetrievalComplete;
    default: return new PreviousConversationHistoryRetrievalState(value);
    }
  }
}
