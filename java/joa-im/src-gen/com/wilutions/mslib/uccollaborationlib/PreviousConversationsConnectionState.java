/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsConnectionState.
 * Enumerates the connection state of the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PreviousConversationsConnectionState {

  // Typed constants
  public final static PreviousConversationsConnectionState ucPreviousConversationsDisconnected = new PreviousConversationsConnectionState(0);
  public final static PreviousConversationsConnectionState ucPreviousConversationsConnected = new PreviousConversationsConnectionState(1);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationsDisconnected = 0;
  public final static int _ucPreviousConversationsConnected = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PreviousConversationsConnectionState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PreviousConversationsConnectionState valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsDisconnected;
    case 1: return ucPreviousConversationsConnected;
    default: return new PreviousConversationsConnectionState(value);
    }
  }
}
