/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTaskStatus {
  olTaskNotStarted(0),
  olTaskInProgress(1),
  olTaskComplete(2),
  olTaskWaiting(3),
  olTaskDeferred(4);

  public final int value;
  private OlTaskStatus(int value) { this.value = value; }
  public static  OlTaskStatus valueOf(int value) {
    switch(value) {
    case 0: return olTaskNotStarted;
    case 1: return olTaskInProgress;
    case 2: return olTaskComplete;
    case 3: return olTaskWaiting;
    case 4: return olTaskDeferred;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTaskStatus.class);
    }
  }
}
