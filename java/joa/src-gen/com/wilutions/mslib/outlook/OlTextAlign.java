/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.outlook;
import com.wilutions.com.*;

/**
 * OlTextAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{03FADFE8-2527-46C3-9CCD-DBBBCD05156B}")
public class OlTextAlign {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static OlTextAlign olTextAlignLeft = new OlTextAlign(1);
  public final static OlTextAlign olTextAlignCenter = new OlTextAlign(2);
  public final static OlTextAlign olTextAlignRight = new OlTextAlign(3);

  // Integer constants for bitsets and switch statements
  public final static int _olTextAlignLeft = 1;
  public final static int _olTextAlignCenter = 2;
  public final static int _olTextAlignRight = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private OlTextAlign(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  OlTextAlign valueOf(int value) {
    switch(value) {
    case 1: return olTextAlignLeft;
    case 2: return olTextAlignCenter;
    case 3: return olTextAlignRight;
    default: return new OlTextAlign(value);
    }
  }
}
