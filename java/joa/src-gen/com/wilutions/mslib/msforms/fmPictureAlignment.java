/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmPictureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{3574BBE0-F520-11CE-83F6-00AA00479846}")
public class fmPictureAlignment {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmPictureAlignment fmPictureAlignmentTopLeft = new fmPictureAlignment(0);
  public final static fmPictureAlignment fmPictureAlignmentTopRight = new fmPictureAlignment(1);
  public final static fmPictureAlignment fmPictureAlignmentCenter = new fmPictureAlignment(2);
  public final static fmPictureAlignment fmPictureAlignmentBottomLeft = new fmPictureAlignment(3);
  public final static fmPictureAlignment fmPictureAlignmentBottomRight = new fmPictureAlignment(4);

  // Integer constants for bitsets and switch statements
  public final static int _fmPictureAlignmentTopLeft = 0;
  public final static int _fmPictureAlignmentTopRight = 1;
  public final static int _fmPictureAlignmentCenter = 2;
  public final static int _fmPictureAlignmentBottomLeft = 3;
  public final static int _fmPictureAlignmentBottomRight = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmPictureAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmPictureAlignment valueOf(int value) {
    switch(value) {
    case 0: return fmPictureAlignmentTopLeft;
    case 1: return fmPictureAlignmentTopRight;
    case 2: return fmPictureAlignmentCenter;
    case 3: return fmPictureAlignmentBottomLeft;
    case 4: return fmPictureAlignmentBottomRight;
    default: return new fmPictureAlignment(value);
    }
  }
}
