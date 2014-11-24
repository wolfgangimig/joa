/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBackgroundStyleIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBackgroundStyleIndex {

  // Typed constants
  public final static MsoBackgroundStyleIndex msoBackgroundStyleMixed = new MsoBackgroundStyleIndex(-2);
  public final static MsoBackgroundStyleIndex msoBackgroundStyleNotAPreset = new MsoBackgroundStyleIndex(0);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset1 = new MsoBackgroundStyleIndex(1);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset2 = new MsoBackgroundStyleIndex(2);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset3 = new MsoBackgroundStyleIndex(3);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset4 = new MsoBackgroundStyleIndex(4);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset5 = new MsoBackgroundStyleIndex(5);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset6 = new MsoBackgroundStyleIndex(6);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset7 = new MsoBackgroundStyleIndex(7);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset8 = new MsoBackgroundStyleIndex(8);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset9 = new MsoBackgroundStyleIndex(9);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset10 = new MsoBackgroundStyleIndex(10);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset11 = new MsoBackgroundStyleIndex(11);
  public final static MsoBackgroundStyleIndex msoBackgroundStylePreset12 = new MsoBackgroundStyleIndex(12);

  // Integer constants for bitsets and switch statements
  public final static int _msoBackgroundStyleMixed = -2;
  public final static int _msoBackgroundStyleNotAPreset = 0;
  public final static int _msoBackgroundStylePreset1 = 1;
  public final static int _msoBackgroundStylePreset2 = 2;
  public final static int _msoBackgroundStylePreset3 = 3;
  public final static int _msoBackgroundStylePreset4 = 4;
  public final static int _msoBackgroundStylePreset5 = 5;
  public final static int _msoBackgroundStylePreset6 = 6;
  public final static int _msoBackgroundStylePreset7 = 7;
  public final static int _msoBackgroundStylePreset8 = 8;
  public final static int _msoBackgroundStylePreset9 = 9;
  public final static int _msoBackgroundStylePreset10 = 10;
  public final static int _msoBackgroundStylePreset11 = 11;
  public final static int _msoBackgroundStylePreset12 = 12;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBackgroundStyleIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBackgroundStyleIndex valueOf(int value) {
    switch(value) {
    case -2: return msoBackgroundStyleMixed;
    case 0: return msoBackgroundStyleNotAPreset;
    case 1: return msoBackgroundStylePreset1;
    case 2: return msoBackgroundStylePreset2;
    case 3: return msoBackgroundStylePreset3;
    case 4: return msoBackgroundStylePreset4;
    case 5: return msoBackgroundStylePreset5;
    case 6: return msoBackgroundStylePreset6;
    case 7: return msoBackgroundStylePreset7;
    case 8: return msoBackgroundStylePreset8;
    case 9: return msoBackgroundStylePreset9;
    case 10: return msoBackgroundStylePreset10;
    case 11: return msoBackgroundStylePreset11;
    case 12: return msoBackgroundStylePreset12;
    default: return new MsoBackgroundStyleIndex(value);
    }
  }
}
