/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoTextDirection {

  // Typed constants
  public final static MsoTextDirection msoTextDirectionMixed = new MsoTextDirection(-2);
  public final static MsoTextDirection msoTextDirectionLeftToRight = new MsoTextDirection(1);
  public final static MsoTextDirection msoTextDirectionRightToLeft = new MsoTextDirection(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoTextDirectionMixed = -2;
  public final static int _msoTextDirectionLeftToRight = 1;
  public final static int _msoTextDirectionRightToLeft = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoTextDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoTextDirection valueOf(int value) {
    switch(value) {
    case -2: return msoTextDirectionMixed;
    case 1: return msoTextDirectionLeftToRight;
    case 2: return msoTextDirectionRightToLeft;
    default: return new MsoTextDirection(value);
    }
  }
}
