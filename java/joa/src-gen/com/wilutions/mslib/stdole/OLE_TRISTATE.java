/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.stdole;
import com.wilutions.com.*;

/**
 * OLE_TRISTATE.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{6650430A-BE0F-101A-8BBB-00AA00300CAB}")
public enum OLE_TRISTATE {
  Unchecked(0),
  Checked(1),
  Gray(2);

  public final int value;
  private OLE_TRISTATE(int value) { this.value = value; }
  public static  OLE_TRISTATE valueOf(int value) {
    switch(value) {
    case 0: return Unchecked;
    case 1: return Checked;
    case 2: return Gray;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + OLE_TRISTATE.class);
    }
  }
}
