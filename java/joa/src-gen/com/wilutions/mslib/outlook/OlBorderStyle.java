/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlBorderStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0B17239E-C724-444B-ACB1-579893197A3C}")
public class OlBorderStyle {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlBorderStyle olBorderStyleNone = new OlBorderStyle(0);
  public final static OlBorderStyle olBorderStyleSingle = new OlBorderStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _olBorderStyleNone = 0;
  public final static int _olBorderStyleSingle = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlBorderStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlBorderStyle valueOf(int value) {
    switch(value) {
    case 0: return olBorderStyleNone;
    case 1: return olBorderStyleSingle;
    default: return new OlBorderStyle(value);
    }
  }
}
