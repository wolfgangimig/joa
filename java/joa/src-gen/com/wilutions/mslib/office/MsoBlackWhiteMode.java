/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBlackWhiteMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBlackWhiteMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBlackWhiteMode msoBlackWhiteMixed = new MsoBlackWhiteMode(-2);
  public final static MsoBlackWhiteMode msoBlackWhiteAutomatic = new MsoBlackWhiteMode(1);
  public final static MsoBlackWhiteMode msoBlackWhiteGrayScale = new MsoBlackWhiteMode(2);
  public final static MsoBlackWhiteMode msoBlackWhiteLightGrayScale = new MsoBlackWhiteMode(3);
  public final static MsoBlackWhiteMode msoBlackWhiteInverseGrayScale = new MsoBlackWhiteMode(4);
  public final static MsoBlackWhiteMode msoBlackWhiteGrayOutline = new MsoBlackWhiteMode(5);
  public final static MsoBlackWhiteMode msoBlackWhiteBlackTextAndLine = new MsoBlackWhiteMode(6);
  public final static MsoBlackWhiteMode msoBlackWhiteHighContrast = new MsoBlackWhiteMode(7);
  public final static MsoBlackWhiteMode msoBlackWhiteBlack = new MsoBlackWhiteMode(8);
  public final static MsoBlackWhiteMode msoBlackWhiteWhite = new MsoBlackWhiteMode(9);
  public final static MsoBlackWhiteMode msoBlackWhiteDontShow = new MsoBlackWhiteMode(10);

  // Integer constants for bitsets and switch statements
  public final static int _msoBlackWhiteMixed = -2;
  public final static int _msoBlackWhiteAutomatic = 1;
  public final static int _msoBlackWhiteGrayScale = 2;
  public final static int _msoBlackWhiteLightGrayScale = 3;
  public final static int _msoBlackWhiteInverseGrayScale = 4;
  public final static int _msoBlackWhiteGrayOutline = 5;
  public final static int _msoBlackWhiteBlackTextAndLine = 6;
  public final static int _msoBlackWhiteHighContrast = 7;
  public final static int _msoBlackWhiteBlack = 8;
  public final static int _msoBlackWhiteWhite = 9;
  public final static int _msoBlackWhiteDontShow = 10;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBlackWhiteMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBlackWhiteMode valueOf(int value) {
    switch(value) {
    case -2: return msoBlackWhiteMixed;
    case 1: return msoBlackWhiteAutomatic;
    case 2: return msoBlackWhiteGrayScale;
    case 3: return msoBlackWhiteLightGrayScale;
    case 4: return msoBlackWhiteInverseGrayScale;
    case 5: return msoBlackWhiteGrayOutline;
    case 6: return msoBlackWhiteBlackTextAndLine;
    case 7: return msoBlackWhiteHighContrast;
    case 8: return msoBlackWhiteBlack;
    case 9: return msoBlackWhiteWhite;
    case 10: return msoBlackWhiteDontShow;
    default: return new MsoBlackWhiteMode(value);
    }
  }
}
