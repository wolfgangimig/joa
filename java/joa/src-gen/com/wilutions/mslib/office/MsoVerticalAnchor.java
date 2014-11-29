/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoVerticalAnchor.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoVerticalAnchor {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoVerticalAnchor msoVerticalAnchorMixed = new MsoVerticalAnchor(-2);
  public final static MsoVerticalAnchor msoAnchorTop = new MsoVerticalAnchor(1);
  public final static MsoVerticalAnchor msoAnchorTopBaseline = new MsoVerticalAnchor(2);
  public final static MsoVerticalAnchor msoAnchorMiddle = new MsoVerticalAnchor(3);
  public final static MsoVerticalAnchor msoAnchorBottom = new MsoVerticalAnchor(4);
  public final static MsoVerticalAnchor msoAnchorBottomBaseLine = new MsoVerticalAnchor(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoVerticalAnchorMixed = -2;
  public final static int _msoAnchorTop = 1;
  public final static int _msoAnchorTopBaseline = 2;
  public final static int _msoAnchorMiddle = 3;
  public final static int _msoAnchorBottom = 4;
  public final static int _msoAnchorBottomBaseLine = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoVerticalAnchor(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoVerticalAnchor valueOf(int value) {
    switch(value) {
    case -2: return msoVerticalAnchorMixed;
    case 1: return msoAnchorTop;
    case 2: return msoAnchorTopBaseline;
    case 3: return msoAnchorMiddle;
    case 4: return msoAnchorBottom;
    case 5: return msoAnchorBottomBaseLine;
    default: return new MsoVerticalAnchor(value);
    }
  }
}
