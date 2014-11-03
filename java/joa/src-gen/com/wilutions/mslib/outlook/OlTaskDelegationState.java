/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskDelegationState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTaskDelegationState {
  olTaskNotDelegated(0),
  olTaskDelegationUnknown(1),
  olTaskDelegationAccepted(2),
  olTaskDelegationDeclined(3);

  public final int value;
  private OlTaskDelegationState(int value) { this.value = value; }
  public static  OlTaskDelegationState valueOf(int value) {
    switch(value) {
    case 0: return olTaskNotDelegated;
    case 1: return olTaskDelegationUnknown;
    case 2: return olTaskDelegationAccepted;
    case 3: return olTaskDelegationDeclined;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTaskDelegationState.class);
    }
  }
}
