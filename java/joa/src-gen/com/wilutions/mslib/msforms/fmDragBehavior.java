/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmDragBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{E25EB550-24F6-11CF-A6E2-00AA00C0098D}")
public class fmDragBehavior {

  // Typed constants
  public final static fmDragBehavior fmDragBehaviorDisabled = new fmDragBehavior(0);
  public final static fmDragBehavior fmDragBehaviorEnabled = new fmDragBehavior(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmDragBehaviorDisabled = 0;
  public final static int _fmDragBehaviorEnabled = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmDragBehavior(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmDragBehavior valueOf(int value) {
    switch(value) {
    case 0: return fmDragBehaviorDisabled;
    case 1: return fmDragBehaviorEnabled;
    default: return new fmDragBehavior(value);
    }
  }
}
