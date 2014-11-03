/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlEnterFieldBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{7E29FD73-540B-4F03-A890-53C6B0AE7DD1}")
public enum OlEnterFieldBehavior {
  olEnterFieldBehaviorSelectAll(0),
  olEnterFieldBehaviorRecallSelection(1);

  public final int value;
  private OlEnterFieldBehavior(int value) { this.value = value; }
  public static  OlEnterFieldBehavior valueOf(int value) {
    switch(value) {
    case 0: return olEnterFieldBehaviorSelectAll;
    case 1: return olEnterFieldBehaviorRecallSelection;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OlEnterFieldBehavior.class);
    }
  }
}
