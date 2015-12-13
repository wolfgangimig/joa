/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowInformationType.
 * Enumerates the conversation window properties. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationWindowInformationType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static ConversationWindowInformationType uiaConversationWindowWidthMin = new ConversationWindowInformationType(537788416);
  public final static ConversationWindowInformationType uiaConversationWindowHeightMin = new ConversationWindowInformationType(537788417);
  public final static ConversationWindowInformationType uiaConversationWindowIsDocked = new ConversationWindowInformationType(269352962);
  public final static ConversationWindowInformationType uiaConversationWindowHasVideo = new ConversationWindowInformationType(269352963);
  public final static ConversationWindowInformationType uiaConversationWindowHasContentStage = new ConversationWindowInformationType(269352964);
  public final static ConversationWindowInformationType uiaConversationWindowHasExtensionPane = new ConversationWindowInformationType(269352965);
  public final static ConversationWindowInformationType uiaConversationWindowIsFullScreen = new ConversationWindowInformationType(269352966);

  // Integer constants for bitsets and switch statements
  public final static int _uiaConversationWindowWidthMin = 537788416;
  public final static int _uiaConversationWindowHeightMin = 537788417;
  public final static int _uiaConversationWindowIsDocked = 269352962;
  public final static int _uiaConversationWindowHasVideo = 269352963;
  public final static int _uiaConversationWindowHasContentStage = 269352964;
  public final static int _uiaConversationWindowHasExtensionPane = 269352965;
  public final static int _uiaConversationWindowIsFullScreen = 269352966;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationWindowInformationType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationWindowInformationType valueOf(int value) {
    switch(value) {
    case 537788416: return uiaConversationWindowWidthMin;
    case 537788417: return uiaConversationWindowHeightMin;
    case 269352962: return uiaConversationWindowIsDocked;
    case 269352963: return uiaConversationWindowHasVideo;
    case 269352964: return uiaConversationWindowHasContentStage;
    case 269352965: return uiaConversationWindowHasExtensionPane;
    case 269352966: return uiaConversationWindowIsFullScreen;
    default: return new ConversationWindowInformationType(value);
    }
  }
}
