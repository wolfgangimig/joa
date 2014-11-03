/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmCycle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3DBDD630-DD73-11CE-8CD1-00AA0044BB60}")
public enum fmCycle {
  fmCycleAllForms(0),
  fmCycleCurrentForm(2);

  public final int value;
  private fmCycle(int value) { this.value = value; }
  public static  fmCycle valueOf(int value) {
    switch(value) {
    case 0: return fmCycleAllForms;
    case 2: return fmCycleCurrentForm;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmCycle.class);
    }
  }
}
