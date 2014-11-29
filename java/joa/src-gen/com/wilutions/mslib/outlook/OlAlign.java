/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class OlAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlAlign olAlignLeft = new OlAlign(0);
  public final static OlAlign olAlignCenter = new OlAlign(1);
  public final static OlAlign olAlignRight = new OlAlign(2);

  // Integer constants for bitsets and switch statements
  public final static int _olAlignLeft = 0;
  public final static int _olAlignCenter = 1;
  public final static int _olAlignRight = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlAlign valueOf(int value) {
    switch(value) {
    case 0: return olAlignLeft;
    case 1: return olAlignCenter;
    case 2: return olAlignRight;
    default: return new OlAlign(value);
    }
  }
}
