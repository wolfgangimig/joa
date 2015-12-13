/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextType.
 * Enumerates the conversation context types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationContextType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationContextType ucConversationContextSimple = new ConversationContextType(0);
  public final static ConversationContextType ucConversationContextMultiple = new ConversationContextType(1);
  public final static ConversationContextType ucConversationContextAlternate = new ConversationContextType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationContextSimple = 0;
  public final static int _ucConversationContextMultiple = 1;
  public final static int _ucConversationContextAlternate = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationContextType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationContextType valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextSimple;
    case 1: return ucConversationContextMultiple;
    case 2: return ucConversationContextAlternate;
    default: return new ConversationContextType(value);
    }
  }
}
