/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmScrollBars.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{5931055E-16BA-101B-989C-00006B82871A}")
public class fmScrollBars {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmScrollBars fmScrollBarsNone = new fmScrollBars(0);
  public final static fmScrollBars fmScrollBarsHorizontal = new fmScrollBars(1);
  public final static fmScrollBars fmScrollBarsVertical = new fmScrollBars(2);
  public final static fmScrollBars fmScrollBarsBoth = new fmScrollBars(3);

  // Integer constants for bitsets and switch statements
  public final static int _fmScrollBarsNone = 0;
  public final static int _fmScrollBarsHorizontal = 1;
  public final static int _fmScrollBarsVertical = 2;
  public final static int _fmScrollBarsBoth = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmScrollBars(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmScrollBars valueOf(int value) {
    switch(value) {
    case 0: return fmScrollBarsNone;
    case 1: return fmScrollBarsHorizontal;
    case 2: return fmScrollBarsVertical;
    case 3: return fmScrollBarsBoth;
    default: return new fmScrollBars(value);
    }
  }
}
