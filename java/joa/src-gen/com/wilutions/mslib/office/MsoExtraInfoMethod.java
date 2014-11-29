/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoExtraInfoMethod.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoExtraInfoMethod {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoExtraInfoMethod msoMethodGet = new MsoExtraInfoMethod(0);
  public final static MsoExtraInfoMethod msoMethodPost = new MsoExtraInfoMethod(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoMethodGet = 0;
  public final static int _msoMethodPost = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoExtraInfoMethod(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoExtraInfoMethod valueOf(int value) {
    switch(value) {
    case 0: return msoMethodGet;
    case 1: return msoMethodPost;
    default: return new MsoExtraInfoMethod(value);
    }
  }
}
