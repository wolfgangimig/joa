/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTaskOwnership.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlTaskOwnership {
  olNewTask(0),
  olDelegatedTask(1),
  olOwnTask(2);

  public final int value;
  private OlTaskOwnership(int value) { this.value = value; }
  public static  OlTaskOwnership valueOf(int value) {
    switch(value) {
    case 0: return olNewTask;
    case 1: return olDelegatedTask;
    case 2: return olOwnTask;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlTaskOwnership.class);
    }
  }
}
