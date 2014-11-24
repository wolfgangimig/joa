/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowState.
 * Enumerates the conversation window states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationWindowState {

  // Typed constants
  public final static ConversationWindowState uiaConversationWindowNotInitialized = new ConversationWindowState(0);
  public final static ConversationWindowState uiaConversationWindowInitialized = new ConversationWindowState(1);
  public final static ConversationWindowState uiaConversationWindowDestroyed = new ConversationWindowState(2);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationWindowNotInitialized = 0;
  public final static int _uiaConversationWindowInitialized = 1;
  public final static int _uiaConversationWindowDestroyed = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationWindowState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationWindowState valueOf(int value) {
    switch(value) {
    case 0: return uiaConversationWindowNotInitialized;
    case 1: return uiaConversationWindowInitialized;
    case 2: return uiaConversationWindowDestroyed;
    default: return new ConversationWindowState(value);
    }
  }
}
