/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoContactCardStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{0739EEEF-D856-414C-9494-F2F791FD1F22}")
public class MsoContactCardStyle {

  // Typed constants
  public final static MsoContactCardStyle msoContactCardHover = new MsoContactCardStyle(0);
  public final static MsoContactCardStyle msoContactCardFull = new MsoContactCardStyle(1);

  // Integer constants for bitsets and switch statements
  public final static int _msoContactCardHover = 0;
  public final static int _msoContactCardFull = 1;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoContactCardStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoContactCardStyle valueOf(int value) {
    switch(value) {
    case 0: return msoContactCardHover;
    case 1: return msoContactCardFull;
    default: return new MsoContactCardStyle(value);
    }
  }
}
