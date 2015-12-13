/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoGradientStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoGradientStyle implements ComEnum {
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

  public String toString() {
    switch(value) {
    case 7: return "msoGradientFromCenter";
    case -2: return "msoGradientMixed";
    case 1: return "msoGradientHorizontal";
    case 2: return "msoGradientVertical";
    case 3: return "msoGradientDiagonalUp";
    case 4: return "msoGradientDiagonalDown";
    case 5: return "msoGradientFromCorner";
    case 6: return "msoGradientFromTitle";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 7) != 0) sbuf.append("|msoGradientFromCenter");
      if ((value & -2) != 0) sbuf.append("|msoGradientMixed");
      if ((value & 1) != 0) sbuf.append("|msoGradientHorizontal");
      if ((value & 2) != 0) sbuf.append("|msoGradientVertical");
      if ((value & 3) != 0) sbuf.append("|msoGradientDiagonalUp");
      if ((value & 4) != 0) sbuf.append("|msoGradientDiagonalDown");
      if ((value & 5) != 0) sbuf.append("|msoGradientFromCorner");
      if ((value & 6) != 0) sbuf.append("|msoGradientFromTitle");
      return sbuf.toString();
      }
    }
  }
}
