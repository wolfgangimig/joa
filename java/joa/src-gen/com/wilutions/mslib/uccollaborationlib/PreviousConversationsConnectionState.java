/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsConnectionState.
 * Enumerates the connection state of the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PreviousConversationsConnectionState {
  ucPreviousConversationsDisconnected(0),
  ucPreviousConversationsConnected(1);

  public final int value;
  private PreviousConversationsConnectionState(int value) { this.value = value; }
  public static  PreviousConversationsConnectionState valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsDisconnected;
    case 1: return ucPreviousConversationsConnected;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PreviousConversationsConnectionState.class);
    }
  }
}
