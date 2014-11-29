/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextFontAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextFontAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextFontAlign msoFontAlignMixed = new MsoTextFontAlign(-2);
  public final static MsoTextFontAlign msoFontAlignAuto = new MsoTextFontAlign(0);
  public final static MsoTextFontAlign msoFontAlignTop = new MsoTextFontAlign(1);
  public final static MsoTextFontAlign msoFontAlignCenter = new MsoTextFontAlign(2);
  public final static MsoTextFontAlign msoFontAlignBaseline = new MsoTextFontAlign(3);
  public final static MsoTextFontAlign msoFontAlignBottom = new MsoTextFontAlign(4);

  // Integer constants for bitsets and switch statements
  public final static int _msoFontAlignMixed = -2;
  public final static int _msoFontAlignAuto = 0;
  public final static int _msoFontAlignTop = 1;
  public final static int _msoFontAlignCenter = 2;
  public final static int _msoFontAlignBaseline = 3;
  public final static int _msoFontAlignBottom = 4;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextFontAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextFontAlign valueOf(int value) {
    switch(value) {
    case -2: return msoFontAlignMixed;
    case 0: return msoFontAlignAuto;
    case 1: return msoFontAlignTop;
    case 2: return msoFontAlignCenter;
    case 3: return msoFontAlignBaseline;
    case 4: return msoFontAlignBottom;
    default: return new MsoTextFontAlign(value);
    }
  }
}
