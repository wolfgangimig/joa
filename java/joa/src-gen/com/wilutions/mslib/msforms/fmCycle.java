/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmCycle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3DBDD630-DD73-11CE-8CD1-00AA0044BB60}")
public class fmCycle {

  // Typed constants
  public final static fmCycle fmCycleAllForms = new fmCycle(0);
  public final static fmCycle fmCycleCurrentForm = new fmCycle(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmCycleAllForms = 0;
  public final static int _fmCycleCurrentForm = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmCycle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmCycle valueOf(int value) {
    switch(value) {
    case 0: return fmCycleAllForms;
    case 2: return fmCycleCurrentForm;
    default: return new fmCycle(value);
    }
  }
}
