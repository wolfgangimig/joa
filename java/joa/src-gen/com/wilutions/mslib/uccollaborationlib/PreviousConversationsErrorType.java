/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsErrorType.
 * Enumerates errors that could have happened in the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum PreviousConversationsErrorType {
  ucPreviousConversationsErrorCritical(0),
  ucPreviousConversationsErrorTransient(1),
  ucPreviousConversationsErrorNotConfigured(2);

  public final int value;
  private PreviousConversationsErrorType(int value) { this.value = value; }
  public static  PreviousConversationsErrorType valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsErrorCritical;
    case 1: return ucPreviousConversationsErrorTransient;
    case 2: return ucPreviousConversationsErrorNotConfigured;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + PreviousConversationsErrorType.class);
    }
  }
}
