/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowState.
 * Enumerates the conversation window states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationWindowState {
  uiaConversationWindowNotInitialized(0),
  uiaConversationWindowInitialized(1),
  uiaConversationWindowDestroyed(2);

  public final int value;
  private ConversationWindowState(int value) { this.value = value; }
  public static  ConversationWindowState valueOf(int value) {
    switch(value) {
    case 0: return uiaConversationWindowNotInitialized;
    case 1: return uiaConversationWindowInitialized;
    case 2: return uiaConversationWindowDestroyed;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationWindowState.class);
    }
  }
}
