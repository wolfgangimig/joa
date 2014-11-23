/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContextType.
 * Enumerates the conversation context type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ContextType {
  ucContextualConversationApplicationId(0),
  ucContextualConversationApplicationData(1),
  ucContextualConversationHyperLink(2);

  public final int value;
  private ContextType(int value) { this.value = value; }
  public static  ContextType valueOf(int value) {
    switch(value) {
    case 0: return ucContextualConversationApplicationId;
    case 1: return ucContextualConversationApplicationData;
    case 2: return ucContextualConversationHyperLink;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ContextType.class);
    }
  }
}
