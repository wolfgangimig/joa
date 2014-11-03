/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextureAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextureAlignment {
  msoTextureAlignmentMixed(-2),
  msoTextureTopLeft(0),
  msoTextureTop(1),
  msoTextureTopRight(2),
  msoTextureLeft(3),
  msoTextureCenter(4),
  msoTextureRight(5),
  msoTextureBottomLeft(6),
  msoTextureBottom(7),
  msoTextureBottomRight(8);

  public final int value;
  private MsoTextureAlignment(int value) { this.value = value; }
  public static  MsoTextureAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoTextureAlignmentMixed;
    case 0: return msoTextureTopLeft;
    case 1: return msoTextureTop;
    case 2: return msoTextureTopRight;
    case 3: return msoTextureLeft;
    case 4: return msoTextureCenter;
    case 5: return msoTextureRight;
    case 6: return msoTextureBottomLeft;
    case 7: return msoTextureBottom;
    case 8: return msoTextureBottomRight;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextureAlignment.class);
    }
  }
}
