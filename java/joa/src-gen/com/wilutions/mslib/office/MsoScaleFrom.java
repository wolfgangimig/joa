/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoScaleFrom.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoScaleFrom {

  // Typed constants
  public final static MsoScaleFrom msoScaleFromTopLeft = new MsoScaleFrom(0);
  public final static MsoScaleFrom msoScaleFromMiddle = new MsoScaleFrom(1);
  public final static MsoScaleFrom msoScaleFromBottomRight = new MsoScaleFrom(2);

  // Integer constants for bitsets and switch statements
  public final static int _msoScaleFromTopLeft = 0;
  public final static int _msoScaleFromMiddle = 1;
  public final static int _msoScaleFromBottomRight = 2;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoScaleFrom(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoScaleFrom valueOf(int value) {
    switch(value) {
    case 0: return msoScaleFromTopLeft;
    case 1: return msoScaleFromMiddle;
    case 2: return msoScaleFromBottomRight;
    default: return new MsoScaleFrom(value);
    }
  }
}
