/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{CD474E84-A35F-101A-BEB9-00006B827DA8}")
public enum fmAlignment {
  fmAlignmentLeft(0),
  fmAlignmentRight(1);

  public final int value;
  private fmAlignment(int value) { this.value = value; }
  public static  fmAlignment valueOf(int value) {
    switch(value) {
    case 0: return fmAlignmentLeft;
    case 1: return fmAlignmentRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmAlignment.class);
    }
  }
}
