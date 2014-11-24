/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoLineCapStyle.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoLineCapStyle {

  // Typed constants
  public final static MsoLineCapStyle msoLineCapMixed = new MsoLineCapStyle(-2);
  public final static MsoLineCapStyle msoLineCapSquare = new MsoLineCapStyle(1);
  public final static MsoLineCapStyle msoLineCapRound = new MsoLineCapStyle(2);
  public final static MsoLineCapStyle msoLineCapFlat = new MsoLineCapStyle(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoLineCapMixed = -2;
  public final static int _msoLineCapSquare = 1;
  public final static int _msoLineCapRound = 2;
  public final static int _msoLineCapFlat = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoLineCapStyle(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoLineCapStyle valueOf(int value) {
    switch(value) {
    case -2: return msoLineCapMixed;
    case 1: return msoLineCapSquare;
    case 2: return msoLineCapRound;
    case 3: return msoLineCapFlat;
    default: return new MsoLineCapStyle(value);
    }
  }
}
