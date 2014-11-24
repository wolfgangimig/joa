/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoButtonStyleHidden.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoButtonStyleHidden {

  // Typed constants
  public final static MsoButtonStyleHidden msoButtonWrapText = new MsoButtonStyleHidden(4);
  public final static MsoButtonStyleHidden msoButtonTextBelow = new MsoButtonStyleHidden(8);

  // Integer constants for bitsets and switch statements
  public final static int _msoButtonWrapText = 4;
  public final static int _msoButtonTextBelow = 8;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoButtonStyleHidden(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoButtonStyleHidden valueOf(int value) {
    switch(value) {
    case 4: return msoButtonWrapText;
    case 8: return msoButtonTextBelow;
    default: return new MsoButtonStyleHidden(value);
    }
  }
}
