/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFontLanguageIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoFontLanguageIndex {
  msoThemeLatin(1),
  msoThemeComplexScript(2),
  msoThemeEastAsian(3);

  public final int value;
  private MsoFontLanguageIndex(int value) { this.value = value; }
  public static  MsoFontLanguageIndex valueOf(int value) {
    switch(value) {
    case 1: return msoThemeLatin;
    case 2: return msoThemeComplexScript;
    case 3: return msoThemeEastAsian;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoFontLanguageIndex.class);
    }
  }
}
