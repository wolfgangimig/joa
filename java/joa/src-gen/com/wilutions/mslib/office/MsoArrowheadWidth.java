/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoArrowheadWidth.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoArrowheadWidth {
  msoArrowheadWidthMixed(-2),
  msoArrowheadNarrow(1),
  msoArrowheadWidthMedium(2),
  msoArrowheadWide(3);

  public final int value;
  private MsoArrowheadWidth(int value) { this.value = value; }
  public static  MsoArrowheadWidth valueOf(int value) {
    switch(value) {
    case -2: return msoArrowheadWidthMixed;
    case 1: return msoArrowheadNarrow;
    case 2: return msoArrowheadWidthMedium;
    case 3: return msoArrowheadWide;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoArrowheadWidth.class);
    }
  }
}
