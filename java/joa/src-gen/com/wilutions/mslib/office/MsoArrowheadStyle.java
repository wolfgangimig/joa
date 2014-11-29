/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoArrowheadStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoArrowheadStyle msoArrowheadStyleMixed = new MsoArrowheadStyle(-2);
  public final static MsoArrowheadStyle msoArrowheadNone = new MsoArrowheadStyle(1);
  public final static MsoArrowheadStyle msoArrowheadTriangle = new MsoArrowheadStyle(2);
  public final static MsoArrowheadStyle msoArrowheadOpen = new MsoArrowheadStyle(3);
  public final static MsoArrowheadStyle msoArrowheadStealth = new MsoArrowheadStyle(4);
  public final static MsoArrowheadStyle msoArrowheadDiamond = new MsoArrowheadStyle(5);
  public final static MsoArrowheadStyle msoArrowheadOval = new MsoArrowheadStyle(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoArrowheadStyleMixed = -2;
  public final static int _msoArrowheadNone = 1;
  public final static int _msoArrowheadTriangle = 2;
  public final static int _msoArrowheadOpen = 3;
  public final static int _msoArrowheadStealth = 4;
  public final static int _msoArrowheadDiamond = 5;
  public final static int _msoArrowheadOval = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoArrowheadStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoArrowheadStyle valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadStyleMixed;
    case 1: return msoArrowheadNone;
    case 2: return msoArrowheadTriangle;
    case 3: return msoArrowheadOpen;
    case 4: return msoArrowheadStealth;
    case 5: return msoArrowheadDiamond;
    case 6: return msoArrowheadOval;
    default: return new MsoArrowheadStyle(value);
    }
  }
}
