/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoPresetLightingDirection.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoPresetLightingDirection {
  msoPresetLightingDirectionMixed(-2),
  msoLightingTopLeft(1),
  msoLightingTop(2),
  msoLightingTopRight(3),
  msoLightingLeft(4),
  msoLightingNone(5),
  msoLightingRight(6),
  msoLightingBottomLeft(7),
  msoLightingBottom(8),
  msoLightingBottomRight(9);

  public final int value;
  private MsoPresetLightingDirection(int value) { this.value = value; }
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
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoPresetLightingDirection.class);
    }
  }
}
