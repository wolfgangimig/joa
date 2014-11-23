/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationContextType.
 * Enumerates the conversation context types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationContextType {
  ucConversationContextSimple(0),
  ucConversationContextMultiple(1),
  ucConversationContextAlternate(2);

  public final int value;
  private ConversationContextType(int value) { this.value = value; }
  public static  ConversationContextType valueOf(int value) {
    switch(value) {
    case 0: return ucConversationContextSimple;
    case 1: return ucConversationContextMultiple;
    case 2: return ucConversationContextAlternate;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationContextType.class);
    }
  }
}
