/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFlagStatus.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlFlagStatus {
  olNoFlag(0),
  olFlagComplete(1),
  olFlagMarked(2);

  public final int value;
  private OlFlagStatus(int value) { this.value = value; }
  public static  OlFlagStatus valueOf(int value) {
    switch(value) {
    case 0: return olNoFlag;
    case 1: return olFlagComplete;
    case 2: return olFlagMarked;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlFlagStatus.class);
    }
  }
}
