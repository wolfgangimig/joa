/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextTabAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextTabAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextTabAlign msoTabAlignMixed = new MsoTextTabAlign(-2);
  public final static MsoTextTabAlign msoTabAlignLeft = new MsoTextTabAlign(0);
  public final static MsoTextTabAlign msoTabAlignCenter = new MsoTextTabAlign(1);
  public final static MsoTextTabAlign msoTabAlignRight = new MsoTextTabAlign(2);
  public final static MsoTextTabAlign msoTabAlignDecimal = new MsoTextTabAlign(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoTabAlignMixed = -2;
  public final static int _msoTabAlignLeft = 0;
  public final static int _msoTabAlignCenter = 1;
  public final static int _msoTabAlignRight = 2;
  public final static int _msoTabAlignDecimal = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextTabAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextTabAlign valueOf(int value) {
    switch(value) {
    case -2: return msoTabAlignMixed;
    case 0: return msoTabAlignLeft;
    case 1: return msoTabAlignCenter;
    case 2: return msoTabAlignRight;
    case 3: return msoTabAlignDecimal;
    default: return new MsoTextTabAlign(value);
    }
  }
}
