/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlHorizontalLayout.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{634EE3C4-6BCB-4BD6-8997-30C9DB02E223}")
public class OlHorizontalLayout {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlHorizontalLayout olHorizontalLayoutAlignLeft = new OlHorizontalLayout(0);
  public final static OlHorizontalLayout olHorizontalLayoutAlignCenter = new OlHorizontalLayout(1);
  public final static OlHorizontalLayout olHorizontalLayoutAlignRight = new OlHorizontalLayout(2);
  public final static OlHorizontalLayout olHorizontalLayoutGrow = new OlHorizontalLayout(3);

  // Integer constants for bitsets and switch statements
  public final static int _olHorizontalLayoutAlignLeft = 0;
  public final static int _olHorizontalLayoutAlignCenter = 1;
  public final static int _olHorizontalLayoutAlignRight = 2;
  public final static int _olHorizontalLayoutGrow = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlHorizontalLayout(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlHorizontalLayout valueOf(int value) {
    switch(value) {
    case 0: return olHorizontalLayoutAlignLeft;
    case 1: return olHorizontalLayoutAlignCenter;
    case 2: return olHorizontalLayoutAlignRight;
    case 3: return olHorizontalLayoutGrow;
    default: return new OlHorizontalLayout(value);
    }
  }
}
