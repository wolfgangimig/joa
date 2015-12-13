/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationState.
 * Enumerates the conversation states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationState ucConversationInactive = new ConversationState(0);
  public final static ConversationState ucConversationActive = new ConversationState(1);
  public final static ConversationState ucConversationParked = new ConversationState(2);
  public final static ConversationState ucConversationTerminated = new ConversationState(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationInactive = 0;
  public final static int _ucConversationActive = 1;
  public final static int _ucConversationParked = 2;
  public final static int _ucConversationTerminated = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationState valueOf(int value) {
    switch(value) {
    case 0: return ucConversationInactive;
    case 1: return ucConversationActive;
    case 2: return ucConversationParked;
    case 3: return ucConversationTerminated;
    default: return new ConversationState(value);
    }
  }
}
