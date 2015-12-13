/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsType.
 * Enumerates the past conversations types. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PreviousConversationsType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static PreviousConversationsType ucPreviousConversationsMissedConversations = new PreviousConversationsType(0);
  public final static PreviousConversationsType ucPreviousConversationsConversationHistory = new PreviousConversationsType(1);
  public final static PreviousConversationsType ucPreviousConversationsAudioCallLogs = new PreviousConversationsType(2);
  public final static PreviousConversationsType ucPreviousConversationsFollowUpConversations = new PreviousConversationsType(3);
  public final static PreviousConversationsType ucPreviousConversationsMissedAudioCalls = new PreviousConversationsType(4);
  public final static PreviousConversationsType ucPreviousConversationsTypeMax = new PreviousConversationsType(5);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationsMissedConversations = 0;
  public final static int _ucPreviousConversationsConversationHistory = 1;
  public final static int _ucPreviousConversationsAudioCallLogs = 2;
  public final static int _ucPreviousConversationsFollowUpConversations = 3;
  public final static int _ucPreviousConversationsMissedAudioCalls = 4;
  public final static int _ucPreviousConversationsTypeMax = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PreviousConversationsType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PreviousConversationsType valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsMissedConversations;
    case 1: return ucPreviousConversationsConversationHistory;
    case 2: return ucPreviousConversationsAudioCallLogs;
    case 3: return ucPreviousConversationsFollowUpConversations;
    case 4: return ucPreviousConversationsMissedAudioCalls;
    case 5: return ucPreviousConversationsTypeMax;
    default: return new PreviousConversationsType(value);
    }
  }
}
