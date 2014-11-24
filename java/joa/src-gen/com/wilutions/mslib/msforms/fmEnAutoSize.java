/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmEnAutoSize.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{C3689F20-C231-11CE-A30C-00AA004A3D3D}")
public class fmEnAutoSize {

  // Typed constants
  public final static fmEnAutoSize _fmEnAutoSizeNone = new fmEnAutoSize(0);
  public final static fmEnAutoSize _fmEnAutoSizeHorizontal = new fmEnAutoSize(1);
  public final static fmEnAutoSize _fmEnAutoSizeVertical = new fmEnAutoSize(2);
  public final static fmEnAutoSize _fmEnAutoSizeBoth = new fmEnAutoSize(3);

  // Integer constants for bitsets and switch statements
  public final static int __fmEnAutoSizeNone = 0;
  public final static int __fmEnAutoSizeHorizontal = 1;
  public final static int __fmEnAutoSizeVertical = 2;
  public final static int __fmEnAutoSizeBoth = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmEnAutoSize(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmEnAutoSize valueOf(int value) {
    switch(value) {
    case 0: return _fmEnAutoSizeNone;
    case 1: return _fmEnAutoSizeHorizontal;
    case 2: return _fmEnAutoSizeVertical;
    case 3: return _fmEnAutoSizeBoth;
    default: return new fmEnAutoSize(value);
    }
  }
}
