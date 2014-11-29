/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmZOrder.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{14C73C30-1612-11CE-9E98-00AA00574A4F}")
public class fmZOrder {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmZOrder fmZOrderFront = new fmZOrder(0);
  public final static fmZOrder fmZOrderBack = new fmZOrder(1);

  // Integer constants for bitsets and switch statements
  public final static int _fmZOrderFront = 0;
  public final static int _fmZOrderBack = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmZOrder(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmZOrder valueOf(int value) {
    switch(value) {
    case 0: return fmZOrderFront;
    case 1: return fmZOrderBack;
    default: return new fmZOrder(value);
    }
  }
}
