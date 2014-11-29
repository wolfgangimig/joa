/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.msforms;
import com.wilutions.com.*;

/**
 * fmListBoxStyles.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{F00164C2-B17B-11CE-A95D-00AA006CB389}")
public class fmListBoxStyles {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static fmListBoxStyles _fmListBoxStylesNone = new fmListBoxStyles(0);
  public final static fmListBoxStyles _fmListBoxStylesListBox = new fmListBoxStyles(1);
  public final static fmListBoxStyles _fmListBoxStylesComboBox = new fmListBoxStyles(2);

  // Integer constants for bitsets and switch statements
  public final static int __fmListBoxStylesNone = 0;
  public final static int __fmListBoxStylesListBox = 1;
  public final static int __fmListBoxStylesComboBox = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private fmListBoxStyles(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  fmListBoxStyles valueOf(int value) {
    switch(value) {
    case 0: return _fmListBoxStylesNone;
    case 1: return _fmListBoxStylesListBox;
    case 2: return _fmListBoxStylesComboBox;
    default: return new fmListBoxStyles(value);
    }
  }
}
