/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlDragBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{25B06F72-02C5-4AF8-8366-28C2C65CB035}")
public enum OlDragBehavior {
  olDragBehaviorDisabled(0),
  olDragBehaviorEnabled(1);

  public final int value;
  private OlDragBehavior(int value) { this.value = value; }
  public static  OlDragBehavior valueOf(int value) {
    switch(value) {
    case 0: return olDragBehaviorDisabled;
    case 1: return olDragBehaviorEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlDragBehavior.class);
    }
  }
}
