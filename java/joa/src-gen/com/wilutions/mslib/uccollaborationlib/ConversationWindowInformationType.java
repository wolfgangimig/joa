/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowInformationType.
 * Enumerates the conversation window properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum ConversationWindowInformationType {
  uiaConversationWindowWidthMin(537788416),
  uiaConversationWindowHeightMin(537788417),
  uiaConversationWindowIsDocked(269352962),
  uiaConversationWindowHasVideo(269352963),
  uiaConversationWindowHasContentStage(269352964),
  uiaConversationWindowHasExtensionPane(269352965),
  uiaConversationWindowIsFullScreen(269352966);

  public final int value;
  private ConversationWindowInformationType(int value) { this.value = value; }
  public static  ConversationWindowInformationType valueOf(int value) {
    switch(value) {
    case 537788416: return uiaConversationWindowWidthMin;
    case 537788417: return uiaConversationWindowHeightMin;
    case 269352962: return uiaConversationWindowIsDocked;
    case 269352963: return uiaConversationWindowHasVideo;
    case 269352964: return uiaConversationWindowHasContentStage;
    case 269352965: return uiaConversationWindowHasExtensionPane;
    case 269352966: return uiaConversationWindowIsFullScreen;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + ConversationWindowInformationType.class);
    }
  }
}
