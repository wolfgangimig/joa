/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ContextType.
 * Enumerates the conversation context type. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ContextType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ContextType ucContextualConversationApplicationId = new ContextType(0);
  public final static ContextType ucContextualConversationApplicationData = new ContextType(1);
  public final static ContextType ucContextualConversationHyperLink = new ContextType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucContextualConversationApplicationId = 0;
  public final static int _ucContextualConversationApplicationData = 1;
  public final static int _ucContextualConversationHyperLink = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ContextType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ContextType valueOf(int value) {
    switch(value) {
    case 0: return ucContextualConversationApplicationId;
    case 1: return ucContextualConversationApplicationData;
    case 2: return ucContextualConversationHyperLink;
    default: return new ContextType(value);
    }
  }
}
