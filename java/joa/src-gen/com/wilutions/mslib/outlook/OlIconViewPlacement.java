/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlIconViewPlacement.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlIconViewPlacement {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlIconViewPlacement olIconDoNotArrange = new OlIconViewPlacement(0);
  public final static OlIconViewPlacement olIconLineUp = new OlIconViewPlacement(1);
  public final static OlIconViewPlacement olIconAutoArrange = new OlIconViewPlacement(2);
  public final static OlIconViewPlacement olIconSortAndAutoArrange = new OlIconViewPlacement(3);

  // Integer constants for bitsets and switch statements
  public final static int _olIconDoNotArrange = 0;
  public final static int _olIconLineUp = 1;
  public final static int _olIconAutoArrange = 2;
  public final static int _olIconSortAndAutoArrange = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlIconViewPlacement(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlIconViewPlacement valueOf(int value) {
    switch(value) {
    case 0: return olIconDoNotArrange;
    case 1: return olIconLineUp;
    case 2: return olIconAutoArrange;
    case 3: return olIconSortAndAutoArrange;
    default: return new OlIconViewPlacement(value);
    }
  }
}
