/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{CD474E84-A35F-101A-BEB9-00006B827DA8}")
public class fmAlignment {

  // Typed constants
  public final static fmAlignment fmAlignmentLeft = new fmAlignment(0);
  public final static fmAlignment fmAlignmentRight = new fmAlignment(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmAlignmentLeft = 0;
  public final static int _fmAlignmentRight = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmAlignment valueOf(int value) {
    switch(value) {
    case 0: return fmAlignmentLeft;
    case 1: return fmAlignmentRight;
    default: return new fmAlignment(value);
    }
  }
}
