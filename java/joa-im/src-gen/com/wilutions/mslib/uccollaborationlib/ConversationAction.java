/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationAction.
 * Enumerates the conversation actions. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationAction {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationAction ucConversationActionMerge = new ConversationAction(0);
  public final static ConversationAction ucConversationActionPark = new ConversationAction(1);
  public final static ConversationAction ucConversationActionAddParticipant = new ConversationAction(2);
  public final static ConversationAction ucConversationActionRemoveParticipant = new ConversationAction(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationActionMerge = 0;
  public final static int _ucConversationActionPark = 1;
  public final static int _ucConversationActionAddParticipant = 2;
  public final static int _ucConversationActionRemoveParticipant = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationAction valueOf(int value) {
    switch(value) {
    case 0: return ucConversationActionMerge;
    case 1: return ucConversationActionPark;
    case 2: return ucConversationActionAddParticipant;
    case 3: return ucConversationActionRemoveParticipant;
    default: return new ConversationAction(value);
    }
  }
}
