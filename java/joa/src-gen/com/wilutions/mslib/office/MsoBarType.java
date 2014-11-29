/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoBarType.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoBarType {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoBarType msoBarTypeNormal = new MsoBarType(0);
  public final static MsoBarType msoBarTypeMenuBar = new MsoBarType(1);
  public final static MsoBarType msoBarTypePopup = new MsoBarType(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoBarTypeNormal = 0;
  public final static int _msoBarTypeMenuBar = 1;
  public final static int _msoBarTypePopup = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoBarType(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoBarType valueOf(int value) {
    switch(value) {
    case 0: return msoBarTypeNormal;
    case 1: return msoBarTypeMenuBar;
    case 2: return msoBarTypePopup;
    default: return new MsoBarType(value);
    }
  }
}
