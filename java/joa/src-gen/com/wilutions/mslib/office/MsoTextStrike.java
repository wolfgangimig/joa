/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextStrike.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextStrike {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextStrike msoStrikeMixed = new MsoTextStrike(-2);
  public final static MsoTextStrike msoNoStrike = new MsoTextStrike(0);
  public final static MsoTextStrike msoSingleStrike = new MsoTextStrike(1);
  public final static MsoTextStrike msoDoubleStrike = new MsoTextStrike(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoStrikeMixed = -2;
  public final static int _msoNoStrike = 0;
  public final static int _msoSingleStrike = 1;
  public final static int _msoDoubleStrike = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextStrike(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextStrike valueOf(int value) {
    switch(value) {
    case -2: return msoStrikeMixed;
    case 0: return msoNoStrike;
    case 1: return msoSingleStrike;
    case 2: return msoDoubleStrike;
    default: return new MsoTextStrike(value);
    }
  }
}
