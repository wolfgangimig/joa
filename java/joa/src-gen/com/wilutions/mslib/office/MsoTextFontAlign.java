/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoTextFontAlign.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoTextFontAlign {
  msoFontAlignMixed(-2),
  msoFontAlignAuto(0),
  msoFontAlignTop(1),
  msoFontAlignCenter(2),
  msoFontAlignBaseline(3),
  msoFontAlignBottom(4);

  public final int value;
  private MsoTextFontAlign(int value) { this.value = value; }
  public static  MsoTextFontAlign valueOf(int value) {
    switch(value) {
    case -2: return msoFontAlignMixed;
    case 0: return msoFontAlignAuto;
    case 1: return msoFontAlignTop;
    case 2: return msoFontAlignCenter;
    case 3: return msoFontAlignBaseline;
    case 4: return msoFontAlignBottom;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoTextFontAlign.class);
    }
  }
}
