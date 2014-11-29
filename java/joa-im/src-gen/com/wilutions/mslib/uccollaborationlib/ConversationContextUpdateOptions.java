/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextUpdateOptions.
 * Enumerates the conversation context update option flags. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationContextUpdateOptions {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationContextUpdateOptions ucConversationContextUpdateNone = new ConversationContextUpdateOptions(0);
  public final static ConversationContextUpdateOptions ucConversationContextUpdateAssociatedInfo = new ConversationContextUpdateOptions(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationContextUpdateNone = 0;
  public final static int _ucConversationContextUpdateAssociatedInfo = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationContextUpdateOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationContextUpdateOptions valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextUpdateNone;
    case 1: return ucConversationContextUpdateAssociatedInfo;
    default: return new ConversationContextUpdateOptions(value);
    }
  }
}
