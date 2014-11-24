/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AutomationModalities.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class AutomationModalities {

  // Typed constants
  public final static AutomationModalities uiaConversationModeInstantMessage = new AutomationModalities(1);
  public final static AutomationModalities uiaConversationModeAudio = new AutomationModalities(2);
  public final static AutomationModalities uiaConversationModeVideo = new AutomationModalities(4);
  public final static AutomationModalities uiaConversationModeFileTransfer = new AutomationModalities(8);
  public final static AutomationModalities uiaConversationModeApplicationSharing = new AutomationModalities(16);
  public final static AutomationModalities uiaConversationModeNone = new AutomationModalities(0);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationModeInstantMessage = 1;
  public final static int _uiaConversationModeAudio = 2;
  public final static int _uiaConversationModeVideo = 4;
  public final static int _uiaConversationModeFileTransfer = 8;
  public final static int _uiaConversationModeApplicationSharing = 16;
  public final static int _uiaConversationModeNone = 0;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private AutomationModalities(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  AutomationModalities valueOf(int value) {
    switch(value) {
    case 1: return uiaConversationModeInstantMessage;
    case 2: return uiaConversationModeAudio;
    case 4: return uiaConversationModeVideo;
    case 8: return uiaConversationModeFileTransfer;
    case 16: return uiaConversationModeApplicationSharing;
    case 0: return uiaConversationModeNone;
    default: return new AutomationModalities(value);
    }
  }
}
