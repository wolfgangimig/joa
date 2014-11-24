/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * ConversationWindowAction.
 * Enumerates supported ConversationWindow actions 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class ConversationWindowAction {

  // Typed constants
  public final static ConversationWindowAction ucConversationWindowActionAddOfficePowerPoint = new ConversationWindowAction(0);
  public final static ConversationWindowAction ucConversationWindowActionAddOfficeOneNote = new ConversationWindowAction(1);
  public final static ConversationWindowAction ucConversationWindowFullScreen = new ConversationWindowAction(2);
  public final static ConversationWindowAction ucConversationWindowActionMAX = new ConversationWindowAction(3);

  // Integer constants for bitsets and switch statements
  public final static int _ucConversationWindowActionAddOfficePowerPoint = 0;
  public final static int _ucConversationWindowActionAddOfficeOneNote = 1;
  public final static int _ucConversationWindowFullScreen = 2;
  public final static int _ucConversationWindowActionMAX = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private ConversationWindowAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  ConversationWindowAction valueOf(int value) {
    switch(value) {
    case 0: return ucConversationWindowActionAddOfficePowerPoint;
    case 1: return ucConversationWindowActionAddOfficeOneNote;
    case 2: return ucConversationWindowFullScreen;
    case 3: return ucConversationWindowActionMAX;
    default: return new ConversationWindowAction(value);
    }
  }
}
