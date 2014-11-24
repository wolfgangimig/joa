/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarProtection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBarProtection {

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
}
