/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileValidationMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileValidationMode implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileValidationMode msoFileValidationDefault = new MsoFileValidationMode(0);
  public final static MsoFileValidationMode msoFileValidationSkip = new MsoFileValidationMode(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoFileValidationDefault = 0;
  public final static int _msoFileValidationSkip = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileValidationMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileValidationMode valueOf(int value) {
    switch(value) {
    case 0: return msoFileValidationDefault;
    case 1: return msoFileValidationSkip;
    default: return new MsoFileValidationMode(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoFileValidationDefault";
    case 1: return "msoFileValidationSkip";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoFileValidationDefault");
      if ((value & 1) != 0) sbuf.append("|msoFileValidationSkip");
      return sbuf.toString();
      }
    }
  }
}
