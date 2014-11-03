/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetExtrusionDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetExtrusionDirection {
  msoPresetExtrusionDirectionMixed(-2),
  msoExtrusionBottomRight(1),
  msoExtrusionBottom(2),
  msoExtrusionBottomLeft(3),
  msoExtrusionRight(4),
  msoExtrusionNone(5),
  msoExtrusionLeft(6),
  msoExtrusionTopRight(7),
  msoExtrusionTop(8),
  msoExtrusionTopLeft(9);

  public final int value;
  private MsoPresetExtrusionDirection(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetExtrusionDirection.class);
    }
  }
}
