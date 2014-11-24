/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineDashStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLineDashStyle {

  // Typed constants
  public final static MsoLineDashStyle msoLineDashStyleMixed = new MsoLineDashStyle(-2);
  public final static MsoLineDashStyle msoLineSolid = new MsoLineDashStyle(1);
  public final static MsoLineDashStyle msoLineSquareDot = new MsoLineDashStyle(2);
  public final static MsoLineDashStyle msoLineRoundDot = new MsoLineDashStyle(3);
  public final static MsoLineDashStyle msoLineDash = new MsoLineDashStyle(4);
  public final static MsoLineDashStyle msoLineDashDot = new MsoLineDashStyle(5);
  public final static MsoLineDashStyle msoLineDashDotDot = new MsoLineDashStyle(6);
  public final static MsoLineDashStyle msoLineLongDash = new MsoLineDashStyle(7);
  public final static MsoLineDashStyle msoLineLongDashDot = new MsoLineDashStyle(8);
  public final static MsoLineDashStyle msoLineLongDashDotDot = new MsoLineDashStyle(9);
  public final static MsoLineDashStyle msoLineSysDash = new MsoLineDashStyle(10);
  public final static MsoLineDashStyle msoLineSysDot = new MsoLineDashStyle(11);
  public final static MsoLineDashStyle msoLineSysDashDot = new MsoLineDashStyle(12);

  // Integer constants for bitsets and switch statements
  public final static int _msoLineDashStyleMixed = -2;
  public final static int _msoLineSolid = 1;
  public final static int _msoLineSquareDot = 2;
  public final static int _msoLineRoundDot = 3;
  public final static int _msoLineDash = 4;
  public final static int _msoLineDashDot = 5;
  public final static int _msoLineDashDotDot = 6;
  public final static int _msoLineLongDash = 7;
  public final static int _msoLineLongDashDot = 8;
  public final static int _msoLineLongDashDotDot = 9;
  public final static int _msoLineSysDash = 10;
  public final static int _msoLineSysDot = 11;
  public final static int _msoLineSysDashDot = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLineDashStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLineDashStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineDashStyleMixed;
    case 1: return msoLineSolid;
    case 2: return msoLineSquareDot;
    case 3: return msoLineRoundDot;
    case 4: return msoLineDash;
    case 5: return msoLineDashDot;
    case 6: return msoLineDashDotDot;
    case 7: return msoLineLongDash;
    case 8: return msoLineLongDashDot;
    case 9: return msoLineLongDashDotDot;
    case 10: return msoLineSysDash;
    case 11: return msoLineSysDot;
    case 12: return msoLineSysDashDot;
    default: return new MsoLineDashStyle(value);
    }
  }
}
