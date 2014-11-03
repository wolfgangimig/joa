/* ** GENEREATED FILE - DO NOT MODIFY ** */
package com.wilutions.mslib.office;
import com.wilutions.com.*;

/**
 * MsoThemeColorSchemeIndex.
 * 
 */
@SuppressWarnings("all")
@CoInterface(guid="{00000000-0000-0000-0000-000000000000}")
public enum MsoThemeColorSchemeIndex {
  msoThemeDark1(1),
  msoThemeLight1(2),
  msoThemeDark2(3),
  msoThemeLight2(4),
  msoThemeAccent1(5),
  msoThemeAccent2(6),
  msoThemeAccent3(7),
  msoThemeAccent4(8),
  msoThemeAccent5(9),
  msoThemeAccent6(10),
  msoThemeHyperlink(11),
  msoThemeFollowedHyperlink(12);

  public final int value;
  private MsoThemeColorSchemeIndex(int value) { this.value = value; }
  public static  MsoThemeColorSchemeIndex valueOf(int value) {
    switch(value) {
    case 1: return msoThemeDark1;
    case 2: return msoThemeLight1;
    case 3: return msoThemeDark2;
    case 4: return msoThemeLight2;
    case 5: return msoThemeAccent1;
    case 6: return msoThemeAccent2;
    case 7: return msoThemeAccent3;
    case 8: return msoThemeAccent4;
    case 9: return msoThemeAccent5;
    case 10: return msoThemeAccent6;
    case 11: return msoThemeHyperlink;
    case 12: return msoThemeFollowedHyperlink;
    default: throw new IllegalArgumentException(value + " is not a valid value for " + MsoThemeColorSchemeIndex.class);
    }
  }
}
