/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoFontLanguageIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public class MsoFontLanguageIndex implements ComEnum {
  static boolean __typelib__loaded = __TypeLib.load();

  // Typed constants
  public final static MsoFontLanguageIndex msoThemeLatin = new MsoFontLanguageIndex(1);
  public final static MsoFontLanguageIndex msoThemeComplexScript = new MsoFontLanguageIndex(2);
  public final static MsoFontLanguageIndex msoThemeEastAsian = new MsoFontLanguageIndex(3);

  // Integer constants for bitsets and switch statements
  public final static int _msoThemeLatin = 1;
  public final static int _msoThemeComplexScript = 2;
  public final static int _msoThemeEastAsian = 3;

  // Value, readonly field.
  public final int value;

  // Private constructor, use valueOf to create an instance.
  private MsoFontLanguageIndex(int value) { this.value = value; }

  // Return one of the predefined typed constants for the given value or create a new object.
  public static  MsoFontLanguageIndex valueOf(int value) {
    switch(value) {
    case 1: return msoThemeLatin;
    case 2: return msoThemeComplexScript;
    case 3: return msoThemeEastAsian;
    default: return new MsoFontLanguageIndex(value);
    }
  }

  public String toString() {
    switch(value) {
    case 1: return "msoThemeLatin";
    case 2: return "msoThemeComplexScript";
    case 3: return "msoThemeEastAsian";
    default: {
      StringBuilder sbuf = new StringBuilder();
      sbuf.append("[").append(value).append("=");
      if ((value & 1) != 0) sbuf.append("|msoThemeLatin");
      if ((value & 2) != 0) sbuf.append("|msoThemeComplexScript");
      if ((value & 3) != 0) sbuf.append("|msoThemeEastAsian");
      return sbuf.toString();
      }
    }
  }
}
