/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * AutomationModalities.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum AutomationModalities {
  uiaConversationModeInstantMessage(1),
  uiaConversationModeAudio(2),
  uiaConversationModeVideo(4),
  uiaConversationModeFileTransfer(8),
  uiaConversationModeApplicationSharing(16),
  uiaConversationModeNone(0);

  public final int value;
  private AutomationModalities(int value) { this.value = value; }
  public static  AutomationModalities valueOf(int value) {
    switch(value) {
    case 1: return uiaConversationModeInstantMessage;
    case 2: return uiaConversationModeAudio;
    case 4: return uiaConversationModeVideo;
    case 8: return uiaConversationModeFileTransfer;
    case 16: return uiaConversationModeApplicationSharing;
    case 0: return uiaConversationModeNone;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + AutomationModalities.class);
    }
  }
}
