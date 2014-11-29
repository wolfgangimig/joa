/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskDelegationState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlTaskDelegationState {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTaskDelegationState olTaskNotDelegated = new OlTaskDelegationState(0);
  public final static OlTaskDelegationState olTaskDelegationUnknown = new OlTaskDelegationState(1);
  public final static OlTaskDelegationState olTaskDelegationAccepted = new OlTaskDelegationState(2);
  public final static OlTaskDelegationState olTaskDelegationDeclined = new OlTaskDelegationState(3);

  // Integer constants for bitsets and switch statements
  public final static int _olTaskNotDelegated = 0;
  public final static int _olTaskDelegationUnknown = 1;
  public final static int _olTaskDelegationAccepted = 2;
  public final static int _olTaskDelegationDeclined = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTaskDelegationState(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTaskDelegationState valueOf(int value) {
    switch(value) {
    case 0: return olTaskNotDelegated;
    case 1: return olTaskDelegationUnknown;
    case 2: return olTaskDelegationAccepted;
    case 3: return olTaskDelegationDeclined;
    default: return new OlTaskDelegationState(value);
    }
  }
}
