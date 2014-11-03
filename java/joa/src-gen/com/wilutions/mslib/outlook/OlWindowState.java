/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlWindowState.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum OlWindowState {
  olMaximized(0),
  olMinimized(1),
  olNormalWindow(2);

  public final int value;
  private OlWindowState(int value) { this.value = value; }
  public static  OlWindowState valueOf(int value) {
    switch(value) {
    case 0: return olMaximized;
    case 1: return olMinimized;
    case 2: return olNormalWindow;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlWindowState.class);
    }
  }
}
