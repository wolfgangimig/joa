/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationDirection.
 * Enumerates the Conversation direction values range. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationDirection {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationDirection ucConversationDirectionNone = new ConversationDirection(0);
  public final static ConversationDirection ucConversationDirectionIncoming = new ConversationDirection(1);
  public final static ConversationDirection ucConversationDirectionOutgoing = new ConversationDirection(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationDirectionNone = 0;
  public final static int _ucConversationDirectionIncoming = 1;
  public final static int _ucConversationDirectionOutgoing = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationDirection valueOf(int value) {
    switch(value) {
    case 0: return ucConversationDirectionNone;
    case 1: return ucConversationDirectionIncoming;
    case 2: return ucConversationDirectionOutgoing;
    default: return new ConversationDirection(value);
    }
  }
}
