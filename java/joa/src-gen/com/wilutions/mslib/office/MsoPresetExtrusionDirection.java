/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetExtrusionDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetExtrusionDirection {

  // Typed constants
  public final static MsoPresetExtrusionDirection msoPresetExtrusionDirectionMixed = new MsoPresetExtrusionDirection(-2);
  public final static MsoPresetExtrusionDirection msoExtrusionBottomRight = new MsoPresetExtrusionDirection(1);
  public final static MsoPresetExtrusionDirection msoExtrusionBottom = new MsoPresetExtrusionDirection(2);
  public final static MsoPresetExtrusionDirection msoExtrusionBottomLeft = new MsoPresetExtrusionDirection(3);
  public final static MsoPresetExtrusionDirection msoExtrusionRight = new MsoPresetExtrusionDirection(4);
  public final static MsoPresetExtrusionDirection msoExtrusionNone = new MsoPresetExtrusionDirection(5);
  public final static MsoPresetExtrusionDirection msoExtrusionLeft = new MsoPresetExtrusionDirection(6);
  public final static MsoPresetExtrusionDirection msoExtrusionTopRight = new MsoPresetExtrusionDirection(7);
  public final static MsoPresetExtrusionDirection msoExtrusionTop = new MsoPresetExtrusionDirection(8);
  public final static MsoPresetExtrusionDirection msoExtrusionTopLeft = new MsoPresetExtrusionDirection(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetExtrusionDirectionMixed = -2;
  public final static int _msoExtrusionBottomRight = 1;
  public final static int _msoExtrusionBottom = 2;
  public final static int _msoExtrusionBottomLeft = 3;
  public final static int _msoExtrusionRight = 4;
  public final static int _msoExtrusionNone = 5;
  public final static int _msoExtrusionLeft = 6;
  public final static int _msoExtrusionTopRight = 7;
  public final static int _msoExtrusionTop = 8;
  public final static int _msoExtrusionTopLeft = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetExtrusionDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetExtrusionDirection valueOf(int value) {
    switch(value) {
    case -2: return msoPresetExtrusionDirectionMixed;
    case 1: return msoExtrusionBottomRight;
    case 2: return msoExtrusionBottom;
    case 3: return msoExtrusionBottomLeft;
    case 4: return msoExtrusionRight;
    case 5: return msoExtrusionNone;
    case 6: return msoExtrusionLeft;
    case 7: return msoExtrusionTopRight;
    case 8: return msoExtrusionTop;
    case 9: return msoExtrusionTopLeft;
    default: return new MsoPresetExtrusionDirection(value);
    }
  }
}
