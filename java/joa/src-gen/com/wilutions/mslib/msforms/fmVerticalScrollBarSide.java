/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmVerticalScrollBarSide.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{D625CA10-CC59-11CE-B653-00AA004CD6D8}")
public class fmVerticalScrollBarSide {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmVerticalScrollBarSide fmVerticalScrollBarSideRight = new fmVerticalScrollBarSide(0);
  public final static fmVerticalScrollBarSide fmVerticalScrollBarSideLeft = new fmVerticalScrollBarSide(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmVerticalScrollBarSideRight = 0;
  public final static int _fmVerticalScrollBarSideLeft = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmVerticalScrollBarSide(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmVerticalScrollBarSide valueOf(int value) {
    switch(value) {
    case 0: return fmVerticalScrollBarSideRight;
    case 1: return fmVerticalScrollBarSideLeft;
    default: return new fmVerticalScrollBarSide(value);
    }
  }
}
