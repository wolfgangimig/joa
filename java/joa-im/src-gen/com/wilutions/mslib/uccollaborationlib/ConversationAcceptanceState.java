/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationAcceptanceState.
 * Enumerates the conversation acceptance states. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationAcceptanceState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationAcceptanceState ucConversationAcceptanceNone = new ConversationAcceptanceState(0);
  public final static ConversationAcceptanceState ucConversationAcceptanceAccepted = new ConversationAcceptanceState(1);
  public final static ConversationAcceptanceState ucConversationAcceptanceRejected = new ConversationAcceptanceState(2);
  public final static ConversationAcceptanceState ucConversationAcceptanceMissed = new ConversationAcceptanceState(3);
  public final static ConversationAcceptanceState ucConversationAcceptanceDeflected = new ConversationAcceptanceState(4);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationAcceptanceNone = 0;
  public final static int _ucConversationAcceptanceAccepted = 1;
  public final static int _ucConversationAcceptanceRejected = 2;
  public final static int _ucConversationAcceptanceMissed = 3;
  public final static int _ucConversationAcceptanceDeflected = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationAcceptanceState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationAcceptanceState valueOf(int value) {
    switch(value) {
    case 0: return ucConversationAcceptanceNone;
    case 1: return ucConversationAcceptanceAccepted;
    case 2: return ucConversationAcceptanceRejected;
    case 3: return ucConversationAcceptanceMissed;
    case 4: return ucConversationAcceptanceDeflected;
    default: return new ConversationAcceptanceState(value);
    }
  }
}
