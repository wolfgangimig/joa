/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoGradientStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoGradientStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoGradientStyle msoGradientMixed = new MsoGradientStyle(-2);
  public final static MsoGradientStyle msoGradientHorizontal = new MsoGradientStyle(1);
  public final static MsoGradientStyle msoGradientVertical = new MsoGradientStyle(2);
  public final static MsoGradientStyle msoGradientDiagonalUp = new MsoGradientStyle(3);
  public final static MsoGradientStyle msoGradientDiagonalDown = new MsoGradientStyle(4);
  public final static MsoGradientStyle msoGradientFromCorner = new MsoGradientStyle(5);
  public final static MsoGradientStyle msoGradientFromTitle = new MsoGradientStyle(6);
  public final static MsoGradientStyle msoGradientFromCenter = new MsoGradientStyle(7);

  // Integer constants for bitsets and switch statements
  public final static int _msoGradientMixed = -2;
  public final static int _msoGradientHorizontal = 1;
  public final static int _msoGradientVertical = 2;
  public final static int _msoGradientDiagonalUp = 3;
  public final static int _msoGradientDiagonalDown = 4;
  public final static int _msoGradientFromCorner = 5;
  public final static int _msoGradientFromTitle = 6;
  public final static int _msoGradientFromCenter = 7;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoGradientStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoGradientStyle valueOf(int value) {
    switch(value) {
    case -2: return msoGradientMixed;
    case 1: return msoGradientHorizontal;
    case 2: return msoGradientVertical;
    case 3: return msoGradientDiagonalUp;
    case 4: return msoGradientDiagonalDown;
    case 5: return msoGradientFromCorner;
    case 6: return msoGradientFromTitle;
    case 7: return msoGradientFromCenter;
    default: return new MsoGradientStyle(value);
    }
  }
}
