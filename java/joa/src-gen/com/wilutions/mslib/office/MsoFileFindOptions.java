/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindOptions.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileFindOptions {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileFindOptions msoOptionsNew = new MsoFileFindOptions(1);
  public final static MsoFileFindOptions msoOptionsAdd = new MsoFileFindOptions(2);
  public final static MsoFileFindOptions msoOptionsWithin = new MsoFileFindOptions(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoOptionsNew = 1;
  public final static int _msoOptionsAdd = 2;
  public final static int _msoOptionsWithin = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileFindOptions(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileFindOptions valueOf(int value) {
    switch(value) {
    case 1: return msoOptionsNew;
    case 2: return msoOptionsAdd;
    case 3: return msoOptionsWithin;
    default: return new MsoFileFindOptions(value);
    }
  }
}
