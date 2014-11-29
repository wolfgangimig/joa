/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextEffectAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextEffectAlignment {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextEffectAlignment msoTextEffectAlignmentMixed = new MsoTextEffectAlignment(-2);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentLeft = new MsoTextEffectAlignment(1);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentCentered = new MsoTextEffectAlignment(2);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentRight = new MsoTextEffectAlignment(3);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentLetterJustify = new MsoTextEffectAlignment(4);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentWordJustify = new MsoTextEffectAlignment(5);
  public final static MsoTextEffectAlignment msoTextEffectAlignmentStretchJustify = new MsoTextEffectAlignment(6);

  // Integer constants for bitsets and switch statements
  public final static int _msoTextEffectAlignmentMixed = -2;
  public final static int _msoTextEffectAlignmentLeft = 1;
  public final static int _msoTextEffectAlignmentCentered = 2;
  public final static int _msoTextEffectAlignmentRight = 3;
  public final static int _msoTextEffectAlignmentLetterJustify = 4;
  public final static int _msoTextEffectAlignmentWordJustify = 5;
  public final static int _msoTextEffectAlignmentStretchJustify = 6;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextEffectAlignment(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextEffectAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoTextEffectAlignmentMixed;
    case 1: return msoTextEffectAlignmentLeft;
    case 2: return msoTextEffectAlignmentCentered;
    case 3: return msoTextEffectAlignmentRight;
    case 4: return msoTextEffectAlignmentLetterJustify;
    case 5: return msoTextEffectAlignmentWordJustify;
    case 6: return msoTextEffectAlignmentStretchJustify;
    default: return new MsoTextEffectAlignment(value);
    }
  }
}
