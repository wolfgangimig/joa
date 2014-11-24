/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetLightingDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoPresetLightingDirection {

  // Typed constants
  public final static MsoPresetLightingDirection msoPresetLightingDirectionMixed = new MsoPresetLightingDirection(-2);
  public final static MsoPresetLightingDirection msoLightingTopLeft = new MsoPresetLightingDirection(1);
  public final static MsoPresetLightingDirection msoLightingTop = new MsoPresetLightingDirection(2);
  public final static MsoPresetLightingDirection msoLightingTopRight = new MsoPresetLightingDirection(3);
  public final static MsoPresetLightingDirection msoLightingLeft = new MsoPresetLightingDirection(4);
  public final static MsoPresetLightingDirection msoLightingNone = new MsoPresetLightingDirection(5);
  public final static MsoPresetLightingDirection msoLightingRight = new MsoPresetLightingDirection(6);
  public final static MsoPresetLightingDirection msoLightingBottomLeft = new MsoPresetLightingDirection(7);
  public final static MsoPresetLightingDirection msoLightingBottom = new MsoPresetLightingDirection(8);
  public final static MsoPresetLightingDirection msoLightingBottomRight = new MsoPresetLightingDirection(9);

  // Integer constants for bitsets and switch statements
  public final static int _msoPresetLightingDirectionMixed = -2;
  public final static int _msoLightingTopLeft = 1;
  public final static int _msoLightingTop = 2;
  public final static int _msoLightingTopRight = 3;
  public final static int _msoLightingLeft = 4;
  public final static int _msoLightingNone = 5;
  public final static int _msoLightingRight = 6;
  public final static int _msoLightingBottomLeft = 7;
  public final static int _msoLightingBottom = 8;
  public final static int _msoLightingBottomRight = 9;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoPresetLightingDirection(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoPresetLightingDirection valueOf(int value) {
    switch(value) {
    case -2: return msoPresetLightingDirectionMixed;
    case 1: return msoLightingTopLeft;
    case 2: return msoLightingTop;
    case 3: return msoLightingTopRight;
    case 4: return msoLightingLeft;
    case 5: return msoLightingNone;
    case 6: return msoLightingRight;
    case 7: return msoLightingBottomLeft;
    case 8: return msoLightingBottom;
    case 9: return msoLightingBottomRight;
    default: return new MsoPresetLightingDirection(value);
    }
  }
}
