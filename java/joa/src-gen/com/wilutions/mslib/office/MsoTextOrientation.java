/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextOrientation.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextOrientation implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextOrientation msoTextOrientationMixed = new MsoTextOrientation(-2);
  public final static MsoTextOrientation msoTextOrientationHorizontal = new MsoTextOrientation(1);
  public final static MsoTextOrientation msoTextOrientationUpward = new MsoTextOrientation(2);
  public final static MsoTextOrientation msoTextOrientationDownward = new MsoTextOrientation(3);
  public final static MsoTextOrientation msoTextOrientationVerticalFarEast = new MsoTextOrientation(4);
  public final static MsoTextOrientation msoTextOrientationVertical = new MsoTextOrientation(5);
  public final static MsoTextOrientation msoTextOrientationHorizontalRotatedFarEast = new MsoTextOrientation(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoTextOrientationMixed = -2;
  public final static int _msoTextOrientationHorizontal = 1;
  public final static int _msoTextOrientationUpward = 2;
  public final static int _msoTextOrientationDownward = 3;
  public final static int _msoTextOrientationVerticalFarEast = 4;
  public final static int _msoTextOrientationVertical = 5;
  public final static int _msoTextOrientationHorizontalRotatedFarEast = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextOrientation(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextOrientation valueOf(int value) {
    switch(value) {
    case -2: return msoTextOrientationMixed;
    case 1: return msoTextOrientationHorizontal;
    case 2: return msoTextOrientationUpward;
    case 3: return msoTextOrientationDownward;
    case 4: return msoTextOrientationVerticalFarEast;
    case 5: return msoTextOrientationVertical;
    case 6: return msoTextOrientationHorizontalRotatedFarEast;
    default: return new MsoTextOrientation(value);
    }
  }

  public String toString() {
    switch(value) {
    case 2: return "msoTextOrientationUpward";
    case -2: return "msoTextOrientationMixed";
    case 1: return "msoTextOrientationHorizontal";
    case 3: return "msoTextOrientationDownward";
    case 4: return "msoTextOrientationVerticalFarEast";
    case 5: return "msoTextOrientationVertical";
    case 6: return "msoTextOrientationHorizontalRotatedFarEast";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 2) != 0) sbuf.append("|msoTextOrientationUpward");
      if ((value & -2) != 0) sbuf.append("|msoTextOrientationMixed");
      if ((value & 1) != 0) sbuf.append("|msoTextOrientationHorizontal");
      if ((value & 3) != 0) sbuf.append("|msoTextOrientationDownward");
      if ((value & 4) != 0) sbuf.append("|msoTextOrientationVerticalFarEast");
      if ((value & 5) != 0) sbuf.append("|msoTextOrientationVertical");
      if ((value & 6) != 0) sbuf.append("|msoTextOrientationHorizontalRotatedFarEast");
      return sbuf.toString();
      }
    }
  }
}
