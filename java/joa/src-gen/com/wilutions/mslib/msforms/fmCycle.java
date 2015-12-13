/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmCycle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3DBDD630-DD73-11CE-8CD1-00AA0044BB60}")
public class fmCycle implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

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

  public String toString() {
    switch(value) {
    case 0: return "fmCycleAllForms";
    case 2: return "fmCycleCurrentForm";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmCycleAllForms");
      if ((value & 2) != 0) sbuf.append("|fmCycleCurrentForm");
      return sbuf.toString();
      }
    }
  }
}
