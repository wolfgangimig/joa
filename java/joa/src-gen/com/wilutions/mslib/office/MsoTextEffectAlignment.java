/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextEffectAlignment.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextEffectAlignment {
  msoTextEffectAlignmentMixed(-2),
  msoTextEffectAlignmentLeft(1),
  msoTextEffectAlignmentCentered(2),
  msoTextEffectAlignmentRight(3),
  msoTextEffectAlignmentLetterJustify(4),
  msoTextEffectAlignmentWordJustify(5),
  msoTextEffectAlignmentStretchJustify(6);

  public final int value;
  private MsoTextEffectAlignment(int value) { this.value = value; }
  public static  MsoTextEffectAlignment valueOf(int value) {
    switch(value) {
    case -2: return msoTextEffectAlignmentMixed;
    case 1: return msoTextEffectAlignmentLeft;
    case 2: return msoTextEffectAlignmentCentered;
    case 3: return msoTextEffectAlignmentRight;
    case 4: return msoTextEffectAlignmentLetterJustify;
    case 5: return msoTextEffectAlignmentWordJustify;
    case 6: return msoTextEffectAlignmentStretchJustify;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextEffectAlignment.class);
    }
  }
}
