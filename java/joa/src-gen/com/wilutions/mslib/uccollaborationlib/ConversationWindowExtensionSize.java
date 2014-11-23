/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowExtensionSize.
 * Enumerates the size of extensibility window that hosts the application. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationWindowExtensionSize {
  ucExtensibilityWindowSmall(0),
  ucExtensibilityWindowMedium(1),
  ucExtensibilityWindowLarge(2),
  ucConversationWindowExtensionSizeMax(3);

  public final int value;
  private ConversationWindowExtensionSize(int value) { this.value = value; }
  public static  ConversationWindowExtensionSize valueOf(int value) {
    switch(value) {
    case 0: return ucExtensibilityWindowSmall;
    case 1: return ucExtensibilityWindowMedium;
    case 2: return ucExtensibilityWindowLarge;
    case 3: return ucConversationWindowExtensionSizeMax;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationWindowExtensionSize.class);
    }
  }
}
