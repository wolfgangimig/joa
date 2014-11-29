/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlFolderDisplayMode.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlFolderDisplayMode {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlFolderDisplayMode olFolderDisplayNormal = new OlFolderDisplayMode(0);
  public final static OlFolderDisplayMode olFolderDisplayFolderOnly = new OlFolderDisplayMode(1);
  public final static OlFolderDisplayMode olFolderDisplayNoNavigation = new OlFolderDisplayMode(2);

  // Integer constants for bitsets and switch statements
  public final static int _olFolderDisplayNormal = 0;
  public final static int _olFolderDisplayFolderOnly = 1;
  public final static int _olFolderDisplayNoNavigation = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlFolderDisplayMode(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlFolderDisplayMode valueOf(int value) {
    switch(value) {
    case 0: return olFolderDisplayNormal;
    case 1: return olFolderDisplayFolderOnly;
    case 2: return olFolderDisplayNoNavigation;
    default: return new OlFolderDisplayMode(value);
    }
  }
}
