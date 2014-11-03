/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDragBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E25EB550-24F6-11CF-A6E2-00AA00C0098D}")
public enum fmDragBehavior {
  fmDragBehaviorDisabled(0),
  fmDragBehaviorEnabled(1);

  public final int value;
  private fmDragBehavior(int value) { this.value = value; }
  public static  fmDragBehavior valueOf(int value) {
    switch(value) {
    case 0: return fmDragBehaviorDisabled;
    case 1: return fmDragBehaviorEnabled;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmDragBehavior.class);
    }
  }
}
