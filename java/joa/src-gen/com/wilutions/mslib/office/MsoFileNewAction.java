/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFileNewAction.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFileNewAction implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFileNewAction msoEditFile = new MsoFileNewAction(0);
  public final static MsoFileNewAction msoCreateNewFile = new MsoFileNewAction(1);
  public final static MsoFileNewAction msoOpenFile = new MsoFileNewAction(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoEditFile = 0;
  public final static int _msoCreateNewFile = 1;
  public final static int _msoOpenFile = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFileNewAction(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFileNewAction valueOf(int value) {
    switch(value) {
    case 0: return msoEditFile;
    case 1: return msoCreateNewFile;
    case 2: return msoOpenFile;
    default: return new MsoFileNewAction(value);
    }
  }

  public String toString() {
    switch(value) {
    case 0: return "msoEditFile";
    case 1: return "msoCreateNewFile";
    case 2: return "msoOpenFile";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 0) != 0) sbuf.append("|msoEditFile");
      if ((value & 1) != 0) sbuf.append("|msoCreateNewFile");
      if ((value & 2) != 0) sbuf.append("|msoOpenFile");
      return sbuf.toString();
      }
    }
  }
}
