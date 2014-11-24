/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextCharWrap.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextCharWrap {

  // Typed constants
  public final static MsoTextCharWrap msoCharWrapMixed = new MsoTextCharWrap(-2);
  public final static MsoTextCharWrap msoNoCharWrap = new MsoTextCharWrap(0);
  public final static MsoTextCharWrap msoStandardCharWrap = new MsoTextCharWrap(1);
  public final static MsoTextCharWrap msoStrictCharWrap = new MsoTextCharWrap(2);
  public final static MsoTextCharWrap msoCustomCharWrap = new MsoTextCharWrap(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoCharWrapMixed = -2;
  public final static int _msoNoCharWrap = 0;
  public final static int _msoStandardCharWrap = 1;
  public final static int _msoStrictCharWrap = 2;
  public final static int _msoCustomCharWrap = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextCharWrap(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextCharWrap valueOf(int value) {
    switch(value) {
    case -2: return msoCharWrapMixed;
    case 0: return msoNoCharWrap;
    case 1: return msoStandardCharWrap;
    case 2: return msoStrictCharWrap;
    case 3: return msoCustomCharWrap;
    default: return new MsoTextCharWrap(value);
    }
  }
}
