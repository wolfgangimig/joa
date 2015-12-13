/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmMultiSelect.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C0-B17B-11CE-A95D-00AA006CB389}")
public class fmMultiSelect implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmMultiSelect fmMultiSelectSingle = new fmMultiSelect(0);
  public final static fmMultiSelect fmMultiSelectMulti = new fmMultiSelect(1);
  public final static fmMultiSelect fmMultiSelectExtended = new fmMultiSelect(2);

  // Integer constants for bitsets and switch statements
  public final static int _fmMultiSelectSingle = 0;
  public final static int _fmMultiSelectMulti = 1;
  public final static int _fmMultiSelectExtended = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmMultiSelect(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmMultiSelect valueOf(int value) {
    switch(value) {
    case 0: return fmMultiSelectSingle;
    case 1: return fmMultiSelectMulti;
    case 2: return fmMultiSelectExtended;
    default: return new fmMultiSelect(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "fmMultiSelectSingle";
    case 1: return "fmMultiSelectMulti";
    case 2: return "fmMultiSelectExtended";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|fmMultiSelectSingle");
      if ((value & 1) != 0) sbuf.append("|fmMultiSelectMulti");
      if ((value & 2) != 0) sbuf.append("|fmMultiSelectExtended");
      return sbuf.toString();
      }
    }
  }
}
