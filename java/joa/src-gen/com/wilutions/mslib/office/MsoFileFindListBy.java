/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileFindListBy.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileFindListBy {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileFindListBy msoListbyName = new MsoFileFindListBy(1);
  public final static MsoFileFindListBy msoListbyTitle = new MsoFileFindListBy(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoListbyName = 1;
  public final static int _msoListbyTitle = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileFindListBy(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileFindListBy valueOf(int value) {
    switch(value) {
    case 1: return msoListbyName;
    case 2: return msoListbyTitle;
    default: return new MsoFileFindListBy(value);
    }
  }
}
