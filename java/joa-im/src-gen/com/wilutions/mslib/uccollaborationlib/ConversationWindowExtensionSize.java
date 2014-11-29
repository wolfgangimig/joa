/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowExtensionSize.
 * Enumerates the size of extensibility window that hosts the application. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationWindowExtensionSize {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationWindowExtensionSize ucExtensibilityWindowSmall = new ConversationWindowExtensionSize(0);
  public final static ConversationWindowExtensionSize ucExtensibilityWindowMedium = new ConversationWindowExtensionSize(1);
  public final static ConversationWindowExtensionSize ucExtensibilityWindowLarge = new ConversationWindowExtensionSize(2);
  public final static ConversationWindowExtensionSize ucConversationWindowExtensionSizeMax = new ConversationWindowExtensionSize(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucExtensibilityWindowSmall = 0;
  public final static int _ucExtensibilityWindowMedium = 1;
  public final static int _ucExtensibilityWindowLarge = 2;
  public final static int _ucConversationWindowExtensionSizeMax = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationWindowExtensionSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationWindowExtensionSize valueOf(int value) {
    switch(value) {
    case 0: return ucExtensibilityWindowSmall;
    case 1: return ucExtensibilityWindowMedium;
    case 2: return ucExtensibilityWindowLarge;
    case 3: return ucConversationWindowExtensionSizeMax;
    default: return new ConversationWindowExtensionSize(value);
    }
  }
}
