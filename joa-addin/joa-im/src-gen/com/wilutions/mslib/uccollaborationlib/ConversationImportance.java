/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationImportance.
 * Enumerates the conversation importance levels. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationImportance {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationImportance ucConversationImportanceLow = new ConversationImportance(0);
  public final static ConversationImportance ucConversationImportanceNormal = new ConversationImportance(1);
  public final static ConversationImportance ucConversationImportanceHigh = new ConversationImportance(2);
  public final static ConversationImportance ucConversationImportanceEmergency = new ConversationImportance(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationImportanceLow = 0;
  public final static int _ucConversationImportanceNormal = 1;
  public final static int _ucConversationImportanceHigh = 2;
  public final static int _ucConversationImportanceEmergency = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationImportance(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationImportance valueOf(int value) {
    switch(value) {
    case 0: return ucConversationImportanceLow;
    case 1: return ucConversationImportanceNormal;
    case 2: return ucConversationImportanceHigh;
    case 3: return ucConversationImportanceEmergency;
    default: return new ConversationImportance(value);
    }
  }
}
