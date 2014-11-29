/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * OLE_TRISTATE.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6650430A-BE0F-101A-8BBB-00AA00300CAB}")
public class OLE_TRISTATE {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OLE_TRISTATE Unchecked = new OLE_TRISTATE(0);
  public final static OLE_TRISTATE Checked = new OLE_TRISTATE(1);
  public final static OLE_TRISTATE Gray = new OLE_TRISTATE(2);

  // Integer constants for bitsets and switch statements
  public final static int _Unchecked = 0;
  public final static int _Checked = 1;
  public final static int _Gray = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OLE_TRISTATE(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OLE_TRISTATE valueOf(int value) {
    switch(value) {
    case 0: return Unchecked;
    case 1: return Checked;
    case 2: return Gray;
    default: return new OLE_TRISTATE(value);
    }
  }
}
