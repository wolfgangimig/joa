/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmEnterFieldBehavior.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6A7167F1-2432-11CF-956F-00AA004B9DFA}")
public class fmEnterFieldBehavior {

  // Typed constants
  public final static fmEnterFieldBehavior fmEnterFieldBehaviorSelectAll = new fmEnterFieldBehavior(0);
  public final static fmEnterFieldBehavior fmEnterFieldBehaviorRecallSelection = new fmEnterFieldBehavior(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmEnterFieldBehaviorSelectAll = 0;
  public final static int _fmEnterFieldBehaviorRecallSelection = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmEnterFieldBehavior(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmEnterFieldBehavior valueOf(int value) {
    switch(value) {
    case 0: return fmEnterFieldBehaviorSelectAll;
    case 1: return fmEnterFieldBehaviorRecallSelection;
    default: return new fmEnterFieldBehavior(value);
    }
  }
}
