/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationStateChangeProperty.
 * Enumerates the conversation state change properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationStateChangeProperty {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationStateChangeProperty ucConversationStateChangeUnparkReason = new ConversationStateChangeProperty(805896192);
  public final static ConversationStateChangeProperty ucConversationStateChangeUnparkTarget = new ConversationStateChangeProperty(589825);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationStateChangeUnparkReason = 805896192;
  public final static int _ucConversationStateChangeUnparkTarget = 589825;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationStateChangeProperty(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationStateChangeProperty valueOf(int value) {
    switch(value) {
    case 805896192: return ucConversationStateChangeUnparkReason;
    case 589825: return ucConversationStateChangeUnparkTarget;
    default: return new ConversationStateChangeProperty(value);
    }
  }
}
