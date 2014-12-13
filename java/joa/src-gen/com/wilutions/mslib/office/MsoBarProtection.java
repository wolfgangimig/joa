/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarProtection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBarProtection implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBarProtection msoBarNoProtection = new MsoBarProtection(0);
  public final static MsoBarProtection msoBarNoCustomize = new MsoBarProtection(1);
  public final static MsoBarProtection msoBarNoResize = new MsoBarProtection(2);
  public final static MsoBarProtection msoBarNoMove = new MsoBarProtection(4);
  public final static MsoBarProtection msoBarNoChangeVisible = new MsoBarProtection(8);
  public final static MsoBarProtection msoBarNoChangeDock = new MsoBarProtection(16);
  public final static MsoBarProtection msoBarNoVerticalDock = new MsoBarProtection(32);
  public final static MsoBarProtection msoBarNoHorizontalDock = new MsoBarProtection(64);

  // Integer constants for bitsets and switch statements
  public final static int _msoBarNoProtection = 0;
  public final static int _msoBarNoCustomize = 1;
  public final static int _msoBarNoResize = 2;
  public final static int _msoBarNoMove = 4;
  public final static int _msoBarNoChangeVisible = 8;
  public final static int _msoBarNoChangeDock = 16;
  public final static int _msoBarNoVerticalDock = 32;
  public final static int _msoBarNoHorizontalDock = 64;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBarProtection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBarProtection valueOf(int value) {
    switch(value) {
    case 0: return msoBarNoProtection;
    case 1: return msoBarNoCustomize;
    case 2: return msoBarNoResize;
    case 4: return msoBarNoMove;
    case 8: return msoBarNoChangeVisible;
    case 16: return msoBarNoChangeDock;
    case 32: return msoBarNoVerticalDock;
    case 64: return msoBarNoHorizontalDock;
    default: return new MsoBarProtection(value);
    }
  }

  public String toString() {
    switch(value) {
    case 8: return "msoBarNoChangeVisible";
    case 0: return "msoBarNoProtection";
    case 64: return "msoBarNoHorizontalDock";
    case 1: return "msoBarNoCustomize";
    case 16: return "msoBarNoChangeDock";
    case 2: return "msoBarNoResize";
    case 32: return "msoBarNoVerticalDock";
    case 4: return "msoBarNoMove";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 8) != 0) sbuf.append("|msoBarNoChangeVisible");
      if ((value & 0) != 0) sbuf.append("|msoBarNoProtection");
      if ((value & 64) != 0) sbuf.append("|msoBarNoHorizontalDock");
      if ((value & 1) != 0) sbuf.append("|msoBarNoCustomize");
      if ((value & 16) != 0) sbuf.append("|msoBarNoChangeDock");
      if ((value & 2) != 0) sbuf.append("|msoBarNoResize");
      if ((value & 32) != 0) sbuf.append("|msoBarNoVerticalDock");
      if ((value & 4) != 0) sbuf.append("|msoBarNoMove");
      return sbuf.toString();
      }
    }
  }
}
