/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmRepeatDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C3689F20-C231-11CE-A30C-00AA004A3D3C}")
public class fmRepeatDirection {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmRepeatDirection _fmRepeatDirectionHorizontal = new fmRepeatDirection(0);
  public final static fmRepeatDirection _fmRepeatDirectionVertical = new fmRepeatDirection(1);

  // Integer constants for bitsets and switch statements
  public final static int __fmRepeatDirectionHorizontal = 0;
  public final static int __fmRepeatDirectionVertical = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmRepeatDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmRepeatDirection valueOf(int value) {
    switch(value) {
    case 0: return _fmRepeatDirectionHorizontal;
    case 1: return _fmRepeatDirectionVertical;
    default: return new fmRepeatDirection(value);
    }
  }
}
