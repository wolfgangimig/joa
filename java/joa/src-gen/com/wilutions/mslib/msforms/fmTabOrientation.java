/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmTabOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{EBC7FDE1-6899-11CE-80C0-00AA00611080}")
public class fmTabOrientation {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmTabOrientation fmTabOrientationTop = new fmTabOrientation(0);
  public final static fmTabOrientation fmTabOrientationBottom = new fmTabOrientation(1);
  public final static fmTabOrientation fmTabOrientationLeft = new fmTabOrientation(2);
  public final static fmTabOrientation fmTabOrientationRight = new fmTabOrientation(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmTabOrientationTop = 0;
  public final static int _fmTabOrientationBottom = 1;
  public final static int _fmTabOrientationLeft = 2;
  public final static int _fmTabOrientationRight = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmTabOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmTabOrientation valueOf(int value) {
    switch(value) {
    case 0: return fmTabOrientationTop;
    case 1: return fmTabOrientationBottom;
    case 2: return fmTabOrientationLeft;
    case 3: return fmTabOrientationRight;
    default: return new fmTabOrientation(value);
    }
  }
}
