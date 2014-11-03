/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmVerticalScrollBarSide.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{D625CA10-CC59-11CE-B653-00AA004CD6D8}")
public enum fmVerticalScrollBarSide {
  fmVerticalScrollBarSideRight(0),
  fmVerticalScrollBarSideLeft(1);

  public final int value;
  private fmVerticalScrollBarSide(int value) { this.value = value; }
  public static  fmVerticalScrollBarSide valueOf(int value) {
    switch(value) {
    case 0: return fmVerticalScrollBarSideRight;
    case 1: return fmVerticalScrollBarSideLeft;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + fmVerticalScrollBarSide.class);
    }
  }
}
