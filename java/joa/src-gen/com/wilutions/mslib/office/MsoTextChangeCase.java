/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextChangeCase.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextChangeCase {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoTextChangeCase msoCaseSentence = new MsoTextChangeCase(1);
  public final static MsoTextChangeCase msoCaseLower = new MsoTextChangeCase(2);
  public final static MsoTextChangeCase msoCaseUpper = new MsoTextChangeCase(3);
  public final static MsoTextChangeCase msoCaseTitle = new MsoTextChangeCase(4);
  public final static MsoTextChangeCase msoCaseToggle = new MsoTextChangeCase(5);

  // Integer constants for bitsets and switch statements
  public final static int _msoCaseSentence = 1;
  public final static int _msoCaseLower = 2;
  public final static int _msoCaseUpper = 3;
  public final static int _msoCaseTitle = 4;
  public final static int _msoCaseToggle = 5;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextChangeCase(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextChangeCase valueOf(int value) {
    switch(value) {
    case 1: return msoCaseSentence;
    case 2: return msoCaseLower;
    case 3: return msoCaseUpper;
    case 4: return msoCaseTitle;
    case 5: return msoCaseToggle;
    default: return new MsoTextChangeCase(value);
    }
  }
}
