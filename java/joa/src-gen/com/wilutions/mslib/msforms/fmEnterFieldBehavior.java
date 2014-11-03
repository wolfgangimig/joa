/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmEnterFieldBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6A7167F1-2432-11CF-956F-00AA004B9DFA}")
public enum fmEnterFieldBehavior {
  fmEnterFieldBehaviorSelectAll(0),
  fmEnterFieldBehaviorRecallSelection(1);

  public final int value;
  private fmEnterFieldBehavior(int value) { this.value = value; }
  public static  fmEnterFieldBehavior valueOf(int value) {
    switch(value) {
    case 0: return fmEnterFieldBehaviorSelectAll;
    case 1: return fmEnterFieldBehaviorRecallSelection;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmEnterFieldBehavior.class);
    }
  }
}
