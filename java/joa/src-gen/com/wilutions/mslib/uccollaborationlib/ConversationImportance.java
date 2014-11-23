/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationImportance.
 * Enumerates the conversation importance levels. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationImportance {
  ucConversationImportanceLow(0),
  ucConversationImportanceNormal(1),
  ucConversationImportanceHigh(2),
  ucConversationImportanceEmergency(3);

  public final int value;
  private ConversationImportance(int value) { this.value = value; }
  public static  ConversationImportance valueOf(int value) {
    switch(value) {
    case 0: return ucConversationImportanceLow;
    case 1: return ucConversationImportanceNormal;
    case 2: return ucConversationImportanceHigh;
    case 3: return ucConversationImportanceEmergency;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationImportance.class);
    }
  }
}
