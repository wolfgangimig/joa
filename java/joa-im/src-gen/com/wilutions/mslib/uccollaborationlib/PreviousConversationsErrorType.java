/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.uccollaborationlib;
import com.wilutions.com.*;

/**
 * PreviousConversationsErrorType.
 * Enumerates errors that could have happened in the previous conversations. 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class PreviousConversationsErrorType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static PreviousConversationsErrorType ucPreviousConversationsErrorCritical = new PreviousConversationsErrorType(0);
  public final static PreviousConversationsErrorType ucPreviousConversationsErrorTransient = new PreviousConversationsErrorType(1);
  public final static PreviousConversationsErrorType ucPreviousConversationsErrorNotConfigured = new PreviousConversationsErrorType(2);

  // Integer constants for bitsets and switch statements
  public final static int _ucPreviousConversationsErrorCritical = 0;
  public final static int _ucPreviousConversationsErrorTransient = 1;
  public final static int _ucPreviousConversationsErrorNotConfigured = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private PreviousConversationsErrorType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  PreviousConversationsErrorType valueOf(int value) {
    switch(value) {
    case 0: return ucPreviousConversationsErrorCritical;
    case 1: return ucPreviousConversationsErrorTransient;
    case 2: return ucPreviousConversationsErrorNotConfigured;
    default: return new PreviousConversationsErrorType(value);
    }
  }
}
